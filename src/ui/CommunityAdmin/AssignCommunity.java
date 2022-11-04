/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui.CommunityAdmin;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Doctor.Doctor;
import model.Doctor.DoctorDirectory;
import model.Hospital.Hospital;
import model.Hospital.HospitalDirectory;
import model.Patient.Patient;
import model.Patient.PatientDirectory;
import model.Person.PersonDirectory;

/**
 *
 * @author Harshada
 */
public class AssignCommunity extends javax.swing.JFrame {

    /**
     * Creates new form AssignCommunity
     *
     */
    PatientDirectory patientList;
    DoctorDirectory doctorList;
    Patient patient;
    PersonDirectory personList;
    HospitalDirectory hospitalList;
    Hospital hospital;
    Doctor doctor;

    public AssignCommunity(DoctorDirectory doctorList1, PatientDirectory patientList1, PersonDirectory personList1, HospitalDirectory hospitalList1,Patient patient1 , Doctor doctor1) {
        initComponents();
        this.doctorList = doctorList1;
        this.patientList = patientList1;
        this.personList = personList1;
        this.hospitalList = hospitalList1;
        this.doctor = doctor1;
        this.patient = patient1;
        populateTable();
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
        btnDelete = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnView = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHospital = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        txtCommunity = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtHospitalPhoneNo = new javax.swing.JLabel();
        txtHospitalName = new javax.swing.JLabel();
        txtCity = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JLabel();
        txtState = new javax.swing.JLabel();
        txtCountry = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(793, 549));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Hospital Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 150, 29));

        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, 93, 33));

        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 86, 33));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Phone No");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 130, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Hospital City");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 110, -1));

        btnView.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnView.setText("VIEW");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        getContentPane().add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 86, 33));

        tblHospital.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tblHospital.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Hospital Name", "Phone No", "Address", "State", "City", "Community", "Country"
            }
        ));
        jScrollPane1.setViewportView(tblHospital);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 540, 170));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ASSIGN COMMUNITY");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 320, 60));

        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/plus (1).png"))); // NOI18N
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 90, 30));

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/updated.png"))); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, -1, 33));
        getContentPane().add(txtCommunity, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 138, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Community");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 110, 40));

        txtHospitalPhoneNo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtHospitalPhoneNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 130, 30));

        txtHospitalName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtHospitalName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 160, 30));

        txtCity.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 140, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Address");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 90, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Country");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 70, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("State");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 80, 30));

        txtAddress.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 160, 30));

        txtState.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtState, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 150, 30));

        txtCountry.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txtCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, 130, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        try
        {
        int selectedRowIndex = tblHospital.getSelectedRow();
        //Check if row selected
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblHospital.getModel();
        Hospital selectedHospital = (Hospital) model.getValueAt(selectedRowIndex, 0);
        hospitalList.deleteHospital(selectedHospital);
        JOptionPane.showMessageDialog(this, "Hospital has been deleted");
        populateTable();
        }
         catch(Exception e)
        {
             JOptionPane.showMessageDialog(this, "Please try again");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CommunityAdminOperations communityAdminOps = new CommunityAdminOperations(personList, doctorList, patientList, hospitalList,doctor,patient);
        communityAdminOps.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        if (tblHospital.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Table is empty");
        }

        int selectedRowIndex = tblHospital.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to view");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblHospital.getModel();
        Hospital selectedHospital = (Hospital) model.getValueAt(selectedRowIndex, 0);
        txtHospitalName.setText(selectedHospital.getHospitalName());
        String strLong = Long.toString(selectedHospital.getPhoneNo());
        txtHospitalPhoneNo.setText(strLong);
        txtCity.setText(selectedHospital.city.getCityName());
        txtAddress.setText(selectedHospital.house.getAddressLine1());
        txtState.setText(selectedHospital.house.getState());
        txtCountry.setText(selectedHospital.house.getCountry());
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        try
        {
        if (validateData()) {

            hospital = hospitalList.addHospitalRecord();
            hospital.setHospitalName(txtHospitalName.getText());
            txtHospitalName.setText("");

            long phoneNo = Long.parseLong(txtHospitalPhoneNo.getText());
            hospital.setPhoneNo(phoneNo);
            txtHospitalPhoneNo.setText("");
            hospital.city.setCityName(txtCity.getText());
            txtCity.setText("");
            hospital.community.setCommunity(txtCommunity.getText());
            txtCommunity.setText("");
            hospital.house.setAddressLine1(txtAddress.getText());
            txtAddress.setText("");
            hospital.house.setState(txtState.getText());
            txtState.setText("");
            hospital.house.setCountry(txtCountry.getText());
            txtCountry.setText("");

            JOptionPane.showMessageDialog(this, "Hospital Added Successfully");
            populateTable();
        }
        }
         catch(Exception e)
        {
             JOptionPane.showMessageDialog(this, "Please try again");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        try
        {
        DefaultTableModel model = (DefaultTableModel) tblHospital.getModel();
        //Get selected row values
        if (tblHospital.getSelectedRowCount() == 1) {
            if (validateData()) {
                tblHospital.setValueAt(txtHospitalName.getText(), tblHospital.getSelectedRow(), 0);
                tblHospital.setValueAt(txtHospitalPhoneNo.getText(), tblHospital.getSelectedRow(), 1);
                tblHospital.setValueAt(txtAddress.getText(), tblHospital.getSelectedRow(), 2);
                tblHospital.setValueAt(txtState.getText(), tblHospital.getSelectedRow(), 3);
                tblHospital.setValueAt(txtCity.getText(), tblHospital.getSelectedRow(), 4);
                tblHospital.setValueAt(txtCommunity.getText(), tblHospital.getSelectedRow(), 5);
                tblHospital.setValueAt(txtCountry.getText(), tblHospital.getSelectedRow(), 6);
                JOptionPane.showMessageDialog(this, "Record Updated Successfully");
                hospitalList.UpdateHospitalCommunity(txtHospitalName.getText(), Long.valueOf(txtHospitalPhoneNo.getText()),
                        txtAddress.getText(), txtCity.getText(), txtCountry.getText(), txtState.getText(), txtCommunity.getText());

                //Setting text to blank once record has been inserted
                txtHospitalName.setText("");
                txtHospitalPhoneNo.setText("");
                txtCity.setText("");

                txtCommunity.setText("");
                txtAddress.setText("");
                txtState.setText("");
                txtCountry.setText("");

            }
        } else {
            if (tblHospital.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Table is empty");
            } else {
                JOptionPane.showMessageDialog(this, "Please select a single record to update");
            }
        }
        }
         catch(Exception e)
        {
             JOptionPane.showMessageDialog(this, "Please try again");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblHospital;
    private javax.swing.JLabel txtAddress;
    private javax.swing.JLabel txtCity;
    private javax.swing.JTextField txtCommunity;
    private javax.swing.JLabel txtCountry;
    private javax.swing.JLabel txtHospitalName;
    private javax.swing.JLabel txtHospitalPhoneNo;
    private javax.swing.JLabel txtState;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {

        DefaultTableModel model = (DefaultTableModel) tblHospital.getModel();
        model.setRowCount(0);

        for (Hospital profile : hospitalList.getHospitalList()) {

            Object[] row = new Object[7];
            row[0] = profile;
            row[1] = profile.getPhoneNo();
            row[2] = profile.house.getAddressLine1();
            row[3] = profile.house.getState();
            row[4] = profile.city.getCityName();
            row[5] = profile.getCommunity();
            row[6] = profile.house.getCountry();

            model.addRow(row);

        }

    }

    private boolean validateData() {

        if (txtHospitalName.getText().length() < 2 || !txtHospitalName.getText().matches("[a-zA-Z]+")) {
            JOptionPane.showMessageDialog(this, "Enter proper  name.");
            return false;
        }

        if (txtHospitalPhoneNo.getText().isEmpty() || txtHospitalPhoneNo.getText().trim().length() != 10 || !txtHospitalPhoneNo.getText().chars().allMatch(Character::isDigit)) {

            JOptionPane.showMessageDialog(this, "Please enter a valid phone no");
            return false;
        }

        if (txtCity.getText().length() < 2 || !txtCity.getText().matches("[a-zA-Z]+")) {
            JOptionPane.showMessageDialog(this, "Enter proper  name.");
            return false;
        }
        if (txtCommunity.getText().length() < 2 || !txtCommunity.getText().matches("[a-zA-Z]+")) {
            JOptionPane.showMessageDialog(this, "Enter proper  community.");
            return false;
        }

        return true;

    }

}
