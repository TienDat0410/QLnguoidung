/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLUser;
import com.mysql.cj.xdevapi.Result;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import class User.getTen;
/**
 *
 * @author TienDat
 */
public class frmTimKiemUser extends javax.swing.JFrame {
    private AccessUser accessUser;
    /**
     * Creates new form frmTimKiemUser
     */
    public frmTimKiemUser() {
        initComponents();
    }
    public frmTimKiemUser(AccessUser accessUser) {
        this.accessUser = accessUser;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKetQua = new javax.swing.JTable();
        btnTimKiemtheoten = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        rbRead = new javax.swing.JRadioButton();
        rbWrite = new javax.swing.JRadioButton();
        rbFull = new javax.swing.JRadioButton();
        btnTimKiemtheoten1 = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Tên User");

        tblKetQua.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tên User", "Mật khẩu", "Đường dẫn", "Quyền"
            }
        ));
        jScrollPane1.setViewportView(tblKetQua);

        btnTimKiemtheoten.setBackground(new java.awt.Color(102, 255, 255));
        btnTimKiemtheoten.setText("Tìm kiếm theo tên");
        btnTimKiemtheoten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemtheotenActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Quyền");

        rbRead.setText("Read");

        rbWrite.setText("Write");

        rbFull.setText("Full");

        btnTimKiemtheoten1.setBackground(new java.awt.Color(102, 255, 255));
        btnTimKiemtheoten1.setText("Tìm kiếm theo quyền");
        btnTimKiemtheoten1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemtheoten1ActionPerformed(evt);
            }
        });

        btnHuy.setBackground(new java.awt.Color(255, 102, 102));
        btnHuy.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnHuy.setText("Huỷ");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbWrite)
                        .addGap(33, 33, 33)
                        .addComponent(btnTimKiemtheoten1))
                    .addComponent(rbFull)
                    .addComponent(rbRead)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnHuy)
                            .addComponent(btnTimKiemtheoten))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiemtheoten)
                    .addComponent(jLabel1))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbRead)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbWrite)
                            .addComponent(btnTimKiemtheoten1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbFull)))
                .addGap(43, 43, 43)
                .addComponent(btnHuy)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        // Huỷ
        this.dispose();
    }//GEN-LAST:event_btnHuyActionPerformed

    private void btnTimKiemtheotenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemtheotenActionPerformed
        // tìm theo tên
//        String ten = txtTen.getText();
//        Vector rows = accessUser.timKiem(ten);
//        DefaultTableModel dm = (DefaultTableModel) this.tblKetQua.getModel();
//        for (int i = 0;i< rows.size();i++)
//        {
//            dm.addRow((Vector)rows.get(i));
//        }
//        this.validate();
        
        DBAccess acc = new DBAccess();   
        ResultSet rs = acc.Query("SELECT * FROM thongtinnguoisd"); 
        
        DefaultTableModel dm = (DefaultTableModel) this.tblKetQua.getModel(); 
//        ArrayList array = new ArrayList();
        try {
            while (rs.next()) {                                
//                User User = new User(rs.getString("Ten"),rs.getString("MatKhau"),rs.getString("Duongdan"), rs.getInt("Quyentruyxuat"));
//                array.add(User);
                
                Object[] row = {rs.getString("Ten"),rs.getString("MatKhau"),rs.getString("Duongdan"), rs.getInt("Quyentruyxuat")};
//                for(int i =0;i<array.size();i++)
//                {
//                    row[0] = array.get(i);
//                    row[1] = array.get(i);
//                    row[2] = array.get(i);
//                    row[3] = array.get(i);                                   
//                }
                dm.addRow(row);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "lỗi dữ liệu");
        }
       
        
        
    }//GEN-LAST:event_btnTimKiemtheotenActionPerformed
//tim kiém theo quyền
    
    private void btnTimKiemtheoten1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemtheoten1ActionPerformed
        // Tim kiếm theo quyền
        int quyen = 2;
        if(rbRead.isSelected()){
            quyen = 0;
        }
        else if(rbWrite.isSelected()){
            quyen  = 1;
        }
        Vector rows = accessUser.timKiem(quyen);
        DefaultTableModel dm =(DefaultTableModel) this.tblKetQua.getModel();
        for (int i = 0;i< rows.size();i++)
        {
            dm.addRow((Vector)rows.get(i));
        }
        this.validate();
    }//GEN-LAST:event_btnTimKiemtheoten1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmTimKiemUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmTimKiemUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmTimKiemUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTimKiemUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmTimKiemUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnTimKiemtheoten;
    private javax.swing.JButton btnTimKiemtheoten1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbFull;
    private javax.swing.JRadioButton rbRead;
    private javax.swing.JRadioButton rbWrite;
    private javax.swing.JTable tblKetQua;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
