/*
    Maciej Monkiewicz © All rights reserved.
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj liczbe a: ");
        int a = in.nextInt();
        System.out.print("Podaj liczbe b: ");
        int b = in.nextInt();
        System.out.print("Podaj liczbe c: ");
        int c = in.nextInt();

        if(a > b && a > c) System.out.println("Liczba " + a + " jest największa");
        else if(b > a && b > c) System.out.println("Liczba " + b + " jest największa");
        else System.out.println("Liczba " + c + " jest największa");
    }
}
