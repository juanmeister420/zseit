import java.awt.*;
import javax.swing.*;


public class PanelEtykieta extends JPanel 
{
    public PanelEtykieta() 
    {
        JLabel lblWiatr = new JLabel("Siła wiatru: ", JLabel.LEFT);
        JLabel lblTemp = new JLabel(
            "<html><font color=#ffffff>Temperatura:</font></html>",
            new ImageIcon("ikona.gif"), JLabel.TRAILING);

        lblWiatr.setBounds(0, 20, 160, 30);
        lblWiatr.setFont(new Font("Times New Roman", Font.BOLD, 18));
    
        lblTemp.setVerticalTextPosition(JLabel.CENTER);
        lblTemp.setHorizontalTextPosition(JLabel.RIGHT);
        lblTemp.setBounds(0, 60, 160, 30);
        lblTemp.setBackground(Color.GRAY);
        lblTemp.setOpaque(true);

        add(lblWiatr);
        add(lblTemp);

        setLayout(null);
    }
}