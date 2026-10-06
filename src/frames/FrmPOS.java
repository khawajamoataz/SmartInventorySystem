package frames;

import javax.swing.JOptionPane;

public class FrmPOS extends javax.swing.JFrame {

    double total = 0;

    public FrmPOS() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PnlHead = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        LblCurrentInvoice = new javax.swing.JLabel();
        BtnToDashboard = new javax.swing.JButton();
        BtnToSalesLog = new javax.swing.JButton();
        BtnLogUot = new javax.swing.JButton();
        LblBarcode = new javax.swing.JLabel();
        LblQTY = new javax.swing.JLabel();
        TxtBarcode = new javax.swing.JTextField();
        TxtQTY = new javax.swing.JTextField();
        BtnAddToCart = new javax.swing.JButton();
        PnlTotal = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        LblTotal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblProducts = new javax.swing.JTable();
        BtnConfirm = new javax.swing.JButton();
        BtnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PnlHead.setBackground(new java.awt.Color(58, 153, 53));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("POINT OF SALE");

        javax.swing.GroupLayout PnlHeadLayout = new javax.swing.GroupLayout(PnlHead);
        PnlHead.setLayout(PnlHeadLayout);
        PnlHeadLayout.setHorizontalGroup(
            PnlHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlHeadLayout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PnlHeadLayout.setVerticalGroup(
            PnlHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlHeadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addContainerGap())
        );

        LblCurrentInvoice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LblCurrentInvoice.setText("CURRENT INVOICE:");

        BtnToDashboard.setText("DASHBOARD");
        BtnToDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnToDashboardActionPerformed(evt);
            }
        });

        BtnToSalesLog.setText("SALES LOG");
        BtnToSalesLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnToSalesLogActionPerformed(evt);
            }
        });

        BtnLogUot.setText("LOG OUT");
        BtnLogUot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLogUotActionPerformed(evt);
            }
        });

        LblBarcode.setText("BARCODE:");

        LblQTY.setText("QTY:");

        BtnAddToCart.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        BtnAddToCart.setText("ADD TO CART");
        BtnAddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddToCartActionPerformed(evt);
            }
        });

        PnlTotal.setBackground(new java.awt.Color(58, 153, 53));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("TOTAL:");

        LblTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LblTotal.setText("0.0");

        javax.swing.GroupLayout PnlTotalLayout = new javax.swing.GroupLayout(PnlTotal);
        PnlTotal.setLayout(PnlTotalLayout);
        PnlTotalLayout.setHorizontalGroup(
            PnlTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlTotalLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LblTotal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PnlTotalLayout.setVerticalGroup(
            PnlTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlTotalLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(PnlTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(LblTotal))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        TblProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CODE", "NAME", "BARCODE", "PRICE"
            }
        ));
        jScrollPane1.setViewportView(TblProducts);

        BtnConfirm.setBackground(new java.awt.Color(0, 255, 0));
        BtnConfirm.setText("CONFIRM TRANSACTION ");
        BtnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConfirmActionPerformed(evt);
            }
        });

        BtnCancel.setBackground(new java.awt.Color(255, 0, 0));
        BtnCancel.setText("CANCEL TRANSACTION");
        BtnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnlHead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 36, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblBarcode)
                            .addComponent(LblQTY))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtBarcode)
                            .addComponent(TxtQTY, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnAddToCart))
                    .addComponent(PnlTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnConfirm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblCurrentInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BtnToDashboard)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnToSalesLog)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnLogUot)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnToDashboard)
                    .addComponent(BtnToSalesLog)
                    .addComponent(BtnLogUot))
                .addGap(2, 2, 2)
                .addComponent(PnlHead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LblCurrentInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblBarcode)
                            .addComponent(TxtBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblQTY)
                            .addComponent(TxtQTY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnAddToCart))
                        .addGap(47, 47, 47)
                        .addComponent(PnlTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnConfirm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnCancel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   

   


    private void BtnLogUotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLogUotActionPerformed
        FrmLogin login = new FrmLogin();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnLogUotActionPerformed

    private void BtnToDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnToDashboardActionPerformed
        FrmDashBoard dash = new FrmDashBoard();
        dash.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnToDashboardActionPerformed

    private void BtnToSalesLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnToSalesLogActionPerformed
        FrmSalesLog sales = new FrmSalesLog();
        sales.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnToSalesLogActionPerformed

    private void BtnAddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddToCartActionPerformed
       String barcode = TxtBarcode.getText().trim();
        String qtyText = TxtQTY.getText().trim();

        if (barcode.equals("")) {
            JOptionPane.showMessageDialog(this, "Please enter barcode!");
            return;
        }
        if (qtyText.equals("")) {
            JOptionPane.showMessageDialog(this, "Please enter QTY!");
            return;
        }

        int qty;
        try {
            qty = Integer.parseInt(qtyText);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "QTY must be a number!");
            return;
        }

        
        try {
            String contents = FilesTest1.readFile("products.txt");
            String lines[] = contents.trim().split("\n");
            boolean found = false;

            for (int i = 0; i < lines.length; i++) {
                String row[] = lines[i].split(",");
                if (row.length == 5 && row[2].trim().equals(barcode)) {
                    found = true;
                    double price = Double.parseDouble(row[3].trim()) * qty;

                    javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) TblProducts.getModel();
                    model.addRow(new String[]{row[0].trim(), row[1].trim(), row[2].trim(), String.valueOf(price)});

                    total = total + price;
                    LblTotal.setText(String.valueOf(total));

                    TxtBarcode.setText("");
                    TxtQTY.setText("");
                    break;
                }
            }

            if (!found) {
                JOptionPane.showMessageDialog(this, "Product not found!");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error reading products!");
        }
    }//GEN-LAST:event_BtnAddToCartActionPerformed

    private void BtnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConfirmActionPerformed
       javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) TblProducts.getModel();

        if (model.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "No products in cart!");
            return;
        }

        try {
            
            int invoiceNum = 1;
            try {
                String old = FilesTest1.readFile("saleslog.txt");
                String oldLines[] = old.trim().split("\n");
                invoiceNum = oldLines.length + 1;
            } catch (Exception e) {
            }

            
            java.util.Calendar cal = java.util.Calendar.getInstance();
            String date = cal.get(java.util.Calendar.DAY_OF_MONTH) + "/" + (cal.get(java.util.Calendar.MONTH) + 1) + "/" + cal.get(java.util.Calendar.YEAR);
            String time = cal.get(java.util.Calendar.HOUR_OF_DAY) + ":" + cal.get(java.util.Calendar.MINUTE);

            String logData = invoiceNum + "," + date + "," + time + "," + total + "\n";
            FilesTest1.writeToFile("saleslog.txt", logData);

            JOptionPane.showMessageDialog(this, "Transaction confirmed! Total: " + total);

            
            model.setRowCount(0);
            total = 0;
            LblTotal.setText("0.0");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error saving transaction!");
        }
    }//GEN-LAST:event_BtnConfirmActionPerformed

    private void BtnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelActionPerformed
       int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to cancel?", "Cancel", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) TblProducts.getModel();
            model.setRowCount(0);
            total = 0;
            LblTotal.setText("0.0");
            TxtBarcode.setText("");
            TxtQTY.setText("");
        }
    }//GEN-LAST:event_BtnCancelActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPOS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAddToCart;
    private javax.swing.JButton BtnCancel;
    private javax.swing.JButton BtnConfirm;
    private javax.swing.JButton BtnLogUot;
    private javax.swing.JButton BtnToDashboard;
    private javax.swing.JButton BtnToSalesLog;
    private javax.swing.JLabel LblBarcode;
    private javax.swing.JLabel LblCurrentInvoice;
    private javax.swing.JLabel LblQTY;
    private javax.swing.JLabel LblTotal;
    private javax.swing.JPanel PnlHead;
    private javax.swing.JPanel PnlTotal;
    private javax.swing.JTable TblProducts;
    private javax.swing.JTextField TxtBarcode;
    private javax.swing.JTextField TxtQTY;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}