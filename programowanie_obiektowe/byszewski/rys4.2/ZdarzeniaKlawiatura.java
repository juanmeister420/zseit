import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ZdarzeniaKlawiatura extends JPanel
{
    final int SREDNICA = 24;
    int koloX;
    int koloY;
    
    public ZdarzeniaKlawiatura()
    {
        setFocusable(true);
        addKeyListener(new ObslugaKlawiatury());
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        g.setColor(Color.RED);
        g.fillOval(koloX, koloY, SREDNICA, SREDNICA);
    }

    class ObslugaKlawiatury implements KeyListener
    {
        public void keyReleased(KeyEvent evt) {}
        public void keyTyped(KeyEvent evt) {}

        public void keyPressed( KeyEvent evt )
        {
            int kod = evt.getKeyCode();
            switch (kod)
            {
                case KeyEvent.VK_LEFT:
                    koloX -= 5;
                    break;
                case KeyEvent.VK_RIGHT:
                    koloX += 5;
                    break;
                case KeyEvent.VK_UP:
                    koloY -= 5;
                    break;
                case KeyEvent.VK_DOWN:
                    koloY += 5;
                    break;
            }
            repaint();
        }
    }
}