import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class PanelMenuKontekst extends JPanel
{
    private final String [] TEKST = 
        {"Czerwony", "Niebieski", "Szary"};
    private final int [] KLAWISZ =
        {KeyEvent.VK_C, KeyEvent.VK_N, KeyEvent.VK_S};
    private final Color [] KOLOR = 
        {Color.RED, Color.BLUE, Color.GRAY};
    
    public PanelMenuKontekst()
    {
        JPopupMenu menuKolory = new JPopupMenu();
         for(int k = 0; k < TEKST.length; k++)
         {
             JMenuItem opcja = new JMenuItem(TEKST[k]);
             opcja.addActionListener(new OpcjaKoloru(this, KOLOR[k]));
             menuKolory.add(opcja);
         }

         setComponentPopupMenu(menuKolory);
    }
}
class OpcjaKoloru implements ActionListener
{
    Color kolor;
    JPanel panel;

    OpcjaKoloru(JPanel panel, Color kolor)
    {
        this.panel = panel;
        this.kolor = kolor;
    }

    public void actionPerformed(ActionEvent evt)
    {
        panel.setBackground(kolor);
    }
}