public class Drukarz
{
    public static void main(String [] args)
    {
        DrukujLitery drukarzDuzy = new DrukujLitery('A', 'H');
        DrukujLitery drukarzMaly = new DrukujLitery('a', 'h');

        Thread watekDuzy = new Thread(drukarzDuzy);
        Thread watekMaly = new Thread(drukarzMaly);

        watekDuzy.start();
        watekMaly.start();
    }
}