public class Book extends Publication {
    String author;

    Book(String isbn, String title, String author) {
        super(isbn, title);
        this.author = author;
    }

    String getinfo() {
        return super.getinfo() + " - " + author;
    }
}