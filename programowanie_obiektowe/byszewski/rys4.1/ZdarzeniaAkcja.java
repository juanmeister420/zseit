import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class ZdarzeniaAkcja extends JPanel
{
    public ZdarzeniaAkcja()
    {
        JButton przyciskCzerwony = new JButton("Czerwony");
        przyciskCzerwony.addActionListener(new ObslugaCzerwony());
        add(przyciskCzerwony);

        JButton przyciskNiebieski = new JButton("Niebiski");
        przyciskNiebieski.addActionListener(new ObslugaNiebieski());
        add(przyciskNiebieski);
    } 
    class ObslugaCzerwony implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            setBackground(Color.RED);
        }
    } 
    class ObslugaNiebieski implements ActionListener
    {
        public void actionPerformed(ActionEvent evt)
        {
            setBackground(Color.BLUE);
        }
    } 
}