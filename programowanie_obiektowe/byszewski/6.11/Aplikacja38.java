import java.io.*;

public class Aplikacja38
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader czytelnik = null;
        String wiersz;

        try
        {
            czytelnik = new BufferedReader(new FileReader("lorem.txt"));

            while ((wiersz = czytelnik.readLine()) != null)
                System.out.println(wiersz);
        }
        catch(IOException ex)
        {
            System.err.format("Błąd WE/WY: %s%n", ex);
        }
        finally
        {
            if (czytelnik != null) czytelnik.close();
        }
    }
}