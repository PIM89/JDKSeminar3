package Task1;

public class Main {
    public static void main(String[] args) {
        GenericArray genericArray = new GenericArray<>();
        genericArray.add(5);
        genericArray.add(4);
        genericArray.add(432.002);
        genericArray.add("Привет");
        System.out.println(genericArray.info());
        System.out.println();

        for (Object item: genericArray.getGenericIterator()) {
            System.out.println(item);
        }

        System.out.println();

        while (genericArray.getGenericIterator().hasNext()) {
            System.out.println(genericArray.getGenericIterator().next());
        }
    }
}