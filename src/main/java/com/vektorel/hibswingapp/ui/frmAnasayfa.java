package com.vektorel.hibswingapp.ui;

import com.vektorel.hibswingapp.entity.Kullanici;
import com.vektorel.hibswingapp.service.KullaniciService;
import java.util.List;
import javax.swing.JOptionPane;

public class frmAnasayfa extends javax.swing.JFrame {

    Kullanici kullanici;
    KullaniciService kullaniciService = new KullaniciService();

    public frmAnasayfa(Kullanici kullanici) {
        initComponents();
        setLocationRelativeTo(null);
        this.kullanici = kullanici;
        gizle();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlAnasayfa = new javax.swing.JPanel();
        txtAra = new javax.swing.JTextField();
        btnAra = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAnasayfa = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuKullaniciIslemleri = new javax.swing.JMenu();
        mnuKullaniciListe = new javax.swing.JMenuItem();
        mnuKullaniciEkle = new javax.swing.JMenuItem();
        mnuKullaniciSil = new javax.swing.JMenuItem();
        mnuKullaniciGuncelle = new javax.swing.JMenuItem();
        mnuOgrenciIslemleri = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAra.setText("ARA");
        btnAra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAraActionPerformed(evt);
            }
        });

        tblAnasayfa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblAnasayfa);

        javax.swing.GroupLayout pnlAnasayfaLayout = new javax.swing.GroupLayout(pnlAnasayfa);
        pnlAnasayfa.setLayout(pnlAnasayfaLayout);
        pnlAnasayfaLayout.setHorizontalGroup(
            pnlAnasayfaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAnasayfaLayout.createSequentialGroup()
                .addComponent(txtAra, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAra, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                .addGap(8, 8, 8))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        pnlAnasayfaLayout.setVerticalGroup(
            pnlAnasayfaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAnasayfaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAnasayfaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAra, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        mnuKullaniciIslemleri.setText("Kullanıcı İşlemleri");

        mnuKullaniciListe.setText("Kullanıcı Listesi");
        mnuKullaniciListe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuKullaniciListeActionPerformed(evt);
            }
        });
        mnuKullaniciIslemleri.add(mnuKullaniciListe);

        mnuKullaniciEkle.setText("Kullanıcı Ekle");
        mnuKullaniciEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuKullaniciEkleActionPerformed(evt);
            }
        });
        mnuKullaniciIslemleri.add(mnuKullaniciEkle);

        mnuKullaniciSil.setText("Kullanıcı Sil");
        mnuKullaniciSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuKullaniciSilActionPerformed(evt);
            }
        });
        mnuKullaniciIslemleri.add(mnuKullaniciSil);

        mnuKullaniciGuncelle.setText("Kullanıcı Güncelle");
        mnuKullaniciGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuKullaniciGuncelleActionPerformed(evt);
            }
        });
        mnuKullaniciIslemleri.add(mnuKullaniciGuncelle);

        jMenuBar1.add(mnuKullaniciIslemleri);

        mnuOgrenciIslemleri.setText("Öğrenci İşlemleri");
        jMenuBar1.add(mnuOgrenciIslemleri);

        jMenu1.setText("Tanımlar");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAnasayfa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAnasayfa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuKullaniciListeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuKullaniciListeActionPerformed
        kullaniciTabloDoldur(null);
    }//GEN-LAST:event_mnuKullaniciListeActionPerformed

    private void mnuKullaniciEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuKullaniciEkleActionPerformed
        frmKullaniciEkle ekle = new frmKullaniciEkle(this, true);
        ekle.setVisible(true);
        kullaniciTabloDoldur(null);
    }//GEN-LAST:event_mnuKullaniciEkleActionPerformed

    private void mnuKullaniciSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuKullaniciSilActionPerformed
        if (tblAnasayfa.getSelectedRowCount()> 1){
            JOptionPane.showMessageDialog(rootPane, "Lütfen sadece bir adet kayıt seçiniz!", "Fazla Kayıt Seçildi", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        int seciliKayit = tblAnasayfa.getSelectedRow();
        if (seciliKayit > -1) {
            int secim = JOptionPane.showConfirmDialog(rootPane, "Seçili kaydı silmek istediğinizden emin misiniz?", "Dikkat", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (secim == 0) {
                String value = tblAnasayfa.getValueAt(seciliKayit, 0).toString();
                Kullanici kullanici = kullaniciService.getById(new Long(value));
                kullaniciService.delete(kullanici);
                kullaniciTabloDoldur(null);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Lütfen silmek istediğiniz kaydı tablodan seçiniz!", "Kayıt Seçilmedi", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_mnuKullaniciSilActionPerformed

    private void mnuKullaniciGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuKullaniciGuncelleActionPerformed
        if (tblAnasayfa.getSelectedRowCount()> 1){
            JOptionPane.showMessageDialog(rootPane, "Lütfen sadece bir adet kayıt seçiniz!", "Fazla Kayıt Seçildi", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int seciliKayit = tblAnasayfa.getSelectedRow();
        if (seciliKayit > -1) {
            String value = tblAnasayfa.getValueAt(seciliKayit, 0).toString();
            Kullanici kullanici = kullaniciService.getById(new Long(value));
            frmKullaniciEkle guncelle = new frmKullaniciEkle(this, true, kullanici);
            guncelle.setVisible(true);
            kullaniciTabloDoldur(null);
        }
    }//GEN-LAST:event_mnuKullaniciGuncelleActionPerformed

    private void btnAraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAraActionPerformed
        String query = txtAra.getText();
        kullaniciTabloDoldur(query);
    }//GEN-LAST:event_btnAraActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAra;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem mnuKullaniciEkle;
    private javax.swing.JMenuItem mnuKullaniciGuncelle;
    private javax.swing.JMenu mnuKullaniciIslemleri;
    private javax.swing.JMenuItem mnuKullaniciListe;
    private javax.swing.JMenuItem mnuKullaniciSil;
    private javax.swing.JMenu mnuOgrenciIslemleri;
    private javax.swing.JPanel pnlAnasayfa;
    private javax.swing.JTable tblAnasayfa;
    private javax.swing.JTextField txtAra;
    // End of variables declaration//GEN-END:variables

    private void kullaniciTabloDoldur(String query) {
        goster();

        List<Kullanici> kullanicilar = kullaniciService.getAll(query);
        String[][] data = new String[kullanicilar.size()][3];

        for (int i = 0; i < kullanicilar.size(); i++) {
            data[i][0] = kullanicilar.get(i).getId().toString();
            data[i][1] = kullanicilar.get(i).getAdSoyad();
            data[i][2] = kullanicilar.get(i).getUsername();
        }

        tblAnasayfa.setModel(new javax.swing.table.DefaultTableModel(
                data,
                new String[]{
                    "No", "Ad Soyad", "Kullanıcı Adı"
                }
        ));
    }

    private void gizle() {
//        tblAnasayfa.setVisible(false);
//        tblAnasayfa.getTableHeader().setVisible(false);
//        btnAra.setVisible(false);
//        txtAra.setVisible(false);
        pnlAnasayfa.setVisible(false);
    }

    private void goster() {
//        tblAnasayfa.setVisible(true);
//        tblAnasayfa.getTableHeader().setVisible(true);
//        btnAra.setVisible(true);
//        txtAra.setVisible(true);
        pnlAnasayfa.setVisible(true);
    }

}
