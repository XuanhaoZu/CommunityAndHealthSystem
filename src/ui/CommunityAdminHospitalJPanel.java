/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Cursor;
import java.awt.Window;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Community;
import model.CommunityAdmin;
import model.Doctor;
import model.Hospital;
import model.Person;

/**
 *
 * @author evelynzu
 */
public class CommunityAdminHospitalJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CommnityAdminHospital
     */
    Hospital hospital;
    Community community;
    DefaultTableModel model;
TableRowSorter myTableRowSorter;
    private int selectedDoctor;
    CommunityAdmin communityAdmin;
    public CommunityAdminHospitalJPanel(CommunityAdmin communityAdmin, Hospital hospital) {
        this.hospital = hospital;
        this.community = communityAdmin.getCommunity();
        this.communityAdmin = communityAdmin;
        initComponents();
                lbLogout.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        
        tfHospitalName.setText(hospital.getName());
        
        model = (DefaultTableModel) tblDoctor.getModel();
        
        populateTable();
        
        myTableRowSorter = new TableRowSorter(model);
 tblDoctor.setRowSorter(myTableRowSorter);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDoctor = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        tfHospitalName = new javax.swing.JTextField();
        btnHospitalSave = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tfDoctorName = new javax.swing.JTextField();
        btnEdit = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnDeleteHospital = new javax.swing.JButton();
        tfSearch = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        lbLogout = new javax.swing.JLabel();

        setBackground(new java.awt.Color(189, 212, 231));
        setMinimumSize(new java.awt.Dimension(1063, 615));
        setPreferredSize(new java.awt.Dimension(1063, 615));

        tblDoctor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Doctor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDoctor);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel1.setText("Hospital name:");

        tfHospitalName.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        tfHospitalName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfHospitalNameActionPerformed(evt);
            }
        });

        btnHospitalSave.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnHospitalSave.setText("Save");
        btnHospitalSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHospitalSaveActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnBack.setText("back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel2.setText("Doctor:");

        tfDoctorName.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N

        btnEdit.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnView.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDeleteHospital.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnDeleteHospital.setText("Delete the Hospital");
        btnDeleteHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteHospitalActionPerformed(evt);
            }
        });

        tfSearch.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 0, 20)); // NOI18N
        jLabel10.setText("Hospital");

        lbLogout.setText("Logout");
        lbLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbLogoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnDelete)
                                        .addGap(132, 132, 132)
                                        .addComponent(btnEdit)
                                        .addGap(37, 37, 37))
                                    .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnHospitalSave))
                                    .addComponent(btnView)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(btnAdd)))
                        .addContainerGap(122, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDeleteHospital)
                        .addGap(95, 95, 95))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbLogout)
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lbLogout)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(btnDeleteHospital))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHospitalSave)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addComponent(btnView))
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDelete)
                            .addComponent(btnEdit)
                            .addComponent(btnAdd)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(40, 40, 40))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tfHospitalNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfHospitalNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfHospitalNameActionPerformed

    private void btnHospitalSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHospitalSaveActionPerformed
        hospital.setName(tfHospitalName.getText());
        JOptionPane.showMessageDialog(this, "hospital edited");
    }//GEN-LAST:event_btnHospitalSaveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        CommunityAdminJFrame communityAdminJFrame = new CommunityAdminJFrame(communityAdmin);
        communityAdminJFrame.setVisible(true);
        JComponent comp = (JComponent) evt.getSource();
            Window win = SwingUtilities.getWindowAncestor(comp);
            win.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        int selectedRowIndex = tblDoctor.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to view");
            return;
        }
        
        Doctor selectedDoctor = (Doctor)model.getValueAt(tblDoctor.convertRowIndexToModel(selectedRowIndex), 0);
        tfDoctorName.setText(selectedDoctor.getPerson().getName());
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        int selectedRowIndex = tblDoctor.getSelectedRow();
        Doctor doctor = (Doctor)model.getValueAt(tblDoctor.convertRowIndexToModel(selectedRowIndex), 0);
        doctor.getPerson().setName(tfDoctorName.getText());
        populateTable();
                JOptionPane.showMessageDialog(this, "Doctor edited");
        

        
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        hospital.getDoctorDirectory().getDoctorDirectory().remove(selectedDoctor);
        JOptionPane.showMessageDialog(this, "Person deleted");
        
        populateTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        Doctor doctor = new Doctor(new Person(tfDoctorName.getText()));
        hospital.getDoctorDirectory().getDoctorDirectory().add(doctor);
        populateTable();
        JOptionPane.showMessageDialog(this, "Doctor added");

        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteHospitalActionPerformed
        community.getHospitalDirectory().getHospitalDirectory().remove(hospital);
        JOptionPane.showMessageDialog(this, "Hospital deleted");
        CommunityAdminJFrame communityAdminJFrame = new CommunityAdminJFrame(communityAdmin);
        communityAdminJFrame.setVisible(true);
        
    }//GEN-LAST:event_btnDeleteHospitalActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String text = tfSearch.getText();
        if (text.trim().length() == 0) {
     myTableRowSorter.setRowFilter(null);
  } else {
     myTableRowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
  }
        tblDoctor.getRowSorter();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void lbLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLogoutMouseClicked
        LoginJframe loginJframe = new LoginJframe();
        loginJframe.setVisible(true);
        JComponent comp = (JComponent) evt.getSource();
            Window win = SwingUtilities.getWindowAncestor(comp);
            win.dispose();

    }//GEN-LAST:event_lbLogoutMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDeleteHospital;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHospitalSave;
    private javax.swing.JButton btnView;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbLogout;
    private javax.swing.JTable tblDoctor;
    private javax.swing.JTextField tfDoctorName;
    private javax.swing.JTextField tfHospitalName;
    private javax.swing.JTextField tfSearch;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        model = (DefaultTableModel) tblDoctor.getModel();
        model.setRowCount(0);
        
        for (Doctor doctor : hospital.getDoctorDirectory().getDoctorDirectory()) {
            Object[] row = new Object[1];
            row[0] = doctor;
            
            model.addRow(row);
        
    }
    }
}
