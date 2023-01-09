import javax.swing.*;

public class PanelLista2 extends JPanel 
{
    public PanelLista2() 
    {
        String[] pory = {"Wiosna", "Lato", "Jesień", "Zima"};

        String[] kolory = 
        {"Czarny", "Biały", "Różowy", "Czerwony", 
        "Niebieski", "Żółty", "Zielony", "Brązowy",
        "Fioletowy", "Pomarańczowy", "Srebrny"};

        JList<String> pora = new JList<String>(pory);
        pora.setSelectedIndex(2);
        pora.setBounds(10, 10, 80, 80);

        DefaultListModel<String> kolorDane = new DefaultListModel<String>();
        for(String nazwa : kolory) kolorDane.addElement(nazwa);
        JList<String> kolor = new JList<String>(kolorDane);

        kolor.setSelectionMode(
            ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        kolor.setLayoutOrientation(JList.VERTICAL_WRAP);
        kolor.setVisibleRowCount(-1);
        JScrollPane panelKolor = new JScrollPane(kolor);
        panelKolor.setBounds(100, 10, 240, 80);
        add(pora); add(panelKolor);

        setLayout( null );
        }
    }