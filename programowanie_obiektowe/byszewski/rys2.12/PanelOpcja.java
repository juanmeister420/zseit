import javax.swing.*;
import java.awt.*;

public class PanelOpcja extends JPanel
{
    public PanelOpcja() 
    {
        String[] kolory = {"Czerwony", "Niebieski", "Żółty"};
        String[] pory = {"Wiosna", "Lato", "Jesień", "Zima"};

        JRadioButton [] opcjeKolor = new JRadioButton[kolory.length];
        for(int k = 0; k < kolory.length; k++)
            opcjeKolor[k] = new JRadioButton(kolory[k]);
        
        JRadioButton [] opcjePora = new JRadioButton[pory.length];
        for(int i = 0; i < pory.length; i++) 
            opcjePora[i] = new JRadioButton(pory[i]);
        
        ButtonGroup KolorGrupa = new ButtonGroup();
        for( JRadioButton opcja : opcjeKolor) KolorGrupa.add(opcja);
        
        ButtonGroup PoraGrupa = new ButtonGroup();
        for( JRadioButton opcja : opcjePora) PoraGrupa.add(opcja);

        JPanel panelKolor = new JPanel(new GridLayout(3, 1));
        panelKolor.setBounds(10, 10, 110, 80);
        panelKolor.setBorder(BorderFactory.createRaisedBevelBorder());
        for( JRadioButton opcja : opcjeKolor) panelKolor.add(opcja);
        
        JPanel panelPora = new JPanel(new GridLayout(4, 1));
        panelPora.setBounds(150, 10, 110, 100);
        panelPora.setBorder(BorderFactory.createRaisedBevelBorder());
        for( JRadioButton opcja : opcjePora) panelPora.add(opcja);

        opcjeKolor[1].setSelected(true);
        opcjePora[2].setSelected(true);

        add(panelKolor); add(panelPora);

        setLayout( null );
    }
}