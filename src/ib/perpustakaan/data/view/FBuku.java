package ib.perpustakaan.data.view;

import ib.perpustakaan.data.entity.Buku;
import ib.perpustakaan.data.implement.BukuImplement;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Program
 */
public class FBuku extends javax.swing.JDialog {

    List<Buku> record = new ArrayList<>(); //untuk menampung getAll() dari barangImplement
    BukuImplement implement;
    int row;
    
    public FBuku(java.awt.Frame parent, boolean modal){
        super(parent, modal);
        initComponents();
        
        implement = new BukuImplement();
        tblBuku.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                row = tblBuku.getSelectedRow();
                if(row != -1)
                {
                    isiText();
                }
            }
        });
        tblBuku.getTableHeader().setReorderingAllowed(false);
        
        statusAwal();
    }
    
    private void isiText() {
        Buku entity = record.get(row);
        txtKodeBuku.setText(entity.getKodeBuku());
        txtJudulBuku.setText(entity.getJudul());
        txtPengarang.setText(entity.getPengarang());
        txtPenerbit.setText(entity.getPenerbit());
        txtTahunTerbit.setText(entity.getTahunTerbit());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblBuku = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtKodeBuku = new javax.swing.JTextField();
        txtJudulBuku = new javax.swing.JTextField();
        txtPengarang = new javax.swing.JTextField();
        txtPenerbit = new javax.swing.JTextField();
        txtTahunTerbit = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnBatal = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnTutup = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cbCari = new javax.swing.JComboBox();
        txtCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("DATA BUKU");

        tblBuku.setModel(new javax.swing.table.DefaultTableModel(
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
        tblBuku.setRowHeight(25);
        tblBuku.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tblBuku);

        jLabel1.setText("Kode Buku");

        jLabel2.setText("Judul Buku");

        txtKodeBuku.setEnabled(false);

        txtJudulBuku.setEnabled(false);

        txtPengarang.setEnabled(false);

        txtPenerbit.setEnabled(false);

        txtTahunTerbit.setEnabled(false);

        jLabel3.setText("Pengarang");

        jLabel4.setText("Penerbit");

        jLabel5.setText("Tahun Terbit");

        btnBatal.setText("Batal");
        btnBatal.setEnabled(false);
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        btnSimpan.setText("Simpan");
        btnSimpan.setEnabled(false);
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtKodeBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtJudulBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPengarang, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTahunTerbit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtKodeBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtJudulBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtTahunTerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPengarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSimpan)
                    .addComponent(btnBatal))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnTutup.setText("Tutup");
        btnTutup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTutupActionPerformed(evt);
            }
        });

        jLabel7.setText("Cari Berdasarkan :");

        cbCari.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nama Buku", "Pengarang", "Penerbit", "Tahun Terbit" }));

        btnCari.setText("CARI");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTutup, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbCari, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCari, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnTambah)
                        .addComponent(btnUbah)
                        .addComponent(btnHapus))
                    .addComponent(btnTutup, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCari))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        if(txtKodeBuku.getText().equals("") || txtJudulBuku.getText().equals("") || txtPengarang.getText().equals("") || txtPenerbit.getText().equals("") || txtTahunTerbit.getText().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane, "Harap isi semua data terlebih dahulu");
        }
        else
        {
            if(btnSimpan.getText().equalsIgnoreCase("Simpan"))
                simpanData();
            else
                rubahData();
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnTutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTutupActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnTutupActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        formUbah();
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        if(txtKodeBuku.getText().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane, "Harap pilih data pada tabel terlebih dahulu");
        }
        else
        {        
            hapusData();
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        cariData();
    }//GEN-LAST:event_btnCariActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        statusAwal();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        formTambah();
    }//GEN-LAST:event_btnTambahActionPerformed

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
            java.util.logging.Logger.getLogger(FBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FBuku dialog = new FBuku(new javax.swing.JFrame(), false);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnTutup;
    private javax.swing.JButton btnUbah;
    private javax.swing.JComboBox cbCari;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBuku;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtJudulBuku;
    private javax.swing.JTextField txtKodeBuku;
    private javax.swing.JTextField txtPenerbit;
    private javax.swing.JTextField txtPengarang;
    private javax.swing.JTextField txtTahunTerbit;
    // End of variables declaration//GEN-END:variables

    private void statusAwal() {
        txtKodeBuku.setText("");
        txtJudulBuku.setText("");
        txtPengarang.setText("");
        txtPenerbit.setText("");
        txtTahunTerbit.setText("");

        // Mengatur  Enable Tombol Dan Textfield  
        txtKodeBuku.setEnabled(false);
        txtJudulBuku.setEnabled(false);
        txtPengarang.setEnabled(false);
        txtPenerbit.setEnabled(false);
        txtTahunTerbit.setEnabled(false);

        btnTambah.setEnabled(true);
        btnUbah.setEnabled(true);
        btnHapus.setEnabled(true);
        btnTutup.setEnabled(true);
        
        btnSimpan.setEnabled(false);
        btnBatal.setEnabled(false);
        
        cbCari.setEnabled(true);
        txtCari.setEnabled(true);
        btnCari.setEnabled(true);
        
        tampilDataKeJTable();
        
        tblBuku.setEnabled(true);
        tblBuku.clearSelection();
    }
    
    private void loadData() {
        try {
            record = implement.getBuku();
        } catch (SQLException ex) {
            Logger.getLogger(FAnggota.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void isiTabel() {
        Object data[][] = new Object[record.size()][6];
        int x = 0;
        for (Buku list:record)
        {
            data[x][0] = list.getKodeBuku();
            data[x][1] = list.getJudul();
            data[x][2] = list.getPengarang();
            data[x][3] = list.getPenerbit();
            data[x][4] = list.getTahunTerbit();
            x++;
        }
        
        String[] judul = {"Kode Buku", "Nama Buku", "Pengarang", "Penerbit", "Tahun Terbit"};
        DefaultTableModel tabModel = new DefaultTableModel(data, judul)
        {
            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        };
        
        tblBuku.setModel(tabModel);
        tblBuku.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tblBuku.getColumnModel().getColumn(0).setPreferredWidth(80);
        tblBuku.getColumnModel().getColumn(1).setPreferredWidth(200);
        tblBuku.getColumnModel().getColumn(2).setPreferredWidth(100);
        tblBuku.getColumnModel().getColumn(3).setPreferredWidth(80);
        tblBuku.getColumnModel().getColumn(4).setPreferredWidth(80);
        tblBuku.setAutoResizeMode(JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS);
        
        jScrollPane1.setViewportView(tblBuku);
    }
    
    private void tampilDataKeJTable() {
        loadData();
        isiTabel();
    }
    
    private void simpanData() {
        // Konfirmasi sebelum melakukan perubahan data
        int ok = JOptionPane.showConfirmDialog(this,
                        "Anda Yakin Ingin Menambah Data\n"
                        + "Dengan Kode Buku = '" + txtKodeBuku.getText() + "'", "Konfirmasi ", JOptionPane.YES_NO_OPTION);
        // Apabila tombol Yes ditekan
        if (ok == JOptionPane.YES_OPTION) {
        try { 
            Buku entity = new Buku();  // Entity

            entity.setKodeBuku(txtKodeBuku.getText());
            entity.setJudul(txtJudulBuku.getText());
            entity.setPengarang(txtPengarang.getText());
            entity.setPenerbit(txtPenerbit.getText());
            entity.setTahunTerbit(txtTahunTerbit.getText());

            implement.insert(entity);   // brgServis Objek dari barangImplement yang punya method Insert (barang brg)
            
            if (entity.getRow_execute() > 0) {
                JOptionPane.showMessageDialog(this, "Data Sudah Tersimpan"); 
                statusAwal();
            }
        } catch (SQLException ex) { 
            Logger.getLogger(FAnggota.class.getName()).log(Level.SEVERE, null, ex); 
        }
        }
    }
    
    private void rubahData() {
        // Konfirmasi sebelum melakukan perubahan data
        int ok = JOptionPane.showConfirmDialog(this,
                "Anda Yakin Ingin Mengubah Data\n Dengan Kode Buku = '" + txtKodeBuku.getText()
                + "'", "Konfirmasi ", JOptionPane.YES_NO_OPTION);
        // Apabila tombol Yes ditekan
        if (ok == 0) {
            try {
                Buku entity = new Buku();  // Entity

                entity.setKodeBuku(txtKodeBuku.getText());
                entity.setJudul(txtJudulBuku.getText());
                entity.setPengarang(txtPengarang.getText());
                entity.setPenerbit(txtPenerbit.getText());
                entity.setTahunTerbit(txtTahunTerbit.getText());
                
                implement.update(entity);   // brgServis Objek dari barangImplement yang punya method Insert (barang brg)

                if (entity.getRow_execute() > 0) {
                    JOptionPane.showMessageDialog(this, "Data Berhasil diubah"); 
                    statusAwal();
                }
                } catch (SQLException se) {
                }     // Silahkan tambahkan Sendiri informasi Eksepsi
            }
    }
    
    public boolean hapusData() {
        // Konfirmasi sebelum melakukan penghapusan data
        int ok = JOptionPane.showConfirmDialog(this,
                "Anda Yakin Ingin Menghapus Data\nDengan Kode Buku = '" + txtKodeBuku.getText()
                + "'", "Konfirmasi Menghapus Data", JOptionPane.YES_NO_OPTION);
        if (ok == 0) {     // Apabila tombol OK ditekan
            try {
                implement.delete(txtKodeBuku.getText());   // brgServis Objek dari barangImplement yang punya method Insert (barang brg)

                JOptionPane.showMessageDialog(this, "Data Berhasil dihapus"); 
                statusAwal();
                
                return true;
            } catch (SQLException | HeadlessException se) {  // Silahkan tambahkan catch Exception yang lain
                JOptionPane.showMessageDialog(this, "Gagal Hapus Data.. ");
                return false;
            }
        }
        else
        {
            return false;
        }
    }

    private void cariData() {
        try {
            if(txtCari.getText().equals(""))
            {
                record = implement.getBuku();   
            }
            else
            {
                record = implement.cariBuku(cbCari.getSelectedIndex(), txtCari.getText());
            }
        } catch (SQLException ex) {
            Logger.getLogger(FAnggota.class.getName()).log(Level.SEVERE, null, ex);
        }
        isiTabel();
    }

    public void formTambah() {
                // Mengatur  Enable Tombol Dan Textfield  
        txtKodeBuku.setText("");
        txtJudulBuku.setText("");
        txtPengarang.setText("");
        txtPenerbit.setText("");
        txtTahunTerbit.setText("");
        
        txtKodeBuku.setEnabled(true);
        txtJudulBuku.setEnabled(true);
        txtPengarang.setEnabled(true);
        txtPenerbit.setEnabled(true);
        txtTahunTerbit.setEnabled(true);
        btnSimpan.setText("Simpan");
        txtKodeBuku.requestFocus();

        btnTambah.setEnabled(false);
        btnUbah.setEnabled(false);
        btnHapus.setEnabled(false);
        btnTutup.setEnabled(false);
        
        btnSimpan.setEnabled(true);
        btnBatal.setEnabled(true);
        
        cbCari.setEnabled(false);
        txtCari.setEnabled(false);
        btnCari.setEnabled(false);
        
        tblBuku.setEnabled(false);
        tblBuku.clearSelection();
    }

    public void formUbah() {
        if(txtKodeBuku.getText().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane, "Harap pilih data pada tabel terlebih dahulu");
        }
        else
        {
            txtKodeBuku.setEnabled(false); // txtNoAnggota Tidak Aktif
            txtJudulBuku.setEnabled(true);       // txtNama          Aktif
            txtPengarang.setEnabled(true);     // txtAlamat Aktif
            txtPenerbit.setEnabled(true);     // txtAlamat Aktif
            txtTahunTerbit.setEnabled(true);     // txtAlamat Aktif

            btnSimpan.setText("Update"); // Merubah Teks Tombol Simpan

            btnTambah.setEnabled(false);
            btnUbah.setEnabled(false);
            btnHapus.setEnabled(false);
            btnTutup.setEnabled(false);

            btnSimpan.setEnabled(true);
            btnBatal.setEnabled(true);

            cbCari.setEnabled(false);
            txtCari.setEnabled(false);
            btnCari.setEnabled(false);

            tblBuku.setEnabled(false);
        }
    }
    
    public void setSelection(String kode_buku)
    {
        for (int i = 0; i < record.size(); i++) {
            if(kode_buku.equals(record.get(i).getKodeBuku()))
            {
                tblBuku.setRowSelectionInterval(i, i);
                i = record.size();
            }
        }
    }
}
