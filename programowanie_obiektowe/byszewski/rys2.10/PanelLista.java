import javax.swing.*;

public class PanelLista extends JPanel 
{
    public PanelLista() 
    {
        String[] kolory = {"Czerwony", "Niebieski", "Żółty"};
        String[] pory = {"Wiosna", "Lato", "Jesień", "Zima"};

        JComboBox<String> kolor = new JComboBox<String>(kolory);
        kolor.addItem("Biały");
        kolor.addItem("Czarny");

        kolor.setEditable(true);
        kolor.setBounds(20, 20, 160, 30);

        JComboBox<String> pora = new JComboBox<String>(pory);
        pora.setSelectedItem(2);
        pora.setBounds(20, 70, 160, 30);

        add(kolor);
        add(pora);
        
        setLayout(null);
    }
}