import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


public class Zycie extends JPanel implements ChangeListener, ActionListener
{
    private ZycieSilnik silnik;

    private JLabel etykWrsz;
    private JLabel etykKlmn;
    private JLabel etykPkln;

    private JSpinner lbWrsz;
    private JSpinner lbKlmn;
    private JTextField numPkln;

    private JButton pklnNastepne;

    private ZycieSiatka zycieSiatka;

    public Zycie()
    {
        super(new GridBagLayout());
        silnik = new ZycieSilnik();

        Font czcionka = new Font("Arial", Font.BOLD, 16);

        etykWrsz = new JLabel("Wiersze", SwingConstants.CENTER);
        etykWrsz.setFont(czcionka);

        etykKlmn = new JLabel("Kolumny", SwingConstants.CENTER);
        etykKlmn.setFont(czcionka);

        lbWrsz = new JSpinner(new SpinnerNumberModel(ZycieSilnik.WRSZ_MIN, ZycieSilnik.WRSZ_MIN, ZycieSilnik.WRSZ_MAX, 1));
        lbWrsz.setFont(czcionka);
        ustawSrodek(lbWrsz);
        lbWrsz.addChangeListener(this);

        lbKlmn = new JSpinner(new SpinnerNumberModel(ZycieSilnik.KLMN_MIN, ZycieSilnik.KLMN_MIN, ZycieSilnik.KLMN_MAX, 1));
        lbKlmn.setFont(czcionka);
        ustawSrodek(lbKlmn);
        lbKlmn.addChangeListener(this);

        numPkln = new JTextField(Integer.toString(ZycieSilnik.PKLN_MIN));
        numPkln.setFont(czcionka);
        numPkln.setEditable(false);
        numPkln.setHorizontalAlignment(SwingConstants.CENTER);

        pklnNastepne = new JButton("Nastepne");
        pklnNastepne.setFont(czcionka);
        pklnNastepne.addActionListener(this);

        zycieSiatka = new ZycieSiatka(silnik);
        JScrollPane pnlprzewijanie = new JScrollPane(zycieSiatka);

        GridBagConstraints ogranicz = new GridBagConstraints();
        ogranicz.fill = GridBagConstraints.HORIZONTAL;
        ogranicz.weightx = 1.0;
        ogranicz.insets = new Insets(5, 10, 0, 10);

        add(etykWrsz, ustawOgraniczniki(ogranicz, 0, 0));
        add(etykKlmn, ustawOgraniczniki(ogranicz, 1, 0));
        add(etykPkln, ustawOgraniczniki(ogranicz, 2, 0));

        add(lbWrsz, ustawOgraniczniki(ogranicz, 0, 1));
        add(lbKlmn, ustawOgraniczniki(ogranicz, 1, 1));
        add(numPkln, ustawOgraniczniki(ogranicz, 2, 1));
        add(pklnNastepne, ustawOgraniczniki(ogranicz, 3, 1));

        ogranicz.weighty = 1.0;
        ogranicz.gridwidth = 4;
        ogranicz.fill = GridBagConstraints.BOTH;
        add(pnlprzewijanie, ustawOgraniczniki(ogranicz, 0, 2));
    }

    private GridBagConstraints ustawOgraniczniki(GridBagConstraints gbc, int gridx, int gridy)
    {
        gbc.gridx = gridx;
        gbc.gridy = gridy;

        return gbc;
    }

    private void ustawSrodek(JSpinner spinner)
    {
        JComponent txtPole = spinner.getEditor();
        if(txtPole instanceof JSpinner.DefaultEditor)
        {
            JFormattedTextField ftfPole = ((JSpinner.DefaultEditor)txtPole).getTextField();
            ftfPole.setHorizontalAlignment(SwingConstants.CENTER);
        }
    }

    public void stateChanged(ChangeEvent e)
    {
        silnik.setKlmnWrsz((int)lbKlmn.getValue(), (int)lbWrsz.getValue());
        zycieSiatka.ustawRozmiar();
    }

    public void actionPerformed(ActionEvent e)
    {
        silnik.obliczNastepne();
        numPkln.setText(Integer.toString(silnik.getPkln()));
        updateUI();
    }

    public static void zrobOkno()
    {
        JFrame okno = new JFrame("Symulacja");
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setContentPane(new Zycie());

        okno.pack();
        okno.setLocation(100, 50);
        okno.setVisible(true);
    }

    public static void main(String[] args)
    {
        javax.swing.SwingUtilities.invokeLater(new Runnable()
        {
            public void run() {
                zrobOkno();
            }
        });
    }
}