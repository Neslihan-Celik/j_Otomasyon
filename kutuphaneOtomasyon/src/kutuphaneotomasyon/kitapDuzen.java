
package kutuphaneotomasyon;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.*;
import javax.swing.table.TableRowSorter;

        /*
            Bu menü kitap düzenleme menüsü bu menüye sadece personel girişinden giriş yapan kişiler girebilir
         */
public class kitapDuzen extends javax.swing.JFrame {
    
java.sql.Connection mycon;
PreparedStatement pst;
DefaultTableModel table;
   
    public kitapDuzen() {
        initComponents();
         try {// try ile veri tabanına bağlantı açıyor, kutuphane veritabanına bağlanıyoruz ve bu bağlantıyı açık bırakıyoruz diğer işlmeler için
            mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/kutuphane", "root", "");
             System.out.println("Veri tabanı bağlantısı başarılı !");
        } catch (Exception e) {//catch hata olması durumunda bildirim için
            e.printStackTrace();
            System.out.println("Veri tabanı bağlantısı başarısız !");
        }
        kitapGetir();
    }

    
     public void kitapGetir() {
         //diğer menülerde de olduğu gibi bu menüde de bir tane tablo güncelleme ver veri tabanından veri çekme methoduna ihtiyaç duyduk
        int c;
        try {
            pst = mycon.prepareStatement("select * from kitap ");//bağlantı ve veri çekme sorgusu
           
           
           
            ResultSet rs = pst.executeQuery();
            ResultSetMetaData rsd = rs.getMetaData();
            c = rsd.getColumnCount();
            table = (DefaultTableModel) tblKitap.getModel();//tablo modeli oluşturuldu
            table.setRowCount(0);

            while (rs.next()) {// vektöre veri tabanından çekilein verileri atadık
                Vector v2 = new Vector();
                for (int i = 1; i <= c; i++) {
                    v2.add(rs.getString("kId"));
                    v2.add(rs.getString("KAdi"));
                    v2.add(rs.getString("seriNo"));
                    v2.add(rs.getString("Yazar"));
                    v2.add(rs.getString("durum"));
                  
                }
                table.addRow(v2);//vektörü tabloya attık
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("veriler çekilemedi !");
        }
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtAd = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnGeri = new javax.swing.JButton();
        txtAra = new javax.swing.JTextField();
        txtYazar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKitap = new javax.swing.JTable();
        btnekle = new javax.swing.JButton();
        btnTamizle = new javax.swing.JButton();
        btnGuncelle = new javax.swing.JButton();
        btnSil = new javax.swing.JButton();
        secimDurum = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtSeri = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kitap Düzen Ekranı");
        setAlwaysOnTop(true);

        jPanel6.setBackground(new java.awt.Color(0, 204, 204));
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));

        jLabel21.setText("Ara :");
        jLabel21.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Personel  Kitap Durum Ekranı");

        btnGeri.setBackground(new java.awt.Color(255, 255, 255));
        btnGeri.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGeri.setText("Geri");
        btnGeri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeriActionPerformed(evt);
            }
        });

        txtAra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAraActionPerformed(evt);
            }
        });
        txtAra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAraKeyReleased(evt);
            }
        });

        jLabel1.setText("Kitap Adı");

        jLabel2.setText("Yazar Adı");

        jLabel5.setText("Durum");

        tblKitap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Kitap Adı", "Seri No", "Yazar Adı", "Durum"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblKitap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKitapMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKitap);

        jScrollPane2.setViewportView(jScrollPane1);

        btnekle.setBackground(new java.awt.Color(255, 255, 255));
        btnekle.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnekle.setText("Ekle");
        btnekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnekleActionPerformed(evt);
            }
        });

        btnTamizle.setBackground(new java.awt.Color(255, 255, 255));
        btnTamizle.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnTamizle.setText("Temizle");
        btnTamizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTamizleActionPerformed(evt);
            }
        });

        btnGuncelle.setBackground(new java.awt.Color(255, 255, 255));
        btnGuncelle.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnGuncelle.setText("Güncelle");
        btnGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuncelleActionPerformed(evt);
            }
        });

        btnSil.setBackground(new java.awt.Color(255, 255, 255));
        btnSil.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnSil.setText("Sil");
        btnSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSilActionPerformed(evt);
            }
        });

        secimDurum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Uygun", "Ödünç Verilmiş", "Hasarlı" }));

        jLabel6.setText("id:");

        lblId.setBackground(new java.awt.Color(255, 255, 255));
        lblId.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblId.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setText("Seri No");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAd, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtAra, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addComponent(txtYazar, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(secimDurum, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(txtSeri, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGuncelle, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                            .addComponent(btnTamizle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnekle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(180, 180, 180))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGeri, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 68, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnGeri, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSil, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtYazar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSeri, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(btnTamizle, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btnGuncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(secimDurum, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(btnekle, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 632, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeriActionPerformed
        personelMenu personelMenu  = new personelMenu ();//bir önceki menüye geçiş için newleme yapıp geçiş yaptık
        this.hide();
        personelMenu.setVisible(true);
    }//GEN-LAST:event_btnGeriActionPerformed

    private void txtAraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAraActionPerformed

    }//GEN-LAST:event_txtAraActionPerformed

    private void txtAraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAraKeyReleased
        /*arama yapabilmek için tablerowsorter kullandık bu kısım diğer
        menülerde de mevcut mantık basit girilen kelime tabloda aranıp veriler getiriliyor*/
           //aramalar büyük küçük harfe duyarlıdır
        String searchKey = txtAra.getText();
        TableRowSorter<DefaultTableModel> tableRowSorter
        = new TableRowSorter<DefaultTableModel>(table);
        tblKitap.setRowSorter(tableRowSorter);
        tableRowSorter.setRowFilter(RowFilter.regexFilter(searchKey));
       
    }//GEN-LAST:event_txtAraKeyReleased

    private void tblKitapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKitapMouseClicked
       //bu kısımda yapılan şey basitçe mause ile tıklanan indexteki tüm bilgileri alınıp sırasıyla textfieldlere atılıyor
        table = (DefaultTableModel) tblKitap.getModel();
        int selectedIndex = tblKitap.getSelectedRow();

        lblId.setText(table.getValueAt(selectedIndex, 0).toString());
        txtAd.setText(table.getValueAt(selectedIndex, 1).toString());
        txtSeri.setText(table.getValueAt(selectedIndex, 2).toString());
        txtYazar.setText(table.getValueAt(selectedIndex, 3).toString());
        secimDurum.setSelectedItem(table.getValueAt(selectedIndex, 4).toString());
        
      

    }//GEN-LAST:event_tblKitapMouseClicked

    private void btnekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnekleActionPerformed
        /*textfieldlerden alınana veriler değişkenlere atılıp ardından sorgu yazılıp veri
        tabanında ekleme işlemleri yapılıyor diğer menülerde de bunun bir çok örneği mevcut*/
        kitapGetir();
        String id = "";
        String ad = txtAd.getText();
        String durum = secimDurum.getSelectedItem().toString();
        String yazar = txtYazar.getText();
        String seri = txtSeri.getText();
        

        try {
            pst = mycon.prepareStatement("insert into kitap (KAdi,seriNo,Yazar,durum) VALUES"
                + "(?,?,?,?)");

            pst.setString(1, ad);
            pst.setString(2, seri);
            pst.setString(3, yazar);
            pst.setString(4, durum);
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Kitap eklendi.");
             kitapGetir();
            lblId.setText("");
            txtAd.setText("");
            txtYazar.setText("");
            secimDurum.setSelectedIndex(1);
            txtSeri.setText("");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Kitap eklenemedi !");
        }

    }//GEN-LAST:event_btnekleActionPerformed

    private void btnTamizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTamizleActionPerformed
         //textfieldler temizleniyor
        lblId.setText("");
        txtAra.setText("");
        txtAd.setText("");
        txtYazar.setText("");
        txtSeri.setText("");
        secimDurum.setSelectedIndex(0);
        kitapGetir();
    }//GEN-LAST:event_btnTamizleActionPerformed

    private void btnGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuncelleActionPerformed
        //ekle butonu ile yapılan işlmelerin aynısı sadece bu sefer sorgu update sorgusu
        kitapGetir();
        String id = lblId.getText();
        String ad = txtAd.getText();
        String durum = secimDurum.getSelectedItem().toString();
        String yazar = txtYazar.getText();
        String seri = txtSeri.getText();

        try {
            pst = mycon.prepareStatement("update kitap set Kadi=?, seriNo=?, Yazar=?, durum=? where kId=?");

            pst.setString(1, ad);
            pst.setString(2, seri);
            pst.setString(3, yazar);
            pst.setString(4, durum);
            pst.setString(5, id);

            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "Kitap bilgileri güncellendi");
            kitapGetir();
            lblId.setText("");
            txtAra.setText("");
            txtAd.setText("");
            txtYazar.setText("");
            txtSeri.setText("");
            secimDurum.setSelectedIndex(0);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("güncellenmedi!");
        }

    }//GEN-LAST:event_btnGuncelleActionPerformed

    private void btnSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSilActionPerformed
        // diğer iki butonla yapılnın aynısı bu sefer delete sorgusu yazıldı id ye göre
        String id = lblId.getText();
        try {
            pst = mycon.prepareStatement("delete from kitap where kId=? ");
            pst.setString(1, id);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "kitap Silindi.");

            kitapGetir();
             lblId.setText("");
            txtAra.setText("");
            txtAd.setText("");
            txtYazar.setText("");
            txtSeri.setText("");
            secimDurum.setSelectedIndex(0);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("silinemedi!");
        }
    }//GEN-LAST:event_btnSilActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kitapDuzen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGeri;
    private javax.swing.JButton btnGuncelle;
    private javax.swing.JButton btnSil;
    private javax.swing.JButton btnTamizle;
    private javax.swing.JButton btnekle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblId;
    private javax.swing.JComboBox<String> secimDurum;
    private javax.swing.JTable tblKitap;
    private javax.swing.JTextField txtAd;
    private javax.swing.JTextField txtAra;
    private javax.swing.JTextField txtSeri;
    private javax.swing.JTextField txtYazar;
    // End of variables declaration//GEN-END:variables
}
