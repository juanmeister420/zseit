import javax.swing.*;

public class Aplikacja21
{
    private static void zrobOkno()
    {
        String [] propozycje = { "Tak, zapisz", "Raczej nie", "Anuluj" };
        String pytanie = "Czy zapisać zmiany na dysku?";
        String tytul = "Zapisywanie dokumentu";
        String komunikat = "";

        int odpowiedz = JOptionPane.showOptionDialog( null,
            pytanie, tytul, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, propozycje, propozycje[1] );

        switch ( odpowiedz )
        {
            case JOptionPane.YES_OPTION:
                komunikat = "TAK";
                break;
            case JOptionPane.NO_OPTION:
                komunikat = "NIE";
                break;
            case JOptionPane.CANCEL_OPTION:
                komunikat = "ANULUJ";
                break;
            default:
                komunikat = "???";
                break;
        }
        System.out.println( "Odpowiedź: " + komunikat );
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