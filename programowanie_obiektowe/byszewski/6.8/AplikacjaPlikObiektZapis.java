import java.io.*;

public class AplikacjaPlikObiektZapis
{   
    public static void main(String [] args) throws IOException
    {
        String [] waluta = {"usd", "eur", "chf", "jpn"};
        int [] liczba = {1, 1, 1, 1, 100};
        double [] kurssprzedaz = {2.8465, 4.0924, 2.7510, 3.0639};
        double [] kurskupno = {2.8565, 4.1124, 2.9810, 3.0841};

        ObjectOutputStream pisarz = null;

        try
        {
            pisarz = new ObjectOutputStream(
                new BufferedOutputStream(new FileOutputStream("kantor.bin"), 512));

            for (int i = 0; i < waluta.length; i++)
            {
                Kantor kantor = new Kantor(
                    waluta[i], liczba[i], kurssprzedaz[i], kurskupno[i]);
                pisarz.writeObject(kantor);
            }
        }
        catch(IOException ex)
        {
            System.err.println(ex.getMessage());
        }
        finally
        {
            if (pisarz != null) pisarz.close();
        }
    }
}