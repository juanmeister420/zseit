import java.awt.*;
import javax.swing.*;


public class PanelObszarTekstu extends JPanel
{
    public PanelObszarTekstu() 
    {
      super(new GridLayout(1, 1));

      JTextArea txtObszar = new JTextArea(
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit,\n" +
        "sed do eiusmod tempor incididunt labore et dolore magna\n" +
        "aliqua. Ut enim ad minim veniam, nostrud exercitation\n" +
        "ullamco laboris nisi ut aliquip ex commodo consequat.\n" +
        "Duis aute irure dolor reprehenderit in voluptate velit\n" +
        "esse cillum dolore eu fugiat nulla pariatur."
      );
      txtObszar.setFont(
        new Font("Times New Roman", Font.ITALIC, 16)
      );
      add(new JScrollPane(txtObszar));
    }
}