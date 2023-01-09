import java.awt.*;
import javax.swing.*;

public class PanelGridBagLayout extends JPanel
{
    public PanelGridBagLayout()
    {
        setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0, 
            GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, 
            new Insets(4, 8, 6, 10), 0, 0);
        add(new JButton("Start"), gbc);

        gbc = new GridBagConstraints(1, 0, 1, 1, 1.0, 0.0, 
            GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, 
            new Insets(4, 8, 6, 10), 0, 0);
        add(new JButton("Naprzód"), gbc);

        gbc = 
            new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0, 
            GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, 
            new Insets(4, 8, 6, 10), 0, 0);
        add(new JButton("Wstecz"), gbc);

        gbc = 
            new GridBagConstraints(0, 1, 3, 1, 0.0, 0.0, 
            GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, 
            new Insets(4, 8, 6, 10), 0, 25);
        add(new JButton("Zwiększ prędkość odtwarzania"), gbc);

        gbc = 
            new GridBagConstraints(1, 2, 2, 1, 0.0, 1.0, 
            GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, 
            new Insets(4, 8, 6, 10), 0, 0);
        add(new JButton("Stop"), gbc);
    }
}