import java.awt.event.*;
import javax.swing.*;
import java.text.*;

public class PanelPoleTekst2 extends JPanel 
{
    public PanelPoleTekst2() 
    {
        JLabel lblSaldo = new JLabel("Stan konta:");
        JLabel lblHaslo = new JLabel("Hasło:");

        JFormattedTextField txtSaldo = new JFormattedTextField(NumberFormat.getCurrencyInstance());
        JPasswordField txtHaslo = new JPasswordField();

        lblSaldo.setDisplayedMnemonic(KeyEvent.VK_S);
        lblSaldo.setLabelFor(txtSaldo);
        lblSaldo.setBounds(10, 20, 120, 24);

        lblHaslo.setDisplayedMnemonic(KeyEvent.VK_H);
        lblHaslo.setLabelFor(txtHaslo);
        lblHaslo.setBounds(10, 50, 120, 24);

        txtSaldo.setBounds(120, 20, 160, 24);
        txtHaslo.setBounds(120, 50, 160, 24);

        add(lblSaldo);
        add(lblHaslo);

        add(txtSaldo);
        add(txtHaslo);

        setLayout(null);
    }
}