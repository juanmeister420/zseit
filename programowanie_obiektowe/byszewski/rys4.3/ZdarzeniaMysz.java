import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ZdarzeniaMysz extends JPanel 
{
    final int SREDNICA = 24;
    int koloX;
    int koloY;

    public ZdarzeniaMysz()
    {
        addMouseListener(new ObslugaMyszki());
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        g.setColor(Color.RED);
        g.fillOval(koloX, koloY, SREDNICA, SREDNICA);
    }

    class ObslugaMyszki implements MouseListener
    {
        public void mouseReleased(MouseEvent evt) {}
        public void mouseEntered(MouseEvent evt) {}
        public void mouseExited(MouseEvent evt) {}
        public void mousePressed(MouseEvent evt) {}
        public void mouseClicked(MouseEvent evt)
        {
            koloX = evt.getX();
            koloY = evt.getY();
            repaint();
        }
    }
}