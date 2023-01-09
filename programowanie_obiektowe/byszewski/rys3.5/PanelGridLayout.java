import java.awt.*;
import javax.swing.*;

public class PanelGridLayout extends JPanel
{
    public PanelGridLayout()
    {
        String [] napisy = {"Start", "Naprzód", "Zwiększ prędkość odtwarzania", "Wstecz", "Stop"};

        setLayout(new GridLayout(3, 2, 20, 10));
        for(int k = 0; k < napisy.length; k++)
        {
            JButton przycisk = new JButton(napisy[k]);
            add(przycisk);
        }
    }
}