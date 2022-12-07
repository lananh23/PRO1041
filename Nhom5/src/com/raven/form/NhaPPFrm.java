/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.raven.form;

import DomainModels.NhaPhanPhoi;
import ServiceImpl.NhaPhanPhoiSV;
import ViewModels.QLNPP;
import java.sql.SQLException;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class NhaPPFrm extends javax.swing.JPanel {

    private final NhaPhanPhoiSV NPPSV;
    DefaultTableModel model;
    DefaultComboBoxModel cbb, cbb1;
    public NhaPPFrm() {
        initComponents();
        cbb = new DefaultComboBoxModel();
        cbb1 = new DefaultComboBoxModel();
        NPPSV = new NhaPhanPhoiSV();
        model = new DefaultTableModel();
        model = (DefaultTableModel) tblNPP.getModel();
        model.setRowCount(0);
        cbx();
        loadtable();
    }

    void loadtable() {
        try {
            List<QLNPP> ql = NPPSV.findALL();
            if (ql == null) {
                JOptionPane.showMessageDialog(null, "lỗi");
                return;

            }
            for (QLNPP q : ql) {
                model.addRow(new Object[]{
                    q.getMaNPP(),
                    q.getTenNPP(),
                    q.getDiaChi(),
                    q.getSdt(),
                    q.getMaSP(),
                    q.getTrangThai() == 1 ? "Còn cung cấp" : "ko còn cung cấp"});
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "lỗi");
            return;
        }

    }

    void cbx() {
        cbb.addElement("ko còn cung cấp");
        cbb.addElement("Còn cung cấp");
        cbxTT.setModel(cbb);
    }


    void clearForm() {
        this.txtMa.setText("");
        this.cbxMaSP.setSelectedIndex(0);
        this.txtTen.setText("");
        this.txtDiaChi.setText("");
        this.txtSDT.setText("");
        this.cbxTT.setSelectedIndex(0);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtMa = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        txtSDT = new javax.swing.JTextField();
        btnXoa = new javax.swing.JButton();
        txtDiaChi = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        tblNPP = new javax.swing.JTable();
        btnLoc = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnTK = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbxTT = new javax.swing.JComboBox<>();
        cbxMaSP = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel62 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel63.setText("Mã NPP");

        btnThem.setText("Thêm ");
        btnThem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnThem.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnXoa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        jLabel64.setText("Tên NPP");

        jLabel65.setText("Địa chỉ");

        jLabel1.setText("Số ĐT");

        tblNPP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã NPP", "Tên NPP", "Địa chỉ", "SĐT", "Mã SP", "Trạng thái"
            }
        ));
        tblNPP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNPPMouseClicked(evt);
            }
        });
        jScrollPane13.setViewportView(tblNPP);

        btnLoc.setText("Lọc");
        btnLoc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLoc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocActionPerformed(evt);
            }
        });

        btnSua.setText("Cập nhật");
        btnSua.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSua.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnTK.setText("Tìm kiếm");
        btnTK.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTK.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTKActionPerformed(evt);
            }
        });

        jLabel2.setText("Mã SP");

        jLabel3.setText("Trạng thái");

        cbxTT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbxMaSP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SP001", "SP002", "SP003", "SP004" }));

        jButton1.setText("Hiển thị");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel62.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel62.setText("Quản lý nhà phân phối");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel63)
                                    .addComponent(jLabel64))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(158, 158, 158)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel65)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(19, 19, 19)
                                    .addComponent(btnThem)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnSua)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnXoa)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnTK)))
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(cbxTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(39, 39, 39)
                                        .addComponent(btnLoc))
                                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(62, 62, 62))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(jLabel62)))
                .addContainerGap(92, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel62)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel63)
                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel65))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel64))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(cbxMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnThem)
                            .addComponent(btnSua)
                            .addComponent(btnXoa)
                            .addComponent(btnTK)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbxTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jButton1))
                    .addComponent(btnLoc))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 846, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 654, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        String Ma = txtMa.getText();
        String Ten = txtTen.getText();
        String DiaChi = txtDiaChi.getText();
        String Sdt = txtSDT.getText();
        String MaSP = (String) cbxMaSP.getSelectedItem();
        int tt = cbxTT.getSelectedIndex();
        String dangSDT = "0\\d{9,10}";
        if (Ma.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "mã ko đc để trống");
            return;
        }
        if (Ten.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "tên ko đc để trống");
            return;
        }
        if (DiaChi.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "địa chỉ ko đc để trống");
            return;
        }
        if (Sdt.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Sdt ko đc để trống");
            return;
        }
        if (!Sdt.matches(dangSDT)) {
            JOptionPane.showMessageDialog(this, "Số điện thoại không đúng định dạng!");
            return;
        }

        model.setRowCount(0);
        loadtable();
        clearForm();
        List<NhaPhanPhoi> n = NPPSV.insert(Ma, Ten, DiaChi, Sdt, MaSP, tt);
        if (n == null) {
            JOptionPane.showMessageDialog(null, "mã bị trùng");
            return;
        } else {
            model.setRowCount(0);
            loadtable();
            clearForm();
            JOptionPane.showMessageDialog(null, "thêm thành công");
            return;
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        int row = tblNPP.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(null, "chọn 1 cái để xóa");
            return;
        } else {
            int cofirm = JOptionPane.showConfirmDialog(this, "bạn muốn xóa không");
            if (cofirm != JOptionPane.YES_OPTION) {
                return;
            }
            String Ma = txtMa.getText();
            NPPSV.delete(Ma);
            model.setRowCount(0);
            loadtable();
            clearForm();
            JOptionPane.showMessageDialog(null, "xóa thành công");
            return;
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void tblNPPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNPPMouseClicked
        // TODO add your handling code here:
        int row = tblNPP.getSelectedRow();
        NhaPhanPhoi npp = NPPSV.click().get(row);
        txtMa.setText(npp.getMaNPP());
        txtTen.setText(npp.getTenNPP());
        txtDiaChi.setText(npp.getDiaChi());
        txtSDT.setText(npp.getSdt());
        cbxMaSP.setSelectedItem(npp.getMaSP());
        cbxTT.setSelectedItem(tblNPP.getValueAt(row, 5).toString());
    }//GEN-LAST:event_tblNPPMouseClicked

    private void btnLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocActionPerformed
        // TODO add your handling code here:
        String ma = JOptionPane.showInputDialog(null, "lọc theo mã sp");
        List<NhaPhanPhoi> k = NPPSV.select2(ma);
        model.setRowCount(0);
        for (NhaPhanPhoi n : k) {
            if (n.getMaSP().equalsIgnoreCase(ma)) {
                model.addRow(new Object[]{
                    n.getMaNPP(),
                    n.getTenNPP(),
                    n.getDiaChi(),
                    n.getSdt(),
                    n.getMaSP(),
                    n.getTrangThai() == 1 ? "Còn cung cấp" : "ko còn cung cấp"});
        }
        }

        if (k.isEmpty()) {
            JOptionPane.showMessageDialog(null, "ko thấy mã sp");
            return;
        } else {
            JOptionPane.showMessageDialog(null, "đã thấy mã sp");
            return;
        }

    }//GEN-LAST:event_btnLocActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        int row = tblNPP.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(null, "vui lòng chọn từ table");
            return;
        } else {
            String Ma = txtMa.getText();
            String Ten = txtTen.getText();
            String DiaChi = txtDiaChi.getText();
            String Sdt = txtSDT.getText();
            String MaSP = (String) cbxMaSP.getSelectedItem();
            int tt = cbxTT.getSelectedIndex();
            String dangSDT = "0\\d{9,10}";
            if (Ma.trim().isEmpty()
                || Ten.trim().isEmpty()
                || DiaChi.trim().isEmpty()
                || Sdt.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "ko đc để trống");
                return;
            }
            if (!Sdt.matches(dangSDT)) {
                JOptionPane.showMessageDialog(null, "Số điện thoại không đúng định dạng!");
                return;
            }
            try {
                NPPSV.update(Ma, Ten, DiaChi, Sdt, MaSP, tt);
                model.setRowCount(0);
                loadtable();
                clearForm();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "sửa thất bại");
                return;
            }
            JOptionPane.showMessageDialog(null, "sửa thành công");
            return;

        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTKActionPerformed
        // TODO add your handling code here:
        String ma = JOptionPane.showInputDialog(null, "vui lòng nhập mã npp muốn tìm");
        try {
            List<NhaPhanPhoi> k = NPPSV.select1(ma);
            model.setRowCount(0);
            for (NhaPhanPhoi n : k) {
                model.addRow(new Object[]{
                    n.getMaNPP(),
                    n.getTenNPP(),
                    n.getDiaChi(),
                    n.getSdt(),
                    n.getMaSP(),
                    n.getTrangThai() == 1 ? "Còn cung cấp" : "ko còn cung cấp"});
        }
        if (k.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Thất bại");
            return;
        } else {
            JOptionPane.showMessageDialog(null, "đã hiện npp muốn tìm");
            return;
        }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnTKActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        loadtable();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoc;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTK;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbxMaSP;
    private javax.swing.JComboBox<String> cbxTT;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JTable tblNPP;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
