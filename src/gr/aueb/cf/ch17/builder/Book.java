package gr.aueb.cf.ch17.builder;

public class Book {
    private final long id; // we can have finals without losing javabeans' advantages (e.g. setters)
    private final String isbn;
    private final String author;
    private final String title;

    public static class Builder {
        //id & isbn are considered required so they are final
        private final long id;
        private final String isbn;

        //author & title are optional and their values which will be set through setters
        private String author = "";
        private String title = "";

        public Builder(long id, String isbn) {
            this.id = id; // final fields should be instantiated within constructor
            this.isbn = isbn;
        }

        public Builder author(String author) {
            this.author = author;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Book build() {
            return new Book(this); //generative method, creates an instance
        }
    }

    private Book(Builder builder) { // it is instantiated through Builder as it is private
        this.id = builder.id;
        this.isbn = builder.isbn;
        this.author = builder.author;
        this.title = builder.title;
    }

    public long getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
}
