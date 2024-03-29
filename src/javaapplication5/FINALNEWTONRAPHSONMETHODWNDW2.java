package javaapplication5;

import javax.swing.JOptionPane;
public class FINALNEWTONRAPHSONMETHODWNDW2 extends javax.swing.JFrame {
    
    /**
     * Creates new form FINALNEWTONRAPHSONMETHODWNDW2
     */
    public FINALNEWTONRAPHSONMETHODWNDW2() {
        initComponents();
        
        this.setTitle("NEWTON RAPHSON CALCULATOR");
        
        this.setSize(631, 725);
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
        jLabel3 = new javax.swing.JLabel();
        kGradientPanel4 = new keeptoo.KGradientPanel();
        studybtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        kGradientPanel5 = new keeptoo.KGradientPanel();
        jLabel7 = new javax.swing.JLabel();
        calculatebtn1 = new javax.swing.JButton();
        kGradientPanel6 = new keeptoo.KGradientPanel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(631, 735));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(47, 62, 70));
        jPanel1.setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication5/newton-raphson-removebg-preview (1).png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(200, 230, 310, 370);

        kGradientPanel4.setInheritsPopupMenu(true);
        kGradientPanel4.setkEndColor(new java.awt.Color(132, 169, 140));
        kGradientPanel4.setkStartColor(new java.awt.Color(53, 79, 82));

        studybtn.setBackground(new java.awt.Color(153, 255, 102));
        studybtn.setFont(new java.awt.Font("Segoe UI Variable", 1, 12)); // NOI18N
        studybtn.setForeground(new java.awt.Color(255, 255, 255));
        studybtn.setText("STUDY ");
        studybtn.setBorderPainted(false);
        studybtn.setContentAreaFilled(false);
        studybtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                studybtnMouseEntered(evt);
            }
        });
        studybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studybtnActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication5/book-2-32.png"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel4Layout = new javax.swing.GroupLayout(kGradientPanel4);
        kGradientPanel4.setLayout(kGradientPanel4Layout);
        kGradientPanel4Layout.setHorizontalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(studybtn)
                .addGap(62, 62, 62))
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(studybtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(kGradientPanel4);
        kGradientPanel4.setBounds(210, 610, 134, 50);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(202, 210, 197));
        jLabel2.setText("METHOD");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 160, 150, 40);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(202, 210, 197));
        jLabel4.setText("CALCULATOR");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 210, 240, 40);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(202, 210, 197));
        jLabel1.setText("NEWTON RAPHSON ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 110, 440, 50);

        jPanel2.setBackground(new java.awt.Color(53, 79, 82));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication5/logout-32.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication5/group-32.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(561, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(-10, 0, 100, 740);

        kGradientPanel5.setInheritsPopupMenu(true);
        kGradientPanel5.setkEndColor(new java.awt.Color(132, 169, 140));
        kGradientPanel5.setkStartColor(new java.awt.Color(53, 79, 82));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication5/calculator-9-32.png"))); // NOI18N

        calculatebtn1.setBackground(new java.awt.Color(60, 63, 65));
        calculatebtn1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        calculatebtn1.setForeground(new java.awt.Color(255, 255, 255));
        calculatebtn1.setText("CALCULATOR");
        calculatebtn1.setBorderPainted(false);
        calculatebtn1.setContentAreaFilled(false);
        calculatebtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calculatebtn1MouseEntered(evt);
            }
        });
        calculatebtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatebtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel5Layout = new javax.swing.GroupLayout(kGradientPanel5);
        kGradientPanel5.setLayout(kGradientPanel5Layout);
        kGradientPanel5Layout.setHorizontalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel5Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(calculatebtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        kGradientPanel5Layout.setVerticalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(calculatebtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel1.add(kGradientPanel5);
        kGradientPanel5.setBounds(360, 610, 135, 50);

        kGradientPanel6.setInheritsPopupMenu(true);
        kGradientPanel6.setkEndColor(new java.awt.Color(202, 210, 197));
        kGradientPanel6.setkStartColor(new java.awt.Color(132, 169, 140));

        javax.swing.GroupLayout kGradientPanel6Layout = new javax.swing.GroupLayout(kGradientPanel6);
        kGradientPanel6.setLayout(kGradientPanel6Layout);
        kGradientPanel6Layout.setHorizontalGroup(
            kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );
        kGradientPanel6Layout.setVerticalGroup(
            kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );

        jPanel1.add(kGradientPanel6);
        kGradientPanel6.setBounds(200, 290, 310, 310);

        jSeparator1.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator1.setForeground(new java.awt.Color(202, 210, 197));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 20));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(350, 610, 10, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studybtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studybtnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_studybtnMouseEntered

    private void studybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studybtnActionPerformed
        // TODO add your handling code here:
        FINALNEWTONRAPHSONMETHODINFOS n = new FINALNEWTONRAPHSONMETHODINFOS();
        n.setVisible(true);
        dispose();
    }//GEN-LAST:event_studybtnActionPerformed

    private void calculatebtn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculatebtn1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_calculatebtn1MouseEntered

    private void calculatebtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculatebtn1ActionPerformed
        // TODO add your handling code here:
        FINALNEWTONRAPHSONMETHOD n = new FINALNEWTONRAPHSONMETHOD();
        n.setVisible(true);
        dispose();
    }//GEN-LAST:event_calculatebtn1ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Removed for Security Reasons ");
                
                
    }//GEN-LAST:event_jLabel8MouseClicked

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FINALNEWTONRAPHSONMETHODWNDW2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FINALNEWTONRAPHSONMETHODWNDW2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FINALNEWTONRAPHSONMETHODWNDW2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FINALNEWTONRAPHSONMETHODWNDW2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FINALNEWTONRAPHSONMETHODWNDW2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculatebtn1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private keeptoo.KGradientPanel kGradientPanel4;
    private keeptoo.KGradientPanel kGradientPanel5;
    private keeptoo.KGradientPanel kGradientPanel6;
    private javax.swing.JButton studybtn;
    // End of variables declaration//GEN-END:variables
}
