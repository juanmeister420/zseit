import java.util.scanner;

import java.util.scanner;

public class BookManager {
    public static void main(string[] args) {

        Scanner sc = new Scanner(System.in);


        Publication[] publications = new Publication[10];

        
        System.out.println("Podaj ISBN książki: ");
        String isbn = sc.nextline();
        System.out.println("Podaj Tytuł książi: ");
        String title = sc.nextline();
        System.out.println("Podaj autora książki: ");
        String author = sc.nextline(); publications[0] = new Book(isbn, title, author);




        System.out.println("Podaj ISBN magazynu: ");
        isbn = sc.nextline();
        System.out.println("Podaj Tytuł magazynu: ");
        title = sc.nextline();
        System.out.println("Podaj wydawcę magazynu: ");
        String publisher = sc.nextline();
        publications[1] = new Magazine(isbn, title, publisher);
        sc.close();

        System.out.println("Książki i magazyny: ");
        for (Publication p: publications) {
            if (p!= null)
                System.out.println(p.getInfo());
        }
    }
}