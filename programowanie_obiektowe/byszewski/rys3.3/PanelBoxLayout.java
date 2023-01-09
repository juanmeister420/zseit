import javax.swing.*;
import java.awt.*;

public class PanelBoxLayout extends JPanel 
{
    public PanelBoxLayout()
    {
        String [] napisy = {"Start", "Naprzód", "Zwiększ prędkość odtwarzania", "Wstecz", "Stop"};

        float [] wyrownianie = {Component.LEFT_ALIGNMENT,
            Component.LEFT_ALIGNMENT, Component.CENTER_ALIGNMENT,
            Component.RIGHT_ALIGNMENT, Component.RIGHT_ALIGNMENT };

        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        for(int k = 0; k < napisy.length; k++)
        {
            JButton przycisk = new JButton(napisy[k]);
            przycisk.setAlignmentX(wyrownianie[k]);
            add(przycisk);
        }
    }    
}