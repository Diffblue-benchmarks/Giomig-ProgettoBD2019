/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;
/**
 *
 * @author emidio
 */

public class ContactButton extends JButton {
    private static final int WIDTH = 469;
    private static final int HEIGHT = 73;
           
    public ContactButton(){
        System.out.println(getPreferredSize() + "     " + getSize());
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        
        setBackground(Color.red);
       // setText("CLICCAMI");
        setVisible(true);
    }    
}
