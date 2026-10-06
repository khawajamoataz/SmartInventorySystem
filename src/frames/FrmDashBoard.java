package frames;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FrmDashBoard extends javax.swing.JFrame {

    public FrmDashBoard() {
        initComponents();
        loadProducts();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BtnToPOS = new javax.swing.JButton();
        BtnToSalesLog = new javax.swing.JButton();
        PnlHead = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        LblSearch = new javax.swing.JLabel();
        TxtSearch = new javax.swing.JTextField();
        BtnSearch = new javax.swing.JButton();
        BtnEdit = new javax.swing.JButton();
        BtnDelete = new javax.swing.JButton();
        BtnAdd = new javax.swing.JButton();
        BtnLogOut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "CODE", "NAME", "BARCODE", "PRICE", "STOCK"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        BtnToPOS.setText("POS");
        BtnToPOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnToPOSActionPerformed(evt);
            }
        });

        BtnToSalesLog.setText("SALES LOG");
        BtnToSalesLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnToSalesLogActionPerformed(evt);
            }
        });

        PnlHead.setBackground(new java.awt.Color(58, 153, 53));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel1.setText("INVENTORY LIST");

        javax.swing.GroupLayout PnlHeadLayout = new javax.swing.GroupLayout(PnlHead);
        PnlHead.setLayout(PnlHeadLayout);
        PnlHeadLayout.setHorizontalGroup(
            PnlHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlHeadLayout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PnlHeadLayout.setVerticalGroup(
            PnlHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlHeadLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        LblSearch.setText("SEARCH ITEM");

        BtnSearch.setText("SEARCH");
        BtnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSearchActionPerformed(evt);
            }
        });

        BtnEdit.setBackground(new java.awt.Color(58, 153, 53));
        BtnEdit.setText("EDIT SELECTED");
        BtnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditActionPerformed(evt);
            }
        });

        BtnDelete.setBackground(new java.awt.Color(255, 51, 51));
        BtnDelete.setText("DELETE SELECTED");
        BtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDeleteActionPerformed(evt);
            }
        });

        BtnAdd.setBackground(new java.awt.Color(58, 153, 53));
        BtnAdd.setText("ADD NEW PRODUCT");
        BtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddActionPerformed(evt);
            }
        });

        BtnLogOut.setText("LOG OUT ");
        BtnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnToPOS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnToSalesLog)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnLogOut)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(PnlHead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnAdd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnDelete))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LblSearch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BtnSearch)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnToPOS)
                    .addComponent(BtnToSalesLog)
                    .addComponent(BtnLogOut))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PnlHead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblSearch)
                    .addComponent(TxtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSearch))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnEdit)
                    .addComponent(BtnDelete)
                    .addComponent(BtnAdd))
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(159, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loadProducts() {
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        try {
            String contents = FilesTest1.readFile("products.txt");
            String lines[] = contents.trim().split("\n");
            for (int i = 0; i < lines.length; i++) {
                String row[] = lines[i].split(",");
                if (row.length == 5) {
                    model.addRow(row);
                }
            }
        } catch (Exception e) {
        }
    }

    private void saveProducts() {
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) jTable1.getModel();
        try {
            java.io.FileWriter fw = new java.io.FileWriter("products.txt", false);
            for (int i = 0; i < model.getRowCount(); i++) {
                fw.write(model.getValueAt(i, 0) + "," + model.getValueAt(i, 1) + "," + model.getValueAt(i, 2) + "," + model.getValueAt(i, 3) + "," + model.getValueAt(i, 4) + "\n");
            }
            fw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error saving!");
        }
    }

    private void BtnAddActionPerformed(java.awt.event.ActionEvent evt) {
        JTextField txtCode = new JTextField();
        JTextField txtName = new JTextField();
        JTextField txtBarcode = new JTextField();
        JTextField txtPrice = new JTextField();
        JTextField txtStock = new JTextField();

        Object[] fields = {"Code:", txtCode, "Name:", txtName, "Barcode:", txtBarcode, "Price:", txtPrice, "Stock:", txtStock};

        int result = JOptionPane.showConfirmDialog(this, fields, "Add New Product", JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {

            if (!ValidationUtil.isEmpty(txtCode, txtName, txtBarcode, txtPrice, txtStock)) {
                JOptionPane.showMessageDialog(this, "Please fill all fields!");
                return;
            }

            if (!ValidationUtil.isNumeric(txtPrice)) {
                JOptionPane.showMessageDialog(this, "Price must be a number!");
                return;
            }

            if (!ValidationUtil.isNumeric(txtStock)) {
                JOptionPane.showMessageDialog(this, "Stock must be a number!");
                return;
            }

            
            javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) jTable1.getModel();
            for (int i = 0; i < model.getRowCount(); i++) {
                if (model.getValueAt(i, 2).toString().equals(txtBarcode.getText().trim())) {
                    JOptionPane.showMessageDialog(this, "Barcode already exists!");
                    return;
                }
            }

            model.addRow(new String[]{txtCode.getText().trim(), txtName.getText().trim(), txtBarcode.getText().trim(), txtPrice.getText().trim(), txtStock.getText().trim()});
            saveProducts();
        }
    }

    private void BtnEditActionPerformed(java.awt.event.ActionEvent evt) {
        int row = jTable1.getSelectedRow();

        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Please select a product!");
            return;
        }

        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) jTable1.getModel();

        JTextField txtCode = new JTextField(model.getValueAt(row, 0).toString());
        JTextField txtName = new JTextField(model.getValueAt(row, 1).toString());
        JTextField txtBarcode = new JTextField(model.getValueAt(row, 2).toString());
        JTextField txtPrice = new JTextField(model.getValueAt(row, 3).toString());
        JTextField txtStock = new JTextField(model.getValueAt(row, 4).toString());
        txtCode.setEditable(false);

        Object[] fields = {"Code:", txtCode, "Name:", txtName, "Barcode:", txtBarcode, "Price:", txtPrice, "Stock:", txtStock};

        int result = JOptionPane.showConfirmDialog(this, fields, "Edit Product", JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {

            if (!ValidationUtil.isEmpty(txtName, txtBarcode, txtPrice, txtStock)) {
                JOptionPane.showMessageDialog(this, "Please fill all fields!");
                return;
            }

            if (!ValidationUtil.isNumeric(txtPrice)) {
                JOptionPane.showMessageDialog(this, "Price must be a number!");
                return;
            }

            if (!ValidationUtil.isNumeric(txtStock)) {
                JOptionPane.showMessageDialog(this, "Stock must be a number!");
                return;
            }

            
            for (int i = 0; i < model.getRowCount(); i++) {
                if (i != row && model.getValueAt(i, 2).toString().equals(txtBarcode.getText().trim())) {
                    JOptionPane.showMessageDialog(this, "Barcode already exists!");
                    return;
                }
            }

            model.setValueAt(txtName.getText().trim(), row, 1);
            model.setValueAt(txtBarcode.getText().trim(), row, 2);
            model.setValueAt(txtPrice.getText().trim(), row, 3);
            model.setValueAt(txtStock.getText().trim(), row, 4);
            saveProducts();
        }
    }

    private void BtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {
        int row = jTable1.getSelectedRow();

        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Please select a product!");
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure?", "Delete", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) jTable1.getModel();
            model.removeRow(row);
            saveProducts();
        }
    }

    private void BtnSearchActionPerformed(java.awt.event.ActionEvent evt) {
        String keyword = TxtSearch.getText().trim().toLowerCase();

        if (keyword.equals("")) {
            loadProducts();
            return;
        }

        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        try {
            String contents = FilesTest1.readFile("products.txt");
            String lines[] = contents.trim().split("\n");
            for (int i = 0; i < lines.length; i++) {
                if (lines[i].toLowerCase().contains(keyword)) {
                    model.addRow(lines[i].split(","));
                }
            }
        } catch (Exception e) {
        }
    }

    private void BtnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLogOutActionPerformed
        FrmLogin login = new FrmLogin();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnLogOutActionPerformed

    private void BtnToPOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnToPOSActionPerformed
        FrmPOS pos = new FrmPOS();
        pos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnToPOSActionPerformed

    private void BtnToSalesLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnToSalesLogActionPerformed
        FrmSalesLog sales = new FrmSalesLog();
        sales.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnToSalesLogActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDashBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAdd;
    private javax.swing.JButton BtnDelete;
    private javax.swing.JButton BtnEdit;
    private javax.swing.JButton BtnLogOut;
    private javax.swing.JButton BtnSearch;
    private javax.swing.JButton BtnToPOS;
    private javax.swing.JButton BtnToSalesLog;
    private javax.swing.JLabel LblSearch;
    private javax.swing.JPanel PnlHead;
    private javax.swing.JTextField TxtSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}