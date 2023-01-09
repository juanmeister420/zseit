import java.awt.event.*;
import javax.swing.*;

public class PasekMenu extends JMenuBar
{
    public PasekMenu()
    {
        JMenu mnPlik = new JMenu("Plik");
        mnPlik.setMnemonic(KeyEvent.VK_P);
        JMenu mnEdycja = new JMenu("Edycja");
        mnEdycja.setMnemonic(KeyEvent.VK_E);

        JMenuItem pzNowy = new JMenuItem("Nowy Plik", KeyEvent.VK_N);
        JMenuItem pzOtworz = new JMenuItem("Otwórz Plik", KeyEvent.VK_O);
        JMenuItem pzZapisz = new JMenuItem("Zapisz Plik", KeyEvent.VK_Z);
        JMenuItem pzKoniec = new JMenuItem("Koniec", KeyEvent.VK_K);

        pzNowy.addActionListener(new MenuZdarzenie(pzNowy.getText()));
        pzZapisz.setIcon(new ImageIcon("zapisz.gif"));

        mnPlik.add(pzNowy);
        mnPlik.add(pzOtworz);
        mnPlik.addSeparator();
        mnPlik.add(pzZapisz);
        mnPlik.addSeparator();
        mnPlik.add(pzKoniec);

        JMenuItem pzKopiuj = new JMenuItem("Kopiuj", KeyEvent.VK_N);
        pzKoniec.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        JMenuItem pzWytnij = new JMenuItem("Wytnij", KeyEvent.VK_K);
        pzKoniec.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
        JMenuItem pzWklej = new JMenuItem("Wklej", KeyEvent.VK_E);
        pzKoniec.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, ActionEvent.CTRL_MASK));

        pzKopiuj.addActionListener(new MenuZdarzenie(pzKopiuj.getText()));

        JCheckBoxMenuItem pzOrtografia = new JCheckBoxMenuItem("Korekta Ortograficzna");
        JCheckBoxMenuItem pzStyl = new JCheckBoxMenuItem("Korekta Stylistyczna");
        pzStyl.addActionListener(new MenuZdarzenie(pzStyl.getText()));
        JRadioButtonMenuItem pzDopisywanie = new JRadioButtonMenuItem("Tryb Dopisywania");
        pzDopisywanie.addActionListener(new MenuZdarzenie(pzDopisywanie.getText()));
        JCheckBoxMenuItem pzNadpisywanie = new JCheckBoxMenuItem("Tryb Zastępowania");

        ButtonGroup grpMenu = new ButtonGroup();
        grpMenu.add(pzDopisywanie);
        grpMenu.add(pzNadpisywanie);

        mnEdycja.add(pzKopiuj);
        mnEdycja.add(pzWytnij);
        mnEdycja.add(pzWklej);
        mnEdycja.addSeparator();
        mnEdycja.add(pzOrtografia);
        mnEdycja.add(pzStyl);
        mnEdycja.addSeparator();
        mnEdycja.add(pzDopisywanie);
        mnEdycja.add(pzNadpisywanie);

        add(mnPlik);
        add(mnEdycja);
    }    
}
class MenuZdarzenie implements ActionListener
{
    String komunikat;

    public MenuZdarzenie(String komunikat)
    {
        this.komunikat = komunikat;
    }

    public void actionPerformed(ActionEvent evt)
    
    {
        JOptionPane.showMessageDialog(null, komunikat, "Zdarzenie", JOptionPane.INFORMATION_MESSAGE);
    }
}