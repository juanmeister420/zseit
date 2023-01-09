import java.io.*;
import java.text.*;
import java.util.*;

public class Aplikacja39
{
    public static void main(String[] args) throws IOException, ParseException
    {
        Scanner czytelnik = null;
        ArrayList<Kantor> kantor = new ArrayList<Kantor>();

        try
        {
            czytelnik = new Scanner(
                new BufferedReader(new FileReader("numeryki.txt")));

            SimpleDateFormat formatWe = 
                new SimpleDateFormat("yyyy MMM dd HH:mm");

            Date data = formatWe.parse(czytelnik.nextLine());
            czytelnik.nextLine();

            while(czytelnik.hasNextLine())
            {
                String waluta = czytelnik.next();
                int liczba = czytelnik.nextInt();
                double sprzedaz = czytelnik.nextDouble();
                double skup = czytelnik.nextDouble();

                czytelnik.nextLine();

                kantor.add(new Kantor(waluta, liczba, sprzedaz, skup));
            }
            SimpleDateFormat formatWy = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            System.out.printf("Data notowania: %s%n", formatWy.format(data));
            System.out.format("%s %4s %10s %10s%n", "Waluta", "Ile", "Sprzedaż", "Skup");

            for(Kantor ktr : kantor)
                System.out.format("%-6S %4d %10.4f   %8.4f%n",
                    ktr.waluta, ktr.liczba, ktr.kurssprzedaz, ktr.kursZakup);
        }
        catch (IOException ex)
        {
            System.err.format("Błąd WE/WY: %s%n", ex);
        }
        finally
        {
            if (czytelnik != null) czytelnik.close();
        }
    }
}