import javax.swing.*;

public class PanelPrzycisk extends JPanel
{
    public PanelPrzycisk()
    {
        String [] napisy = {"<html><i><font color='red'>S</font>tart</i></html>", "Stop", "Naprzód", "Wstecz"};

        for(String napis : napisy)
            add(new JButton(napis));
    }
}