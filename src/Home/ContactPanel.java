/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Home;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;

/**
 *
 * @author emidio
 */
public class ContactPanel extends JPanel {

    Dimension size;
    
    
    public ContactPanel() {
        size = new Dimension(470, 73);
        setPreferredSize(size);
        setMaximumSize(size);
        setSize(size);
        setBackground(Color.yellow);
        setBorder(new MatteBorder(0, 0, 1, 0, Color.GREEN));
        setVisible(true);
    }
}
