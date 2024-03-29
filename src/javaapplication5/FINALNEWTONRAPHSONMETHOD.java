/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication5;

/**
 *
 *
 */
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import org.mariuszgromada.math.mxparser.*;
public class FINALNEWTONRAPHSONMETHOD extends javax.swing.JFrame {

    /**
     * Creates new form FINALNEWTONRAPHSONMETHOD
     */
    
    public FINALNEWTONRAPHSONMETHOD() {
        
        try { 
            for(UIManager.LookAndFeelInfo info: UIManger.getInstalledLookAndFeels())
            {
                if("".equals(info.getName()))
                {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
                
            }
        } catch (Exception ex){
        }
        initComponents();
        this.setTitle("NEWTON RAPHSON CALCULATOR");
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        yourTable = new javax.swing.JTable();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        eqL = new javax.swing.JLabel();
        derivativedL = new javax.swing.JLabel();
        initialL = new javax.swing.JLabel();
        eqtxt = new javax.swing.JTextField();
        derivativestxt = new javax.swing.JTextField();
        initialtxt = new javax.swing.JTextField();
        eqL1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        kGradientPanel5 = new keeptoo.KGradientPanel();
        clearbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        kGradientPanel6 = new keeptoo.KGradientPanel();
        CALCULATEBTN = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(47, 62, 70));
        jPanel1.setPreferredSize(new java.awt.Dimension(631, 725));

        yourTable.setBackground(new java.awt.Color(202, 210, 197));
        yourTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        yourTable.setFont(new java.awt.Font("Segoe UI", 0, 14));
        yourTable.setForeground(new java.awt.Color(0, 0, 0));
        yourTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Iterattion", "x", "Error %"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        yourTable.setToolTipText("");
        yourTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        yourTable.setRowSelectionAllowed(false);
        yourTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        yourTable.setShowGrid(true);
        jScrollPane1.setViewportView(yourTable);

        kGradientPanel1.setkEndColor(new java.awt.Color(132, 169, 140));
        kGradientPanel1.setkStartColor(new java.awt.Color(53, 79, 82));

        eqL.setForeground(new java.awt.Color(255, 255, 255));
        eqL.setText("ENTER EQUATION");

        derivativedL.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        derivativedL.setForeground(new java.awt.Color(255, 255, 255));
        derivativedL.setText("ENTER DERIVATIVES:");

        initialL.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        initialL.setForeground(new java.awt.Color(255, 255, 255));
        initialL.setText("ENTER INITIAL GUESS:");

        eqtxt.setBackground(new java.awt.Color(202, 210, 197));
        eqtxt.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        eqtxt.setForeground(new java.awt.Color(47, 62, 70));
        eqtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eqtxtActionPerformed(evt);
            }
        });

        derivativestxt.setBackground(new java.awt.Color(202, 210, 197));
        derivativestxt.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        derivativestxt.setForeground(new java.awt.Color(47, 62, 70));

        initialtxt.setBackground(new java.awt.Color(202, 210, 197));
        initialtxt.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        initialtxt.setForeground(new java.awt.Color(47, 62, 70));
        initialtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                initialtxtActionPerformed(evt);
            }
        });

        eqL1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        eqL1.setForeground(new java.awt.Color(255, 255, 255));
        eqL1.setText("IN TERMS OF X:");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(202, 210, 197));
        jLabel4.setText("CALCULATOR");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(202, 210, 197));
        jLabel5.setText("METHOD");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication5/arrow-89-32.png"))); // NOI18N
        jLabel6.setText("jLabel4");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        kGradientPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(53, 79, 82)));
        kGradientPanel5.setInheritsPopupMenu(true);
        kGradientPanel5.setkEndColor(new java.awt.Color(132, 169, 140));
        kGradientPanel5.setkStartColor(new java.awt.Color(53, 79, 82));

        clearbtn.setBackground(new java.awt.Color(51, 51, 51));
        clearbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        clearbtn.setForeground(new java.awt.Color(202, 210, 197));
        clearbtn.setText("CLEAR");
        clearbtn.setBorderPainted(false);
        clearbtn.setContentAreaFilled(false);
        clearbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clearbtnMouseEntered(evt);
            }
        });
        clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtnActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication5/delete-row-32.png"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel5Layout = new javax.swing.GroupLayout(kGradientPanel5);
        kGradientPanel5.setLayout(kGradientPanel5Layout);
        kGradientPanel5Layout.setHorizontalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel5Layout.setVerticalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(clearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(kGradientPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        kGradientPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(53, 79, 82)));
        kGradientPanel6.setInheritsPopupMenu(true);
        kGradientPanel6.setkEndColor(new java.awt.Color(132, 169, 140));
        kGradientPanel6.setkStartColor(new java.awt.Color(53, 79, 82));

        CALCULATEBTN.setBackground(new java.awt.Color(51, 51, 51));
        CALCULATEBTN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CALCULATEBTN.setForeground(new java.awt.Color(202, 210, 197));

        CALCULATEBTN.setText("CALCULATE");
        CALCULATEBTN.setBorderPainted(false);
        CALCULATEBTN.setContentAreaFilled(false);
        CALCULATEBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CALCULATEBTNMouseEntered(evt);
            }
        });
        CALCULATEBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CALCULATEBTNActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication5/equal-sign-32.png"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel6Layout = new javax.swing.GroupLayout(kGradientPanel6);
        kGradientPanel6.setLayout(kGradientPanel6Layout);
        kGradientPanel6Layout.setHorizontalGroup(
            kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CALCULATEBTN))
        );
        kGradientPanel6Layout.setVerticalGroup(
            kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(CALCULATEBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(initialtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(initialL))
                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(eqL1)
                        .addComponent(eqL)
                        .addComponent(eqtxt)
                        .addComponent(derivativedL)
                        .addComponent(derivativestxt, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(kGradientPanel1Layout.createSequentialGroup()
                            .addGap(48, 48, 48)
                            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(kGradientPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(kGradientPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(kGradientPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(kGradientPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel4))
                        .addGroup(kGradientPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel5))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel6)
                .addGap(59, 59, 59)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(eqL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eqL1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eqtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(derivativedL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(derivativestxt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(initialL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(initialtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(kGradientPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kGradientPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(254, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(202, 210, 197));
        jLabel2.setText("TABLE");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(202, 210, 197));
        jLabel3.setText("ITERATION");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbtnActionPerformed
        // TODO add your handling code here:
        eqtxt.setText("");
        derivativestxt.setText("");
        initialtxt.setText("");

        DefaultTableModel model = (DefaultTableModel) yourTable.getModel();
        model.setRowCount(0); // Clear all rows in the table
    }//GEN-LAST:event_clearbtnActionPerformed

    private void CALCULATEBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CALCULATEBTNActionPerformed
        String equation = eqtxt.getText();
        String derived = derivativestxt.getText();
        float initialGuess = Float.parseFloat(initialtxt.getText());

        double x_before = initialGuess;
        double x = initialGuess;
        double difference = 1;
        float error = (float) 0;
        int iter = 0;

        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("Iteration");
        tableModel.addColumn("x");
        tableModel.addColumn("Error%");

        while(Math.abs(difference) > error){
            x_before = x;
            x = (float)(x_before - (function(equation,x)/derivativefunction(derived,x)));
            difference = x_before - x;
            iter++;
            tableModel.addRow(new Object[]{iter,x,difference});
        }
        yourTable.setModel(tableModel);
        }
        public static double function(String equation, double x){
            Expression e = new Expression(equation.replace("x", Double.toString(x)));
            return e.calculate();
        }

        public static double derivativefunction(String derived, double x){
            Argument xArg = new Argument("x = " + x);
            Expression e = new Expression("der(" + derived + ", x)", xArg);
            return e.calculate();

    }//GEN-LAST:event_CALCULATEBTNActionPerformed

    private void initialtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_initialtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_initialtxtActionPerformed

    private void clearbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearbtnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_clearbtnMouseEntered

    private void CALCULATEBTNMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CALCULATEBTNMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_CALCULATEBTNMouseEntered

    private void eqtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eqtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eqtxtActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        FINALNEWTONRAPHSONMETHODWNDW2 n = new FINALNEWTONRAPHSONMETHODWNDW2();
        n.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel6MouseClicked
    
    
    boolean isCallSuccessful = License.iConfirmNonCommercialUse("Checking");

        /* Verification if use type has been already confirmed */
    boolean isConfirmed = License.checkIfUseTypeConfirmed();
    
    DefaultTableModel model ;
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FINALNEWTONRAPHSONMETHOD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FINALNEWTONRAPHSONMETHOD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FINALNEWTONRAPHSONMETHOD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FINALNEWTONRAPHSONMETHOD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FINALNEWTONRAPHSONMETHOD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CALCULATEBTN;
    private javax.swing.JButton clearbtn;
    private javax.swing.JLabel derivativedL;
    private javax.swing.JTextField derivativestxt;
    private javax.swing.JLabel eqL;
    private javax.swing.JLabel eqL1;
    private javax.swing.JTextField eqtxt;
    private javax.swing.JLabel initialL;
    private javax.swing.JTextField initialtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel5;
    private keeptoo.KGradientPanel kGradientPanel6;
    private javax.swing.JTable yourTable;
    // End of variables declaration//GEN-END:variables
}
