import java.awt.*;
import javax.swing.*;

public class PanelDzielony extends JSplitPane 
{
    public PanelDzielony()
    {
        JPanel panelCzerwony = new JPanel();
        JPanel panelZolty = new JPanel();

        panelCzerwony.setBackground(Color.RED);
        panelZolty.setBackground(Color.YELLOW);

        setOrientation(JSplitPane.HORIZONTAL_SPLIT);
        setLeftComponent(panelCzerwony);
        setRightComponent(panelZolty);

        setDividerLocation(100);
        setOneTouchExpandable(true);
    }
}