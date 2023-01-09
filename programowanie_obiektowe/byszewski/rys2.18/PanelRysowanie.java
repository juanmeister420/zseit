import javax.swing.*;
import java.awt.*;

public class PanelRysowanie extends JPanel
{
    private final int SRED = 24;
    
    public PanelRysowanie()
    {
        setBackground(Color.WHITE);

    }
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        for(int x = 0; x < (getSize().width - SRED); x += SRED)
            for(int y = 0; y < (getSize().height - SRED); y += SRED)
            {
                int cz = (int)(Math.random() * 256);
                int zn = (int)(Math.random() * 256);
                int nb = (int)(Math.random() * 256);

                g.setColor(new Color(cz, zn, nb));
                g.fillOval(x, y, SRED, SRED);
            }
    }
}