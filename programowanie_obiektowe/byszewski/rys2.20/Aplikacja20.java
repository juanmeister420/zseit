import javax.swing.*;

public class Aplikacja20
{
    private static void zrobOkno()
    {
        String pytanie = "Czy zapisać zmiany na dysku?";
        String tytul = "Zapisywanie dokumentu";
        String komunikat = "";

        int odpowiedz = JOptionPane.showConfirmDialog( null,
            pytanie, tytul, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE );

        switch ( odpowiedz )
        {
            case JOptionPane.YES_OPTION:
                komunikat = "TAK";
                break;
            case JOptionPane.NO_OPTION:
                komunikat = "NIE";
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