/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Data.NhanVien;
import Data.QLNhanVien_Table;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

public class QuanLyThongTinNhanVien_Screen extends javax.swing.JFrame {

    ArrayList<NhanVien> dsnv = new ArrayList<>();

    public void fakedata() {    
        NhanVien a = new NhanVien("Nguyễn Văn An", "1985", "Nam", "Giảng Viên", "0365542", "Hà Nội","30123193");
        NhanVien a1 = new NhanVien("Pham Văn Thống", "1988", "Nam", "Công nhân", "0365542", "Nam Định","30123193");
        NhanVien a2 = new NhanVien("NGuyễn Thị Cúc", "1990", "Nữ", "Công Nhân", "0365542", "Quảng Ninh","30123193");
        NhanVien a3 = new NhanVien("NGuyễn Văn Tê", "1992", "Nữ", "Công Nhân", "03655242", "Thái Bình","30123193");
        NhanVien a4 = new NhanVien("Phan Văn Ngọc", "1987", "Nam", "Công Nhân", "03655342", "Hà Nội","30123193");
        dsnv.add(a);
        dsnv.add(a1);
        dsnv.add(a2);
        dsnv.add(a3);
        dsnv.add(a4);
    }
    
    int dongchon = -1;

    NhanVien nv = new NhanVien();

    public void LoadTable() {
        Table_QLNV.setModel(new QLNhanVien_Table(dsnv));
    }

    public QuanLyThongTinNhanVien_Screen() {
        initComponents();
        fakedata();
        LoadTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_vitri = new javax.swing.JTextField();
        but_add = new javax.swing.JButton();
        but_edit = new javax.swing.JButton();
        but_delete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_hoten = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_gioitinh = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_quequan = new javax.swing.JTextField();
        but_back = new javax.swing.JButton();
        bt_sort = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txt_namsinh = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_cccd = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_sdt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_QLNV = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUẢN LÝ THÔNG TIN NHÂN VIÊN\n");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 887, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("QUẢN LÝ THÔNG TIN NHÂN VIÊN");

        txt_vitri.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        but_add.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        but_add.setText("Thêm");
        but_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_addActionPerformed(evt);
            }
        });

        but_edit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        but_edit.setText("Sửa");
        but_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_editActionPerformed(evt);
            }
        });

        but_delete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        but_delete.setText("Xóa");
        but_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_deleteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Vị trí:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Họ Tên:");

        txt_hoten.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Năm sinh:");

        txt_gioitinh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Quê quán:");

        txt_quequan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        but_back.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        but_back.setText("Quay Lại");
        but_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_backActionPerformed(evt);
            }
        });

        bt_sort.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_sort.setText("Sắp xếp");
        bt_sort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_sortActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Giới Tính:");

        txt_namsinh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Số CCCD:");

        txt_cccd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("SĐT:");

        Table_QLNV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Table_QLNV.setModel(new javax.swing.table.DefaultTableModel(
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
        Table_QLNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_QLNVMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table_QLNV);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(but_add)
                .addGap(38, 38, 38)
                .addComponent(but_edit)
                .addGap(43, 43, 43)
                .addComponent(but_delete)
                .addGap(33, 33, 33)
                .addComponent(bt_sort)
                .addGap(30, 30, 30)
                .addComponent(but_back)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_gioitinh, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(txt_hoten)
                            .addComponent(txt_namsinh, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(txt_sdt))
                        .addGap(202, 202, 202)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_cccd, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_vitri, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_quequan, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_cccd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_vitri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_namsinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_quequan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_hoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_gioitinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_sdt)))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(but_edit)
                    .addComponent(but_add)
                    .addComponent(but_delete)
                    .addComponent(but_back)
                    .addComponent(bt_sort))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void but_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_addActionPerformed
       
        if (txt_hoten.getText().isEmpty() || txt_namsinh.getText().isEmpty() || txt_gioitinh.getText().isEmpty() || txt_vitri.getText().isEmpty() || txt_sdt.getText().isEmpty() || txt_quequan.getText().isEmpty() || txt_cccd.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đủ thông tin!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        
    } else {
        nv = new NhanVien(txt_hoten.getText(), txt_namsinh.getText(),txt_gioitinh.getText(), txt_vitri.getText(), txt_sdt.getText(), txt_quequan.getText(), txt_cccd.getText());
             dsnv.add(nv);
             LoadTable();
        }
    }//GEN-LAST:event_but_addActionPerformed

    private void Table_QLNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_QLNVMouseClicked
        dongchon = Table_QLNV.getSelectedRow();
        if (dongchon != -1) {
            nv = dsnv.get(dongchon);
            txt_hoten.setText(nv.getHoTen() + "");
            txt_vitri.setText(nv.getViTri() + "");
            txt_gioitinh.setText(nv.getGioiTinh()+ "");
            txt_quequan.setText(nv.getQueQuan() + "");
            txt_cccd.setText(nv.getCccd());
            txt_sdt.setText(nv.getsDT());
            txt_namsinh.setText(nv.getNamSinh());

        }
    }//GEN-LAST:event_Table_QLNVMouseClicked

    private void but_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_editActionPerformed
        dongchon = Table_QLNV.getSelectedRow();
        if (dongchon != -1) {
            NhanVien nv_moi = new NhanVien(txt_hoten.getText(), txt_namsinh.getText(),txt_gioitinh.getText(), txt_vitri.getText(), txt_sdt.getText(), txt_quequan.getText(), txt_cccd.getText());
            dsnv.set(dongchon, nv_moi);
            LoadTable();
        } else {
            JOptionPane.showConfirmDialog(this, "Bạn chưa chọn dòng nào", "Thông báo", WIDTH);
        }
    }//GEN-LAST:event_but_editActionPerformed

    private void but_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_deleteActionPerformed
        dongchon = Table_QLNV.getSelectedRow();
        if (dongchon != -1) {
           NhanVien nv_moi = new NhanVien(txt_hoten.getText(), txt_namsinh.getText(),txt_gioitinh.getText(), txt_vitri.getText(), txt_sdt.getText(), txt_quequan.getText(), txt_cccd.getText());
            dsnv.set(dongchon, nv_moi);
            dsnv.remove(dongchon);
            LoadTable();
        } else {
            JOptionPane.showConfirmDialog(this, "Bạn chưa chọn dòng nào", "Thông báo", WIDTH);
        }
    }//GEN-LAST:event_but_deleteActionPerformed

    private void but_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_backActionPerformed
        Main_Screen main_ = new Main_Screen();
        main_.setVisible(true);
        main_.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_but_backActionPerformed

    private void bt_sortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_sortActionPerformed
        Comparator<NhanVien> c = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return o1.getHoTen().compareTo(o2.getHoTen());
            }
        };
        Collections.sort(dsnv,c);
        LoadTable();
    }//GEN-LAST:event_bt_sortActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyThongTinNhanVien_Screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table_QLNV;
    private javax.swing.JButton bt_sort;
    private javax.swing.JButton but_add;
    private javax.swing.JButton but_back;
    private javax.swing.JButton but_delete;
    private javax.swing.JButton but_edit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_cccd;
    private javax.swing.JTextField txt_gioitinh;
    private javax.swing.JTextField txt_hoten;
    private javax.swing.JTextField txt_namsinh;
    private javax.swing.JTextField txt_quequan;
    private javax.swing.JTextField txt_sdt;
    private javax.swing.JTextField txt_vitri;
    // End of variables declaration//GEN-END:variables
}
