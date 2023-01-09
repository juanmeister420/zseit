import javax.swing.*;

public class Aplikacja19
{
    private static void zrobOkno()
    {
       final String komunikat = "Aplikacja gotowa do pracy!";
       final String tytul = "Start aplikacji";

       JOptionPane.showMessageDialog( null,
            komunikat, tytul, JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main( String[] args )
    {
        javax.swing.SwingUtilities.invokeLater( new Runnable()
        {
            public void run() {
                zrobOkno();
            }
        } );
    }
}