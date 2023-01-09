import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.*;
import java.text.*;


public class PanelPoleTekst3 extends JPanel 
{
    public PanelPoleTekst3() 
    {
        JLabel lblData = new JLabel("Data urodzenia:");
        JFormattedTextField txtData = new JFormattedTextField(new SimpleDateFormat("yyyy-MM-dd"));

        lblData.setLabelFor(txtData);
        lblData.setDisplayedMnemonic(KeyEvent.VK_D);
        lblData.setBounds(10, 20, 120, 24);

        try {
        MaskFormatter maskaData = new MaskFormatter("####-##-##");
        maskaData.setPlaceholderCharacter('_');
        maskaData.install(txtData);
        }
        catch (ParseException ex) {}
        
        txtData.setBounds(120, 20, 160, 24);
        add(lblData);
        add(txtData);
        setLayout(null);
    }
}