/*
    Maciej Monkiewicz © All rights reserved.
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Sprawdzanie poprawności boków trójkąta\nPodaj bok a: ");
        int a = in.nextInt();
        System.out.print("Podaj bok b: ");
        int b = in.nextInt();
        System.out.print("Podaj bok c: ");
        int c = in.nextInt();

        if ((a + b > c) && (b + c > a) && (a + c > b)) {
            System.out.print("Taki trojkat istnieje i ");
            if ((a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a)) System.out.println("jest prostokatny");
            else System.out.println("nie jest prostokatny");
        } else {
            System.out.println("Taki trojkat nie istnieje");
        }
    }
}
