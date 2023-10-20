package Task4;

public class Main {
    public static void main(String[] args) {
        Pair pair = new Pair<>(6,"привет");
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        System.out.println(pair.toString());
    }
}