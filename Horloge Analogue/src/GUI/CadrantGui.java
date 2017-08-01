package GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by ernest on 30/07/17.
 */
public class CadrantGui extends JFrame
{
    Container container;
    ClockGui clockGui;

    public CadrantGui()
    {
        container = getContentPane();
        clockGui = new ClockGui();
        container.add(clockGui);
    }
}
