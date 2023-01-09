import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class ZycieSiatka extends JPanel implements MouseListener
{
    private static final int KW_BOK = 20;
    private static final int KW_MRG = 2;
    private static final int MARGINES = 5;
    private static final int KL_MRG = 1;
    private static final int KL_SRD = KW_BOK - KL_MRG * 2;

    private ZycieSilnik silnik;
    
    public ZycieSiatka(ZycieSilnik silnik)
    {
        super();
        this.silnik = silnik;

        ustawRozmiar();
        addMouseListener(this);
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        int [][] tbl = silnik.getMacierz();

        for(int w = 0; w < tbl.length; w++)
            for(int k = 0; k < tbl[w].length; k++)
            {
                int x = k * KW_BOK + KW_MRG * 2;
                int y = w * KW_BOK + KW_MRG * 2;

                g.setColor(Color.BLACK);
                g.drawRect(x, y, KW_BOK - KW_MRG, KW_BOK - KW_MRG);
                if (tbl[w][k] == 1)
                {
                    g.setColor(Color.BLACK);
                    g.fillRect(x + KL_MRG, y + KL_MRG, KL_SRD, KL_SRD);
                }
            }
    }

    public void mouseClicked(MouseEvent evt){}
    public void mouseEntered(MouseEvent evt){}
    public void mouseExited(MouseEvent evt){}
    public void mousePressed(MouseEvent evt){}

    public void mouseReleased(MouseEvent evt)
    {
        if(silnik.getPkln() > 1) return;

        int wrsz = (evt.getY() - MARGINES)/ KW_BOK;
        int klmn = (evt.getX() - MARGINES)/ KW_BOK;

        int [][] tbl = silnik.getMacierz();

        if(wrsz < tbl.length)
            if(klmn < tbl[wrsz].length)
                tbl[wrsz][klmn] = tbl[wrsz][klmn] == 1 ? 0 : 1;
                
        repaint();
    }

    public void ustawRozmiar()
    {
        setPreferredSize(new Dimension(
            silnik.getKlmn() * KW_BOK + MARGINES * 2,
            silnik.getWrsz() * KW_BOK + MARGINES * 2 ));
        updateUI();
    }
}