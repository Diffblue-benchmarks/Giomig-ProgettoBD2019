/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;

import java.awt.Color;
import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;
import javax.swing.Box;
import javax.swing.JPanel;
import progettobd2019.*;

/**
 *
 * @author emidio
 */
public class UI extends javax.swing.JFrame {

    public static final String driver = "org.postgresql.Driver";
    public static Connection conn;

    /**
     * Creates new form UI
     */
    public UI() {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        Properties props = new Properties();
        String[] value = Accesso_utente();
        props.setProperty("user", value[0]);
        props.setProperty("password", value[1]);
        String url = "jdbc:postgresql://" + value[2] + ":" + value[3] + "/" + value[4];
        try {
            conn = DriverManager.getConnection(url, props);
            
            String query = "SELECT * FROM  settore";
            Statement st=conn.createStatement();
            ResultSet res = st.executeQuery(query);
            while (res.next()) {
                System.out.println(res.getString(1));
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        topPanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        searchBox = new javax.swing.JTextField();
        searchIco = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        rightSidePanel = new javax.swing.JPanel();
        userButton = new javax.swing.JPanel();
        userIco = new javax.swing.JLabel();
        userSide = new javax.swing.JPanel();
        addButton = new javax.swing.JPanel();
        addIco = new javax.swing.JLabel();
        addSide = new javax.swing.JPanel();
        famButton = new javax.swing.JPanel();
        famIco = new javax.swing.JLabel();
        famSide = new javax.swing.JPanel();
        infoPanel = new javax.swing.JPanel();
        toolPanel = new javax.swing.JPanel();
        editLabel = new javax.swing.JLabel();
        deleteLabel = new javax.swing.JLabel();
        infoScroll = new javax.swing.JScrollPane();
        infoScrollPanel = new javax.swing.JPanel();
        contactsPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Contacts");
        setName("Contacts"); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        topPanel.setBackground(new java.awt.Color(77, 77, 255));
        topPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        topPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, 218, 10));

        searchBox.setBackground(new java.awt.Color(77, 77, 255));
        searchBox.setForeground(new java.awt.Color(255, 255, 255));
        searchBox.setToolTipText("");
        searchBox.setBorder(null);
        topPanel.add(searchBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, 186, 27));

        searchIco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home/images/icons8-search-20.png"))); // NOI18N
        topPanel.add(searchIco, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home/images/banner.png"))); // NOI18N
        topPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        getContentPane().add(topPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, -1));

        rightSidePanel.setBackground(new java.awt.Color(77, 77, 255));

        userButton.setBackground(new java.awt.Color(0, 51, 128));
        userButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userButtonMousePressed(evt);
            }
        });

        userIco.setBackground(new java.awt.Color(255, 255, 255));
        userIco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userIco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home/images/icons8-contacts-32.png"))); // NOI18N

        userSide.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout userSideLayout = new javax.swing.GroupLayout(userSide);
        userSide.setLayout(userSideLayout);
        userSideLayout.setHorizontalGroup(
            userSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        userSideLayout.setVerticalGroup(
            userSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout userButtonLayout = new javax.swing.GroupLayout(userButton);
        userButton.setLayout(userButtonLayout);
        userButtonLayout.setHorizontalGroup(
            userButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userButtonLayout.createSequentialGroup()
                .addComponent(userSide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userIco)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        userButtonLayout.setVerticalGroup(
            userButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(userSide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(userButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(userIco)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        addButton.setBackground(new java.awt.Color(77, 77, 255));
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                addButtonMousePressed(evt);
            }
        });

        addIco.setBackground(new java.awt.Color(1, 68, 133));
        addIco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addIco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home/images/icons8-plus-32.png"))); // NOI18N

        addSide.setBackground(new java.awt.Color(255, 255, 255));
        addSide.setOpaque(false);

        javax.swing.GroupLayout addSideLayout = new javax.swing.GroupLayout(addSide);
        addSide.setLayout(addSideLayout);
        addSideLayout.setHorizontalGroup(
            addSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        addSideLayout.setVerticalGroup(
            addSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout addButtonLayout = new javax.swing.GroupLayout(addButton);
        addButton.setLayout(addButtonLayout);
        addButtonLayout.setHorizontalGroup(
            addButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addButtonLayout.createSequentialGroup()
                .addComponent(addSide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addIco)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addButtonLayout.setVerticalGroup(
            addButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addSide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(addButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addIco)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        famButton.setBackground(new java.awt.Color(77, 77, 255));
        famButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                famButtonMousePressed(evt);
            }
        });

        famIco.setBackground(new java.awt.Color(255, 255, 255));
        famIco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        famIco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home/images/icons8-mi-piace-filled-32.png"))); // NOI18N

        famSide.setBackground(new java.awt.Color(255, 255, 255));
        famSide.setOpaque(false);

        javax.swing.GroupLayout famSideLayout = new javax.swing.GroupLayout(famSide);
        famSide.setLayout(famSideLayout);
        famSideLayout.setHorizontalGroup(
            famSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        famSideLayout.setVerticalGroup(
            famSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout famButtonLayout = new javax.swing.GroupLayout(famButton);
        famButton.setLayout(famButtonLayout);
        famButtonLayout.setHorizontalGroup(
            famButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, famButtonLayout.createSequentialGroup()
                .addComponent(famSide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(famIco)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        famButtonLayout.setVerticalGroup(
            famButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(famSide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(famButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(famIco)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout rightSidePanelLayout = new javax.swing.GroupLayout(rightSidePanel);
        rightSidePanel.setLayout(rightSidePanelLayout);
        rightSidePanelLayout.setHorizontalGroup(
            rightSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(userButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(addButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(famButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        rightSidePanelLayout.setVerticalGroup(
            rightSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightSidePanelLayout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(userButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(famButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        getContentPane().add(rightSidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 60, 450));

        infoPanel.setBackground(new java.awt.Color(255, 255, 255));
        infoPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(0, 0, 0)));

        toolPanel.setBackground(new java.awt.Color(128, 159, 255));

        editLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home/images/icons8-edit-25.png"))); // NOI18N
        editLabel.setText("Edit");
        toolPanel.add(editLabel);

        deleteLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home/images/icons8-trash-can-25.png"))); // NOI18N
        deleteLabel.setText("Delete");
        toolPanel.add(deleteLabel);

        infoScroll.setBorder(null);
        infoScroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        infoScroll.setOpaque(false);

        javax.swing.GroupLayout infoScrollPanelLayout = new javax.swing.GroupLayout(infoScrollPanel);
        infoScrollPanel.setLayout(infoScrollPanelLayout);
        infoScrollPanelLayout.setHorizontalGroup(
            infoScrollPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 509, Short.MAX_VALUE)
        );
        infoScrollPanelLayout.setVerticalGroup(
            infoScrollPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 409, Short.MAX_VALUE)
        );

        infoScroll.setViewportView(infoScrollPanel);

        javax.swing.GroupLayout infoPanelLayout = new javax.swing.GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(infoScroll)
                    .addComponent(toolPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        infoPanelLayout.setVerticalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoPanelLayout.createSequentialGroup()
                .addComponent(infoScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(toolPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(infoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, 510, 450));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout contactsPanelLayout = new javax.swing.GroupLayout(contactsPanel);
        contactsPanel.setLayout(contactsPanelLayout);
        contactsPanelLayout.setHorizontalGroup(
            contactsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        contactsPanelLayout.setVerticalGroup(
            contactsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        getContentPane().add(contactsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 470, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMousePressed
        setColor(addButton);
        resetColor(userButton);
        resetColor(famButton);
        userSide.setOpaque(false);
        addSide.setOpaque(true);
        famSide.setOpaque(false);
        jPanel1.add(new MalePanel(false));
        jPanel1.add(Box.createRigidArea(new Dimension(5, 5)));
        jPanel1.add(new FemalePanel(true));
        jPanel1.add(Box.createRigidArea(new Dimension(5, 5)));
        
        infoScrollPanel.add(new newUserPanel());
        infoScrollPanel.validate();
        infoScrollPanel.repaint();
        
        validate();
        repaint();
    }//GEN-LAST:event_addButtonMousePressed

    private void userButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userButtonMousePressed
        setColor(userButton);
        resetColor(addButton);
        resetColor(famButton);
        addSide.setOpaque(false);
        famSide.setOpaque(false);
        userSide.setOpaque(true);
        jPanel1.removeAll();
        jPanel1.repaint();
        PersonaDAO pDAO = new PersonaDAO();
        List<Persona> list=pDAO.getAll();
        for (Persona persona : list) {
            if (persona.getSesso()=="M"){
                MalePanel mp=new MalePanel(persona.getFamiliare());
                mp.Title.setText(persona.getTitolo());
                mp.name.setText(persona.getNome());
                mp.Cognome.setText(persona.getCognome());
                jPanel1.add(mp);
            }
            else{
                FemalePanel fp=new FemalePanel(persona.getFamiliare());
                fp.Title.setText(persona.getTitolo());
                fp.name.setText(persona.getNome());
                fp.Cognome.setText(persona.getCognome());
                jPanel1.add(fp);
            }
        }
        jPanel1.repaint();
    }//GEN-LAST:event_userButtonMousePressed

    private void famButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_famButtonMousePressed
        setColor(famButton);
        resetColor(addButton);
        resetColor(userButton);
        addSide.setOpaque(false);
        userSide.setOpaque(false);
        famSide.setOpaque(true);
        jPanel1.removeAll();
        jPanel1.repaint();
    }//GEN-LAST:event_famButtonMousePressed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        try {
            conn.close();
        } catch (SQLException e) {

        }
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
    }

    static public String[] Accesso_utente() {
        try {
            Scanner s = new Scanner(new File("login.conf"));
            String[] x = new String[5];
            x[0] = s.nextLine().substring(10);
            x[1] = s.nextLine().substring(10);
            x[2] = s.nextLine().substring(10);
            x[3] = s.nextLine().substring(6);
            x[4] = s.nextLine().substring(10);
            return x;
        } catch (IOException e) {
            return null;
        }
    }

    private void setColor(JPanel panel) {
        panel.setBackground(new Color(0, 51, 128));
    }

    private void resetColor(JPanel panel) {
        panel.setBackground(new Color(77, 77, 255));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addButton;
    private javax.swing.JLabel addIco;
    private javax.swing.JPanel addSide;
    private javax.swing.JPanel contactsPanel;
    private javax.swing.JLabel deleteLabel;
    private javax.swing.JLabel editLabel;
    private javax.swing.JPanel famButton;
    private javax.swing.JLabel famIco;
    private javax.swing.JPanel famSide;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JScrollPane infoScroll;
    private javax.swing.JPanel infoScrollPanel;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel rightSidePanel;
    private javax.swing.JTextField searchBox;
    private javax.swing.JLabel searchIco;
    private javax.swing.JPanel toolPanel;
    private javax.swing.JPanel topPanel;
    private javax.swing.JPanel userButton;
    private javax.swing.JLabel userIco;
    private javax.swing.JPanel userSide;
    // End of variables declaration//GEN-END:variables
}
