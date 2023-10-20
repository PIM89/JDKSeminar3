package Task1;

import java.util.Arrays;
import java.util.Iterator;

public class GenericArray<T> {
    private Object[] arr;
    private GenericIterator genericIterator;

    GenericArray() {
        arr = new Object[0];
        genericIterator = new GenericIterator<>(arr);
    }

    public void add(T t) {
        Object[] temp_arr = new Object[arr.length + 1];
        for (int index = 0; index < arr.length; index++) {
            temp_arr[index] = arr[index];
        }
        temp_arr[temp_arr.length - 1] = t;
        arr = temp_arr;
        genericIterator = new GenericIterator<>(arr);
    }

    public void remove(T t) {
        Integer position = find(t);
        if (position != null) {
            Object[] temp_arr = new Object[arr.length - 1];
            for (int i = 0; i < position; i++) {
                temp_arr[i] = arr[i];
            }
            for (int i = position; i < arr.length - 1; i++) {
                temp_arr[i] = arr[i + 1];
            }
            arr = temp_arr;
        }
        genericIterator = new GenericIterator<>(arr);
    }

    public Integer find(T t) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(t)) return i;
        }
        return null;
    }

    public String info() {
        return Arrays.toString(arr);
    }

    public GenericIterator getGenericIterator() {
        return genericIterator;
    }

    public class GenericIterator<T> implements Iterator<T>, Iterable<T> {
        T[] arr;
        private Integer index = 0;

        GenericIterator(T[] arr) {
            this.arr = arr;
        }

        @Override
        public boolean hasNext() {
            return (arr.length > index);
        }

        @Override
        public T next() {
            if (hasNext()) {
                return arr[index++];
            }
            return null;
        }

        @Override
        public Iterator<T> iterator() {
            return this;
        }
    }
}