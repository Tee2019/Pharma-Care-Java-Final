package pharma_care;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.table.*;

public class Frame_Browse extends javax.swing.JFrame {

    JFrame mainFrame, previous;
    private DefaultTableModel dtm;
    private ArrayList<Medicine> meds;
    private String medName;
    private String manuFacturer;
    private String genericName;
    private String dosageForm;
    private String strength;
    private double price;
    private int stock;
    private String indication;
    int index;

    public Frame_Browse(JFrame mainFrame) {
        this.mainFrame = mainFrame;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        table_browse1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        button_back_main = new javax.swing.JButton();
        button_browse = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_browse = new javax.swing.JTable();

        table_browse1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Manufacturer", "Generic ", "Dosage form", "Strength", "Price", "Stock", "Indication"
            }
        ));
        jScrollPane2.setViewportView(table_browse1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setText("Available Medicines ");

        button_back_main.setText("Back");
        button_back_main.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_back_mainActionPerformed(evt);
            }
        });

        button_browse.setText("Browse");
        button_browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_browseActionPerformed(evt);
            }
        });

        table_browse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Manufacturer", "Generic ", "Dosage form", "Strength", "Price", "Stock", "Indication"
            }
        ));
        jScrollPane3.setViewportView(table_browse);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(button_back_main)
                                .addGap(490, 490, 490)
                                .addComponent(button_browse)))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_back_main)
                    .addComponent(button_browse))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void switchFrame() {
        this.setVisible(false);
        mainFrame.setVisible(true);
    }

    private void button_back_mainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_back_mainActionPerformed
        switchFrame();
    }//GEN-LAST:event_button_back_mainActionPerformed
    public void ArrayList_file(String med_array[]) {
        medName = med_array[0];
        manuFacturer = med_array[1];
        genericName = med_array[2];
        dosageForm = med_array[3];
        strength = med_array[4];
        price = -1;
        try {
            price = Double.parseDouble(med_array[5]);

        } catch (NumberFormatException num) {
            num.printStackTrace();
        }
        stock = -1;
        try {
            stock = Integer.parseInt(med_array[6]);
        } catch (NumberFormatException num) {
            num.getMessage();
        }
        indication = med_array[7];
        meds.add(new Medicine(medName, manuFacturer, genericName, dosageForm, strength, price, stock, indication));
    }
    private void readFile() {
        meds = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("MedInfo.txt"));
            String line;
            try {
                while ((line = br.readLine()) != null) {
                    String med_array[] = line.split("\t");
                    ArrayList_file(med_array);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            br.close();
            for (var x : meds) {
                x.display();
                System.out.println("this");
            }
        } catch (IOException io) {
            io.printStackTrace();
        }
    }
    private void button_browseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_browseActionPerformed
readFile();
        for (var x : meds) {
            System.out.println(x.getMedName());

        }
        dtm = (DefaultTableModel) table_browse.getModel();
        try {

            dtm.setRowCount(0);

        } catch (NullPointerException np) {

        }
        for (var x : meds) {
            Object ob[] = {x.getMedName(), x.getManuFacturer(), x.getGenericName(), x.getDosageForm(), x.getStrength(), x.getPrice(), x.getStock(), x.getIndication()};
            dtm.addRow(ob);

        }    }//GEN-LAST:event_button_browseActionPerformed

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
//            java.util.logging.Logger.getLogger(Frame_Browse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Frame_Browse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Frame_Browse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Frame_Browse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Frame_Browse().setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_back_main;
    private javax.swing.JButton button_browse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable table_browse;
    private javax.swing.JTable table_browse1;
    // End of variables declaration//GEN-END:variables
}
