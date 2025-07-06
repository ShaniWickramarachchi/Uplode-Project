
 
package Juice2;
import java.sql.Statement;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;h ;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import JuiceBarManagement2.db;

import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JOptionPane;
import java.awt.Dimension;
import java.awt.Font;



public class PlaceOrder extends javax.swing.JFrame {

    
    public PlaceOrder() {
        initComponents();
        loadCategories();
        updateGrandTotal();
        loadCartTable();

        
        
 jComboBoxcatogory.addActionListener(evt -> {
        String selectedCategory = (String) jComboBoxcatogory.getSelectedItem();
        if (selectedCategory != null) {
            loadProductsByCategory(selectedCategory);
        }
    });
 
 jSpinnerQuantity.addChangeListener(e -> {
    calculateTotal();
});

txtprice.addActionListener(e -> {
    calculateTotal();
});


    }

    public PlaceOrder(String email) {
       
    }

    public void productNameByCategory(String category) {
       

    }

    public void filterProductByname(String name, String category) {
       

    }

    public void clearProductFields() {
        

    }

    public void validateField() {
       
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBoxname = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtcusname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtcusmobile = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtcusemail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxcatogory = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        jSpinnerQuantity = new javax.swing.JSpinner();
        btnclear = new javax.swing.JButton();
        btnaddtocart = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        txtgrandtotal = new javax.swing.JTextField();
        btnbill = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/place order.png"))); // NOI18N
        jLabel1.setText("Place Order");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 34, -1, -1));
        getContentPane().add(jComboBoxname, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 150, 240, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Bill ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 113, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Customer Detailes");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 156, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 199, -1, -1));

        txtcusname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtcusname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcusnameKeyReleased(evt);
            }
        });
        getContentPane().add(txtcusname, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 242, 250, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Mobile Number");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 291, -1, -1));

        txtcusmobile.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtcusmobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcusmobileKeyReleased(evt);
            }
        });
        getContentPane().add(txtcusmobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 334, 250, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Email");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 383, -1, -1));

        txtcusemail.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtcusemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcusemailKeyReleased(evt);
            }
        });
        getContentPane().add(txtcusemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 426, 250, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Category");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 113, -1, -1));

        jComboBoxcatogory.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jComboBoxcatogory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxcatogoryActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxcatogory, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 156, 250, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Name");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(697, 113, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Price");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1025, 113, -1, -1));

        txtprice.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(1025, 156, 250, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Quantity");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(697, 205, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Total");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1025, 205, -1, -1));

        txttotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txttotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotalActionPerformed(evt);
            }
        });
        getContentPane().add(txttotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1025, 248, 250, -1));

        jSpinnerQuantity.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jSpinnerQuantity.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerQuantityStateChanged(evt);
            }
        });
        getContentPane().add(jSpinnerQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(697, 248, 250, -1));

        btnclear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnclear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        getContentPane().add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(697, 297, -1, -1));

        btnaddtocart.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnaddtocart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add to cart.png"))); // NOI18N
        btnaddtocart.setText("Add to Cart");
        btnaddtocart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddtocartActionPerformed(evt);
            }
        });
        getContentPane().add(btnaddtocart, new org.netbeans.lib.awtextra.AbsoluteConstraints(1143, 291, -1, -1));

        jTable2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "PRICE", "QUANTITY", "TOTAL"
            }
        ));
        jTable2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable2AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(697, 355, 578, 278));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("Grand Total RS");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(697, 654, -1, -1));

        txtgrandtotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtgrandtotal.setText("000");
        txtgrandtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtgrandtotalActionPerformed(evt);
            }
        });
        getContentPane().add(txtgrandtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(843, 651, 90, -1));

        btnbill.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnbill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/generate bill & print.png"))); // NOI18N
        btnbill.setText("Generate Bill & Print");
        btnbill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbillActionPerformed(evt);
            }
        });
        getContentPane().add(btnbill, new org.netbeans.lib.awtextra.AbsoluteConstraints(1083, 655, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setText("--");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Big background.jpg"))); // NOI18N
        jLabel17.setText("jLabel17");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxcatogoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxcatogoryActionPerformed
  
    }//GEN-LAST:event_jComboBoxcatogoryActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        
    }//GEN-LAST:event_formComponentShown

    private void jSpinnerQuantityStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerQuantityStateChanged
        
    }//GEN-LAST:event_jSpinnerQuantityStateChanged

    private void btnaddtocartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddtocartActionPerformed
     
    String customerName = txtcusname.getText();
    String customerMobile = txtcusmobile.getText();
    String customerEmail = txtcusemail.getText();
    String category = (String) jComboBoxcatogory.getSelectedItem();
    String product = (String) jComboBoxname.getSelectedItem();
    double price = Double.parseDouble(txtprice.getText());
    int quantity = (int) jSpinnerQuantity.getValue();
    double total = price * quantity;

    try {
        Connection con = db.getConnection();
        String sql = "INSERT INTO cart (customer_name, customer_mobile, customer_email, category, product_name, price, quantity, total) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, customerName);
        pst.setString(2, customerMobile);
        pst.setString(3, customerEmail);
        pst.setString(4, category);
        pst.setString(5, product);
        pst.setDouble(6, price);
        pst.setInt(7, quantity);
        pst.setDouble(8, total);

        pst.executeUpdate();
        JOptionPane.showMessageDialog(this, "Item added to cart successfully!");

        // Reload table
        loadCartTable();
    } catch (Exception e) {
        
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Failed to add item to cart.");
    }


    }//GEN-LAST:event_btnaddtocartActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
      
    }//GEN-LAST:event_btnclearActionPerformed

    private void txtcusnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcusnameKeyReleased
        
    }//GEN-LAST:event_txtcusnameKeyReleased

    private void txtcusmobileKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcusmobileKeyReleased
      
    }//GEN-LAST:event_txtcusmobileKeyReleased

    private void txtcusemailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcusemailKeyReleased
        
    }//GEN-LAST:event_txtcusemailKeyReleased

    private void btnbillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbillActionPerformed
      
    String customerName = txtcusname.getText();
    String customerMobile = txtcusmobile.getText();
    String customerEmail = txtcusemail.getText();
    StringBuilder bill = new StringBuilder();

    bill.append("********** CUSTOMER BILL **********\n");
    bill.append("Name   : ").append(customerName).append("\n");
    bill.append("Mobile : ").append(customerMobile).append("\n");
    bill.append("Email  : ").append(customerEmail).append("\n");
    bill.append("-----------------------------------\n");
    bill.append(String.format("%-12s %-10s %-7s %-8s %-8s\n", "Category", "Product", "Price", "Qty", "Total"));
    bill.append("-----------------------------------\n");

    DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
    double grandTotal = 0;

    for (int i = 0; i < model.getRowCount(); i++) {
        String category = model.getValueAt(i, 0).toString();
        String product = model.getValueAt(i, 1).toString();
        String price = model.getValueAt(i, 2).toString();
        String qty = model.getValueAt(i, 3).toString();
        String total = model.getValueAt(i, 4).toString();

        bill.append(String.format("%-12s %-10s %-7s %-8s %-8s\n", category, product, price, qty, total));
        grandTotal += Double.parseDouble(total);
    }

    bill.append("-----------------------------------\n");
    bill.append("GRAND TOTAL: Rs. ").append(String.format("%.2f", grandTotal)).append("\n");
    bill.append("-----------------------------------\n");
    bill.append("Thank you for shopping with us!\n");

    // Show bill in a dialog
    JTextArea textArea = new JTextArea(bill.toString());
    textArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
    try {
        textArea.print(); // directly print
    } catch (Exception ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error while printing the bill.");
    }

    // Optional: Also show in a dialog window
    JScrollPane scrollPane = new JScrollPane(textArea);
    scrollPane.setPreferredSize(new Dimension(500, 400));
    JOptionPane.showMessageDialog(this, scrollPane, "Customer Bill", JOptionPane.INFORMATION_MESSAGE);

 
    }//GEN-LAST:event_btnbillActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        
    }//GEN-LAST:event_jTable2MouseClicked

    private void txttotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttotalActionPerformed

    private void jTable2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable2AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable2AncestorAdded

    private void txtgrandtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgrandtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtgrandtotalActionPerformed


    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlaceOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddtocart;
    private javax.swing.JButton btnbill;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBoxcatogory;
    private javax.swing.JComboBox<String> jComboBoxname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinnerQuantity;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txtcusemail;
    private javax.swing.JTextField txtcusmobile;
    private javax.swing.JTextField txtcusname;
    private javax.swing.JTextField txtgrandtotal;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables

    private void loadCategories() {
        
       
    try {
        Connection con = db.getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT name FROM category");
        jComboBoxcatogory.removeAllItems(); // clear first
        while (rs.next()) {
            jComboBoxcatogory.addItem(rs.getString("name"));
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    }

    private void loadProductsByCategory(String category) {
       try {
        Connection con = db.getConnection();
        PreparedStatement pst = con.prepareStatement("SELECT name FROM product WHERE category = ?");
        pst.setString(1, category);
        ResultSet rs = pst.executeQuery();
        jComboBoxname.removeAllItems(); // clear before adding
        while (rs.next()) {
            jComboBoxname.addItem(rs.getString("name"));
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    }

    private void calculateTotal() {
        try {
        int quantity = (int) jSpinnerQuantity.getValue();
        double price = Double.parseDouble(txtprice.getText());
        double total = quantity * price;
        txttotal.setText(String.valueOf(total));
    } catch (NumberFormatException e) {
        // handle empty or invalid inputs
        txttotal.setText("0.0");
    }
    }

    private void updateGrandTotal() {
        double grandTotal = 0.0;
    DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
    for (int i = 0; i < model.getRowCount(); i++) {
        grandTotal += (double) model.getValueAt(i, 4);  // column index 4 = total
    }
    txtgrandtotal.setText(String.valueOf(grandTotal));
    }

    private void loadCartTable() {
        
   
    DefaultTableModel model = new DefaultTableModel(new String[]{"Category", "Product", "Price", "Quantity", "Total"}, 0);
    try {
        Connection con = db.getConnection();
        String sql = "SELECT category, product_name, price, quantity, total FROM cart";
        PreparedStatement pst = con.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        while (rs.next()) {
            String cat = rs.getString("category");
            String prod = rs.getString("product_name");
            double price = rs.getDouble("price");
            int qty = rs.getInt("quantity");
            double total = rs.getDouble("total");

            model.addRow(new Object[]{cat, prod, price, qty, total});
        }
        jTable2.setModel(model);
    } catch (Exception e) {
        e.printStackTrace();
    }
}


}
