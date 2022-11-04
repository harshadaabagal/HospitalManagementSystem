/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui.Patient;

import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import model.Doctor.Doctor;
import model.Doctor.DoctorDirectory;
import model.Hospital.HospitalDirectory;
import model.Patient.Patient;
import model.Patient.PatientDirectory;
import model.Person.PersonDirectory;
import ui.Admin.MainJFrame;

/**
 *
 * @author Harshada
 */
public class PatientSelfRegistration extends javax.swing.JFrame {

    /**
     * Creates new form PatientSelfRegistration
     */
    PatientDirectory patientList;
    Patient patient;
    PersonDirectory personList;
    DoctorDirectory doctorList;
    HospitalDirectory hospitalList;
    Doctor doctor;

    public PatientSelfRegistration(PersonDirectory personList1, DoctorDirectory doctorList1, PatientDirectory patientList1, HospitalDirectory hospitalList1) {
        initComponents();

        this.patientList = patientList1;
        this.personList = personList1;
        this.doctorList = doctorList1;
        this.hospitalList = hospitalList1;
        txtPatientName.setText("Patient");
        txtUsername.setText("Patient");
        password.setText("Sch$54321");
        confirmPassword.setText("Sch$54321");
        patientGender.setSelectedItem("COMMUNITY ADMIN");
        txtPatientPhoneNo.setText("1234567890");
        txtEmail.setText("b@gmail.com");
        txtAge.setText("23");
        txtPatientDisease.setText("Fever");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPatientDisease = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        lblcnfPassword = new javax.swing.JLabel();
        confirmPassword = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        patientGender = new javax.swing.JComboBox<>();
        lblName = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        txtPatientPhoneNo = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(771, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtPatientDisease, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 160, 30));

        lblUsername.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblUsername.setText("Username");
        getContentPane().add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 70, 30));

        lblPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPassword.setText("Password");
        getContentPane().add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 80, 40));
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 170, 30));

        lblcnfPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblcnfPassword.setText("Confirm Password");
        getContentPane().add(lblcnfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 230, 130, 30));
        getContentPane().add(confirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 170, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Email");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 70, 30));
        getContentPane().add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 160, 30));

        patientGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Female", "Male" }));
        patientGender.setSelectedIndex(-1);
        getContentPane().add(patientGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 160, 30));

        lblName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblName.setText("Patient Name");
        getContentPane().add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 100, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("PhoneNo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, -1, 50));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Age");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 60, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Gender");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 80, 30));
        getContentPane().add(txtPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 170, 30));

        txtPatientPhoneNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientPhoneNoActionPerformed(evt);
            }
        });
        getContentPane().add(txtPatientPhoneNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, 160, 30));
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 170, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText(" Disease");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 93, 30));
        getContentPane().add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 170, 30));

        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/plus (1).png"))); // NOI18N
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 90, 37));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("REGISTER");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 140, 50));

        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 90, 37));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPatientPhoneNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientPhoneNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientPhoneNoActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        try {
            if (validateData()) {
                patient = patientList.addPatientRecord();
                patient.person.setFullName(txtPatientName.getText());
                patient.person.setUsername(txtUsername.getText());
                patient.person.setPassword(password.getText());
                patient.person.setConfirmPassword(confirmPassword.getText());
                patient.person.setEmail(txtEmail.getText());
                patient.setDisease(txtPatientDisease.getText());
                int result = Integer.parseInt(txtAge.getText());
                patient.person.setAge(result);
                // txtAge.setText("");
                long phoneNo = Long.parseLong(txtPatientPhoneNo.getText());
                patient.person.setPhoneNo(phoneNo);
                patient.person.setGender(patientGender.getSelectedItem().toString());
                patient.person.setRole("PATIENT");
                JOptionPane.showMessageDialog(this, "Registered Successfully!Please login");

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please try again");
        }


    }//GEN-LAST:event_btnAddActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        MainJFrame frame = new MainJFrame(personList, doctorList, patientList, hospitalList, patient, doctor);
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JPasswordField confirmPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblcnfPassword;
    private javax.swing.JPasswordField password;
    private javax.swing.JComboBox<String> patientGender;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtPatientDisease;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtPatientPhoneNo;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    private boolean validateData() {
        String username = txtUsername.getText();
        String password1 = password.getText();
        String cnfpassword = confirmPassword.getText();

        txtUsername.setBorder(new LineBorder(new Color(128, 128, 128)));
        password.setBorder(new LineBorder(new Color(128, 128, 128)));
        confirmPassword.setBorder(new LineBorder(new Color(128, 128, 128)));

        if (username == null || username.equals("")) {
            txtUsername.setBorder(BorderFactory.createLineBorder(Color.RED));
            lblUsername.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Username already ");
            return false;
        }


        if (password == null || password.equals("")) {
            JOptionPane.showMessageDialog(null, "Password can't be empty.");
            txtUsername.setBorder(BorderFactory.createLineBorder(Color.RED));
            lblPassword.setForeground(Color.RED);
            return false;
        }

        if (!passwordPatternCorrect()) {
            JOptionPane.showMessageDialog(null, "Paasword should be at least 6 digits and+"
                    + " a combination of number, uppercarse, lowercase abd secial cjaracter $,*,#,&");
            password.setBorder(BorderFactory.createLineBorder(Color.RED));
            lblName.setForeground(Color.RED);
            return false;
        }

        if (!password1.equals(cnfpassword)) {
            JOptionPane.showMessageDialog(null, "Password does not match.");
            password.setBorder(BorderFactory.createLineBorder(Color.RED));
            confirmPassword.setBorder(BorderFactory.createLineBorder(Color.RED));
            lblName.setBackground(Color.red);
            lblcnfPassword.setBackground(Color.red);
            return false;

        }

        if (txtPatientName.getText().length() < 2 || !txtPatientName.getText().matches("[a-zA-Z]+")) {
            JOptionPane.showMessageDialog(this, "Enter proper  name.");
            return false;
        }
        if (txtUsername.getText().length() < 2 || !txtUsername.getText().matches("[a-zA-Z]+")) {
            JOptionPane.showMessageDialog(this, "Enter proper username.");
            return false;
        }

        if (txtPatientPhoneNo.getText().isEmpty() || txtPatientPhoneNo.getText().trim().length() != 10 || !txtPatientPhoneNo.getText().chars().allMatch(Character::isDigit)) {

            JOptionPane.showMessageDialog(this, "Please enter a valid phone no");
            return false;
        }
        if (!emailAddressValidation(txtEmail.getText().trim())) {
            JOptionPane.showMessageDialog(this, "Please enter a valid email address");
            return false;
        }

        if (!txtAge.getText().matches("[0-9]+")) {
            JOptionPane.showMessageDialog(this, "Enter proper age");
            return false;
        }
        if (patientGender.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Please select a gender");
            return false;
        }
        if (txtPatientDisease.getText().length() < 2 || !txtPatientDisease.getText().matches("[a-zA-Z]+")) {
            JOptionPane.showMessageDialog(this, "Enter proper  name.");
            return false;
        }

        return true;

    }

    private boolean passwordPatternCorrect() {
        Pattern p = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[$*#&])[A-Za-z\\d$*#&]{6,}$");
        Matcher m = p.matcher(password.getText());
        boolean b = m.matches();
        return b;
    }

    private boolean emailAddressValidation(String email) {
        String emailValidation = "^[A-Za-z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        Pattern pattern = Pattern.compile(emailValidation);
        Matcher m = pattern.matcher(email);
        return m.matches();
    }

}
