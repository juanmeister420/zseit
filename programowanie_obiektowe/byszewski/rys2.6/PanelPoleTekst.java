import java.awt.event.*;
import javax.swing.*;

public class PanelPoleTekst extends JPanel
{
    public PanelPoleTekst() 
    {
        JLabel lblNazwisko = new JLabel("Nazwisko:");
        JTextField txtNazwisko = new JTextField();

        lblNazwisko.setDisplayedMnemonic(KeyEvent.VK_N);
        lblNazwisko.setLabelFor(txtNazwisko);
        lblNazwisko.setBounds(10, 20, 120, 24);

        txtNazwisko.setBounds(120, 20, 160, 24);

        add(lblNazwisko);
        add(txtNazwisko);

        setLayout(null);
    }
}