import java.io.*;

public class Kantor implements Serializable
{
    String waluta;
    int liczba;
    double kurssprzedaz;
    double kursZakup;

    public Kantor(String waluta, int liczba,
        double kurssprzedaz, double kursZakup)
    {
        this.waluta = waluta;
        this.liczba = liczba;
        this.kurssprzedaz = kurssprzedaz;
        this.kursZakup = kursZakup;
    }
}