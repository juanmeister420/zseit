import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Konwerter extends JPanel
{
    private static final long serialVersionUID = 1L;

    private static final String [] TEMP_SKALA = 
                    {"Celsjusz", "Fahrenheit", "Kelvin"};
    private static final String [] TEMP_MIN = {"-273.15", "-459.67", "0"};
    private static final double TEMP_MAX = 400;

    private JComboBox<String> cmbListaWe;
    private JComboBox<String> cmbListaWy;
    private JTextField txtTempWe;
    private JTextField txtTempWy;
    private JButton btnPrzelicz;
    private JSlider sldSuwak;

    public Konwerter()
    {
        setLayout(new GridBagLayout());

        Font czcionka = new Font("Arial", Font.BOLD, 24);

        cmbListaWe = new JComboBox<String>(TEMP_SKALA);
        cmbListaWe.setFont(czcionka);
        cmbListaWe.addActionListener(new KonwerterSkalaWe());

        cmbListaWy = new JComboBox<String>(TEMP_SKALA);
        cmbListaWy.setFont(czcionka);
        cmbListaWy.addActionListener(new KonwerterSkalaWy());

        txtTempWe = new JTextField("0");
        txtTempWe.setFont(czcionka);
        txtTempWe.setEditable(false);

        txtTempWy = new JTextField();
        txtTempWy.setFont(czcionka);
        txtTempWy.setEditable(false);

        btnPrzelicz = new JButton("Przelicz");
        btnPrzelicz.setFont(czcionka);
        btnPrzelicz.addActionListener(new KonwerterPrzelicz());

        sldSuwak = new JSlider((int)Double.parseDouble(TEMP_MIN[ 0 ]), (int)TEMP_MAX, 0 );
        sldSuwak.addChangeListener(new KonwerterSuwak());

        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1.0;

        add(cmbListaWe, ustawOgraniczenia(c, 0, 0, new Insets(10, 10, 0, 10)));
        add(cmbListaWy, ustawOgraniczenia(c, 2, 0, null));
        add(txtTempWe, ustawOgraniczenia(c, 0, 1, null));
        add(btnPrzelicz, ustawOgraniczenia(c, 1, 1, null));
        add(txtTempWy, ustawOgraniczenia(c, 2, 1, null));

        c.weighty = 1.0;
        c.anchor = GridBagConstraints.FIRST_LINE_START;
        add(sldSuwak, ustawOgraniczenia(c, 0, 2, new Insets(0, 10, 0, 10)));
    }

    private GridBagConstraints ustawOgraniczenia(GridBagConstraints gbc, int gridx, int gridy, Insets insets)
    {
        gbc.gridx = gridx;
        gbc.gridy = gridy;

        if(insets != null) gbc.insets = insets;
        
        return gbc;
    }

    public static void zrobOkno()
    {
        JFrame okno = new JFrame("Konwerter");
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JComponent panel = new Konwerter();
        panel.setOpaque(true);
        okno.setContentPane(panel);

        okno.setSize(600, 200);
        okno.setLocation(100, 50);
        okno.setVisible(true);
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                zrobOkno();
            }
        });
    }

    class KonwerterSkalaWe implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            double temp = Double.parseDouble(txtTempWy.getText());
            if (temp > TEMP_MAX)
                txtTempWe.setText(String.format("%0.1f", TEMP_MAX));
            else
            {
                temp = Math.max(temp, Double.parseDouble(TEMP_MIN[cmbListaWe.getSelectedIndex()]));
                txtTempWe.setText(String.format("%.0f", temp));
            }

            txtTempWe.setText("");

            sldSuwak.setMinimum((int)Double.parseDouble(TEMP_MIN[cmbListaWe.getSelectedIndex()]));
            sldSuwak.setMajorTickSpacing((int)((sldSuwak.getMaximum() - sldSuwak.getMinimum()) / 20));
        }
    }

    class KonwerterSkalaWy implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            txtTempWy.setText("");
        }
    }

    class KonwerterPrzelicz implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            double tempWe = Double.parseDouble(txtTempWe.getText());
            double tempK = 0;
            double tempWy = 0;

            switch(cmbListaWe.getSelectedIndex())
            {
                case 0:
                    tempK = tempWe + 273.15;
                    break;
                case 1:
                    tempK = (tempWe + 459.67) * 5 / 9;
                    break;
                case 2:
                    tempK = tempWe;
                    break;
            }

            switch(cmbListaWy.getSelectedIndex())
            {
                case 0:
                    tempWy = tempK - 273.15; 
                    break;
                case 1:
                    tempWy = tempK * 9 / 5 - 459.67;
                    break;
                case 2:
                    tempWy = tempK;
                    break;
            }

            txtTempWy.setText(String.format("%.2f", tempWy));
        }
    }

    class KonwerterSuwak implements ChangeListener
    {
        public void stateChanged(ChangeEvent e)
        {
            txtTempWe.setText(String.format("%s", sldSuwak.getValue()));
            txtTempWy.setText("");
        }
    }
}