package programmer.zaman.now.application;

public class EqualsApp {
    public static void main(String[] args) {
        String first = "Eko";
        first = first + " " + "khannedy";
        System.out.println(first);

        String second = "Eko khannedy";
        System.out.println(second);

        String third = "Eko khannedy";

//        System.out.println(first == second);
        System.out.println(first.equals(second));
        System.out.println(first == first);
        System.out.println(second.equals(first));
    }
}
