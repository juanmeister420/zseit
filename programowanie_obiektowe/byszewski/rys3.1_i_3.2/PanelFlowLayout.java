import javax.swing.*;

public class PanelFlowLayout extends JPanel
{
    public PanelFlowLayout()
    {
        String [] napisy = {"Start", "Naprzód", "Zwiększ prędkość odtwarzania", "Wstecz", "Stop"};

        for(int i = 0; i < napisy.length; i++)
        {
            JButton przycisk = new JButton(napisy[i]);
            add(przycisk);
        }
    }
}