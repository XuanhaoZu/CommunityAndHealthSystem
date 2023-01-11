/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

//import java.awt.FlowLayout;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.Window;
import java.awt.font.TextAttribute;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Map;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import model.AllSystem;
import model.CommunityAdmin;
import model.Doctor;
import model.EncounterDirectory;
import model.Patient;
import model.Person;


/**
 *
 * @author evelynzu
 */
public class RegisterJPanel extends javax.swing.JPanel {

    

    /**
     * Creates new form Register
     */
    public RegisterJPanel() {
        initComponents();
        labelHaveAccount.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        dcDOB.setDate(new Date());
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
        tfAccount = new javax.swing.JTextField();
        tfPassword = new javax.swing.JPasswordField();
        cbType = new javax.swing.JComboBox<>();
        btnRegister = new javax.swing.JButton();
        labelHaveAccount = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfPersonName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        dcDOB = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(189, 212, 231));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel1.setText("Register");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        jLabel2.setText("Account:");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        jLabel3.setText("Password:");

        tfAccount.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        tfAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAccountActionPerformed(evt);
            }
        });

        tfPassword.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N

        cbType.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        cbType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "doctor", "patient", "communityAdmin", "systemAdmin" }));

        btnRegister.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        labelHaveAccount.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        labelHaveAccount.setText("Already have account? Login");
        labelHaveAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelHaveAccountMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        jLabel4.setText("Name:");

        tfPersonName.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        jLabel5.setText("DOB:");

        dcDOB.setMinimumSize(null);
        dcDOB.setPreferredSize(null);

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        jLabel6.setText("Identity type:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addComponent(btnRegister))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGap(60, 60, 60)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tfAccount)
                                            .addComponent(tfPassword)
                                            .addComponent(cbType, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(tfPersonName, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dcDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(90, 90, 90)
                                    .addComponent(labelHaveAccount)
                                    .addGap(19, 19, 19)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(433, 433, 433)
                        .addComponent(jLabel1)))
                .addContainerGap(326, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfPersonName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel5)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dcDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addComponent(btnRegister)
                .addGap(37, 37, 37)
                .addComponent(labelHaveAccount)
                .addContainerGap(170, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tfAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAccountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAccountActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        boolean flag = true;
        
        //account
        String accountText = tfAccount.getText();
        if ((accountText == null) || (accountText.equals(""))) {flag = false; JOptionPane.showMessageDialog(this, "Please enter account");}

        for(Person person : AllSystem.persons) {
            if(accountText.equals(person.getAccount())) {
                flag = false;
                JOptionPane.showMessageDialog(this, "account already existed");
                break;
            }
        }
        
        //psw
        String passwordText = tfPassword.getText();
        if ((passwordText == null) || (passwordText.equals(""))) {flag = false; JOptionPane.showMessageDialog(this, "Please enter password");}

        //type
        String type = String.valueOf(cbType.getSelectedItem());
        
        //name
        String name = tfPersonName.getText();
        if ((name == null) || (name.equals("")) || (!name.matches("^[a-zA-Z]*$"))) { flag = false; JOptionPane.showMessageDialog(this, "Please follow name format");}
        
        //dob
        String dob = null;
        SimpleDateFormat formatter;
        formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date currentDate = new Date(); 
        if (dcDOB.getDate() == null){ flag = false; JOptionPane.showMessageDialog(this, "Please choose a property date");}
        else if (dcDOB.getDate().after(currentDate)) { flag = false; JOptionPane.showMessageDialog(this, "Please choose a property date");}
        else { dob = formatter.format(dcDOB.getDate());}
        

        
        
        if (flag) {
            Person newPerson = new Person(accountText, passwordText, type,name,dob);
            AllSystem.persons.add(newPerson);
            if(type.equals("patient")){
                AllSystem.patients.add(new Patient(newPerson, new EncounterDirectory()));
            } else if(type.equals("doctor")){
                AllSystem.doctors.add(new Doctor(newPerson));
            } else if(type.equals("communityAdmin")){
                AllSystem.communityAdmins.add(new CommunityAdmin(newPerson,AllSystem.community1));
            } 
            
            JOptionPane.showMessageDialog(this, "register!");
            LoginJframe loginJframe1 = new LoginJframe();
            loginJframe1.setVisible(true);
            JComponent comp = (JComponent) evt.getSource();
            Window win = SwingUtilities.getWindowAncestor(comp);
            win.dispose();
            
//            LoginJpanel1 loginJpanel = new LoginJpanel1();

//            removeAll();
//            FlowLayout flowLayout = new FlowLayout();
//            setLayout(flowLayout);
            
//            add(loginJpanel);
//            loginJpanel.setVisible(true);
           
//            LoginJframe.jpanel1.setVisible(true);
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void labelHaveAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelHaveAccountMouseClicked
        LoginJframe loginJframe1 = new LoginJframe();
            loginJframe1.setVisible(true);
            JComponent comp = (JComponent) evt.getSource();
            Window win = SwingUtilities.getWindowAncestor(comp);
            win.dispose();
    }//GEN-LAST:event_labelHaveAccountMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JComboBox<String> cbType;
    private com.toedter.calendar.JDateChooser dcDOB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel labelHaveAccount;
    private javax.swing.JTextField tfAccount;
    private javax.swing.JPasswordField tfPassword;
    private javax.swing.JTextField tfPersonName;
    // End of variables declaration//GEN-END:variables
}
