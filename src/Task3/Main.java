package Task3;

public class Main {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3, 4, 5};
        Integer[] arr2 = {1, 2, 3, 4, 5};
        compareArrays(arr1, arr2);
        System.out.println("------------------------------------");
        String[] str1 = {"привет", "пока"};
        String[] str2 = {"привет", "пока"};
        System.out.println(compareArrays(str1, str2));
        System.out.println("------------------------------------");
        System.out.println(compareArrays(arr1, str2));
    }

    public static <T, V> boolean compareArrays(T[] t, V[] v) {
        if (t.length != v.length) {
            return false;
        }
        for (int i = 0; i < t.length; i++) {
            if (t[i] != v[i]) {
                return false;
            }
        }
        return true;
    }
}