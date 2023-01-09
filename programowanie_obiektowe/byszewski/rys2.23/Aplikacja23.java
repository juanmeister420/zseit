import javax.swing.*;

public class Aplikacja23
{
    private static void zrobOkno()
    {
        String [] propozycje = { "C: (System)", "D:(Dane)", "E:(Zapas)" };
        String pytanie = "Na którym dysku zapisać plik:";
        String tytul = "Zapisywanie dokumentu";

        String odpowiedz = (String)JOptionPane.showInputDialog( null,
            pytanie, tytul, JOptionPane.QUESTION_MESSAGE, null,
            propozycje, propozycje[1] );

        System.out.println( "Odpowiedź: " + odpowiedz );
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