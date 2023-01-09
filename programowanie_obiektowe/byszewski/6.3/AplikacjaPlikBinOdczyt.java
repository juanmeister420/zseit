import java.io.*;

public class AplikacjaPlikBinOdczyt 
{
    public static void main(String[] args) throws IOException
    {
        BufferedInputStream czytelnik = null;
        int liczba;

        try
        {
            czytelnik = new BufferedInputStream(
                new FileInputStream("liczby.bin"), 512);

            while((liczba = czytelnik.read()) != -1)
                System.out.println(liczba + " ");
        }
        catch(IOException ex)
        {
            System.err.println(ex.getMessage());
        }
        finally
        {
            if(czytelnik != null) czytelnik.close();
        }
    }
    
}