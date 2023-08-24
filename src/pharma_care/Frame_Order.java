package pharma_care;

import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

public class Frame_Order extends javax.swing.JFrame {

    private DefaultTableModel dtm_search, dtm_cart, dtm_total_price;
    public JFrame mainFrame, userFrame;
    private Cart cart;
    private ArrayList<Medicine> meds;
    private Medicine med;
    private double totalCost;
    private String medName;
    private String manuFacturer;
    private String genericName;
    private String dosageForm;
    private String strength;
    private double price;
    private int stock;
    private String indication;

    public Frame_Order(JFrame mainFrame) {
        cart = new Cart();
        totalCost = 0;
        this.mainFrame = mainFrame;
        init();
        initComponents();
    }

    public void displayArrayList() {
        for (var x : meds) {
            x.display();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        button_back_main = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_search = new javax.swing.JTable();
        tf_search = new javax.swing.JTextField();
        button_search = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        button_add_cart = new javax.swing.JButton();
        button_show_all = new javax.swing.JButton();
        spinner_qty = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_cart = new javax.swing.JTable();
        button_remove_cart = new javax.swing.JButton();
        button_place_order = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_total_price = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        button_back_main.setText("Cancel");
        button_back_main.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_back_mainActionPerformed(evt);
            }
        });

        table_search.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicine Name", "Strength", "Stock", "Price"
            }
        ));
        jScrollPane1.setViewportView(table_search);

        tf_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_searchActionPerformed(evt);
            }
        });

        button_search.setText("Search");
        button_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_searchActionPerformed(evt);
            }
        });

        jLabel1.setText("Enter the search key");

        button_add_cart.setText("Add to Cart");
        button_add_cart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_add_cartActionPerformed(evt);
            }
        });

        button_show_all.setText("Show All");
        button_show_all.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_show_allActionPerformed(evt);
            }
        });

        spinner_qty.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jLabel4.setText("Qty");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(button_back_main)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spinner_qty, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button_add_cart, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(tf_search, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(button_search)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(button_show_all))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_search)
                    .addComponent(button_show_all))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(spinner_qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(button_add_cart))
                    .addComponent(button_back_main))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel2.setText("ORDER PANEL");

        table_cart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicine Name", "Quantity", "Price"
            }
        ));
        jScrollPane2.setViewportView(table_cart);

        button_remove_cart.setText("Remove from Cart");
        button_remove_cart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_remove_cartActionPerformed(evt);
            }
        });

        button_place_order.setText("Place Order");
        button_place_order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_place_orderActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CART");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        table_total_price.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Total Price", ""
            }
        ));
        table_total_price.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane3.setViewportView(table_total_price);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(button_remove_cart)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(button_place_order))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(311, 311, 311)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(button_remove_cart)
                            .addComponent(button_place_order)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void switchFrame() {
        mainFrame.setVisible(true);
        this.setVisible(false);
    }

    public Cart getCart() {
        return cart;
    }

    private void init() {
        readFile();
    }

    private void readFile() {
        if (meds == null) {
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
        //displayArrayList();
    }

    private void writeMedFile() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("MedInfo.txt"));
            for (Medicine m : meds) {
                bw.write(m.getMedName() + "\t" + m.getManuFacturer() + "\t" + m.getGenericName() + "\t" + m.getDosageForm() + "\t"
                        + m.getStrength() + "\t" + m.getPrice() + "\t" + m.getStock() + "\t" + m.getIndication());
                bw.newLine();
            }
            bw.close();
        } catch (Exception e) {
        }
    }

    private void button_back_mainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_back_mainActionPerformed
        if (table_cart.getRowCount() != 0) {
            int choice = JOptionPane.showConfirmDialog(this, "Do you want to proceed?", "Message",
                    JOptionPane.OK_CANCEL_OPTION);
            if (choice == 0) {
                try {
                    dtm_search.setRowCount(0);
                    dtm_cart.setRowCount(0);
                    table_total_price.getColumnModel().getColumn(1).setHeaderValue("");
                    table_total_price.getTableHeader().repaint();
                } catch (NullPointerException e) {
                }
                switchFrame();
            }
        } else {
            try {
                dtm_search.setRowCount(0);
                dtm_cart.setRowCount(0);
                table_total_price.getColumnModel().getColumn(1).setHeaderValue("");
                table_total_price.getTableHeader().repaint();
            } catch (NullPointerException e) {
            }
            switchFrame();
        }
    }//GEN-LAST:event_button_back_mainActionPerformed

    private void tf_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_searchActionPerformed

    }//GEN-LAST:event_tf_searchActionPerformed

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

    private void button_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_searchActionPerformed
        dtm_search = (DefaultTableModel) table_search.getModel();
        int flag = 0;
        String key = tf_search.getText();
        if (key.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Insert search key!");
        } else {
            for (Medicine m : meds) {
                if (m.getMedName().toLowerCase().contains(key.toLowerCase()) == true || m.getDosageForm().toLowerCase().contains(key.toLowerCase()) == true || m.getGenericName().toLowerCase().contains(key.toLowerCase()) == true) {
                    dtm_search.setRowCount(0);
                    try {
                        Object ob[] = {m.getMedName(), m.getStrength(), m.getStock(), m.getPrice()};
                        dtm_search.addRow(ob);
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
    }//GEN-LAST:event_button_searchActionPerformed

    private void button_add_cartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_add_cartActionPerformed
        dtm_cart = (DefaultTableModel) table_cart.getModel();
        dtm_total_price = (DefaultTableModel) table_total_price.getModel();

        try {
            String name = table_search.getValueAt(table_search.getSelectedRow(), table_search.getSelectedRow()).toString();
            for (Medicine m : meds) {
                if (name.equals(m.getMedName())) {
                    med = m;
                }
            }
            dtm_total_price.setColumnCount(1);
            try {
                int quantity = Integer.parseInt(spinner_qty.getValue().toString());
                if (quantity <= med.getStock()) {
                    cart.addMed(med, quantity);
                    totalCost += cart.getTotalPrice();
                    Object ob[] = {med.getMedName(), quantity, cart.getTotalPrice()};
                    dtm_cart.addRow(ob);
                    //dtm_total_price.addColumn((Object) totalCost);
                } else {
                    //dtm_total_price.addColumn((Object) totalCost);
                    JOptionPane.showMessageDialog(this, "Sorry, stock limited!");
                }
                dtm_total_price.addColumn((Object) totalCost);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Unexpected error! Try again");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "Please select an item!");
        }
        spinner_qty.setValue(((SpinnerNumberModel) spinner_qty.getModel()).getMinimum());
    }//GEN-LAST:event_button_add_cartActionPerformed

    private void button_remove_cartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_remove_cartActionPerformed
        dtm_cart = (DefaultTableModel) table_cart.getModel();
        if (dtm_cart.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Cart is empty!");
        } else {
            String name = table_search.getValueAt(table_search.getSelectedRow(), table_search.getSelectedRow()).toString();
            for (Medicine m : meds) {
                if (name.equals(m.getMedName())) {
                    med = m;
                }
            }
            try {
                if (table_cart.getSelectedRowCount() == 1) {
                    totalCost -= Double.parseDouble(table_cart.getValueAt(table_cart.getSelectedRow(), 2).toString());
                    med.increaseStock(Integer.parseInt(table_cart.getValueAt(table_cart.getSelectedRow(), 1).toString()));
                    dtm_cart.removeRow(table_cart.getSelectedRow());
                } else {
                    JOptionPane.showMessageDialog(this, "Select an item to remove");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Unexpected error! Try again");
            }
            table_total_price.getColumnModel().getColumn(1).setHeaderValue(totalCost);
            table_total_price.getTableHeader().repaint();
        }
    }//GEN-LAST:event_button_remove_cartActionPerformed

    private void button_show_allActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_show_allActionPerformed
        readFile();
        for (var x : meds) {
            System.out.println(x.getMedName());
        }
        dtm_search = (DefaultTableModel) table_search.getModel();
        try {
            dtm_search.setRowCount(0);
        } catch (NullPointerException np) {
            np.printStackTrace();
        }

        for (var x : meds) {
            Object ob[] = {x.getMedName(), x.getStrength(), x.getStock(), x.getPrice()};
            dtm_search.addRow(ob);
        }
    }//GEN-LAST:event_button_show_allActionPerformed

    private void button_place_orderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_place_orderActionPerformed
        for (var x : cart.getMedicines()) {
            if (meds.contains(x)) {
                meds.get(meds.indexOf(x)).decreaseStock(x.getQuantity());
            }
        }

        JOptionPane.showMessageDialog(this, "Please provide further information");
        writeMedFile();

        dtm_search.setRowCount(0);
        dtm_cart.setRowCount(0);
        table_total_price.getColumnModel().getColumn(1).setHeaderValue("");
        table_total_price.getTableHeader().repaint();
        userFrame = new Frame_User_Info(this, cart);
        userFrame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_button_place_orderActionPerformed

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
//            java.util.logging.Logger.getLogger(Frame_Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Frame_Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Frame_Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Frame_Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Frame_Order().setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_add_cart;
    private javax.swing.JButton button_back_main;
    private javax.swing.JButton button_place_order;
    private javax.swing.JButton button_remove_cart;
    private javax.swing.JButton button_search;
    private javax.swing.JButton button_show_all;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner spinner_qty;
    private javax.swing.JTable table_cart;
    private javax.swing.JTable table_search;
    private javax.swing.JTable table_total_price;
    private javax.swing.JTextField tf_search;
    // End of variables declaration//GEN-END:variables
}
