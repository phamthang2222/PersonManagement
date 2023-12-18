/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Data.NhanVien;
import Data.QLLD_Table1;
import Data.QLLD_Table2;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;
import java.util.ArrayList;


public class QLDoiVS extends javax.swing.JFrame {

    ArrayList<NhanVien> dsnv = new ArrayList<>();
    ArrayList<NhanVien> dsnv2 = new ArrayList<>();
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
        Table_QLNV.setModel(new QLLD_Table1(dsnv));
    }
    public void LoadTable2() {
        table2.setModel(new QLLD_Table2(dsnv2));
    }
    public QLDoiVS() {
        initComponents();
        fakedata();
        LoadTable();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cb_doivs = new javax.swing.JComboBox<>();
        bt_add = new javax.swing.JButton();
        bt_edit = new javax.swing.JButton();
        bt_delete = new javax.swing.JButton();
        bt_back = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_QLNV = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        bt_sort = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        setTitle("QUẢN LÝ ĐỘI VỆ SINH");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("QUẢN LÝ ĐỘI VỆ SINH");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Phân Công:");

        cb_doivs.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cb_doivs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đội vệ sinh 1", "Đội vệ sinh 2", "Đội vệ sinh 3", "Đội vệ sinh 4" }));

        bt_add.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bt_add.setText("Thêm");
        bt_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_addActionPerformed(evt);
            }
        });

        bt_edit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bt_edit.setText("Sửa");
        bt_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_editActionPerformed(evt);
            }
        });

        bt_delete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bt_delete.setText("Xóa");
        bt_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_deleteActionPerformed(evt);
            }
        });

        bt_back.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bt_back.setText("Quay lại");
        bt_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_backActionPerformed(evt);
            }
        });

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
        jScrollPane1.setViewportView(Table_QLNV);

        table2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        table2.setModel(new javax.swing.table.DefaultTableModel(
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
        table2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table2);

        bt_sort.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bt_sort.setText("Sắp xếp");
        bt_sort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_sortActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cb_doivs, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(43, 43, 43)))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(bt_add)
                .addGap(44, 44, 44)
                .addComponent(bt_edit)
                .addGap(45, 45, 45)
                .addComponent(bt_delete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(bt_sort)
                .addGap(43, 43, 43)
                .addComponent(bt_back)
                .addGap(82, 82, 82))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_doivs, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_add)
                    .addComponent(bt_edit)
                    .addComponent(bt_delete)
                    .addComponent(bt_back)
                    .addComponent(bt_sort))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_backActionPerformed
        PhanCongLD_Screen a = new PhanCongLD_Screen();
    	a.setVisible(true);
        a.setLocationRelativeTo(null);
    	dispose();
    }//GEN-LAST:event_bt_backActionPerformed

    private void bt_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addActionPerformed
        dongchon = Table_QLNV.getSelectedRow();
        if (dongchon != -1) {
            nv = new NhanVien(Table_QLNV.getValueAt(dongchon, 0).toString(), Table_QLNV.getValueAt(dongchon, 1).toString(), Table_QLNV.getValueAt(dongchon, 2).toString(), Table_QLNV.getValueAt(dongchon, 3).toString(),Table_QLNV.getValueAt(dongchon, 4).toString(), cb_doivs.getSelectedItem().toString() );
            dsnv2.add(nv);
            LoadTable2();
        } else {
            JOptionPane.showConfirmDialog(this, "Bạn chưa chọn dòng nào", "Thông báo", WIDTH);
        }
    }//GEN-LAST:event_bt_addActionPerformed
    
    private void bt_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_editActionPerformed
        dongchon = table2.getSelectedRow();
        if (dongchon != -1) {
            NhanVien nv_moi1 = new NhanVien(Table_QLNV.getValueAt(dongchon, 0).toString(), Table_QLNV.getValueAt(dongchon, 1).toString(), Table_QLNV.getValueAt(dongchon, 2).toString(), Table_QLNV.getValueAt(dongchon, 3).toString(),Table_QLNV.getValueAt(dongchon, 4).toString(), cb_doivs.getSelectedItem().toString() );
            dsnv2.set(dongchon, nv_moi1);
            LoadTable2();
        } else {
            JOptionPane.showConfirmDialog(this, "Bạn chưa chọn dòng nào", "Thông báo", WIDTH);
        }
    }//GEN-LAST:event_bt_editActionPerformed

    private void bt_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_deleteActionPerformed
        dongchon = table2.getSelectedRow();
        if (dongchon != -1) {
            NhanVien nv_moi1 = new NhanVien(Table_QLNV.getValueAt(dongchon, 0).toString(), Table_QLNV.getValueAt(dongchon, 1).toString(), Table_QLNV.getValueAt(dongchon, 2).toString(), Table_QLNV.getValueAt(dongchon, 3).toString(),Table_QLNV.getValueAt(dongchon, 4).toString(), cb_doivs.getSelectedItem().toString() );
            dsnv2.set(dongchon, nv_moi1);
            dsnv2.remove(dongchon);
            LoadTable2();
        } else {
            JOptionPane.showConfirmDialog(this, "Bạn chưa chọn dòng nào", "Thông báo", WIDTH);
        }
    }//GEN-LAST:event_bt_deleteActionPerformed

    private void bt_sortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_sortActionPerformed
        Comparator<NhanVien> c = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return o1.getDoiVS().compareTo(o2.getDoiVS());
            }
        };
        Collections.sort(dsnv2,c);
        LoadTable2();
    }//GEN-LAST:event_bt_sortActionPerformed

    private void table2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table2MouseClicked
        dongchon = table2.getSelectedRow();
        if (dongchon != -1) {
            nv = dsnv2.get(dongchon);
            cb_doivs.setSelectedItem(nv.getDoiVS());
            
        }
    }//GEN-LAST:event_table2MouseClicked

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
            java.util.logging.Logger.getLogger(QLDoiVS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLDoiVS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLDoiVS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLDoiVS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                QLDoiVS window = new QLDoiVS();
                window.setLocationRelativeTo(null); // Đặt cửa sổ ở giữa màn hình
                window.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table_QLNV;
    private javax.swing.JButton bt_add;
    private javax.swing.JButton bt_back;
    private javax.swing.JButton bt_delete;
    private javax.swing.JButton bt_edit;
    private javax.swing.JButton bt_sort;
    private javax.swing.JComboBox<String> cb_doivs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table2;
    // End of variables declaration//GEN-END:variables
}
