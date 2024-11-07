package gr.aueb.cf.ch17.builder;

public class Main {

    public static void main(String[] args) {
        Book book = new Book.Builder(1, "12345").build();
        Book book2 = new  Book.Builder(2, "23456")
                .author("Ath. A.")
                .title("Java")
                .build();
    }
}
