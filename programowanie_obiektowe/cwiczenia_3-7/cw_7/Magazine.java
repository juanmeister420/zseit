public class Magazine extends Publication {
    String publisher;

    Magazine(String isbn, String title, String publisher) {
        super(isbn, title);
        this.publisher = publisher;
    }

    String getinfo() {
        return super.getinfo() + " - " + publisher;
    }
}