import java.io.*;

public class AplikacjaPlikBinKopia 
{
    public static void main(String[] args) throws IOException
    {
        BufferedInputStream czytelnik = null;
        BufferedOutputStream pisarz = null;
        int liczba;

        try
        {
            czytelnik = new BufferedInputStream(
                new FileInputStream("liczby.bin"), 512);
            pisarz = new BufferedOutputStream(
                new FileOutputStream("wartosci.bin"), 512);
            while((liczba = czytelnik.read()) != -1)
                pisarz.write(liczba);
        }
        catch(IOException ex)
        {
            System.err.println(ex.getMessage());
        }
        finally
        {
            if(czytelnik != null) czytelnik.close();
            if(pisarz != null) pisarz.close();
        }
    }   
}