import java.awt.*;
import javax.swing.*;

public class PanelZakladki extends JTabbedPane
{
    public PanelZakladki() {
        ImageIcon ikona = new ImageIcon("ikona.gif");

        JPanel panelCzerwony = new JPanel();
        JPanel panelZolty = new JPanel();

        panelCzerwony.setBackground(Color.RED);
        panelZolty.setBackground(Color.YELLOW);

        addTab("Czerwona", ikona, panelCzerwony, "Zakładka czerwona");
        addTab("Żółta", ikona, panelZolty, "Zakładka żółta");
    }
}