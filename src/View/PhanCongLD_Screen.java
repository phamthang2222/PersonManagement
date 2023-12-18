/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;


import Data.NhanVien;
import Data.PhanCongLD_Table;
import Data.PhanCongLD;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
/**
 *
 * @author Admin
 */
public class PhanCongLD_Screen extends javax.swing.JFrame {

    ArrayList<PhanCongLD> dspc = new ArrayList<>();
    
    int dongchon = -1;

    PhanCongLD pcld = new PhanCongLD();
    
    public void fakedata(){
        PhanCongLD a = new PhanCongLD("17/5/2023", "Tòa A1", "Tầng 3", "Đội vệ sinh 1");
        PhanCongLD a2 = new PhanCongLD("17/5/2023", "Tòa A7", "Tầng 5", "Đội vệ sinh 1");
        PhanCongLD a3 = new PhanCongLD("18/5/2023", "Tòa A8", "Tầng 4", "Đội vệ sinh 2");
        PhanCongLD a4 = new PhanCongLD("18/5/2023", "Tòa A9", "Tầng 2", "Đội vệ sinh 2");
        PhanCongLD a5 = new PhanCongLD("19/5/2023", "Tòa A1", "Tầng 6", "Đội vệ sinh 3");
        dspc.add(a);dspc.add(a2);dspc.add(a3);dspc.add(a5);dspc.add(a4);
    }
    
    public void LoadTable() {
        Table_PCLD.setModel(new PhanCongLD_Table(dspc));
    }
    
    public PhanCongLD_Screen(){
        initComponents();
        fakedata();
        LoadTable();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_ngayLD = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cb_chontoanha = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cb_chonTang = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cb_doiVS = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_PCLD = new javax.swing.JTable();
        bt_QLDVS = new javax.swing.JButton();
        bt_add = new javax.swing.JButton();
        but_edit = new javax.swing.JButton();
        bt_back = new javax.swing.JButton();
        but_delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("PHÂN CÔNG LAO ĐỘNG");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Chọn tòa nhà: ");

        txt_ngayLD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        setTitle("PHÂN CÔNG LAO ĐỘNG");
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Thời gian:");

        cb_chontoanha.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tòa A1", "Tòa A7", "Tòa A8", "Tòa A9" }));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Chọn Tầng: ");

        cb_chonTang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tầng 1", "Tầng 2", "Tầng 3", "Tầng 4", "Tầng 5", "Tầng 6" }));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Phân Công:");

        cb_doiVS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đội vệ sinh 1", "Đội vệ sinh 2", "Đội vệ sinh 3", "Đội vệ sinh 4", " ", " " }));

        Table_PCLD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Table_PCLD.setModel(new javax.swing.table.DefaultTableModel(
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
        Table_PCLD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_PCLDMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table_PCLD);

        bt_QLDVS.setText("QL Đội Vệ Sinh");
        bt_QLDVS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_QLDVSActionPerformed(evt);
            }
        });

        bt_add.setText("Thêm");
        bt_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_addActionPerformed(evt);
            }
        });

        but_edit.setText("Sửa");
        but_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_editActionPerformed(evt);
            }
        });

        bt_back.setText("Quay lại");
        bt_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_backActionPerformed(evt);
            }
        });

        but_delete.setText("Xóa");
        but_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_ngayLD)
                                        .addComponent(cb_chontoanha, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cb_chonTang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cb_doiVS, 0, 171, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(but_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(55, 55, 55)
                                        .addComponent(but_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(15, 15, 15)
                        .addComponent(bt_QLDVS, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bt_add, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)))
                        .addGap(312, 312, 312)
                        .addComponent(bt_back, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(89, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(76, 76, 76)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(501, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txt_ngayLD, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_chontoanha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_chonTang, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_doiVS, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_QLDVS, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(but_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_add, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_back, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(but_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(69, 69, 69)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(484, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void but_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_editActionPerformed
        dongchon = Table_PCLD.getSelectedRow();
        if (dongchon != -1) {
            PhanCongLD nv_moi = new PhanCongLD(txt_ngayLD.getText(),cb_chontoanha.getSelectedItem().toString(), cb_chonTang.getSelectedItem().toString(), cb_doiVS.getSelectedItem().toString());
            dspc.set(dongchon, nv_moi);
            LoadTable();
        } else {
            JOptionPane.showConfirmDialog(this, "Bạn chưa chọn dòng nào", "Thông báo", WIDTH);
        }
    }//GEN-LAST:event_but_editActionPerformed

    private void bt_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_backActionPerformed
        Main_Screen a = new Main_Screen();
    	a.setVisible(true);
        a.setLocationRelativeTo(null);
    	dispose();
    }//GEN-LAST:event_bt_backActionPerformed

    private void but_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_deleteActionPerformed
        dongchon = Table_PCLD.getSelectedRow();
        if (dongchon != -1) {
            PhanCongLD nv_moi = new PhanCongLD(txt_ngayLD.getText(),cb_chontoanha.getSelectedItem().toString(), cb_chonTang.getSelectedItem().toString(), cb_doiVS.getSelectedItem().toString());
            dspc.set(dongchon, nv_moi);
            dspc.remove(dongchon);
            LoadTable();
        } else {
            JOptionPane.showConfirmDialog(this, "Bạn chưa chọn dòng nào", "Thông báo", WIDTH);
        }
    }//GEN-LAST:event_but_deleteActionPerformed

    private void bt_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addActionPerformed
         if (txt_ngayLD.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đủ thông tin!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        
    } else {
        
        pcld = new PhanCongLD(txt_ngayLD.getText(),cb_chontoanha.getSelectedItem().toString(), cb_chonTang.getSelectedItem().toString(), cb_doiVS.getSelectedItem().toString());
        dspc.add(pcld);
        LoadTable();
         }
    }//GEN-LAST:event_bt_addActionPerformed

    private void bt_QLDVSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_QLDVSActionPerformed
        QLDoiVS a = new QLDoiVS();
    	a.setVisible(true);
        a.setLocationRelativeTo(null);
    	dispose();
    }//GEN-LAST:event_bt_QLDVSActionPerformed

    private void Table_PCLDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_PCLDMouseClicked
        dongchon = Table_PCLD.getSelectedRow();
        if(dongchon != -1 ){
            pcld = dspc.get(dongchon);
            txt_ngayLD.setText(pcld.getNgay());
            cb_chontoanha.setSelectedItem(pcld.getToa());
            cb_chonTang.setSelectedItem(pcld.getTang());
            cb_doiVS.setSelectedItem(pcld.getDoiVS());
        }
    }//GEN-LAST:event_Table_PCLDMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PhanCongLD_Screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table_PCLD;
    private javax.swing.JButton bt_QLDVS;
    private javax.swing.JButton bt_add;
    private javax.swing.JButton bt_back;
    private javax.swing.JButton but_delete;
    private javax.swing.JButton but_edit;
    private javax.swing.JComboBox<String> cb_chonTang;
    private javax.swing.JComboBox<String> cb_chontoanha;
    private javax.swing.JComboBox<String> cb_doiVS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_ngayLD;
    // End of variables declaration//GEN-END:variables
}
