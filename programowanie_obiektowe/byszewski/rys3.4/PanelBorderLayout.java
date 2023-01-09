import java.awt.*;
import javax.swing.*;

public class PanelBorderLayout extends JPanel
{
    public PanelBorderLayout()
    {
        String [] napisy = {"Start", "Naprzód", "Zwiększ prędkość odtwarzania", "Wstecz", "Stop"};

        String [] polozenie = 
        {
            BorderLayout.PAGE_START, 
            BorderLayout.LINE_START, 
            BorderLayout.CENTER, 
            BorderLayout.LINE_END, 
            BorderLayout.PAGE_END
        
        };

        setLayout(new BorderLayout(10, 20));
        for(int k = 0; k < napisy.length; k++)
        {
            JButton przycisk = new JButton(napisy[k]);
            add(przycisk, polozenie[k]);
        }
    }
}