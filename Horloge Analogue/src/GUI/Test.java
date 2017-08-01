package GUI;

import javax.swing.*;

/**
 * Created by ernest on 30/07/17.
 */
public class Test
{
    public static void main(String args[])
    {
        CadrantGui cadrantGui = new CadrantGui();
        cadrantGui.setTitle("Dufenschmirzt");
        cadrantGui.setSize(400,400);
        cadrantGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cadrantGui.setLocationRelativeTo(null);
        cadrantGui.setVisible(true);
    }
}
