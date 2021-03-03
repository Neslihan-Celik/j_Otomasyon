
package formlar;

import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;


public class adminMenu extends javax.swing.JFrame {
  
    
    public adminMenu() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnRezervasyon = new javax.swing.JButton();
        btnPersonelIslem = new javax.swing.JButton();
        btnOdaIslem = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnGeri = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnRezervasyon.setBackground(new java.awt.Color(255, 255, 255));
        btnRezervasyon.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRezervasyon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gorseller/dish-2-icon (2).png"))); // NOI18N
        btnRezervasyon.setText("Rezervasyon işlemleri");
        btnRezervasyon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRezervasyonActionPerformed(evt);
            }
        });

        btnPersonelIslem.setBackground(new java.awt.Color(255, 255, 255));
        btnPersonelIslem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPersonelIslem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gorseller/Users-icon.png"))); // NOI18N
        btnPersonelIslem.setText("Personel işlemleri");
        btnPersonelIslem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonelIslemActionPerformed(evt);
            }
        });

        btnOdaIslem.setBackground(new java.awt.Color(255, 255, 255));
        btnOdaIslem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnOdaIslem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gorseller/hospital-bed-icon (2).png"))); // NOI18N
        btnOdaIslem.setText("Oda İşlemleri");
        btnOdaIslem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOdaIslemActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gorseller/Admin-icon (1).png"))); // NOI18N
        jLabel1.setText("Hoşgeldin Admin");

        btnGeri.setBackground(new java.awt.Color(255, 255, 255));
        btnGeri.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGeri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gorseller/sign-left-icon (1).png"))); // NOI18N
        btnGeri.setText("Geri");
        btnGeri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeriActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRezervasyon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPersonelIslem, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnOdaIslem, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                            .addComponent(btnGeri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(27, 27, 27))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPersonelIslem, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOdaIslem, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGeri, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRezervasyon, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPersonelIslemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonelIslemActionPerformed
         personelDuzen personelDuzen  = new personelDuzen ();
                    this.hide();
                    personelDuzen.setVisible(true);
    }//GEN-LAST:event_btnPersonelIslemActionPerformed

    private void btnRezervasyonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRezervasyonActionPerformed
        AdminPersonelIslem adminPersonelIslem  = new AdminPersonelIslem ();
                    this.hide();
                    adminPersonelIslem.setVisible(true);
    }//GEN-LAST:event_btnRezervasyonActionPerformed

    private void btnGeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeriActionPerformed
        login login  = new login ();
                    this.hide();
                    login.setVisible(true);
    }//GEN-LAST:event_btnGeriActionPerformed

    private void btnOdaIslemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOdaIslemActionPerformed
        adminOdaIslem oda  = new adminOdaIslem ();
        this.hide();
        oda.setVisible(true);
    }//GEN-LAST:event_btnOdaIslemActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new adminMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGeri;
    private javax.swing.JButton btnOdaIslem;
    private javax.swing.JButton btnPersonelIslem;
    private javax.swing.JButton btnRezervasyon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
