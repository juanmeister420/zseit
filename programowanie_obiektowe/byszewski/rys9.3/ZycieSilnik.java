public class ZycieSilnik 
{
    public static final int KLMN_MAX = 50;
    public static final int KLMN_MIN = 20;
    public static final int WRSZ_MAX = 50;
    public static final int WRSZ_MIN = 20;
    public static final int PKLN_MIN = 1;

    private int wrsz = WRSZ_MIN;
    private int klmn = KLMN_MIN;
    private int pkln = PKLN_MIN;

    private int [][] macierz;

    public ZycieSilnik()
    {
        macierz = new int [wrsz][klmn];
    }

    public int getKlmn() { return klmn; }
    public int getWrsz() { return wrsz; }
    public int getPkln() { return pkln; }

    public int [][] getMacierz() { return macierz; }
    public void setKlmnWrsz(int klmn, int wrsz)
    {
        this.klmn = klmn;
        this.wrsz = wrsz;
        zmienRozmiar();
    }

    public void setPkln(int pkln)
    {
        this.pkln = pkln;
    }

    public void zmienRozmiar()
    {
        int [][] tbl_bak = macierz;

        macierz = new int [wrsz][klmn];

        for(int w = 0; w < wrsz; w++)
            for(int k = 0; k < klmn; k++)
                if (w < tbl_bak.length && k < tbl_bak[w].length)
                    macierz[w][k] = tbl_bak[w][k];
    }

    private int obliczStatus(int wrsz, int klmn)
    {
        int suma = 0;
        int status = 0;

        for(int w = wrsz - 1; w <= wrsz + 1; w++)
            for(int k = klmn - 1; k <= klmn + 1; k++)
                if (w >= 0 && w < macierz.length)
                    if (k >= 0 && k < macierz[w].length)
                        if (w != wrsz || k != klmn)
                            suma += macierz[w][k];
        
        switch(macierz[wrsz][klmn])
        {
            case 0: status = suma == 3 ? 1 : 0; break;
            case 1: status = suma == 2 || suma == 3 ? 1 : 0; break;
        }

        return status;
    }

    public void obliczNastepne()
    {
        int [][] macierzN = new int [wrsz][klmn];

        for(int w = 0; w < wrsz; w++)
            for(int k = 0; k < klmn; k++)
                macierzN[w][k] = obliczStatus(w, k);

        macierz = macierzN;
        pkln++;
    }
}