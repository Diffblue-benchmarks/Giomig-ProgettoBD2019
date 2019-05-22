/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.border.MatteBorder;

import progettobd2019.Persona;
/**
 *
 * @author emidio
 */
public class FemalePanel extends javax.swing.JPanel {

    
    /**
     * Creates new form NewJPanel
     */
    public FemalePanel(boolean fam) {
        Dimension size = new Dimension(470, 73);
        setPreferredSize(size);
        setMaximumSize(size);
        setSize(size);
        setBackground(new Color(230, 242, 255));
        setBorder(new MatteBorder(0, 0, 1, 0, new Color(0, 38, 77)));
        initComponents();
        setVisible(true);
        if(fam)
            familiare.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home/images/icons8-mi-piace-filled-32.png")));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        maleIcon = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        Cognome = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        familiare = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(470, 73));

        maleIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home/images/female.png"))); // NOI18N

        Title.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Title.setText("Avv.");

        Cognome.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Cognome.setText("Salvati");

        name.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        name.setText("Anna");

        familiare.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(maleIcon)
                .addGap(43, 43, 43)
                .addComponent(Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(name)
                .addGap(18, 18, 18)
                .addComponent(Cognome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(familiare)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(maleIcon))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(familiare)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Title)
                                .addComponent(Cognome)
                                .addComponent(name)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cognome;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel familiare;
    private javax.swing.JLabel maleIcon;
    private javax.swing.JLabel name;
    // End of variables declaration//GEN-END:variables
}
