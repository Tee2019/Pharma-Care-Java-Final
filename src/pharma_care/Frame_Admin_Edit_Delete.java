package pharma_care;

import javax.swing.JFrame;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.io.*;
import java.util.Collections;
import javax.swing.*;

public class Frame_Admin_Edit_Delete extends javax.swing.JFrame {

    private JFrame mainFrame;
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

    public Frame_Admin_Edit_Delete(JFrame mainFrame) {

        init();
        this.mainFrame = mainFrame;
        initComponents();
    }

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

    private void writeFile() {
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

    private void init() {
        readFile();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tf_search = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        button_show_all = new javax.swing.JButton();
        button_update = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        combo_box_dosage_form = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        tf_indication = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tf_stock = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tf_manufacturer = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tf_strength = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tf_price = new javax.swing.JTextField();
        tf_med_name = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_generic_name = new javax.swing.JTextField();
        button_delete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        button_edit = new javax.swing.JButton();
        button_back_admin_panel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        button_search = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_edit_delete = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tf_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_searchActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setText("EDIT/DELETE");

        button_show_all.setText("Show All");
        button_show_all.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_show_allActionPerformed(evt);
            }
        });

        button_update.setText("Update");
        button_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_updateActionPerformed(evt);
            }
        });

        combo_box_dosage_form.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[Select one]", "Tablet", "Syrup", "Injection", "Capsule", "Others" }));
        combo_box_dosage_form.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_box_dosage_formActionPerformed(evt);
            }
        });

        jLabel5.setText("Generic Name");

        jLabel11.setText("Price");

        tf_stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_stockActionPerformed(evt);
            }
        });

        jLabel10.setText("Indication");

        tf_manufacturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_manufacturerActionPerformed(evt);
            }
        });

        jLabel7.setText("Strength");

        jLabel8.setText("Dosage Form");

        tf_strength.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_strengthActionPerformed(evt);
            }
        });

        jLabel9.setText("In Stock");

        tf_med_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_med_nameActionPerformed(evt);
            }
        });

        jLabel6.setText("Manufacturer");

        jLabel4.setText("Medicine Name");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf_manufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(tf_generic_name, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(26, 26, 26)
                        .addComponent(tf_med_name, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf_strength, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(combo_box_dosage_form, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf_price, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf_stock, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf_indication, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_med_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(tf_generic_name, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(tf_manufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(tf_indication, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_strength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(combo_box_dosage_form, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(tf_stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        button_delete.setText("Delete");
        button_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_deleteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Search Results");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        button_edit.setText("Edit");
        button_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_editActionPerformed(evt);
            }
        });

        button_back_admin_panel.setText("Cancel/Back");
        button_back_admin_panel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_back_admin_panelActionPerformed(evt);
            }
        });

        jLabel2.setText("Enter the search key");

        button_search.setText("Search");
        button_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_searchActionPerformed(evt);
            }
        });

        jScrollPane2.setHorizontalScrollBar(null);

        table_edit_delete.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " Med Name", "Generic Name", "Dosage Form"
            }
        ));
        table_edit_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_edit_deleteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table_edit_delete);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tf_search, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button_search, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(256, 256, 256)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jLabel1)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(button_show_all)
                        .addGap(51, 51, 51)
                        .addComponent(button_edit)
                        .addGap(55, 55, 55)
                        .addComponent(button_delete)
                        .addGap(36, 36, 36)
                        .addComponent(button_update)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button_back_admin_panel)
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_search))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_show_all)
                    .addComponent(button_edit)
                    .addComponent(button_delete)
                    .addComponent(button_update)
                    .addComponent(button_back_admin_panel))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void clearEditFields() {
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
        medName = medsArray[0];
        manuFacturer = medsArray[1];
        genericName = medsArray[2];
        dosageForm = medsArray[3];
        strength = medsArray[4];
        price = -1;
        try {
            price = Double.parseDouble(medsArray[5]);
        } catch (NumberFormatException e) {
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

    private void tf_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_searchActionPerformed

    }//GEN-LAST:event_tf_searchActionPerformed

    private void button_show_allActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_show_allActionPerformed
        readFile();
        for (var x : meds) {
            System.out.println(x.getMedName());
        }
        dtm = (DefaultTableModel) table_edit_delete.getModel();
        try {
            dtm.setRowCount(0);
        } catch (NullPointerException np) {
        }

        for (var x : meds) {
            Object ob[] = {x.getMedName(), x.getGenericName(), x.getDosageForm()};
            dtm.addRow(ob);
        }
    }//GEN-LAST:event_button_show_allActionPerformed

    private void combo_box_dosage_formActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_box_dosage_formActionPerformed

    }//GEN-LAST:event_combo_box_dosage_formActionPerformed

    private void tf_stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_stockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_stockActionPerformed

    private void tf_manufacturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_manufacturerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_manufacturerActionPerformed

    private void tf_strengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_strengthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_strengthActionPerformed

    private void tf_med_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_med_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_med_nameActionPerformed

    private void button_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_deleteActionPerformed
        if (table_edit_delete.getSelectedRow() > -1) {

            index = 0;
            int rowIndex = table_edit_delete.getSelectedRow();
            String tmedName = dtm.getValueAt(rowIndex, 0).toString();
            String tgenericName = dtm.getValueAt(rowIndex, 1).toString();
            String tdosageForm = dtm.getValueAt(rowIndex, 2).toString();
            for (Medicine m : meds) {
                if (tmedName.equals(m.getMedName()) && tgenericName.equals(m.getGenericName()) && tdosageForm.equals(m.getDosageForm())) {
                    break;
                }
                index++;
            }
            dtm.removeRow(rowIndex);
            meds.remove(index);
            writeFile();
        }
    }//GEN-LAST:event_button_deleteActionPerformed

    private void button_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_editActionPerformed
        if (table_edit_delete.getSelectedRow() > -1) {
            int rowIndex = table_edit_delete.getSelectedRow();
            String tmedName = dtm.getValueAt(rowIndex, 0).toString();
            String tgenericName = dtm.getValueAt(rowIndex, 1).toString();
            String tdosageForm = dtm.getValueAt(rowIndex, 2).toString();

            index = 0;
            for (Medicine m : meds) {
                if (tmedName.equals(m.getMedName()) && tgenericName.equals(m.getGenericName()) && tdosageForm.equals(m.getDosageForm())) {
                    tf_med_name.setText(medName);
                    tf_manufacturer.setText(manuFacturer);
                    tf_generic_name.setText(genericName);
                    //combo_box_dosage_form.setSelectedIndex(0);
                    combo_box_dosage_form.setSelectedItem(dtm.getValueAt(rowIndex, 2).toString());
                    tf_strength.setText(strength);
                    tf_price.setText(String.valueOf(price));
                    tf_stock.setText(String.valueOf(stock));
                    tf_indication.setText(indication);
                    break;
                }
                index++;
            }
        }
    }//GEN-LAST:event_button_editActionPerformed

    private void button_back_admin_panelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_back_admin_panelActionPerformed
        try {
            dtm.setRowCount(0);
        } catch (NullPointerException np) {
        } finally {
            switchFrame();
        }
    }//GEN-LAST:event_button_back_admin_panelActionPerformed

    private void button_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_searchActionPerformed
        dtm = (DefaultTableModel) table_edit_delete.getModel();
        try {
            BufferedReader br = new BufferedReader(new FileReader("MedInfo.txt"));
//            try {
//                String medsTitle[] = br.readLine().split("\t");
//                Object title[] = {medsTitle[0], medsTitle[2], medsTitle[3]};
//                dtm.setColumnIdentifiers(title);
//            } catch (NullPointerException np) {
//                JOptionPane.showMessageDialog(this, "File Empty!");
//            }
            String line;
            while ((line = br.readLine()) != null) {
                try {
                    String medsArray[] = line.split("\t");
                    medName = medsArray[0];
                    manuFacturer = medsArray[1];
                    genericName = medsArray[2];
                    dosageForm = medsArray[3];
                    strength = medsArray[4];
                    price = -1;
                    try {
                        price = Double.parseDouble(medsArray[5]);
                    } catch (NumberFormatException e) {
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
                } catch (NullPointerException np) {
                    JOptionPane.showMessageDialog(this, "File Empty!");
                }
            }
            String searchKey = tf_search.getText();
            int flag = 0;
            if (tf_search.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Insert search key!");
            } else {
                for (Medicine m : meds) {
                    if (m.getMedName().toLowerCase().contains(searchKey.toLowerCase()) == true || m.getGenericName().toLowerCase().contains(searchKey.toLowerCase()) == true || m.getDosageForm().toLowerCase().contains(searchKey.toLowerCase()) == true) {
                        dtm.setRowCount(0);
                        try {
                            Object ob[] = {m.getMedName(), m.getGenericName(), m.getDosageForm()};
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
            JOptionPane.showMessageDialog(this, "Something Wrong with File!");
        }
    }//GEN-LAST:event_button_searchActionPerformed

    private void table_edit_deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_edit_deleteMouseClicked

    }//GEN-LAST:event_table_edit_deleteMouseClicked

    private void button_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_updateActionPerformed
        medName = tf_med_name.getText();
        manuFacturer = tf_manufacturer.getText();
        genericName = tf_generic_name.getText();
        dosageForm = combo_box_dosage_form.getSelectedItem().toString();
        strength = tf_strength.getText();
        price = -1;
        try {
            price = Double.parseDouble(tf_price.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please Enter Valid Price!");
        }
        stock = -1;
        try {
            stock = Integer.parseInt(tf_stock.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please Enter Valid Stock Amount!");
        }
        indication = tf_indication.getText();

        if (tf_med_name.getText().isEmpty() || tf_manufacturer.getText().isEmpty() || tf_generic_name.getText().isEmpty() || combo_box_dosage_form.getSelectedIndex() == 0 || tf_strength.getText().isEmpty() || tf_price.getText().isEmpty() || tf_stock.getText().isEmpty() || tf_indication.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Enter All Fields!");
        } else {
            meds.get(index).setMedName(medName);
            meds.get(index).setManuFacturer(manuFacturer);
            meds.get(index).setGenericName(genericName);
            meds.get(index).setDosageForm(dosageForm);
            meds.get(index).setStrength(strength);
            meds.get(index).setPrice(price);
            meds.get(index).setStock(stock);
            meds.get(index).setIndication(indication);
            writeFile();
        }
        clearFields();
    }//GEN-LAST:event_button_updateActionPerformed

    public void switchFrame() {
        mainFrame.setVisible(true);
        this.setVisible(false);
    }
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
//            java.util.logging.Logger.getLogger(Frame_Admin_Edit_Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Frame_Admin_Edit_Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Frame_Admin_Edit_Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Frame_Admin_Edit_Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Frame_Admin_Edit_Delete().setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_back_admin_panel;
    private javax.swing.JButton button_delete;
    private javax.swing.JButton button_edit;
    private javax.swing.JButton button_search;
    private javax.swing.JButton button_show_all;
    private javax.swing.JButton button_update;
    private javax.swing.JComboBox<String> combo_box_dosage_form;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table_edit_delete;
    private javax.swing.JTextField tf_generic_name;
    private javax.swing.JTextField tf_indication;
    private javax.swing.JTextField tf_manufacturer;
    private javax.swing.JTextField tf_med_name;
    private javax.swing.JTextField tf_price;
    private javax.swing.JTextField tf_search;
    private javax.swing.JTextField tf_stock;
    private javax.swing.JTextField tf_strength;
    // End of variables declaration//GEN-END:variables
}
