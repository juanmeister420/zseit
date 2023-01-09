import javax.swing.*;

public class PanelSpringLayout extends JPanel
{
    public PanelSpringLayout()
    {
        String [] napisy = {"Start", "Naprzód", "Zwiększ prędkość odtwarzania", "Wstecz", "Stop"};
        SpringLayout układ = new SpringLayout();
        setLayout(układ);

        JButton btnStart = (JButton) add(new JButton(napisy[0]));
        JButton btnNaprzod = (JButton) add(new JButton(napisy[1]));
        JButton btnZwieksz = (JButton) add(new JButton(napisy[2]));
        JButton btnWstecz = (JButton) add(new JButton(napisy[3]));
        JButton btnStop = (JButton) add(new JButton(napisy[4]));

        układ.putConstraint(SpringLayout.WEST, btnStart, 5, SpringLayout.WEST, this);
        układ.putConstraint(SpringLayout.NORTH, btnStart, 5, SpringLayout.NORTH, this);

        układ.putConstraint(SpringLayout.EAST, btnNaprzod, -5, SpringLayout.EAST, this);
        układ.putConstraint(SpringLayout.NORTH, btnNaprzod, 0, SpringLayout.NORTH, btnStart);

        układ.putConstraint(SpringLayout.WEST, btnZwieksz, 0, SpringLayout.WEST, btnStart);
        układ.putConstraint(SpringLayout.EAST, btnZwieksz, 0, SpringLayout.EAST, btnStop);
        układ.putConstraint(SpringLayout.NORTH, btnZwieksz, 10, SpringLayout.SOUTH, btnStart);

        układ.putConstraint(SpringLayout.WEST, btnWstecz, 0, SpringLayout.WEST, btnStart);
        układ.putConstraint(SpringLayout.SOUTH, btnWstecz, -5, SpringLayout.SOUTH, this);

        układ.putConstraint(SpringLayout.EAST, btnStop, 0, SpringLayout.EAST, btnNaprzod);
        układ.putConstraint(SpringLayout.SOUTH, btnStop, -5, SpringLayout.SOUTH, this);

    }
    
}