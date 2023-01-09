import java.io.*;

public class AplikacjaPlikTypZapis 
{
    public static void main(String[] args) throws IOException 
    {
        String [] waluta = {"usd", "eur", "chf", "jpn"};
        int [] liczba = {1, 1, 1, 1, 100};
        double [] kurssprzedaz = {2.8465, 4.0924, 2.7510, 3.0639};
        double [] kurskupno = {2.8565, 4.1124, 2.9810, 3.0841};

        DataOutputStream pisarz = null;

        try
        {
            pisarz = new DataOutputStream(new BufferedOutputStream(
                        new FileOutputStream("kurs.bin"), 512));
            for (int i = 0; i < waluta.length; i++)
            {
                pisarz.writeUTF(waluta[i]);
                pisarz.writeInt(liczba[i]);
                pisarz.writeDouble(kurssprzedaz[i]);
                pisarz.writeDouble(kurskupno[i]);
            }
        }
        catch (IOException ex)
        {
            System.err.println(ex.getMessage());
        }
        finally
        {
            if(pisarz != null) pisarz.close();
        }
    }    
}