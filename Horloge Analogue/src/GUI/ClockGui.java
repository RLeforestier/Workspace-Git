package GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by ernest on 30/07/17.
 */
public class ClockGui extends JPanel
{

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(Color.gray);
        g.fillOval(0, 0, getWidth() , getHeight() );
        g.setColor(Color.white);
        g.fillOval(getWidth()/20, getHeight()/20, getWidth() -(getHeight()/10), getHeight() -(getWidth()/10));
    }
}
