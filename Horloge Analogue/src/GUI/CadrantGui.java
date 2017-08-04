package GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by ernest on 30/07/17.
 */
public class CadrantGui extends JFrame
{
    Container container;
    Cadrant cadrant;

    public CadrantGui()
    {
        container = getContentPane();
        cadrant = new Cadrant();
        container.add(cadrant);
    }
}
