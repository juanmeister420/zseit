public class Publication {
    String isbn;
    String title;

    Publication(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    String getinfo() {
        return title + " - " + isbn;
    }
}
