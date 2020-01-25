/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examination;

import java.sql.SQLException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author User
 */
public class Student extends javax.swing.JFrame {

    /**
     * Creates new form Student
     */
    public Student() throws ClassNotFoundException, SQLException {
        this.db = new DbConnection();
        initComponents();
        retrieve();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtStudentName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        txtUserName = new javax.swing.JTextField();
        txtBatch = new javax.swing.JTextField();
        txtConfirmPassword = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudentData = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Student Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 60, -1, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Student Registration");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 0, 168, 54));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Batch");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 119, -1, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Password");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 237, -1, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("UserName");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 178, -1, 40));

        txtStudentName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtStudentName, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 61, 229, 40));
        txtStudentName.getAccessibleContext().setAccessibleName("");

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 238, 229, 40));

        txtUserName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 179, 229, 40));

        txtBatch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtBatch, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 120, 229, 40));

        txtConfirmPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 297, 229, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Confirm Password");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 296, -1, 40));

        btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 530, 124, -1));

        jScrollPane1.setAutoscrolls(true);

        tblStudentData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "S.N", "Student Name", "Batch", "Username", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblStudentData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStudentDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblStudentData);
        if (tblStudentData.getColumnModel().getColumnCount() > 0) {
            tblStudentData.getColumnModel().getColumn(1).setPreferredWidth(5);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 404, 530, 120));

        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 530, 124, -1));

        btnSave.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 355, 124, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

//    ArrayList list = new ArrayList();
//    ArrayList studentname = new ArrayList();
//    ArrayList batch = new ArrayList();
//    ArrayList username = new ArrayList();
//    ArrayList password = new ArrayList();
    
    DbConnection db;
    
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int row = tblStudentData.getSelectedRow();
        if(row < 0)
        {
            JOptionPane.showMessageDialog(null,"Please Select row to edit that row.");
        }
        else{
            String query = "Update Students SET Student_Name = '"+txtStudentName.getText()+"', Batch = '"+txtBatch.getText()+"',"
                + "Username = '"+txtUserName.getText()+"', Password = '"+txtPassword.getText()+"' where Student_Id = "+StudentId+"";
            if(txtPassword.getText().equals(txtConfirmPassword.getText()))
            {
                try {
                db.manipulate(query);
                JOptionPane.showMessageDialog(null,"Data Updated.");
                retrieve();
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Password Doesn't Matched.");
            }
        }
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
         int row = tblStudentData.getSelectedRow();
        if(row < 0)
        {
            JOptionPane.showMessageDialog(null,"Please Select Student to delete that Student.");
        }
        else{
            int response = JOptionPane.showConfirmDialog(this, "Are you sure You want to Delete this Student Detail","Confirm",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(response == JOptionPane.YES_OPTION)
            {
                String query = "Delete Students where Student_Id = "+StudentId+"";
                try {
                    db.manipulate(query);
                    JOptionPane.showMessageDialog(null,"Deleted Successfully");
                    retrieve();
             
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
            String query = "insert into Students values ('"+txtStudentName.getText()+"', '"+txtBatch.getText()+"',"
                + " '"+txtUserName.getText()+"', '"+txtPassword.getText()+"' )";
            if(txtPassword.getText().equals(txtConfirmPassword.getText()))
            {
                try {
                db.manipulate(query);
                JOptionPane.showMessageDialog(null,"Student Registered.");
                retrieve();
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Password Doesn't Matched.");
            }
            
        
    }//GEN-LAST:event_btnSaveActionPerformed

    int StudentId;
    private void tblStudentDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStudentDataMouseClicked
        // TODO add your handling code here:
        int row = tblStudentData.getSelectedRow();
        TableModel model = tblStudentData.getModel();
        StudentId = Integer.parseInt(model.getValueAt(row, 0).toString());
        txtStudentName.setText(model.getValueAt(row,2).toString());
        txtBatch.setText(model.getValueAt(row,3).toString());
        txtUserName.setText(model.getValueAt(row,4).toString());
        txtPassword.setText(model.getValueAt(row,5).toString());
        txtConfirmPassword.setText(model.getValueAt(row,5).toString());
    }//GEN-LAST:event_tblStudentDataMouseClicked

    public void retrieve() throws ClassNotFoundException, SQLException
    {
        clear();
        DefaultTableModel model = (DefaultTableModel)tblStudentData.getModel();   
        String query = "Select * from Students"; 
	ResultSet rs = db.stm.executeQuery(query);
        int counter =1;
	while (rs.next()) { 
            Object row[] = {rs.getString("Student_Id"),counter, rs.getString("Student_Name"), rs.getString("Batch"), rs.getString("Username"), rs.getString("Password")};
            model.addRow(row);
            counter++;
        }
    }
    
    public void clear(){
        
        DefaultTableModel model = (DefaultTableModel)tblStudentData.getModel();
        for(int i=0;i < model.getRowCount(); i = i + 1/2)
        {
            model.removeRow(i);
        }
        txtBatch.setText("");
        txtStudentName.setText("");
        txtConfirmPassword.setText("");
        txtUserName.setText("");
        txtPassword.setText("");
    }
    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Student().setVisible(true);
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblStudentData;
    private javax.swing.JTextField txtBatch;
    private javax.swing.JTextField txtConfirmPassword;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtStudentName;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
