import java.io.*;

public class Aplikacja37
{
    public static void main(String[] args) throws IOException
    {
        String tekst = 
        "Lorem ipsum dolor sit amet, consectetur adipiscing\r\n" +
        "elit, sed do eiusmod tempor incididunt ut labore et\r\n" +
        "dolore magna aliqua. Ut enim ad minim veniam, quis\r\n" +
        "nostrud exercitation ullamco laboris nisi ut aliquip\r\n" +
        "ex ea commodo consequat.";

        BufferedWriter pisarz = null;

        try
        {
            pisarz = new BufferedWriter(new FileWriter("lorem.txt"));
            pisarz.write(tekst);
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