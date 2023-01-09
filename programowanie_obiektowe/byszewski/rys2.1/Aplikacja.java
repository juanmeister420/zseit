import javax.swing.*;

public class Aplikacja
{
    private static void zrobOkno()
    {
    JFrame okno = new JFrame( "Aplikacja" );

    okno.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

    okno.setSize( 400, 200 );
    okno.setLocation( 100, 50 );
    okno.setVisible( true );
    }

    public static void main( String[] args )
    {
        javax.swing.SwingUtilities.invokeLater( new Runnable()
        {
            public void run()
            {
                zrobOkno();
            }
        } );
    }
}