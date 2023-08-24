package pharma_care;

import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

public class Frame_Sales extends javax.swing.JFrame {

    JFrame mainFrame;
    ArrayList<Order> orders;
    ArrayList<Medicine> med;
    private Order order;

    private DefaultTableModel dtm;

    public Frame_Sales(JFrame mainFrame) {
        med = new ArrayList<>();
        orders = new ArrayList<>();
        this.mainFrame = mainFrame;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table_order = new javax.swing.JTable();
        button_back_admin_panel = new javax.swing.JButton();
        button_receipt = new javax.swing.JButton();
        button_all_receipt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        button_show_orders = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table_order.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Name", "Contact Number"
            }
        ));
        jScrollPane1.setViewportView(table_order);

        button_back_admin_panel.setText("Back");
        button_back_admin_panel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_back_admin_panelActionPerformed(evt);
            }
        });

        button_receipt.setText("Show Receipt");
        button_receipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_receiptActionPerformed(evt);
            }
        });

        button_all_receipt.setText("Show All Receipt");
        button_all_receipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_all_receiptActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setText("Order List");

        button_show_orders.setText("Orders");
        button_show_orders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_show_ordersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(button_back_admin_panel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button_show_orders)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button_receipt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(button_all_receipt)))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_back_admin_panel)
                    .addComponent(button_receipt)
                    .addComponent(button_all_receipt)
                    .addComponent(button_show_orders))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void switchFrame() {
        mainFrame.setVisible(true);
        this.setVisible(false);
    }
    private void button_back_admin_panelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_back_admin_panelActionPerformed
        switchFrame();
    }//GEN-LAST:event_button_back_admin_panelActionPerformed

    private void addOrder() {
        User user1 = new User("MD. Abujar Hossain Jim", "Mohammadpur", "01*-********");
        User user2 = new User("Abu Saleh Naeem", "Bosila", "01*-********");
        User user3 = new User("Sajin Ahmed", "Jatrabari", "01*-********");
        med.add(new Medicine("Napa", "Beximco Pharma", "Paracetamol", "Tablet", "500 mg", 50.75, 238, "Fever, Headache"));
        med.add(new Medicine("Maxpro", "Renata Ltd.", "Esomeprazole", "Capsule", "20 mg", 100.0, 360, "Acidity"));
        //Collections.addAll(med, new Medicine("Napa", "Beximco Pharma", "Paracetamol", "Tablet", "500 mg", 50.75, 238, "Fever, Headache"), new Medicine("Maxpro", "Renata Ltd.", "Esomeprazole", "Capsule", "20 mg", 100.0, 360, "Acidity"));
        Cart cart1 = new Cart();
        Cart cart2 = new Cart();
        Cart cart3 = new Cart();
        cart1.addMed(med.get(0), 2);
        cart1.addMed(med.get(1), 4);
        cart2.addMed(med.get(1), 2);
        cart2.addMed(med.get(0), 4);
        cart3.addMed(med.get(1), 1);
        cart3.addMed(med.get(0), 3);
        //order = new Order(user1, cart1);
        orders.add(new Order(user1, cart1));
        orders.add(new Order(user2, cart2));
        orders.add(new Order(user3, cart3));
    }

    private void button_receiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_receiptActionPerformed
        try {
            int oID = Integer.parseInt(table_order.getValueAt(table_order.getSelectedRow(), table_order.getSelectedRow()).toString());
            for (Order o : orders) {
                if (oID == o.getoId()) {
                    order = o;
                }
            }
            order.getUser().displayReceipt();
        } catch (NumberFormatException np) {
            np.printStackTrace();
        }
    }//GEN-LAST:event_button_receiptActionPerformed

    private void button_all_receiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_all_receiptActionPerformed

    }//GEN-LAST:event_button_all_receiptActionPerformed

    private void button_show_ordersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_show_ordersActionPerformed
        dtm = (DefaultTableModel) table_order.getModel();
        addOrder();
        try {

            dtm.setRowCount(0);
        } catch (NullPointerException np) {

        }
        for (var x : orders) {
            Object ob[] = {x.getoId(), x.getUser().getName(), x.getUser().getContactNumber()};
            dtm.addRow(ob);
        }
    }//GEN-LAST:event_button_show_ordersActionPerformed

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
//            java.util.logging.Logger.getLogger(Frame_Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Frame_Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Frame_Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Frame_Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Frame_Sales().setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_all_receipt;
    private javax.swing.JButton button_back_admin_panel;
    private javax.swing.JButton button_receipt;
    private javax.swing.JButton button_show_orders;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_order;
    // End of variables declaration//GEN-END:variables
}
