/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.raven.form;

import ServiceImpl.ManageLoaiSanPhamService;
import ServiceImpl.ManageSanPhamLoiService;
import ServiceImpl.ManageSanPhamService;
import Services.IManageLoaiSanPhamService;
import Services.IManageSanPhamLoiService;
import Services.IManageSanPhamService;
import ViewModels.ManageSanPhamLoi;
import ViewModels.QLLoaiSanPham;
import ViewModels.QLSanPham;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SanPhamLoiFrm extends javax.swing.JPanel {

    private IManageSanPhamLoiService sanPhamLoiService;
    private IManageSanPhamService sanPhamService;
    private IManageLoaiSanPhamService loaiSanPhamService;

    public SanPhamLoiFrm() {
        initComponents();
        this.sanPhamLoiService = new ManageSanPhamLoiService();
        this.sanPhamService = new ManageSanPhamService();
        this.loaiSanPhamService = new ManageLoaiSanPhamService();
        List<QLLoaiSanPham> dsSP = loaiSanPhamService.ALL();
        this.cbbLocSP.getModel();
        String[] sp = new String[dsSP.size()];
        for (int i = 0; i < dsSP.size(); i++) {
            sp[i] = dsSP.get(i).getMaLSP();
        }
        cbbLocSP.setModel(new DefaultComboBoxModel(sp));
        List<QLSanPham> dsSP1 = sanPhamService.ALL();
        this.cbbLocSPL.getModel();
        String[] sp1 = new String[dsSP1.size()];
        for (int i = 0; i < dsSP1.size(); i++) {
            sp1[i] = dsSP1.get(i).getMaSP();
        }
        cbbLocSPL.setModel(new DefaultComboBoxModel(sp1));

        this.loadTableSP();
        this.loadTableSPL();
        this.clearForm();
    }

    public void loadTableSPL() {
        DefaultTableModel dtm = (DefaultTableModel) this.tblSPL.getModel();
        dtm.setRowCount(0);
        for (ManageSanPhamLoi sp : this.sanPhamLoiService.ALL()) {
            Object[] rowData = {
                sp.getMaSPL(),
                sp.getMaSP(),
                sp.getTenSP(),
                sp.getLyDoLoi()
            };
            dtm.addRow(rowData);
        }
    }

    public void loadTableSP() {
        DefaultTableModel dtm = (DefaultTableModel) this.tblSP.getModel();
        dtm.setRowCount(0);
        for (QLSanPham sp : this.sanPhamService.ALL()) {
            Object[] rowData = {
                sp.getMaSP(),
                sp.getTenSP(),
                sp.getSoLuong()
            };
            dtm.addRow(rowData);
        }
    }

    public void clearForm() {
//        List<ManageSanPhamLoi> list = this.sanPhamLoiService.ALL();
//        String[] splits = list.split("-", 3);
//        this.lblMaSPL.setText(list.get((list.size() - 1)).getMaSPL() + 1);
        this.txtMaSPL.setText("");
        this.lblMaSP.setText("-");
        this.lblTen.setText("-");
        this.txtLyDoLoi.setText("");

    }

    private ManageSanPhamLoi getFormData() {
        String maSPL = this.txtMaSPL.getText().trim();
        String maSP = this.lblMaSP.getText().trim();
        String tenSP = this.lblTen.getText().trim();
        String loi = this.txtLyDoLoi.getText().trim();

        ManageSanPhamLoi s = new ManageSanPhamLoi(maSPL, maSP, tenSP, loi);
        return s;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel22 = new javax.swing.JPanel();
        jScrollPane16 = new javax.swing.JScrollPane();
        tblSP = new javax.swing.JTable();
        jPanel23 = new javax.swing.JPanel();
        txtLyDoLoi = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        btnXoa = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        jScrollPane17 = new javax.swing.JScrollPane();
        tblSPL = new javax.swing.JTable();
        btnTimKiemSPL = new javax.swing.JButton();
        jLabel76 = new javax.swing.JLabel();
        lblMaSP = new javax.swing.JLabel();
        cbbLocSPL = new javax.swing.JComboBox<>();
        txtMaSPL = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblTen = new javax.swing.JLabel();
        btnLoc = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        btnTimKiemSP = new javax.swing.JButton();
        txtMaSP = new javax.swing.JTextField();
        cbbLocSP = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        tblSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SP", "Tên SP", "Số lượng"
            }
        ));
        tblSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSPMouseClicked(evt);
            }
        });
        jScrollPane16.setViewportView(tblSP);

        jPanel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel73.setText("Lý do lỗi");

        jLabel74.setText("Mã SP");

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnCapNhat.setText("Cập nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        tblSPL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SPL", "Mã SP", "Tên SP", "Lý do lỗi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSPL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSPLMouseClicked(evt);
            }
        });
        jScrollPane17.setViewportView(tblSPL);

        btnTimKiemSPL.setText("Tìm kiếm");
        btnTimKiemSPL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemSPLActionPerformed(evt);
            }
        });

        jLabel76.setText("Mã SPL");

        lblMaSP.setText("--");

        cbbLocSPL.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("Tên SP");

        lblTen.setText("-");

        btnLoc.setText("Lọc");
        btnLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel76)
                            .addComponent(jLabel74))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel73)
                                .addGap(29, 29, 29))
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addComponent(lblMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addComponent(txtMaSPL, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(37, 37, 37)))
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLyDoLoi, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTen, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(129, 129, 129))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(cbbLocSPL, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLoc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnThem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCapNhat)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoa)
                        .addGap(18, 18, 18)
                        .addComponent(btnTimKiemSPL, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
            .addComponent(jScrollPane17)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel76)
                            .addComponent(txtMaSPL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel74)
                            .addComponent(lblMaSP))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addContainerGap(21, Short.MAX_VALUE)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lblTen))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel73)
                            .addComponent(txtLyDoLoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)))
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoa)
                    .addComponent(btnCapNhat)
                    .addComponent(btnThem)
                    .addComponent(btnTimKiemSPL)
                    .addComponent(cbbLocSPL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLoc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setText("Quản lý sản phẩm lỗi");

        jLabel26.setText("Mã SP");

        btnTimKiemSP.setText("Tìm kiếm");
        btnTimKiemSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemSPActionPerformed(evt);
            }
        });

        cbbLocSP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbLocSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbLocSPActionPerformed(evt);
            }
        });

        jButton1.setText("Lọc");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addGap(336, 336, 336))
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel26)
                .addGap(28, 28, 28)
                .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnTimKiemSP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(cbbLocSP, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jButton1)
                .addGap(61, 61, 61))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane16)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbLocSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(btnTimKiemSP)
                    .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSPMouseClicked
        int row = this.tblSP.getSelectedRow();
        if (row == -1) {
            return;
        }
        String ma = this.tblSP.getValueAt(row, 0).toString();
        String ten = this.tblSP.getValueAt(row, 1).toString();

        this.lblMaSP.setText(ma);
        this.lblTen.setText(ten);
    }//GEN-LAST:event_tblSPMouseClicked

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int row = this.tblSPL.getSelectedRow();
        if (row == -1) {
            return;
        }
        int cofirm = JOptionPane.showConfirmDialog(this, "bạn muốn xóa không");
        if (cofirm != JOptionPane.YES_OPTION) {
            return;
        }
        String id = this.tblSPL.getValueAt(row, 0).toString();
        this.sanPhamLoiService.delete(id);
        this.loadTableSPL();
        this.clearForm();
        JOptionPane.showMessageDialog(this, "Xóa thành công");
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        ManageSanPhamLoi sp = this.getFormData();
        if (sp == null) {
            return;
        }
        String id = this.txtMaSPL.getText();
        this.sanPhamLoiService.update(id, sp);
        this.loadTableSPL();
        this.clearForm();
        JOptionPane.showMessageDialog(this, "Cập nhật thành công");
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        ManageSanPhamLoi sp = this.getFormData();
        if (sp == null) {
            return;
        }
        this.sanPhamLoiService.insert(sp);
        this.sanPhamService.updateSL(sp.getMaSP());
        this.loadTableSPL();
        this.loadTableSP();
        this.clearForm();
        JOptionPane.showMessageDialog(this, "thêm thành công");
    }//GEN-LAST:event_btnThemActionPerformed

    private void tblSPLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSPLMouseClicked
        int row = this.tblSPL.getSelectedRow();
        if (row == -1) {
            return;
        }
        String maSPL = this.tblSPL.getValueAt(row, 0).toString();
        String maSP = this.tblSPL.getValueAt(row, 1).toString();
        String ten = this.tblSPL.getValueAt(row, 2).toString();
        String lyDoLoi = this.tblSPL.getValueAt(row, 3).toString();

        this.txtMaSPL.setText(maSPL);
        this.lblMaSP.setText(maSP);
        this.lblTen.setText(ten);
        this.txtLyDoLoi.setText(lyDoLoi);
    }//GEN-LAST:event_tblSPLMouseClicked

    private void btnTimKiemSPLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemSPLActionPerformed
        String maSPL = this.txtMaSPL.getText();
        List<ManageSanPhamLoi> ds = this.sanPhamLoiService.ALL();
        int check = 0;
        if (maSPL.trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Không được để trống mã sản phẩm lỗi");
            return;
        } else {
            for (ManageSanPhamLoi sp : ds) {
                if (sp.getMaSPL().equalsIgnoreCase(txtMaSPL.getText())) {
                    check++;
                    this.txtMaSPL.setText(sp.getMaSPL());
                    this.lblMaSP.setText(sp.getMaSP());
                    this.txtLyDoLoi.setText(sp.getLyDoLoi());
                    JOptionPane.showMessageDialog(this, "Tìm thấy sản phẩm lỗi");
                    this.tblSPL.getSelectedRow();
                    return;
                }
            }
        }
        if (check == 0) {
            this.clearForm();
            JOptionPane.showMessageDialog(this, "Không tìm thấy sản phẩm lỗi");

        }
    }//GEN-LAST:event_btnTimKiemSPLActionPerformed

    private void btnLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocActionPerformed
        String ma = (String) this.cbbLocSPL.getSelectedItem();
        List<ManageSanPhamLoi> ds = this.sanPhamLoiService.ALL();
        int check = 0;
        DefaultTableModel dtm = (DefaultTableModel) this.tblSPL.getModel();
        dtm.setRowCount(0);
        for (ManageSanPhamLoi sp : ds) {
            if (sp.getMaSP().equalsIgnoreCase(ma)) {
                check++;
                Object[] rowData = {
                    sp.getMaSPL(),
                    sp.getMaSP(),
                    sp.getTenSP(),
                    sp.getLyDoLoi()
                };
                dtm.addRow(rowData);
            }
        }
        if (check == 0) {
            JOptionPane.showMessageDialog(this, "Không tìm thấy sản phẩm");
            return;
        } else {
            JOptionPane.showMessageDialog(this, "tìm thấy sản phẩm");
            return;
        }
    }//GEN-LAST:event_btnLocActionPerformed

    private void btnTimKiemSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemSPActionPerformed
        String maSP = this.txtMaSP.getText();
        List<QLSanPham> ds = this.sanPhamService.ALL();
        int check = 0;
        int i = 0;
        if (maSP.trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Không được để trống mã sản phẩm");
            return;
        } else {
            for (QLSanPham sp : ds) {
                if (sp.getMaSP().equalsIgnoreCase(txtMaSP.getText())) {
                    check++;
                    this.lblMaSP.setText(sp.getMaSP());
                    this.lblTen.setText(sp.getTenSP());
                    for (i = 0; i < this.sanPhamService.ALL().size() - 1; i++) {
                        if (tblSP.getValueAt(i, 0).equals(txtMaSP.getText())) {
                            this.tblSP.setRowSelectionInterval(i, i);
                        }
                    }
                    JOptionPane.showMessageDialog(this, "Tìm thấy sản phẩm");
                    return;
                }
            }
        }

        if (check == 0) {
            this.clearForm();
            JOptionPane.showMessageDialog(this, "Không tìm thấy sản phẩm");

        }
    }//GEN-LAST:event_btnTimKiemSPActionPerformed

    private void cbbLocSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbLocSPActionPerformed

    }//GEN-LAST:event_cbbLocSPActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String ma = (String) this.cbbLocSP.getSelectedItem();
        List<QLSanPham> ds = this.sanPhamService.ALL();
        int check = 0;
        DefaultTableModel dtm = (DefaultTableModel) this.tblSP.getModel();
        dtm.setRowCount(0);
        for (QLSanPham sp : ds) {
            if (sp.getMaLSP().equalsIgnoreCase(ma)) {
                check++;
                Object[] rowData = {
                    sp.getMaSP(),
                    sp.getTenSP(),
                    sp.getSoLuong()
                };
                dtm.addRow(rowData);
            }
        }
        if (check == 0) {
            JOptionPane.showMessageDialog(this, "Không tìm thấy sản phẩm");
            return;
        } else {
            JOptionPane.showMessageDialog(this, "tìm thấy sản phẩm");
            return;
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnLoc;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiemSP;
    private javax.swing.JButton btnTimKiemSPL;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbbLocSP;
    private javax.swing.JComboBox<String> cbbLocSPL;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JLabel lblMaSP;
    private javax.swing.JLabel lblTen;
    private javax.swing.JTable tblSP;
    private javax.swing.JTable tblSPL;
    private javax.swing.JTextField txtLyDoLoi;
    private javax.swing.JTextField txtMaSP;
    private javax.swing.JTextField txtMaSPL;
    // End of variables declaration//GEN-END:variables
}
