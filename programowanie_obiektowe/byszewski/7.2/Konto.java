public class Konto 
{
    double saldo;
    
    public Konto(double poczatek)
    {
        saldo = poczatek;
    }

    synchronized public void wplata(double kwota)
    {
        int opoznieniePrzed = (int)(Math.random() * 120);
        int opoznieniePo = (int)(Math.random() * 30);

        try{
            Thread.sleep(opoznieniePrzed);
        } catch (InterruptedException e){}

        double saldoPrzed = saldo;

        try{
            Thread.sleep(opoznieniePo);
        } catch (InterruptedException e){}

        saldo = saldoPrzed + kwota;

        System.out.printf("%2s : %f : %f : %3d : %3d\n",
            Thread.currentThread().getName(), 
            saldoPrzed, saldo, opoznieniePrzed, opoznieniePo);
    }
}