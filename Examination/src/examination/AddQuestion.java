/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examination;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

/**
 *
 * @author User
 */
public class AddQuestion extends javax.swing.JFrame {

    DbConnection db;
    public int QuestionId;
    public String SubjectName;
    public String query;
    public AddQuestion() throws ClassNotFoundException, SQLException {
        this.db = new DbConnection();
        initComponents();
        addcombo();
        tableData();
        
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
        txtQuestion = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        lblQuestion = new javax.swing.JLabel();
        lblQuestion1 = new javax.swing.JLabel();
        txtAnswer = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblQuestion = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtOptionA = new javax.swing.JTextField();
        lblQuestion2 = new javax.swing.JLabel();
        txtOptionB = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtOptionC = new javax.swing.JTextField();
        lblQuestion3 = new javax.swing.JLabel();
        txtOptionD = new javax.swing.JTextField();
        txtSubjectName = new javax.swing.JTextField();
        lblQuestion4 = new javax.swing.JLabel();
        lblQuestion5 = new javax.swing.JLabel();
        cboSet = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Note: One of the Option should be same as Answer");

        txtQuestion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnSave.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblQuestion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblQuestion.setText("Add Question");

        lblQuestion1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblQuestion1.setText("Question :");

        txtAnswer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tblQuestion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Question_ID", "S.N", "Subject", "Set", "Questions", "Answer", "Option A", "Option B", "Option C", "Option D"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblQuestion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblQuestionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblQuestion);
        if (tblQuestion.getColumnModel().getColumnCount() > 0) {
            tblQuestion.getColumnModel().getColumn(0).setMinWidth(0);
            tblQuestion.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblQuestion.getColumnModel().getColumn(0).setMaxWidth(0);
            tblQuestion.getColumnModel().getColumn(1).setMaxWidth(40);
            tblQuestion.getColumnModel().getColumn(3).setMaxWidth(40);
        }

        btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Option B :");

        txtOptionA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblQuestion2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblQuestion2.setText("Option A :");

        txtOptionB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Option D :");

        txtOptionC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblQuestion3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblQuestion3.setText("Option C :");

        txtOptionD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtSubjectName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblQuestion4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblQuestion4.setText("Subject : ");

        lblQuestion5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblQuestion5.setText("Set:");

        cboSet.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboSet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSetActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Answer :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblQuestion)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblQuestion4)
                                    .addComponent(txtSubjectName, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblQuestion5)
                                    .addComponent(cboSet, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblQuestion1)
                                    .addComponent(txtQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtOptionA, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblQuestion2)
                                    .addComponent(txtOptionB, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblQuestion3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtOptionC, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtOptionD, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 940, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(440, 440, 440)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblQuestion4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(txtSubjectName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblQuestion5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(cboSet, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblQuestion1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(txtQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(txtAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(txtOptionA, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblQuestion2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(txtOptionB, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblQuestion3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(txtOptionC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(txtOptionD, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSave)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        
        SubjectName = txtSubjectName.getText();
        try {
            insertCategory();
            insertSets(); 
            insertQuestion();
        } catch (SQLException ex) {
            Logger.getLogger(AddQuestion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if(SubjectName.equals(txtSubjectName.getText()) && cboSet.getSelectedItem().equals('A'))
        {
            JOptionPane.showMessageDialog(null, "You cannot change the Set and Subject name.");
            txtSubjectName.setText(SubjectName);
            //cboSet.(set);
        }
        else{
                update();
        }
          
    }//GEN-LAST:event_btnUpdateActionPerformed

    
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            // TODO add your handling code here:
            query = "Delete Questions where Question_Id = '"+QuestionId+"'";
            db.manipulate(query);
            JOptionPane.showMessageDialog(null, "Question Deleted !!");
            tableData();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AddQuestion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    Boolean check; 
    public void insertCategory() throws SQLException{
        if(!checkCategory())
        {
            try {
                query = "insert into Categories values('"+SubjectName+"')";
                db.manipulate(query);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AddQuestion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void update(){
        try {
//            String question;
//            String Answers;
//            String OptionA;
//            String OptionB;
//            String OptionC;
//            String OptionD;
//            int QuestionId;
//            String selectedSubject;
//            int subjectid;
            // TODO add your handling code here
                query = "Update Questions Set Questions = '"+txtQuestion.getText()+"', Answers = '"+txtAnswer.getText()+"'"
                    + ",Option1 = '"+txtOptionA.getText()+"',Option2 = '"+txtOptionB.getText()+"',Option3 = '"+txtOptionC.getText()+"',"
                    + "Option4 = '"+txtOptionD.getText()+"' where Question_Id = "+QuestionId+"";
                db.manipulate(query);
                JOptionPane.showMessageDialog(null, "Question updated !!");
                tableData();
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(AddQuestion.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    public void insertSets() throws SQLException
    {
        if(!checkSet())
        {
            try {
                query = "insert into Sets values('"+cboSet.getSelectedItem()+"',("+subjectid+"))";
                db.manipulate(query);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AddQuestion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void insertQuestion(){
        if(!sameQuestion())
        {
            try {
                query = "insert into Questions(Questions,Answers,Option1,Option2,Option3,Option4,Set_ID)"
                        + "values('"+txtQuestion.getText()+"','"+txtAnswer.getText()+"','"+txtOptionA.getText()+"'"
                        + ",'"+txtOptionB.getText()+"','"+txtOptionC.getText()+"','"+txtOptionD.getText()+"',("+setid+"))";
                db.manipulate(query);
            JOptionPane.showMessageDialog(null,"Question Registered.");
            tableData();
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(AddQuestion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Question has already been added. Please write another Question.");
        }
    }
    
    public Boolean sameQuestion()
    {
        int counter=0;
        try {
            query = "Select q.Questions,s.Set_code from Questions as q,Sets as s "
                    + "where Questions = '"+txtQuestion.getText()+"'";
            ResultSet rs = db.stm.executeQuery(query);
            while(rs.next()){
                counter++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddQuestion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return counter > 0;
    }
    private void addcombo(){
        cboSet.removeAllItems();
        cboSet.addItem("A");
        cboSet.addItem("B");
        cboSet.addItem("C");
        cboSet.addItem("D");
    }
    private void cboSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboSetActionPerformed

    private void tblQuestionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblQuestionMouseClicked
        // TODO add your handling code here:
        int selectedrow = tblQuestion.getSelectedRow();
        TableModel model = tblQuestion.getModel();
        QuestionId = Integer.parseInt(model.getValueAt(selectedrow,0).toString());
        SubjectName = model.getValueAt(selectedrow,2).toString();
        txtSubjectName.setText(SubjectName);
        cboSet.setSelectedItem(model.getValueAt(selectedrow,3).toString());
        txtQuestion.setText(model.getValueAt(selectedrow,4).toString());
        txtAnswer.setText(model.getValueAt(selectedrow,5).toString());
        txtOptionA.setText(model.getValueAt(selectedrow,6).toString());
        txtOptionB.setText(model.getValueAt(selectedrow,7).toString());
        txtOptionC.setText(model.getValueAt(selectedrow,8).toString());
        txtOptionD.setText(model.getValueAt(selectedrow,9).toString());
    }//GEN-LAST:event_tblQuestionMouseClicked

    String subjectid;
    public Boolean checkCategory() throws SQLException{
        query = "Select Category_Id from Categories where Subject = '"+txtSubjectName.getText()+"'";
        ResultSet rs = db.stm.executeQuery(query);
        int counter = 0;
        while(rs.next()){
            counter++;
        }
        subjectid = query;
        return counter > 0;
    }
    String setid;
    public Boolean checkSet() throws SQLException
    {
        int counter = 0;
            query = "Select Set_Id from Sets where Set_code = '"+cboSet.getSelectedItem()+"' and Category_Id = ("+subjectid+")";
            ResultSet rs = db.stm.executeQuery(query);
            while(rs.next()){
                //setid = rs.getInt("Set_Id");
                counter++;
            }
            setid = query;
        return counter > 0 ;
    }
    private void tableData() throws SQLException{
        clear();
        DefaultTableModel model = (DefaultTableModel)tblQuestion.getModel();   
        query = "Select c.Subject,Set_code,q.Question_Id,q.Questions,q.Answers,q.Option1,q.Option2,q.Option3,q.Option4 "
                + "from Categories as c, Sets as s, Questions as q"
                + " where q.Set_ID = s.Set_Id and s.Category_Id = c.Category_Id"; 
	ResultSet rs = db.stm.executeQuery(query);
        int counter =1;
	while (rs.next()){ 
            Object row[] = {rs.getString("Question_Id"),counter, rs.getString("Subject"),
                rs.getString("Set_code"), rs.getString("Questions"), rs.getString("Answers"),
            rs.getString("Option1"), rs.getString("Option2"), rs.getString("Option3"),rs.getString("Option4")};
            model.addRow(row);
            counter++;
        }
    }
    public void clear(){
        DefaultTableModel model = (DefaultTableModel)tblQuestion.getModel();
        for(int i=0;i < model.getRowCount(); i = i + 1/2)
        {
            model.removeRow(i);
        }
        txtQuestion.setText("");
        txtAnswer.setText("");
        txtOptionA.setText("");
        txtOptionB.setText("");
        txtOptionC.setText("");
        txtOptionD.setText("");
        
    }
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
            java.util.logging.Logger.getLogger(AddQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new AddQuestion().setVisible(true);
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(AddQuestion.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cboSet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblQuestion;
    private javax.swing.JLabel lblQuestion1;
    private javax.swing.JLabel lblQuestion2;
    private javax.swing.JLabel lblQuestion3;
    private javax.swing.JLabel lblQuestion4;
    private javax.swing.JLabel lblQuestion5;
    private javax.swing.JTable tblQuestion;
    private javax.swing.JTextField txtAnswer;
    private javax.swing.JTextField txtOptionA;
    private javax.swing.JTextField txtOptionB;
    private javax.swing.JTextField txtOptionC;
    private javax.swing.JTextField txtOptionD;
    private javax.swing.JTextField txtQuestion;
    private javax.swing.JTextField txtSubjectName;
    // End of variables declaration//GEN-END:variables
    
    
}
