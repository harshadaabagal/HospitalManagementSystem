/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui.Admin;

import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import model.Doctor.DoctorDirectory;
import model.Hospital.HospitalDirectory;
import model.Patient.PatientDirectory;
import model.Person.Person;
import model.Person.PersonDirectory;

/**
 *
 * @author Harshada
 */
public class RegisterUser extends javax.swing.JFrame {

    /**
     * Creates new form RegisterUser
     */
    PersonDirectory personList;
    DoctorDirectory doctorList;
    PatientDirectory patientList;
    Person person;
    HospitalDirectory hospitalList;

    public RegisterUser() {
        initComponents();
        txtFullname.setText("comadmin");
        txtUsername.setText("comadmin");
        txtPassword.setText("Sch$54321");
        txtConfirmPassword.setText("Sch$54321");
        comboRole.setSelectedItem("COMMUNITY ADMIN");
        comboGender.setSelectedItem("Female");
        txtEmail.setText("b@gmail.com");
        txtAge.setText("23");
        txtPhone.setText("1234567890");

    }

    public RegisterUser(PersonDirectory personList1, DoctorDirectory doctorList1, PatientDirectory patientList1, HospitalDirectory hospitalList1) {
        initComponents();
        this.personList = personList1;
        this.doctorList = doctorList1;
        this.patientList = patientList1;
        this.hospitalList = hospitalList1;
        txtFullname.setText("Harshada");
        txtUsername.setText("Harshada");
        txtPassword.setText("Sch$54321");
        txtConfirmPassword.setText("Sch$54321");
        comboRole.setSelectedItem("COMMUNITY ADMIN");
        txtPhone.setText("1234567890");
        comboGender.setSelectedItem("Female");
        txtEmail.setText("b@gmail.com");
        txtAge.setText("23");

    }

    public boolean validateData() {

        String username = txtUsername.getText();
        String password = txtPassword.getText();
        String cnfpassword = txtConfirmPassword.getText();

        txtUsername.setBorder(new LineBorder(new Color(128, 128, 128)));
        txtPassword.setBorder(new LineBorder(new Color(128, 128, 128)));
        txtConfirmPassword.setBorder(new LineBorder(new Color(128, 128, 128)));

        if (txtFullname.getText().length() < 2 || !txtFullname.getText().matches("[a-zA-Z]+")) {
            JOptionPane.showMessageDialog(this, "Enter proper  name.");
            return false;
        }

        if (username == null || username.equals("")) {
            txtUsername.setBorder(BorderFactory.createLineBorder(Color.RED));
            lblUsername.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Please enter username ");
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
            txtPassword.setBorder(BorderFactory.createLineBorder(Color.RED));
            return false;
        }

        if (!password.equals(cnfpassword)) {
            JOptionPane.showMessageDialog(null, "Password does not match.");
            txtPassword.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtConfirmPassword.setBorder(BorderFactory.createLineBorder(Color.RED));
            lblConfirmPassword.setBackground(Color.red);
            return false;

        }

        if (txtUsername.getText().length() < 2 || !txtUsername.getText().matches("[a-zA-Z]+")) {
            JOptionPane.showMessageDialog(this, "Enter proper username.");
            return false;
        }

        if (txtPhone.getText().isEmpty() || txtPhone.getText().trim().length() != 10 || !txtPhone.getText().chars().allMatch(Character::isDigit)) {

            JOptionPane.showMessageDialog(this, "Please enter a valid phone no");
            return false;
        }
        if (!emailAddressValidation(txtEmail.getText().trim())) {
            JOptionPane.showMessageDialog(this, "Please enter a valid email address");
            return false;
        }

        if (!txtAge.getText().matches("[0-9]+")) {
            JOptionPane.showMessageDialog(this, "Enter proper zip");
            return false;
        }
        if (comboGender.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Please select a gender");
            return false;
        }

        if (comboRole.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Please select a role");
            return false;
        }

        return true;
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
        lblName = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblConfirmPassword = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtFullname = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        txtConfirmPassword = new javax.swing.JPasswordField();
        txtPhone = new javax.swing.JTextField();
        comboGender = new javax.swing.JComboBox<>();
        txtEmail = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        comboRole = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 430));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTER USER");
        jLabel1.setMaximumSize(new java.awt.Dimension(716, 469));
        jLabel1.setMinimumSize(new java.awt.Dimension(716, 469));
        jLabel1.setPreferredSize(new java.awt.Dimension(716, 469));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 200, 40));

        lblName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblName.setText("Full Name");
        getContentPane().add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 85, 30));

        lblUsername.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblUsername.setText("Username");
        getContentPane().add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 80, 33));

        lblPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPassword.setText("Password");
        getContentPane().add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 110, 40));

        lblConfirmPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblConfirmPassword.setText("Confirm Password");
        getContentPane().add(lblConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 234, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Phone No");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Gender");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 60, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Email");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 70, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Age");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 50, 40));
        getContentPane().add(txtFullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 140, 30));
        getContentPane().add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 140, 33));
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 140, 33));
        getContentPane().add(txtConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 229, 140, 33));
        getContentPane().add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 149, 31));

        comboGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        comboGender.setSelectedIndex(-1);
        getContentPane().add(comboGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 149, 33));
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 149, 33));
        getContentPane().add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 149, 33));

        comboRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COMMUNITY ADMIN", "HOSPITAL ADMIN" }));
        comboRole.setSelectedIndex(-1);
        getContentPane().add(comboRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 280, 140, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Role");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 67, 30));

        btnCreate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/plus (1).png"))); // NOI18N
        btnCreate.setText("CREATE");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        getContentPane().add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 120, 34));

        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 90, 33));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        try {

            if (validateData()) {

                person = personList.addPersonRecord();
                person.setFullName(txtFullname.getText());
                txtFullname.setText("");
                person.setUsername(txtUsername.getText());
                txtUsername.setText("");
                person.setPassword(txtPassword.getText());
                txtPassword.setText("");
                person.setConfirmPassword(txtConfirmPassword.getText());
                txtConfirmPassword.setText("");
                int age = Integer.parseInt(txtAge.getText());
                person.setAge(age);
                txtAge.setText("");
                person.setGender(comboGender.getSelectedItem().toString());
                comboGender.setSelectedIndex(-1);
                long phoneNo = Long.parseLong(txtPhone.getText());
                person.setPhoneNo(phoneNo);
                txtPhone.setText("");
                person.setRole(comboRole.getSelectedItem().toString());
                comboRole.setSelectedIndex(-1);
                person.setEmail(txtEmail.getText());
                txtEmail.setText("");
                JOptionPane.showMessageDialog(this, "User Added Successfully");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please try again");
        }

    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        AdminOperations adOps = new AdminOperations(personList, doctorList, patientList, hospitalList);
        adOps.setVisible(true);
        dispose();

    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JComboBox<String> comboGender;
    private javax.swing.JComboBox<String> comboRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblConfirmPassword;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtAge;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFullname;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    private boolean emailAddressValidation(String email) {
        String emailValidation = "^[A-Za-z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        Pattern pattern = Pattern.compile(emailValidation);
        Matcher m = pattern.matcher(email);
        return m.matches();
    }
    private boolean passwordPatternCorrect() {
        Pattern p = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[$*#&])[A-Za-z\\d$*#&]{6,}$");
        Matcher m = p.matcher(txtPassword.getText());
        boolean b = m.matches();
        return b;
    }

}
