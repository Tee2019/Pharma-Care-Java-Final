package pharma_care;

import java.util.*;
import java.io.*;
import javax.swing.*;
import javax.swing.table.*;

public class Frame_Search extends javax.swing.JFrame {

    JFrame mainFrame;
    private ArrayList<Medicine> meds;
    private DefaultTableModel dtm;
    private String medName;
    private String manuFacturer;
    private String genericName;
    private String dosageForm;
    private String strength;
    private double price;
    private int stock;
    private String indication;

    public Frame_Search(JFrame mainFrame) {
        meds = new ArrayList<>();
        this.mainFrame = mainFrame;
        init();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tf_search = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_seach = new javax.swing.JTable();
        button_back_main = new javax.swing.JButton();
        button_search = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tf_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_searchActionPerformed(evt);
            }
        });

        table_seach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicine Name", "Menufacturer", "Generic Name", "Price", "Strength", "Indications"
            }
        ));
        jScrollPane1.setViewportView(table_seach);

        button_back_main.setText("Back");
        button_back_main.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_back_mainActionPerformed(evt);
            }
        });

        button_search.setText("Search");
        button_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_searchActionPerformed(evt);
            }
        });

        jLabel1.setText("Enter the search key");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button_back_main)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tf_search, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button_search))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_search))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(button_back_main)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void switchFrame() {
        mainFrame.setVisible(true);
        this.setVisible(false);
    }
    private void button_back_mainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_back_mainActionPerformed
        try {
            dtm.setRowCount(0);
        } catch (NullPointerException e) {
        } finally {
            switchFrame();
        }
    }//GEN-LAST:event_button_back_mainActionPerformed

    private void tf_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_searchActionPerformed

    private void readFile() {
        meds = new ArrayList<>();
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
                System.out.println("this");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void arrayListFile(String medsArray[]) {
        medName = medsArray[0];
        manuFacturer = medsArray[1];
        genericName = medsArray[2];
        dosageForm = medsArray[3];
        strength = medsArray[4];
        price = -1;
        try {
            price = Double.parseDouble(medsArray[5]);
        } catch (NumberFormatException np) {
            JOptionPane.showMessageDialog(this, "Price not valid!");
        }
        stock = -1;
        try {
            stock = Integer.parseInt(medsArray[6]);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Stock Amount not Valid!");
        }
        indication = medsArray[7];
        meds.add(new Medicine(medName, manuFacturer, genericName, dosageForm, strength, price, stock, indication));
    }

    private void init() {
        readFile();
    }

    private void button_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_searchActionPerformed
        dtm = (DefaultTableModel) table_seach.getModel();
        try {
            BufferedReader br = new BufferedReader(new FileReader("MedInfo.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                try {
                    String medsArray[] = line.split("\t");
                    arrayListFile(medsArray);
                } catch (NullPointerException np) {
                    JOptionPane.showMessageDialog(this, "File Empty!");
                }
            }
            int flag = 0;
            String key = tf_search.getText();
            if (key.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Insert search key!");
            } else {
                for (Medicine m : meds) {
                    if (m.getMedName().toLowerCase().contains(key.toLowerCase()) == true || m.getDosageForm().toLowerCase().contains(key.toLowerCase()) == true || m.getGenericName().toLowerCase().contains(key.toLowerCase()) == true) {
                        dtm.setRowCount(0);
                        try {
                            Object ob[] = {m.getMedName(), m.getManuFacturer(), m.getGenericName(), m.getPrice(), m.getDosageForm(), m.getIndication()};
                            dtm.addRow(ob);
                            flag++;
                        } catch (NullPointerException np) {
                            JOptionPane.showMessageDialog(this, "File Empty!");
                        }
                    }
                }
                if (flag == 0) {
                    JOptionPane.showMessageDialog(this, "Search Result Not Found");
                }
                tf_search.setText("");
            }
            br.close();
        } catch (IOException io) {
            JOptionPane.showMessageDialog(this, "Something wrong with file");
        }
    }//GEN-LAST:event_button_searchActionPerformed

//    public static void main(String args[]) {
//
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//               /// new Frame_Search().setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_back_main;
    private javax.swing.JButton button_search;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_seach;
    private javax.swing.JTextField tf_search;
    // End of variables declaration//GEN-END:variables
}
