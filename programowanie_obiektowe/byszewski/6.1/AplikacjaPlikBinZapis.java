import java.io.*;

public class AplikacjaPlikBinZapis 
{
    public static void main(String[] args) throws IOException
    {
        int [] liczby = {255, 0, 1, 2, 29, 10, 82, 92, 2, 17}; 

        BufferedOutputStream pisarz =
            new BufferedOutputStream(
                new FileOutputStream("liczby.bin"), 512);

        for(int k = 0; k < liczby.length; k++)
            pisarz.write(liczby[k]);

        pisarz.close();
    }
}