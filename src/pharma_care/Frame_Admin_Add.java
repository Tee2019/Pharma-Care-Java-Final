package pharma_care;

import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.util.*;
import java.text.*;
import javax.swing.table.*;
import java.text.SimpleDateFormat;

public class Frame_Admin_Add extends javax.swing.JFrame {

    JFrame adminpanel;
    ArrayList<Medicine> meds;

    public Frame_Admin_Add(JFrame adminpanel) {
        this.adminpanel = adminpanel;
        meds = new ArrayList<>();
        init();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        button_back_admin = new javax.swing.JButton();
        button_add = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        tf_strength = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tf_med_name = new javax.swing.JTextField();
        tf_manufacturer = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_indication = new javax.swing.JTextField();
        tf_generic_name = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        combo_box_dosage_form = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_price = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tf_stock = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel11.setText("ADD NEW MEDICINE");

        button_back_admin.setText("Cancel/Back");
        button_back_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_back_adminActionPerformed(evt);
            }
        });

        button_add.setText("Add");
        button_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_addActionPerformed(evt);
            }
        });

        tf_strength.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_strengthActionPerformed(evt);
            }
        });

        jLabel8.setText("Price");

        jLabel10.setText("Indication");

        tf_med_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_med_nameActionPerformed(evt);
            }
        });

        tf_manufacturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_manufacturerActionPerformed(evt);
            }
        });

        jLabel5.setText("Manufacturer");

        jLabel4.setText("Generic Name");

        tf_indication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_indicationActionPerformed(evt);
            }
        });

        jLabel9.setText("In Stock");

        combo_box_dosage_form.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[Select one]", "Tablet", "Syrup", "Injection", "Capsule", "Others" }));
        combo_box_dosage_form.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_box_dosage_formActionPerformed(evt);
            }
        });

        jLabel7.setText("Dosage Form");

        jLabel2.setText("Medicine Name");

        jLabel6.setText("Strength");

        tf_stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_stockActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tf_generic_name))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(tf_med_name))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_manufacturer)
                            .addComponent(tf_indication, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_price))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_strength)
                            .addComponent(combo_box_dosage_form, 0, 141, Short.MAX_VALUE)
                            .addComponent(tf_stock)))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_med_name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_strength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_generic_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(combo_box_dosage_form, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_manufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_indication, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(tf_stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel11))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(button_add)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(button_back_admin)))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_add)
                    .addComponent(button_back_admin))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void switchFrame() {
        adminpanel.setVisible(true);
        this.setVisible(false);
    }

    private void button_back_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_back_adminActionPerformed
        clearFields();
        switchFrame();
    }//GEN-LAST:event_button_back_adminActionPerformed

    public void clearFields() {
        tf_med_name.setText("");
        tf_manufacturer.setText("");
        tf_generic_name.setText("");
        combo_box_dosage_form.setSelectedIndex(0);
        tf_strength.setText("");
        tf_price.setText("");
        tf_stock.setText("");
        tf_indication.setText("");
    }

    public void arrayListFile(String medsArray[]) {
        String medName = medsArray[0];
        String manuFacturer = medsArray[1];
        String genericName = medsArray[2];
        String dosageForm = medsArray[3];
        String strength = medsArray[4];
        double price = -1;
        try {
            price = Double.parseDouble(medsArray[5]);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Price not valid!");
        }
        int stock = -1;
        try {
            stock = Integer.parseInt(medsArray[6]);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Stock Amount not Valid!");
        }
        String indication = medsArray[7];
        meds.add(new Medicine(medName, manuFacturer, genericName, dosageForm, strength, price, stock, indication));
    }

    private void readFile() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("MedInfo.txt"));
            String line;
            try {
                while ((line = br.readLine()) != null) {

                    String medsArray[] = line.split("\t");
                    arrayListFile(medsArray);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            br.close();
            for (var x : meds) {
                x.display();
                //System.out.println("this");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void init() {
        readFile();
    }

    private void button_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_addActionPerformed
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("MedInfo.txt"));

            for (Medicine m : meds) {
                m.display();
            }
            String medName = tf_med_name.getText();
            String manuFacturer = tf_manufacturer.getText();
            String genericName = tf_generic_name.getText();
            String dosageForm = combo_box_dosage_form.getSelectedItem().toString();
            String strength = tf_strength.getText();
            double price = -1;
            try {
                price = Double.parseDouble(tf_price.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Please Enter Valid Price!");
            }
            int stock = -1;
            try {
                stock = Integer.parseInt(tf_stock.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Please Enter Valid Stock Amount!");
            }
            String indication = tf_indication.getText();
            if (tf_med_name.getText().isEmpty() || tf_manufacturer.getText().isEmpty() || tf_generic_name.getText().isEmpty() || combo_box_dosage_form.getSelectedIndex() == 0 || tf_strength.getText().isEmpty() || tf_price.getText().isEmpty() || tf_stock.getText().isEmpty() || tf_indication.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please Enter All Fields!");
            } else {
                meds.add(new Medicine(medName, manuFacturer, genericName, dosageForm, strength, price, stock, indication));
                for (Medicine m : meds) {
                    bw.write(m.getMedName() + "\t" + m.getManuFacturer() + "\t" + m.getGenericName() + "\t" + m.getDosageForm() + "\t"
                            + m.getStrength() + "\t" + m.getPrice() + "\t" + m.getStock() + "\t" + m.getIndication());
                    bw.newLine();
                }
            }

            bw.close();
        } catch (IOException io) {
            JOptionPane.showMessageDialog(this, "Something Wrong with Writing in File!");
        }
        for (Medicine m : meds) {
            m.display();
        }
        clearFields();
    }//GEN-LAST:event_button_addActionPerformed

    private void tf_strengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_strengthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_strengthActionPerformed

    private void tf_med_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_med_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_med_nameActionPerformed

    private void tf_manufacturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_manufacturerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_manufacturerActionPerformed

    private void combo_box_dosage_formActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_box_dosage_formActionPerformed

    }//GEN-LAST:event_combo_box_dosage_formActionPerformed

    private void tf_stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_stockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_stockActionPerformed

    private void tf_indicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_indicationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_indicationActionPerformed

//    public static void main(String args[]) {
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
//            java.util.logging.Logger.getLogger(Frame_Admin_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Frame_Admin_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Frame_Admin_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Frame_Admin_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Frame_Admin_Add().setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_add;
    private javax.swing.JButton button_back_admin;
    private javax.swing.JComboBox<String> combo_box_dosage_form;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField tf_generic_name;
    private javax.swing.JTextField tf_indication;
    private javax.swing.JTextField tf_manufacturer;
    private javax.swing.JTextField tf_med_name;
    private javax.swing.JTextField tf_price;
    private javax.swing.JTextField tf_stock;
    private javax.swing.JTextField tf_strength;
    // End of variables declaration//GEN-END:variables
}
