/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.internal;

import controller.ItemController;
import controller.Validator;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.Item;

/**
 *
 * @author sandakelum
 */
public class ViewItem extends javax.swing.JInternalFrame {

    /**
     * Creates new form ViewItem
     */
    DefaultTableModel model;
    Validator validator;
    
    

    public ViewItem() {
        initComponents();
        loadItems();
        rbtnByItemCode.setSelected(true);
        validator = new Validator();
        JButton btns[] = {btnDeleteItem,btnUpdateItem};
        validator.disableSubmit(btns);
        
    }

    public void loadItems() {
        try {
            ItemController items = new ItemController();
            ResultSet r = items.loadItems();

            model = (DefaultTableModel) tblItems.getModel();
            model.setRowCount(0);
            while (r.next()) {
                Vector v = new Vector();
                v.add(r.getString("itemCode"));
                v.add(r.getString("itemName"));
                v.add(r.getFloat("itemPrice"));
                v.add(r.getInt("quantity"));
                model.addRow(v);
            }

            tblItems.setModel(model);

        } catch (Exception e) {
        }
    }

    public void searchItems(String col, String data) {
        try {
            ItemController items = new ItemController();
            ResultSet r = items.searchItems(col, data);

            model = (DefaultTableModel) tblItems.getModel();
            model.setRowCount(0);
            while (r.next()) {
                Vector v = new Vector();
                v.add(r.getString("itemCode"));
                v.add(r.getString("itemName"));
                v.add(r.getFloat("itemPrice"));
                v.add(r.getInt("quantity"));
                model.addRow(v);
            }

            tblItems.setModel(model);

        } catch (Exception e) {
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGsearchOpption = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtItemSearchBox = new javax.swing.JTextField();
        rbtnByItemCode = new javax.swing.JRadioButton();
        rbtnByItemName = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        lblItemCode = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtItemName = new javax.swing.JTextField();
        txtItemPrice = new javax.swing.JTextField();
        txtItemQuantity = new javax.swing.JTextField();
        btnDeleteItem = new javax.swing.JButton();
        btnUpdateItem = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblItems = new javax.swing.JTable();
        btnRefresh = new javax.swing.JButton();

        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(31, 161, 240), 1, true));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("View items");

        jPanel1.setMaximumSize(new java.awt.Dimension(500, 32767));
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 100));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 525));

        jLabel2.setFont(new java.awt.Font("Monaco", 1, 13)); // NOI18N
        jLabel2.setText("Search ");

        txtItemSearchBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtItemSearchBoxKeyReleased(evt);
            }
        });

        btnGsearchOpption.add(rbtnByItemCode);
        rbtnByItemCode.setText("By item code");
        rbtnByItemCode.setActionCommand("itemcode");
        rbtnByItemCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnByItemCodeActionPerformed(evt);
            }
        });

        btnGsearchOpption.add(rbtnByItemName);
        rbtnByItemName.setText("By item name");
        rbtnByItemName.setActionCommand("itemname");

        jLabel3.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        jLabel3.setText("Item Code");

        lblItemCode.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        jLabel5.setText("Quantity");

        jLabel6.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        jLabel6.setText("Price");

        jLabel7.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        jLabel7.setText("Item Name");

        txtItemName.setFont(new java.awt.Font("Monaco", 0, 14)); // NOI18N
        txtItemName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtItemNameKeyReleased(evt);
            }
        });

        txtItemPrice.setFont(new java.awt.Font("Monaco", 0, 14)); // NOI18N
        txtItemPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtItemPriceKeyReleased(evt);
            }
        });

        txtItemQuantity.setFont(new java.awt.Font("Monaco", 0, 14)); // NOI18N
        txtItemQuantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtItemQuantityKeyReleased(evt);
            }
        });

        btnDeleteItem.setBackground(new java.awt.Color(218, 57, 57));
        btnDeleteItem.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteItem.setText("Delete Selected");
        btnDeleteItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteItemActionPerformed(evt);
            }
        });

        btnUpdateItem.setBackground(new java.awt.Color(19, 142, 72));
        btnUpdateItem.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateItem.setText("Update Selected");
        btnUpdateItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rbtnByItemCode)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rbtnByItemName))
                            .addComponent(txtItemSearchBox)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(lblItemCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtItemPrice, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtItemName)
                            .addComponent(txtItemQuantity, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnDeleteItem, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(btnUpdateItem, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtItemSearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnByItemCode)
                    .addComponent(rbtnByItemName))
                .addGap(3, 3, 3)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblItemCode))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtItemPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtItemQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteItem)
                    .addComponent(btnUpdateItem))
                .addContainerGap(210, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        jLabel1.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Item Table");

        tblItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "Item Name", "Price", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Float.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblItems.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblItemsMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblItems);

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnRefresh))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtnByItemCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnByItemCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnByItemCodeActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed

        loadItems();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void tblItemsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblItemsMousePressed
        int row = tblItems.getSelectedRow();
        lblItemCode.setText(tblItems.getModel().getValueAt(row, 0).toString());
        txtItemName.setText(tblItems.getModel().getValueAt(row, 1).toString());
        txtItemPrice.setText(tblItems.getModel().getValueAt(row, 2).toString());
        txtItemQuantity.setText(tblItems.getModel().getValueAt(row, 3).toString());
        
        checkTxtBoxIsEmpty();

    }//GEN-LAST:event_tblItemsMousePressed

    private void clearTxtBox() {
        lblItemCode.setText("");
        txtItemName.setText("");
        txtItemPrice.setText("");
        txtItemQuantity.setText("");

    }

    private void btnDeleteItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteItemActionPerformed
        ItemController ic = new ItemController();
        ic.deleteItem(lblItemCode.getText());
        loadItems();
        clearTxtBox();
    }//GEN-LAST:event_btnDeleteItemActionPerformed

    private void btnUpdateItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateItemActionPerformed
        Item item = new Item(lblItemCode.getText(), txtItemName.getText(), Float.parseFloat(txtItemPrice.getText()), Integer.parseInt(txtItemQuantity.getText()));
        ItemController ic = new ItemController(item);
        ic.updateItem();
        loadItems();
        clearTxtBox();
    }//GEN-LAST:event_btnUpdateItemActionPerformed

    private void txtItemSearchBoxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtItemSearchBoxKeyReleased
        String stype = btnGsearchOpption.getSelection().getActionCommand();
//        System.out.println(stype);
        if (stype.equals("itemcode")) {
            searchItems("itemCode", txtItemSearchBox.getText());
        }
        if (stype.equals("itemname")) {
            searchItems("itemName", txtItemSearchBox.getText());
        }
    }//GEN-LAST:event_txtItemSearchBoxKeyReleased

    private void checkTxtBoxIsEmpty() {

        JTextField txts[] = {txtItemName, txtItemPrice, txtItemQuantity};
        JButton btns[] = {btnDeleteItem,btnUpdateItem};
        validator.txtBoxIsEmpty(txts, btns);

    }

    private void txtItemNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtItemNameKeyReleased
        checkTxtBoxIsEmpty();
        validator.txtMax(txtItemName, 100);
    }//GEN-LAST:event_txtItemNameKeyReleased

    private void txtItemPriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtItemPriceKeyReleased
        checkTxtBoxIsEmpty();
        validator.txtMax(txtItemPrice, 11);
        validator.txtDigit(txtItemPrice);
    }//GEN-LAST:event_txtItemPriceKeyReleased

    private void txtItemQuantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtItemQuantityKeyReleased
        checkTxtBoxIsEmpty();
        validator.txtMax(txtItemPrice, 11);
        validator.txtDigit(txtItemPrice);
    }//GEN-LAST:event_txtItemQuantityKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteItem;
    private javax.swing.ButtonGroup btnGsearchOpption;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnUpdateItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblItemCode;
    private javax.swing.JRadioButton rbtnByItemCode;
    private javax.swing.JRadioButton rbtnByItemName;
    private javax.swing.JTable tblItems;
    private javax.swing.JTextField txtItemName;
    private javax.swing.JTextField txtItemPrice;
    private javax.swing.JTextField txtItemQuantity;
    private javax.swing.JTextField txtItemSearchBox;
    // End of variables declaration//GEN-END:variables
}