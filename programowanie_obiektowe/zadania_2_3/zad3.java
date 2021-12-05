/*
    Maciej Monkiewicz © All rights reserved.
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj numer dnia tygodnia (1-7)");
        byte dzien = in.nextByte();
        String result;

        switch (dzien){
            case 1 -> result = "Poniedziałek";
            case 2 -> result = "Wtorek";
            case 3 -> result = "Środa";
            case 4 -> result = "Czwartek";
            case 5 -> result = "Piątek";
            case 6 -> result = "Sobota";
            case 7 -> result = "Niedziela";
            default -> result = "Błędny numer dnia tygodnia";
        }

        System.out.println(dzien);
    }
}
