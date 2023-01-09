public class DrukujLitery implements Runnable
{
    char pierwsza;
    char ostatnia;

    public DrukujLitery(char pierwsza, char ostatnia)
    {
        this.pierwsza = pierwsza;
        this.ostatnia = ostatnia;
    }

    @Override
    public void run()
    {
        char litera = (char) pierwsza;

        while (litera <= ostatnia)
        {
            System.out.print(litera++);
            try {
                Thread.sleep(200);
            } catch (InterruptedException ex){}
        }
    }
}