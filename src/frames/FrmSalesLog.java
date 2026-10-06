package frames;

public class FrmSalesLog extends javax.swing.JFrame {

    public FrmSalesLog() {
        initComponents();
        loadLog();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnToDashboard = new javax.swing.JButton();
        BtnToPOS = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        PnlHEAD = new javax.swing.JPanel();
        LblTitel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblHistory = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnToDashboard.setText("DASHBOARD");
        BtnToDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnToDashboardActionPerformed(evt);
            }
        });

        BtnToPOS.setText("POS");
        BtnToPOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnToPOSActionPerformed(evt);
            }
        });

        btnLogOut.setText("LOG OUT");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        PnlHEAD.setBackground(new java.awt.Color(58, 153, 53));

        LblTitel.setFont(new java.awt.Font("Tahoma", 1, 24));
        LblTitel.setText("SALES LOG");

        javax.swing.GroupLayout PnlHEADLayout = new javax.swing.GroupLayout(PnlHEAD);
        PnlHEAD.setLayout(PnlHEADLayout);
        PnlHEADLayout.setHorizontalGroup(
            PnlHEADLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlHEADLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LblTitel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(178, 178, 178))
        );
        PnlHEADLayout.setVerticalGroup(
            PnlHEADLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlHEADLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblTitel, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        TblHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "INVOICE", "DATE", "TIME", "TOTAL"
            }
        ));
        jScrollPane1.setViewportView(TblHistory);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BtnToDashboard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnToPOS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogOut)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(PnlHEAD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnToDashboard)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtnToPOS)
                        .addComponent(btnLogOut)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PnlHEAD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loadLog() {
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) TblHistory.getModel();
        model.setRowCount(0);
        try {
            String contents = FilesTest1.readFile("saleslog.txt");
            String lines[] = contents.trim().split("\n");
            for (int i = 0; i < lines.length; i++) {
                String row[] = lines[i].split(",");
                if (row.length == 4) {
                    model.addRow(row);
                }
            }
        } catch (Exception e) {
        }
    }

    private void BtnToDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnToDashboardActionPerformed
        FrmDashBoard dash = new FrmDashBoard();
        dash.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnToDashboardActionPerformed

    private void BtnToPOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnToPOSActionPerformed
        FrmPOS pos = new FrmPOS();
        pos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnToPOSActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        FrmLogin login = new FrmLogin();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLogOutActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmSalesLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSalesLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSalesLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSalesLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmSalesLog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnToDashboard;
    private javax.swing.JButton BtnToPOS;
    private javax.swing.JLabel LblTitel;
    private javax.swing.JPanel PnlHEAD;
    private javax.swing.JTable TblHistory;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}