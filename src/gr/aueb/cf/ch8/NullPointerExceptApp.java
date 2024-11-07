package gr.aueb.cf.ch8;

public class NullPointerExceptApp {

    public static void main(String[] args) {
        String s = null;

        if (s != null) {
            if (s.equals("Coding")) {
                System.out.println("Bingo");
            } else {
                System.out.println("Not equal");
            }
        } else {
            System.out.println("s is null");
        }
    }
}