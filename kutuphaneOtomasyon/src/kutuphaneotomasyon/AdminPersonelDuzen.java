
package kutuphaneotomasyon;
import java.sql.DriverManager;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

public class AdminPersonelDuzen extends javax.swing.JFrame {

    java.sql.Connection mycon;
    PreparedStatement pst;
    DefaultTableModel table;
    public AdminPersonelDuzen() {
        initComponents();
        try {// try ile veri tabanına bağlantı açıyor, kutuphane veritabanına bağlanıyoruz ve bu bağlantıyı açık bırakıyoruz diğer işlmeler için
            mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/kutuphane", "root", "");
             System.out.println("Veri tabanı bağlantısı başarılı !");
        } catch (Exception e) {//catch hata olması durumunda bildirim için
            e.printStackTrace();
            System.out.println("Veri tabanı bağlantısı başarısız !");
        }
        personelVeriGetir();
    }

 
  
     public void personelVeriGetir() { 
         // bu method ile tablo sürekli güncellenecek veri tabanından veriler alınacaktır
        int c;
        try {//try ile sorgu güvenliği sağlanacak ve her hangi bir sorun karşısında sistem çökmeyecektir
            pst = mycon.prepareStatement("select * from personel");// veri tabanı sorgusu
            ResultSet rs = pst.executeQuery();
            ResultSetMetaData rsd = rs.getMetaData();
            c = rsd.getColumnCount();
            table = (DefaultTableModel) tblPersonelAdmin.getModel();//tablo modeli oluşturuldu
            table.setRowCount(0);

            while (rs.next()) {// while ile tablo verileri vektöre atandı
                Vector v2 = new Vector();
                for (int i = 1; i <= c; i++) {
                    v2.add(rs.getInt("id"));
                    v2.add(rs.getString("adSoyad"));
                    v2.add(rs.getString("tc"));
                    v2.add(rs.getString("tel"));
                    v2.add(rs.getString("mail"));
                    v2.add(rs.getString("adres"));
                    v2.add(rs.getString("isBaslama"));
                    v2.add(rs.getString("kadi"));
                    v2.add(rs.getString("ksifre"));
                }
                table.addRow(v2);// veriler tabloya atıldı
            }
        } catch (Exception e) {// hata durumunda yapılacaklar 
            e.printStackTrace();
            System.out.println("veriler çekilemedi !");
        }
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtTc = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        txtAdSoyad = new javax.swing.JTextField();
        txtMail = new javax.swing.JTextField();
        txtAdres = new javax.swing.JTextField();
        date = new com.toedter.calendar.JDateChooser();
        btnkaydet = new javax.swing.JButton();
        btnGuncelle = new javax.swing.JButton();
        btnSil = new javax.swing.JButton();
        txtSifre = new javax.swing.JTextField();
        txtKAdi = new javax.swing.JTextField();
        txtAra = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnTemizle = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        btnGeri = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblPersonelAdmin = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Personel Ekleme Sayfası");

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Ad-soyad :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel5.setText("Admin Personel İşlemleri Ekranı");

        jLabel6.setText("Tel :");

        jLabel7.setText("Adres :");

        jLabel8.setText("Mail :");

        jLabel10.setText("İşe başlama :");

        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("Kullanıcı adı :");

        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setText("Sistem Şifresi :");

        btnkaydet.setBackground(new java.awt.Color(255, 255, 255));
        btnkaydet.setText("Kaydet");
        btnkaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkaydetActionPerformed(evt);
            }
        });

        btnGuncelle.setBackground(new java.awt.Color(255, 255, 255));
        btnGuncelle.setText("Güncelle");
        btnGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuncelleActionPerformed(evt);
            }
        });

        btnSil.setBackground(new java.awt.Color(255, 255, 255));
        btnSil.setText("Sil");
        btnSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSilActionPerformed(evt);
            }
        });

        txtSifre.setForeground(new java.awt.Color(255, 0, 0));

        txtKAdi.setForeground(new java.awt.Color(255, 0, 0));

        txtAra.setForeground(new java.awt.Color(255, 0, 0));
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

        jLabel11.setText("TC :");

        btnTemizle.setBackground(new java.awt.Color(255, 255, 255));
        btnTemizle.setText("Temizle");
        btnTemizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTemizleActionPerformed(evt);
            }
        });

        jLabel14.setText("ARA :");
        jLabel14.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnGeri.setBackground(new java.awt.Color(255, 255, 255));
        btnGeri.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGeri.setText("Geri");
        btnGeri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeriActionPerformed(evt);
            }
        });

        tblPersonelAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Ad Soyad", "TC", "Tel", "Mail", "Adres", "İşe Başlama", "Kullanıcı Adı", "Sistem Şifre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPersonelAdmin.setGridColor(new java.awt.Color(0, 0, 0));
        tblPersonelAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPersonelAdminMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblPersonelAdmin);

        jLabel1.setText("id:");

        lblId.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        lblId.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtAdres, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(20, 20, 20)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtTc, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                        .addComponent(txtTel)))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(10, 10, 10)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtKAdi)
                                        .addComponent(txtSifre)
                                        .addComponent(date, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSil, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnkaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnGuncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnTemizle, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAdSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAra, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 17, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(608, 608, 608)
                        .addComponent(btnGeri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtAra, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGeri, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAdSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTc, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAdres, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtKAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnkaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSil, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTemizle, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnkaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkaydetActionPerformed
        personelVeriGetir();// methodu çağırdık
        //bu kısımda değişkenlere değer atandı textfieldlerden alınarak
        String id = "";
        String adSoyad = txtAdSoyad.getText();
        String tc = txtTc.getText();
        String tel = txtTel.getText();
        String mail = txtMail.getText();
        String adres = txtAdres.getText();
        String kadi = txtKAdi.getText();
        String ksifre = txtSifre.getText();
        SimpleDateFormat isBaslama = new SimpleDateFormat("dd-MM--yyyy");//jCalenderin veri ataması simpledateformat ile yapılıyor
        String isbaslama = isBaslama.format(date.getDate());

        try {//try ile veri tabanına bağlanı veri eklemesi yapıyoruz
            pst = mycon.prepareStatement("insert into personel (adSoyad,tc,tel,mail,adres,isBaslama,kadi,ksifre) VALUES"
                + "(?,?,?,?,?,?,?,?)");
            // sorgu güvenliği için preparestatemente değer ataması burda yapılıyor
            pst.setString(1, adSoyad);
            pst.setString(2, tc);
            pst.setString(3, tel);
            pst.setString(4, mail);
            pst.setString(5, adres);
            pst.setString(6, isbaslama);
            pst.setString(7, kadi);
            pst.setString(8, ksifre);
            pst.executeUpdate();//güncelle 
            JOptionPane.showMessageDialog(this, "Personel başarıyla eklendi.");//messagebox ile işlem çıktısı verdik
            personelVeriGetir();//tablo güncellemesi
            //tüm textfieldler boşaltıldı
            lblId.setText("");
            txtAdSoyad.setText("");
            txtTc.setText("");
            txtTel.setText("");
            txtMail.setText("");
            txtAdres.setText("");
            txtKAdi.setText("");
            txtSifre.setText("");
            date.setDate(null);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Veri tabanı bağlantısı başarısız !");
        }
    }//GEN-LAST:event_btnkaydetActionPerformed

    private void btnGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuncelleActionPerformed
        //bir önceki ekle butonu gibi burada da değişkene veri ataması yapıldı
        String id = lblId.getText();
        String adSoyad = txtAdSoyad.getText();
        String tc = txtTc.getText();
        String tel = txtTel.getText();
        String mail = txtMail.getText();
        String adres = txtAdres.getText();
        String kadi = txtKAdi.getText();
        String ksifre = txtSifre.getText();
        SimpleDateFormat isBaslama = new SimpleDateFormat("dd-MM--yyyy");
        String isbaslama = isBaslama.format(date.getDate());

        try {//sorgu ile güncelleme yapıldı
            pst = mycon.prepareStatement("update personel set adSoyad=?, tc=?, tel=?, mail=?, adres=?, isbaslama=?, kadi=? where id=?");

            pst.setString(1, adSoyad);
            pst.setString(2, tc);
            pst.setString(3, tel);
            pst.setString(4, mail);
            pst.setString(5, adres);
            pst.setString(6, isbaslama);
            pst.setString(7, kadi);
            pst.setString(8, id);
            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "Personel bilgileri güncellendi");
            personelVeriGetir();
            lblId.setText("");
            txtAdSoyad.setText("");
            txtTc.setText("");
            txtTel.setText("");
            txtMail.setText("");
            txtAdres.setText("");
            txtKAdi.setText("");
            txtSifre.setText("");
            date.setDate(null);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("güncellenmedi!");
        }
    }//GEN-LAST:event_btnGuncelleActionPerformed

    private void btnSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSilActionPerformed
        //burada da diğer butonlaral yapılan işlem  yapıldı sadece tek farkla yanlız id bilgisi ile silme yapıldı
        String id = lblId.getText();
        try {
            pst = mycon.prepareStatement("delete from personel where id=? ");
            pst.setString(1, id);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Personel Silindi.");

            personelVeriGetir();
            lblId.setText("");
            txtAdSoyad.setText("");
            txtTc.setText("");
            txtTel.setText("");
            txtMail.setText("");
            txtAdres.setText("");
            txtKAdi.setText("");
            txtSifre.setText("");
            date.setDate(null);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("silinemedi!");
        }
    }//GEN-LAST:event_btnSilActionPerformed

    private void txtAraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAraActionPerformed

    }//GEN-LAST:event_txtAraActionPerformed

    private void txtAraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAraKeyReleased
        String arama = txtAra.getText();//arama kısmına girilen değerler tablo içinde aratıldı
           //aramalar büyük küçük harfe duyarlıdır
        TableRowSorter<DefaultTableModel> tableRowSorter
        = new TableRowSorter<DefaultTableModel>(table);
        tblPersonelAdmin.setRowSorter(tableRowSorter);
        tableRowSorter.setRowFilter(RowFilter.regexFilter(arama));
    }//GEN-LAST:event_txtAraKeyReleased

    private void btnTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTemizleActionPerformed
        lblId.setText("");//temizleme kısmı
        txtAdSoyad.setText("");
        txtTc.setText("");
        txtTel.setText("");
        txtMail.setText("");
        txtAdres.setText("");
        txtKAdi.setText("");
        txtSifre.setText("");
        date.setDate(null);
        txtAra.setText("");
    }//GEN-LAST:event_btnTemizleActionPerformed

    private void btnGeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeriActionPerformed
        adminMenu adminMenu = new adminMenu();//başka menüye geçiş için menü newlendi
        this.hide();// bu menü kapandı diğer menü açıldı
        adminMenu.setVisible(true);
    }//GEN-LAST:event_btnGeriActionPerformed

    private void tblPersonelAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPersonelAdminMouseClicked
       //bu kısımda basit bir işlme yapılmıştır mause ile tabloda tıklanana değerler sırasıyla textfieldlere atıldı
        table = (DefaultTableModel) tblPersonelAdmin.getModel();
        int selectedIndex = tblPersonelAdmin.getSelectedRow();

        lblId.setText(table.getValueAt(selectedIndex, 0).toString());
        txtAdSoyad.setText(table.getValueAt(selectedIndex, 1).toString());
        txtTc.setText(table.getValueAt(selectedIndex, 2).toString());
        txtTel.setText(table.getValueAt(selectedIndex, 3).toString());
        txtMail.setText(table.getValueAt(selectedIndex, 4).toString());
        txtAdres.setText(table.getValueAt(selectedIndex, 5).toString());
        Date tarih = null;
        try {
            tarih = new SimpleDateFormat("dd-MM-yyyy").parse((String) table.getValueAt(selectedIndex, 6));
        } catch (ParseException ex) {
            Logger.getLogger(AdminPersonelDuzen.class.getName()).log(Level.SEVERE, null, ex);
        }
        date.setDate(tarih);
        txtKAdi.setText(table.getValueAt(selectedIndex, 7).toString());
        txtSifre.setText(table.getValueAt(selectedIndex, 8).toString());
    }//GEN-LAST:event_tblPersonelAdminMouseClicked

    
    public static void main(String args[]) {
      

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPersonelDuzen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGeri;
    private javax.swing.JButton btnGuncelle;
    private javax.swing.JButton btnSil;
    private javax.swing.JButton btnTemizle;
    private javax.swing.JButton btnkaydet;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblId;
    private javax.swing.JTable tblPersonelAdmin;
    private javax.swing.JTextField txtAdSoyad;
    private javax.swing.JTextField txtAdres;
    private javax.swing.JTextField txtAra;
    private javax.swing.JTextField txtKAdi;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtSifre;
    private javax.swing.JTextField txtTc;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
