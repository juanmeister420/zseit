import java.awt.event.*;
import javax.swing.*;

public class PanelPasek extends JPanel 
{
    private JScrollBar pasek;
    private JLabel komunikat;
    
    public PanelPasek()
    {
        komunikat = new JLabel();
        komunikat.setBounds(5, 5, 40, 20);

        pasek = new JScrollBar( JScrollBar.HORIZONTAL, 1, 10, 1, 100);
        pasek.setBlockIncrement(10);
        pasek.setBounds(5, 30, 200, 20);

        add(pasek); add(komunikat);

        setLayout(null);
    }
    public void adjustmentValueChanged( AdjustmentEvent e)
    {
        komunikat.setText( Integer.toString(e.getValue()) );
    }
}