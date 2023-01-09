import javax.swing.*;

public class AplikacjaPasekMenu extends JPanel 
{
    private static void zrobOkno()
    {
        JFrame okno = new JFrame("Aplikacja z paskiem menu");
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setJMenuBar(new PasekMenu());
        okno.setBounds(100, 50, 400, 200);
        okno.setVisible(true);
    }
    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
          public void run() {
            zrobOkno();
          }
        });
      }    
}