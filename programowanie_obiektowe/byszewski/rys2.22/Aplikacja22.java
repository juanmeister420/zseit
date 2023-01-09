import javax.swing.*;

public class Aplikacja22
{
    private static void zrobOkno()
    {
        String pytanie = "Nazwa pliku:";
        String tytul = "Zapisywanie pliku";
        
        String odpowiedz = (String)JOptionPane.showInputDialog( null,
            pytanie, tytul, JOptionPane.QUESTION_MESSAGE );

        System.out.println( "Nazwa pliku: " + odpowiedz );
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