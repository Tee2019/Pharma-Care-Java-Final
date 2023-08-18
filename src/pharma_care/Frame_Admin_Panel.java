package pharma_care;

import javax.swing.*;

public class Frame_Admin_Panel extends javax.swing.JFrame {

    JFrame adminPanel;
    Frame_Search search;
    Frame_Browse browse;
    Frame_Pharma_Care mainFrame;
    Frame_Tech_Support tech;
    Frame_Sales sales;
    Frame_Admin_Edit_Delete edit_delete;
    Frame_Admin_Add add_meds;

    public Frame_Admin_Panel(JFrame adminPanel) {
        this.adminPanel = adminPanel;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        button_add = new javax.swing.JButton();
        button_edit_delete = new javax.swing.JButton();
        button_browse = new javax.swing.JButton();
        button_search = new javax.swing.JButton();
        button_sales_record = new javax.swing.JButton();
        button_tech_support = new javax.swing.JButton();
        button_logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setText("ADMIN PANEL");

        button_add.setText("Add");
        button_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_addActionPerformed(evt);
            }
        });

        button_edit_delete.setText("Edit/Delete");
        button_edit_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_edit_deleteActionPerformed(evt);
            }
        });

        button_browse.setText("Browse");
        button_browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_browseActionPerformed(evt);
            }
        });

        button_search.setText("Search");
        button_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_searchActionPerformed(evt);
            }
        });

        button_sales_record.setText("Sales Record");
        button_sales_record.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_sales_recordActionPerformed(evt);
            }
        });

        button_tech_support.setText("Tech-Support");
        button_tech_support.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_tech_supportActionPerformed(evt);
            }
        });

        button_logout.setText("Log out");
        button_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button_add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button_edit_delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button_browse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button_search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button_sales_record, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button_tech_support, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(button_logout)))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(button_add)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button_edit_delete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button_browse, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button_search, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button_sales_record, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button_tech_support)
                .addGap(18, 18, 18)
                .addComponent(button_logout)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_browseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_browseActionPerformed
        if (browse == null) {
            browse = new Frame_Browse(this);
        }
        this.setVisible(false);
        browse.setVisible(true);
    }//GEN-LAST:event_button_browseActionPerformed

    private void button_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_logoutActionPerformed
        switchFrame();
    }//GEN-LAST:event_button_logoutActionPerformed

    private void button_tech_supportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_tech_supportActionPerformed
        if (tech == null) {
            tech = new Frame_Tech_Support(this);
        }
        this.setVisible(false);
        tech.setVisible(true);
    }//GEN-LAST:event_button_tech_supportActionPerformed

    private void button_edit_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_edit_deleteActionPerformed
        if (edit_delete == null) {
            edit_delete = new Frame_Admin_Edit_Delete(this);
        }
        this.setVisible(false);
        edit_delete.setVisible(true);
    }//GEN-LAST:event_button_edit_deleteActionPerformed

    private void button_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_addActionPerformed
        if (add_meds == null) {
            add_meds = new Frame_Admin_Add(this);
        }
        this.setVisible(false);
        add_meds.setVisible(true);
    }//GEN-LAST:event_button_addActionPerformed

    private void button_sales_recordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_sales_recordActionPerformed
        if (sales == null) {
            sales = new Frame_Sales(this);
        }
        this.setVisible(false);
        sales.setVisible(true);
    }//GEN-LAST:event_button_sales_recordActionPerformed

    private void button_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_searchActionPerformed
        if (search == null) {
            search = new Frame_Search(this);
        }
        this.setVisible(false);
        search.setVisible(true);
    }//GEN-LAST:event_button_searchActionPerformed

    public void switchFrame() {
        mainFrame = new Frame_Pharma_Care();
        mainFrame.setVisible(true);
        this.setVisible(false);
    }

//    public static void main(String args[])
//    {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Frame_Admin_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Frame_Admin_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Frame_Admin_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Frame_Admin_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Frame_Admin_Panel().setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_add;
    private javax.swing.JButton button_browse;
    private javax.swing.JButton button_edit_delete;
    private javax.swing.JButton button_logout;
    private javax.swing.JButton button_sales_record;
    private javax.swing.JButton button_search;
    private javax.swing.JButton button_tech_support;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
