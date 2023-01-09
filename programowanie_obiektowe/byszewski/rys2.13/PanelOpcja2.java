import javax.swing.*;
import java.awt.*;

public class PanelOpcja2 extends JPanel
{
    public PanelOpcja2() 
    {
        String[] kolory = {"Czerwony", "Niebieski", "Żółty"};
        String[] pory = {"Wiosna", "Lato", "Jesień", "Zima"};

        JCheckBox [] opcjeKolor = new JCheckBox[kolory.length];
        for(int k = 0; k < kolory.length; k++)
            opcjeKolor[k] = new JCheckBox(kolory[k]);
        
        JCheckBox [] opcjePora = new JCheckBox[pory.length];
        for(int i = 0; i < pory.length; i++) 
            opcjePora[i] = new JCheckBox(pory[i]);
        
        ButtonGroup KolorGrupa = new ButtonGroup();
        for( JCheckBox opcja : opcjeKolor) KolorGrupa.add(opcja);
        
        ButtonGroup PoraGrupa = new ButtonGroup();
        for( JCheckBox opcja : opcjePora) PoraGrupa.add(opcja);

        JPanel panelKolor = new JPanel(new GridLayout(3, 1));
        panelKolor.setBounds(10, 10, 110, 80);
        panelKolor.setBorder(BorderFactory.createRaisedBevelBorder());
        for( JCheckBox opcja : opcjeKolor) panelKolor.add(opcja);
        
        JPanel panelPora = new JPanel(new GridLayout(4, 1));
        panelPora.setBounds(150, 10, 110, 100);
        panelPora.setBorder(BorderFactory.createRaisedBevelBorder());
        for( JCheckBox opcja : opcjePora) panelPora.add(opcja);

        opcjeKolor[1].setSelected(true);
        opcjePora[2].setSelected(true);

        add(panelKolor); add(panelPora);

        setLayout( null );
    }
}