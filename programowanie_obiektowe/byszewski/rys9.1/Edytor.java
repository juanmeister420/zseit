import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class Edytor extends JFrame implements ActionListener
{
    private JMenuBar pasekMenu;
    private JTextArea txtEdytor;
    private JScrollPane zawartosc;

    public Edytor()
    {
        setTitle("Edytor");

        JMenu mnPlik = new JMenu("Plik");
        mnPlik.setMnemonic(KeyEvent.VK_P);
     
        JMenuItem mnNowy = new JMenuItem("Nowy Plik", KeyEvent.VK_N);
        mnNowy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        mnNowy.setActionCommand("Nowy");
        mnNowy.addActionListener(this);

        JMenuItem mnOtworz = new JMenuItem("Otwórz Plik....", KeyEvent.VK_O);
        mnOtworz.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
        mnOtworz.setActionCommand("Otworz");
        mnOtworz.addActionListener(this);

        JMenuItem mnZapisz = new JMenuItem("Zapisz Plik", KeyEvent.VK_Z);
        mnZapisz.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        mnZapisz.setActionCommand("Zapisz");
        mnZapisz.addActionListener(this);

        JMenuItem mnKoniec = new JMenuItem("Koniec", KeyEvent.VK_K);
        mnKoniec.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
        mnKoniec.setActionCommand("Koniec");
        mnKoniec.addActionListener(this);

        mnPlik.add(mnNowy);
        mnPlik.add(mnOtworz);
        mnPlik.add(mnZapisz);
        mnPlik.addSeparator();
        mnPlik.add(mnKoniec);

        pasekMenu = new JMenuBar();
        pasekMenu.add(mnPlik);

        setJMenuBar(pasekMenu);

        txtEdytor = new JTextArea();
        zawartosc = new JScrollPane(txtEdytor, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        zawartosc.setVisible(false);

        setContentPane(zawartosc);
    }

    private static void zrobGUI()
    {
        Edytor okno = new Edytor();
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        okno.setSize(400, 200);
        okno.setLocation(100, 50);
        okno.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        switch(e.getActionCommand())
        {
            case "Koniec" : dispatchEvent(new WindowEvent(this,
                                    WindowEvent.WINDOW_CLOSING));
            break;

            case "Nowy" :  zawartosc.setVisible(true);
                           txtEdytor.setText("");
                           break;

            case "Otworz" : czytajPlik(); break;
            case "Zapisz" : zapiszPlik(); break;
        }   
    }

    private void czytajPlik()
    {
        JFileChooser plikWybor = new JFileChooser();

        if(plikWybor.showOpenDialog(this)
                        == JFileChooser.APPROVE_OPTION)
        {
            BufferedReader czytelnik = null;
            String wiersz;
            String bufor = "";

            try
            {
                czytelnik = new BufferedReader(new FileReader(plikWybor.getSelectedFile()));

                while((wiersz = czytelnik.readLine()) != null)
                    bufor += wiersz + "\r\n";
                czytelnik.close();
            }
            catch(IOException x)
            {
                System.err.format("Błąd WE/WY: %s%n", x);
            }

            txtEdytor.setText(bufor);
            zawartosc.setVisible(true);
        }
    }

    private void zapiszPlik()
    {
        JFileChooser plikWybor = new JFileChooser();

        if(plikWybor.showSaveDialog(this)
                    == JFileChooser.APPROVE_OPTION)
        {
            BufferedWriter pisarz = null;

            try
            {
                pisarz = new BufferedWriter(
                    new FileWriter(plikWybor.getSelectedFile()));
                pisarz.write(txtEdytor.getText());
                pisarz.close();
            }
            catch(IOException x)
            {
                System.err.format("Błąd WE/WY: %s%n", x);
            }
        }
    }

    public static void main(String[] args)
    {
        javax.swing.SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                zrobGUI();
            }
        });
    }

}