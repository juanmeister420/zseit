
// Maciej Monkiewicz ZSEiT
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float x,y,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Liczba 1: ");
        x = sc.nextFloat();
        System.out.println("Liczba 2: ");
        y = sc.nextFloat();

        c = x+y;
        System.out.printf("Suma liczb "+x+", oraz "+y+" wynosi: "+"%.2f\n",c );
        c = x-y;
        System.out.printf("Róźnica liczb "+x+", oraz "+y+" wynosi: "+"%.2f\n",c );
        c = x*y;
        System.out.printf("Iloczyn liczb "+x+", oraz "+y+" wynosi: "+"%.2f\n",c );
        c = x/y;
        System.out.printf("Iloraz liczb "+x+", oraz "+y+" wynosi: "+"%.2f\n",c );
        c = (float) Math.sqrt(x);
        System.out.printf("Pierwiastek kwadratowy z "+x+ " wynosi "+"%.2f\n",c );
        c = (float) Math.sqrt(y);
        System.out.printf("Pierwiastek kwadratowy z "+y+ " wynosi "+"%.2f\n",c );
        c = x*x;
        System.out.println("Kwadrat liczby "+x+ " wynosi: "+c);
        c = y*y*y*y*y;
        System.out.println("Piąta potęga liczby "+y+ " wynosi: "+c);

    }
}
