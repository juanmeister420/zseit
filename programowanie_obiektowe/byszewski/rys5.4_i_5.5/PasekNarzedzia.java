import javax.swing.*;
import java.awt.event.*;

public class PasekNarzedzia extends JToolBar
{
    private final String [] IKONA = {"start.gif", "Stop.gif", "pause.gif"};
    private final String [] TEKST = {"Start", "Stop", "Pause"};
    
    public PasekNarzedzia()
    {
        super("MultiMedia");
        for(int k = 0; k < IKONA.length; k++)
        {
            JButton przycisk = new JButton(new ImageIcon(IKONA[k]));
            przycisk.addActionListener(new PasekZdarzenia(TEKST[k]));
            przycisk.setToolTipText(TEKST[k]);
            add(przycisk);
        }
        
        addSeparator();

        JLabel nazwa = new JLabel("Wykonwawca: Myszka Miki");
        add(nazwa);
    }
}
class PasekZdarzenia implements ActionListener
{
    String tekst;
    PasekZdarzenia(String tekst)
    {
        this.tekst = tekst;
    }
    public void actionPerformed(ActionEvent evt)
    {
        JOptionPane.showMessageDialog(null, tekst, "Zdarzenie", JOptionPane.INFORMATION_MESSAGE);
    }
}