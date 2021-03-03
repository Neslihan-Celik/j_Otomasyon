
package kutuphaneotomasyon;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


        /* Bu menü giriş kısmı gerekli kontroller yapılıp admin veya personel menülerine yönlendirmeler yapılıyor*/

public class personelLogin extends javax.swing.JFrame {

java.sql.Connection mycon;
PreparedStatement pst;
DefaultTableModel table;
    public personelLogin() {
        initComponents();
        try {// try ile veri tabanına bağlantı açıyor, kutuphane veritabanına bağlanıyoruz ve bu bağlantıyı açık bırakıyoruz diğer işlmeler için
            mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/kutuphane", "root", "");
             System.out.println("Veri tabanı bağlantısı başarılı !");
        } catch (Exception e) {//catch hata olması durumunda bildirim için
            e.printStackTrace();
            System.out.println("Veri tabanı bağlantısı başarısız !");
        }
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        kontrol = new javax.swing.JCheckBox();
        pas = new javax.swing.JPasswordField();
        txtKAdi = new javax.swing.JTextField();
        btnAdmin = new javax.swing.JButton();
        btnGeri = new javax.swing.JButton();
        btnPersonel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Personel Login Ekranı");
        setAlwaysOnTop(true);

        jPanel5.setBackground(new java.awt.Color(0, 204, 204));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));

        jLabel8.setText("Şifre :");

        jLabel9.setText("K.Adı :");

        kontrol.setText("Şifre Göster");
        kontrol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kontrolActionPerformed(evt);
            }
        });

        btnAdmin.setBackground(new java.awt.Color(255, 255, 255));
        btnAdmin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAdmin.setText("Admin");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        btnGeri.setBackground(new java.awt.Color(255, 255, 255));
        btnGeri.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGeri.setText("Geri");
        btnGeri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeriActionPerformed(evt);
            }
        });

        btnPersonel.setBackground(new java.awt.Color(255, 255, 255));
        btnPersonel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPersonel.setText("Personel");
        btnPersonel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addComponent(txtKAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGeri))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addComponent(pas, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(kontrol, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnPersonel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKAdi, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                        .addGap(15, 15, 15))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnGeri)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kontrol)
                    .addComponent(pas, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPersonel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
       //admin butonuna tıklanmışsa kullanıcı adı şifre ve id bilgisi kontrol edilicektir adminin id'si 1 
        String kadi = txtKAdi.getText();
        String ksifre = pas.getText();
        String sorgu = "select * from personel where kadi =? and ksifre =? and id=1";// sorgu yapılıyor
        if(txtKAdi.getText().isEmpty() || pas.getText().isEmpty()){// textfieldler boşsa dışarı bilgi veriliyor
            JOptionPane.showMessageDialog(this, "Lütfen tüm alanları doldurun !");
        }else{// değil ise sorgu değerleri atanıyor 
            try {
                pst = mycon.prepareStatement(sorgu);
                pst.setString(1, kadi);
                pst.setString(2, ksifre);
               ResultSet res = pst.executeQuery();
                if(res.next()){//admin menüsü oluşturuluyor ve geçiş sağlanıyor
                    adminMenu adminMenu  = new adminMenu ();
                    this.hide();
                    adminMenu.setVisible(true);
                }
                else{//şifre veya kullanıcı adında bir sorun varsa bilgi veriliyor 
                    JOptionPane.showMessageDialog(this, "Kullanıcı adı veya şifre yanlış.");
                    txtKAdi.setText("");
                    pas.setText("");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnAdminActionPerformed

    private void kontrolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kontrolActionPerformed
       //bu kısım tamamen şifre güvenliği için şifrenin görünür veya yıldız şekilde olması için 
        if(kontrol.isSelected()){
            pas.setEchoChar((char)0);
        }else
        {
            pas.setEchoChar('*');
        }
    }//GEN-LAST:event_kontrolActionPerformed

    private void btnGeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeriActionPerformed
        girisEkrani login  = new girisEkrani ();//geri butonu bir önceki menüye geçiş için
        this.hide();
        login.setVisible(true);
    }//GEN-LAST:event_btnGeriActionPerformed

    private void btnPersonelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonelActionPerformed
        //admin için yapılan herşey burada da yapıldı tek farkla admini id'si ile sorguladık çünkü idler benzersizdir
        String kadi = txtKAdi.getText();
        String ksifre = pas.getText();
        String sorgu = "select * from personel where kadi =? and ksifre =? ";
        if(txtKAdi.getText().isEmpty() || pas.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Lütfen tüm alanları doldurun !");
        }else{
            try {
                pst = mycon.prepareStatement(sorgu);
                pst.setString(1, kadi);
                pst.setString(2, ksifre);
               ResultSet res = pst.executeQuery();
                if(res.next()){
                   personelMenu personelMenu  = new personelMenu ();
                    this.hide();
                    personelMenu.setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(this, "Kullanıcı adı veya şifre yanlış.");
                    txtKAdi.setText("");
                    pas.setText("");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnPersonelActionPerformed

    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new personelLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnGeri;
    private javax.swing.JButton btnPersonel;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JCheckBox kontrol;
    private javax.swing.JPasswordField pas;
    private javax.swing.JTextField txtKAdi;
    // End of variables declaration//GEN-END:variables
}
