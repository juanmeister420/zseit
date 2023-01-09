import java.io.*;

public class AplikacjaPlikObiektOdczyt
{
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        ObjectInputStream czytelnik = null;
        Kantor kantor;

        try
        {
            czytelnik = new ObjectInputStream(
                new BufferedInputStream(new FileInputStream("kantor.bin"), 512));

            while(true)
            try
            {
                kantor = (Kantor) czytelnik.readObject();

                System.out.printf("%s %3d %2.4f %2.4f\n", kantor.waluta, kantor.liczba, kantor.kurssprzedaz, kantor.kursZakup);
            }
            catch(EOFException e)
            {
                break;
            }
        }   
        catch (IOException ex)
        {
            System.err.println(ex.getMessage());
        }
        finally
        {
            if (czytelnik != null) czytelnik.close();
        }
    }
}