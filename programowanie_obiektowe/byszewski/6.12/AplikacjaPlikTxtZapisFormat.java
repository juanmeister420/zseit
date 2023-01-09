import java.io.*;
import java.util.*;

public class AplikacjaPlikTxtZapisFormat 
{
    public static void main(String[] args) throws IOException
    {
        String [] waluta = {"usd", "eur", "chf", "jpy"};
        int [] liczba = {1, 1, 1, 100};
        double [] sprzedaz = {2.8685, 4.1244, 2.7730, 3.0859};
        double [] skup = {2.8245, 4.0704, 2.7290, 3.0239};
        PrintWriter pisarz = null;

        try
        {
            pisarz = new PrintWriter(new FileWriter("numeryki.txt"));
            pisarz.printf("Kiedy: %1$tY %1$tB %1$td %1$tH:%1$tM %n", Calendar.getInstance());
            pisarz.format("%s %4s %10s %10s%n", "Waluta", "Ile", "Sprzedaż", "Skup");

            for(int k = 0; k < waluta.length; k++)
                pisarz.format("%-6S %4d %10.4f    %08.4f%n",
                    waluta[ k ], liczba[ k], sprzedaz[ k ], skup[ k ]);
        }
        catch(IOException ex)
        {
            System.err.format("Błąd WE/WY: %s%n", ex);
        }
        finally
        {
            if (pisarz != null) pisarz.close();
        }
    }
}