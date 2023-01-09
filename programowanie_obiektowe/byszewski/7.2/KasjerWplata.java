public class KasjerWplata implements Runnable
{
    Konto konto;
    double kwota;

    public KasjerWplata(Konto konto, double kwota)
    {
        this.konto = konto;
        this.kwota = kwota;
    }

    public void run()
    {
        konto.wplata(kwota);
    }
}