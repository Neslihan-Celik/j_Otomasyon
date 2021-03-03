
package kutuphaneotomasyon;


import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

        /* Bu Menü Kullanıcı yani kitap verilen kişilerin bilgilerinin düzenlendiği menüdür*/

public class kullaniciDuzen extends javax.swing.JFrame {

    java.sql.Connection mycon;
    PreparedStatement pst;
    DefaultTableModel table;
    public kullaniciDuzen() {
        initComponents();
          try {// try ile veri tabanına bağlantı açıyor, kutuphane veritabanına bağlanıyoruz ve bu bağlantıyı açık bırakıyoruz diğer işlmeler için
            mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/kutuphane", "root", "");
             System.out.println("Veri tabanı bağlantısı başarılı !");
        } catch (Exception e) {//catch hata olması durumunda bildirim için
            e.printStackTrace();
            System.out.println("Veri tabanı bağlantısı başarısız !");
        }
      VeriGetir();
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
        txtTc = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        txtAdSoyad = new javax.swing.JTextField();
        txtMail = new javax.swing.JTextField();
        txtKitap = new javax.swing.JTextField();
        dateA = new com.toedter.calendar.JDateChooser();
        btnkaydet = new javax.swing.JButton();
        btnGuncelle = new javax.swing.JButton();
        btnSil = new javax.swing.JButton();
        txtAra = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnTemizle = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        btnGeri = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblkullanici = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        dateV = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        txtAdres = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kullanıcı İşlemleri Ekranı");

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Ad-soyad :");

        jLabel5.setBackground(new java.awt.Color(0, 240, 240));
        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel5.setText("Kullanıcı İşlemleri Ekranı");

        jLabel6.setText("Tel :");

        jLabel7.setText("Adres :");

        jLabel8.setText("Mail :");

        jLabel10.setText("Kitap Alış Tarihi :");

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

        tblkullanici.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Ad Soyad", "TC", "Tel", "Mail", "Adres", "Alıi Tarihi", "Veriş Tarihi", "Kitap ADı", "Kitap id"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblkullanici.setGridColor(new java.awt.Color(0, 0, 0));
        tblkullanici.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblkullaniciMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblkullanici);

        jLabel1.setText("id:");

        lblId.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        lblId.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel12.setText("Kitap  veriş Tarihi :");

        jLabel9.setText("Kitap Adı :");

        jLabel13.setText("Kitap İd:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGeri, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtAdres, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(20, 20, 20)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtTc, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                                .addComponent(txtTel))))
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
                                            .addComponent(txtAdSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(dateA, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dateV, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtKitap, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 85, Short.MAX_VALUE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAra, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))))
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
                            .addComponent(btnGeri, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(txtAdres, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dateV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtKitap, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnkaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSil, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTemizle, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
     public void VeriGetir() { // bu method ile tablo güncelleniyor ve veri tabanındaki bilgileri çekiliyor
         
        int c;
        try {
            pst = mycon.prepareStatement("select * from kullanici");//sorgu yapılıyor
            ResultSet rs = pst.executeQuery();
            ResultSetMetaData rsd = rs.getMetaData();
            c = rsd.getColumnCount();
            table = (DefaultTableModel) tblkullanici.getModel();// tablo modeli oluşturuluyor
            table.setRowCount(0);

            while (rs.next()) {//while ile vektöre veri atıldı ardından da tabloya veri atıldı
                Vector v2 = new Vector();
                for (int i = 1; i <= c; i++) {
                    v2.add(rs.getInt("id"));
                    v2.add(rs.getString("adSoyad"));
                    v2.add(rs.getString("tc"));
                    v2.add(rs.getString("tel"));
                    v2.add(rs.getString("mail"));
                    v2.add(rs.getString("adres"));
                    v2.add(rs.getString("aTarih"));
                    v2.add(rs.getString("vTarih"));
                    v2.add(rs.getString("kAdi"));
                     v2.add(rs.getString("kId"));
                }
                table.addRow(v2);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("veriler çekilemedi !");
        }
    }
    
    private void btnkaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkaydetActionPerformed
        VeriGetir();// bu kısımda textfieldlerdeki bilgileri alıp değişkenlere atadık
        String id = "";
        String adSoyad = txtAdSoyad.getText();
        String tc = txtTc.getText();
        String tel = txtTel.getText();
        String mail = txtMail.getText();
        String adres = txtAdres.getText();
        String kitap = txtKitap.getText();
        String kId = txtId.getText();
        SimpleDateFormat ATarih = new SimpleDateFormat("dd-MM--yyyy");
        SimpleDateFormat VTarih = new SimpleDateFormat("dd-MM--yyyy");
        String atarih = ATarih.format(dateA.getDate());
        String vtarih = VTarih.format(dateA.getDate());

        try {// sorgumuzu yazdık ve veri tabanında bağlandık
            pst = mycon.prepareStatement("insert into kullanici (adSoyad,tc,tel,mail,adres,aTarih,vTarih,KAdi,kId) VALUES"
                + "(?,?,?,?,?,?,?,?,?)");
              //veri güvenliği için değişken değerlerini burada gönderdik
            pst.setString(1, adSoyad);
            pst.setString(2, tc);
            pst.setString(3, tel);
            pst.setString(4, mail);
            pst.setString(5, adres);
            pst.setString(6, atarih);
            pst.setString(7, vtarih);
            pst.setString(8, kitap);
            pst.setString(9, kId);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Kullanıcı başarıyla eklendi.");//kullanıcıyı bilgilendirdik
            VeriGetir();//tabloyu güncelledik
            //burada da textfieldleri temizledik
            lblId.setText("");
            txtAdSoyad.setText("");
            txtTc.setText("");
            txtTel.setText("");
            txtMail.setText("");
            txtKitap.setText("");
            txtAdres.setText("");
            txtId.setText("");
            dateA.setDate(null);
            dateV.setDate(null);
            txtAra.setText("");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Veri tabanı bağlantısı başarısız !");
        }
    }//GEN-LAST:event_btnkaydetActionPerformed

    private void btnGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuncelleActionPerformed
        //bir önceki butonla yapılanların aynısı sadece sorgu değiştirildi
        VeriGetir();
        String id =lblId.getText();
        String adSoyad = txtAdSoyad.getText();
        String tc = txtTc.getText();
        String tel = txtTel.getText();
        String mail = txtMail.getText();
        String adres = txtAdres.getText();
        String kitap = txtKitap.getText();
        String kId = txtId.getText();
        SimpleDateFormat ATarih = new SimpleDateFormat("dd-MM--yyyy");
        SimpleDateFormat VTarih = new SimpleDateFormat("dd-MM--yyyy");
        String atarih = ATarih.format(dateA.getDate());
        String vtarih = VTarih.format(dateA.getDate());

        try {
            pst = mycon.prepareStatement("update kullanici set adSoyad=?, tc=?, tel=?, mail=?,"
                                         + " adres=?, aTarih=?, vTarih=?,KAdi=?,kId=? where id=?");

            pst.setString(1, adSoyad);
            pst.setString(2, tc);
            pst.setString(3, tel);
            pst.setString(4, mail);
            pst.setString(5, adres);
            pst.setString(6, atarih);
            pst.setString(7, vtarih);
            pst.setString(8, kitap);
            pst.setString(9, kId);
             pst.setString(10, id);
            pst.executeUpdate();
            VeriGetir();
            JOptionPane.showMessageDialog(this, "Kullanıcı bilgileri güncellendi");
            VeriGetir();
            lblId.setText("");
            txtAdSoyad.setText("");
            txtTc.setText("");
            txtTel.setText("");
            txtMail.setText("");
            txtAdres.setText("");
            txtKitap.setText("");
            txtId.setText("");
            dateA.setDate(null);
            dateV.setDate(null);
            txtAra.setText("");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("güncellenmedi!");
        }
    }//GEN-LAST:event_btnGuncelleActionPerformed

    private void btnSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSilActionPerformed
        //burada da diğer sorgularda yapılanla aynı şeyler yapıldı farklar sorgu ve id ile silme işlemi yapılmasıdır
        String id = lblId.getText();
        try {
            pst = mycon.prepareStatement("delete from kullanici where id=? ");
            pst.setString(1, id);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Kullanıcı Silindi.");

            VeriGetir();
           lblId.setText("");
            txtAdSoyad.setText("");
            txtTc.setText("");
            txtTel.setText("");
            txtMail.setText("");
            txtAdres.setText("");
            txtKitap.setText("");
            txtId.setText("");
            dateA.setDate(null);
            dateV.setDate(null);
            txtAra.setText("");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("silinemedi!");
        }
    }//GEN-LAST:event_btnSilActionPerformed

    private void txtAraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAraActionPerformed

    }//GEN-LAST:event_txtAraActionPerformed

    private void txtAraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAraKeyReleased
        //diğer bir çok menüde de olan arama kısmı girilen kelimeleri tablo içinde arayıp bulmaya yarıyor
           //aramalar büyük küçük harfe duyarlıdır
        String arama = txtAra.getText();
        TableRowSorter<DefaultTableModel> tableRowSorter
        = new TableRowSorter<DefaultTableModel>(table);
        tblkullanici.setRowSorter(tableRowSorter);
        tableRowSorter.setRowFilter(RowFilter.regexFilter(arama));
    }//GEN-LAST:event_txtAraKeyReleased

    private void btnTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTemizleActionPerformed
        lblId.setText("");//tüm menüyü temizliyoruz
        txtAdSoyad.setText("");
        txtTc.setText("");
        txtTel.setText("");
        txtMail.setText("");
        txtAdres.setText("");
        txtKitap.setText("");
        txtId.setText("");
        dateA.setDate(null);
        dateV.setDate(null);
        txtAra.setText("");
    }//GEN-LAST:event_btnTemizleActionPerformed

    private void btnGeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeriActionPerformed
        personelMenu personelMenu = new personelMenu();//bir önceki menüye geçiş yapıldı
        this.hide();
        personelMenu.setVisible(true);
    }//GEN-LAST:event_btnGeriActionPerformed

    private void tblkullaniciMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblkullaniciMouseClicked
        table = (DefaultTableModel) tblkullanici.getModel();
        /*bu kısımda diğer menülerde buluanan bir kısım mantık 
        oldukça basit tıklanan verileri textfieldlere atılıyor sırasıyla*/
        int selectedIndex = tblkullanici.getSelectedRow();

        lblId.setText(table.getValueAt(selectedIndex, 0).toString());
        txtAdSoyad.setText(table.getValueAt(selectedIndex, 1).toString());
        txtTc.setText(table.getValueAt(selectedIndex, 2).toString());
        txtTel.setText(table.getValueAt(selectedIndex, 3).toString());
        txtMail.setText(table.getValueAt(selectedIndex, 4).toString());
        txtAdres.setText(table.getValueAt(selectedIndex, 5).toString());
        Date tarih = null;
        try {
            tarih = new SimpleDateFormat("dd-MM-yyyy").parse((String) table.getValueAt(selectedIndex, 6));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Veri tabanı bağlantısı başarısız !");
        }
        dateA.setDate(tarih);
         Date tarih2 = null;
        try {
            tarih2 = new SimpleDateFormat("dd-MM-yyyy").parse((String) table.getValueAt(selectedIndex, 7));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Veri tabanı bağlantısı başarısız !");
        }
        
        dateV.setDate(tarih2);
        txtKitap.setText(table.getValueAt(selectedIndex, 8).toString());
        txtId.setText(table.getValueAt(selectedIndex, 9).toString());
    }//GEN-LAST:event_tblkullaniciMouseClicked

   
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kullaniciDuzen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGeri;
    private javax.swing.JButton btnGuncelle;
    private javax.swing.JButton btnSil;
    private javax.swing.JButton btnTemizle;
    private javax.swing.JButton btnkaydet;
    private com.toedter.calendar.JDateChooser dateA;
    private com.toedter.calendar.JDateChooser dateV;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblId;
    private javax.swing.JTable tblkullanici;
    private javax.swing.JTextField txtAdSoyad;
    private javax.swing.JTextField txtAdres;
    private javax.swing.JTextField txtAra;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtKitap;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtTc;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
