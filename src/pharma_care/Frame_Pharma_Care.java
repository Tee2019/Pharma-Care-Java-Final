package pharma_care;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import javax.swing.JOptionPane;

public class Frame_Pharma_Care extends javax.swing.JFrame {

    Frame_Search search;
    Frame_Browse browse;
    Frame_Order order;
    Frame_Contact_Us contactus;
    Frame_Admin_Login adminLogin;
    ArrayList<Medicine> meds = new ArrayList<>();

    ;

    public Frame_Pharma_Care() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        button_admin_login = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        button_search = new javax.swing.JButton();
        button_browse = new javax.swing.JButton();
        button_order = new javax.swing.JButton();
        button_contact = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("PHARMA CARE");

        button_admin_login.setText("Admin Login");
        button_admin_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_admin_loginActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Main Menu");

        button_search.setText("Search");
        button_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_searchActionPerformed(evt);
            }
        });

        button_browse.setText("Browse");
        button_browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_browseActionPerformed(evt);
            }
        });

        button_order.setText("Order Now");
        button_order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_orderActionPerformed(evt);
            }
        });

        button_contact.setText("Contact Us");
        button_contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_contactActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(button_search, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_browse, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_order, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_contact, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(button_admin_login, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 146, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button_search)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button_browse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button_order)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button_contact)
                .addGap(34, 34, 34)
                .addComponent(button_admin_login)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_admin_loginActionPerformed(java.awt.event.ActionEvent evt) {
        if (adminLogin == null) {
            adminLogin = new Frame_Admin_Login(this);
        }
        this.setVisible(false);
        adminLogin.setVisible(true);
    }

    private void button_browseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_browseActionPerformed
        if (browse == null) {
            browse = new Frame_Browse(this);
        }
        this.setVisible(false);
        browse.setVisible(true);
    }//GEN-LAST:event_button_browseActionPerformed

    public void test() {
        Collections.addAll(meds, new Medicine("Alatrol", "Cetirize Hydrochloride", "Square Pharmaceuticals Ltd.", "Tablet", "10 mmg", 650.000000, 789, "seasonal and perennial allergic rhinitis"), new Medicine("Napa", "Paracetamol", "Beximco Pharmaceuticals Ltd.", "Tablet", "500 mg", 612.00, 395, "fever, cold"));
    }
    private void button_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_searchActionPerformed
        if (search == null) {
            search = new Frame_Search(this);
        }
        this.setVisible(false);
        search.setVisible(true);
    }//GEN-LAST:event_button_searchActionPerformed

    private void button_contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_contactActionPerformed
        if (contactus == null) {
            contactus = new Frame_Contact_Us(this);
        }
        this.setVisible(false);
        contactus.setVisible(true);
    }//GEN-LAST:event_button_contactActionPerformed

    private void button_orderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_orderActionPerformed
        if (order == null) {
            order = new Frame_Order(this);
        }
        this.setVisible(false);
        order.setVisible(true);
    }//GEN-LAST:event_button_orderActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_Pharma_Care().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_admin_login;
    private javax.swing.JButton button_browse;
    private javax.swing.JButton button_contact;
    private javax.swing.JButton button_order;
    private javax.swing.JButton button_search;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
