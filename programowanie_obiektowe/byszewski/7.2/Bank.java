public class Bank 
{
    public static void main(String[] args)
    {
        Konto Konto = new Konto(100.0);

        for (int k = 1; k <= 10; k++)
        {
            Thread watek = 
                new Thread(new KasjerWplata(Konto, 1),
                    Integer.toString(k));
            watek.start();
        }
        try 
        {
            Thread.sleep(2000);
        } catch (InterruptedException e){ }    

        System.out.println("Saldo: " + Konto.saldo);
    }
}