/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.io.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;
/**
 *
 * @author NITRO 5
 */
public class DataSepatu extends javax.swing.JFrame {

    /**
     * Creates new form DataSepatu
     */
    public DataSepatu() {
        initComponents();
        table();
        
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        txtIDSepatu1 = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtHarga = new javax.swing.JTextField();
        txtTahunRilis = new javax.swing.JTextField();
        rbSneakers = new javax.swing.JRadioButton();
        rbBasket = new javax.swing.JRadioButton();
        rbLari = new javax.swing.JRadioButton();
        cbMerek = new javax.swing.JComboBox<>();
        btnsimpan = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbrak = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(644, 401));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sneakers Zone");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Home");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Data Sepatu");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(287, 287, 287)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        lbl1.setBackground(new java.awt.Color(0, 0, 0));
        lbl1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lbl1.setText("Data Sepatu");

        lbl2.setBackground(new java.awt.Color(0, 0, 0));
        lbl2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lbl2.setText("ID Data Sepatu:");

        lbl3.setBackground(new java.awt.Color(0, 0, 0));
        lbl3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lbl3.setText("Nama Sepatu:");

        lbl4.setBackground(new java.awt.Color(0, 0, 0));
        lbl4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lbl4.setText("Harga Sepatu:");

        lbl5.setBackground(new java.awt.Color(0, 0, 0));
        lbl5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lbl5.setText("Rilis Sepatu:");

        lbl6.setBackground(new java.awt.Color(0, 0, 0));
        lbl6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lbl6.setText("Jenis Sepatu:");

        lbl7.setBackground(new java.awt.Color(0, 0, 0));
        lbl7.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lbl7.setText("Merek Sepatu:");

        txtIDSepatu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDSepatu1ActionPerformed(evt);
            }
        });

        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });

        txtHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHargaActionPerformed(evt);
            }
        });

        txtTahunRilis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTahunRilisActionPerformed(evt);
            }
        });

        rbSneakers.setText("Sneakers");

        rbBasket.setText("Basket");

        rbLari.setText("Lari");

        cbMerek.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Adidas", "New Balance", "Nike" }));

        btnsimpan.setText("Simpan");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        btnDelete.setLabel("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnKembali.setText("Kembali");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        tbrak.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No.", "Nama Sepatu", "Harga", "Tahun Rilis", "Jenis Sepatu", "Merek"
            }
        ));
        tbrak.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbrakMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbrak);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(285, 285, 285))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btnKembali))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnsimpan)
                                .addGap(55, 55, 55)
                                .addComponent(btnUpdate)
                                .addGap(40, 40, 40)
                                .addComponent(btnBatal)
                                .addGap(55, 55, 55)
                                .addComponent(btnDelete))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl7, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rbSneakers)
                                        .addGap(52, 52, 52)
                                        .addComponent(rbBasket)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rbLari, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtIDSepatu1)
                                    .addComponent(txtNama)
                                    .addComponent(txtHarga)
                                    .addComponent(txtTahunRilis)
                                    .addComponent(cbMerek, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIDSepatu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl5)
                            .addComponent(txtTahunRilis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbLari)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rbSneakers)
                                .addComponent(rbBasket)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbMerek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnsimpan)
                            .addComponent(btnUpdate)
                            .addComponent(btnBatal)
                            .addComponent(btnDelete))
                        .addGap(23, 23, 23)
                        .addComponent(btnKembali))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 909, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDSepatu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDSepatu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDSepatu1ActionPerformed

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void txtHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHargaActionPerformed

    private void txtTahunRilisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTahunRilisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTahunRilisActionPerformed

    private void table(){
        DefaultTableModel tbl = (DefaultTableModel) tbrak.getModel();
        tbrak.setRowHeight(40);
        tbrak.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        tbl.setRowCount(0);
        
        try{
            Connection conn = koneksi.getConnection();
            String sql = "SELECT * FROM tbdatasepatu";
            PreparedStatement psmt = conn.prepareStatement(sql);
            ResultSet rs = psmt.executeQuery();
            
            while (rs.next()){
                int id = rs.getInt("Idsepatu");
                String nama = rs.getString("nama");
                int harga = rs.getInt("harga");
                int Trilis = rs.getInt("rilis");
                String jenis = rs.getString("jenis");
                String merek = rs.getString("merek");
                tbl.addRow(new Object []{id, nama, harga, Trilis, jenis, merek});
                tbrak.setModel(tbl);
            }
            conn.close();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(this, "There is an error : " + e.getMessage(), "SQL Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void cls(){
        txtIDSepatu1.setText(null);
        txtNama.setText(null);
        txtHarga.setText(null);
        txtTahunRilis.setText(null);
        rbBasket.setSelected(false);
        rbSneakers.setSelected(false);
        rbLari.setSelected(false);
        cbMerek.setSelectedIndex(-1);
        txtNama.requestFocusInWindow();
        tbrak.clearSelection();
        btnsimpan.setVisible(true);
        btnBatal.setVisible(true);
        btnDelete.setVisible(false);
        btnUpdate.setVisible(false);
    }
    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        String textid = txtIDSepatu1.getText();
        String Hargasepatu = txtHarga.getText();
        String tahunril = txtTahunRilis.getText();
        int id = Integer.parseInt(textid);
        int rilis = Integer.parseInt(tahunril);
        int Harga = Integer.parseInt(Hargasepatu);
        String merek = cbMerek.getSelectedItem().toString();
        try{
            Connection conn = koneksi.getConnection();
            String sql = "INSERT INTO tbdatasepatu (Idsepatu, nama, harga, rilis, jenis, merek) VALUES (?,?,?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.setString(2, this.txtNama.getText());
            stmt.setInt(3, Harga);
            stmt.setInt(4, rilis);
            if(rbBasket.isSelected()){
                String jenis = "Basket";
                stmt.setString(5, jenis);
            } else if(rbLari.isSelected()){
                String jenis = "Lari";
                stmt.setString(5, jenis);
            } else if(rbSneakers.isSelected()){
                String jenis = "Sneakers";
                stmt.setString(5, jenis);
            }
            stmt.setString(6, merek);
            int masukkan_row = stmt.executeUpdate();
            if (masukkan_row > 0){
                cls();
                JOptionPane.showMessageDialog(this, "Data Successfully Added!", "SQL Information", JOptionPane.INFORMATION_MESSAGE);
                table();
            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(this, "There is an error: " + e.getMessage(), "SQL Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        Login_admin logadmin = new Login_admin();
        this.dispose();
        logadmin.setVisible(true);
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int baris = tbrak.getSelectedRow();
        int option = JOptionPane.showConfirmDialog(null, "Apakah yakin ingin merubah??", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if(option == JOptionPane.YES_OPTION){
            Connection conn = koneksi.getConnection();
            String textid = txtIDSepatu1.getText();
            String textrilis = txtTahunRilis.getText();
            String textharga = txtHarga.getText();
            int id = Integer.parseInt(textid);
            int harga = Integer.parseInt(textharga);
            int tahunril = Integer.parseInt(textrilis);
            String merek =  cbMerek.getSelectedItem().toString();
            String sql = "UPDATE tbdatasepatu SET nama=?, harga=?, rilis=?, jenis=?, merek=? WHERE Idsepatu=?";
            
            try{
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, txtNama.getText());
                stmt.setInt(2, harga);
                stmt.setInt(3, tahunril);
                if(rbBasket.isSelected()){
                    String jenis = "Basket";
                    stmt.setString(4, jenis);
                } else if(rbLari.isSelected()){
                    String jenis = "Lari";
                    stmt.setString(4, jenis);
                } else if (rbSneakers.isSelected()){
                    String jenis = "Sneakers";
                    stmt.setString(4, jenis);
                }
                stmt.setString(5, merek);
                stmt.setString(6, tbrak.getValueAt(baris, 0).toString());
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Data Successfully Updated!!", "SQL Information", JOptionPane.INFORMATION_MESSAGE);
                cls();
                table();
            } catch(SQLException e){
                JOptionPane.showMessageDialog(this, "There is an error : " + e.getMessage(), "SQL Error", JOptionPane.ERROR_MESSAGE);
            }
        }else {
            JOptionPane.showMessageDialog(this, "Updated data cancelled!!!", "SQL Information", JOptionPane.INFORMATION_MESSAGE);
            cls();
        }
            
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int baris = tbrak.getSelectedRow();
        Connection conn = koneksi.getConnection();
        int option = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin mengapus data ini???", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if(option == JOptionPane.YES_OPTION){
            String sql = "DELETE FROM tbdatasepatu WHERE Idsepatu=?";
            try{
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, tbrak.getValueAt(baris, 0).toString());
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Data Successfully deleted!!", "SQL Konfirmation", JOptionPane.INFORMATION_MESSAGE);
                cls();
                table();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "There is an error : " + e.getMessage(), "SQL Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Deleted data cancelled!!", "SQL Information", JOptionPane.INFORMATION_MESSAGE);
            cls();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        cls();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void tbrakMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbrakMouseClicked
        btnsimpan.setVisible(false);
        btnUpdate.setVisible(true);
        btnDelete.setVisible(true);
        int baris = tbrak.getSelectedRow();
        txtIDSepatu1.setText(tbrak.getValueAt(baris, 0).toString());
        txtNama.setText(tbrak.getValueAt(baris, 1).toString());
        txtHarga.setText(tbrak.getValueAt(baris, 2).toString());
        txtTahunRilis.setText(tbrak.getValueAt(baris, 3).toString());
        String jenis_sepatu = tbrak.getValueAt(baris, 4).toString();
        if (jenis_sepatu.equals("Basket")){
            rbBasket.setSelected(true);
        } else if (jenis_sepatu.equals("Lari")){
            rbLari.setSelected(true);
        } else if (jenis_sepatu.equals("Sneakers")){
            rbSneakers.setSelected(true);
        }
        String merek = tbrak.getValueAt(baris, 5).toString();
        cbMerek.setSelectedItem(merek);
    }//GEN-LAST:event_tbrakMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Halaman_admin haladmin = new Halaman_admin();
        this.dispose();
        haladmin.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    
    
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
            java.util.logging.Logger.getLogger(DataSepatu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataSepatu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataSepatu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataSepatu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataSepatu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JComboBox<String> cbMerek;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JRadioButton rbBasket;
    private javax.swing.JRadioButton rbLari;
    private javax.swing.JRadioButton rbSneakers;
    private javax.swing.JTable tbrak;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtIDSepatu1;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtTahunRilis;
    // End of variables declaration//GEN-END:variables
}