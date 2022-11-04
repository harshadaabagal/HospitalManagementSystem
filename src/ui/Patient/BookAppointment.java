/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui.Patient;

import java.util.HashSet;
import java.util.Set;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.Doctor.Doctor;
import model.Doctor.DoctorDirectory;
import model.Hospital.Hospital;
import model.Hospital.HospitalDirectory;
import model.Patient.Patient;
import model.Patient.PatientDirectory;
import model.Person.Person;
import model.Person.PersonDirectory;

/**
 *
 * @author Harshada
 */
public class BookAppointment extends javax.swing.JFrame {

    /**
     * Creates new form BookAppointment
     */
    DoctorDirectory doctorList;
    PatientDirectory patientList;
    PersonDirectory personList;
    HospitalDirectory hospitalList;
    Patient patient;
    Doctor doctor;

    public BookAppointment(PersonDirectory personList1, DoctorDirectory doctorList1, PatientDirectory patientList1, HospitalDirectory hospitalList1, Patient patient1, Doctor doctor1) {
        initComponents();
        this.personList = personList1;
        this.doctorList = doctorList1;
        this.patientList = patientList1;
        this.hospitalList = hospitalList1;
        this.patient = patient1;
        this.doctor = doctor1;
        populateFields();
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtDisease = new javax.swing.JTextField();
        comboDoctor = new javax.swing.JComboBox<>();
        comboHospital = new javax.swing.JComboBox<>();
        btnBookAppointment = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(675, 479));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("BOOK APPOINTMENT");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 193, 60));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Patient Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, 34));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Disease");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 79, 33));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Doctor");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 70, 42));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Hospital");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, -1, 50));
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 88, 130, 34));
        getContentPane().add(txtDisease, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 155, 130, 33));

        getContentPane().add(comboDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 148, 33));

        getContentPane().add(comboHospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, 148, 34));

        btnBookAppointment.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBookAppointment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/plus (1).png"))); // NOI18N
        btnBookAppointment.setText("BOOK APPOINTMENT");
        btnBookAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookAppointmentActionPerformed(evt);
            }
        });
        getContentPane().add(btnBookAppointment, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 258, -1, 36));

        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 320, 118, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBookAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookAppointmentActionPerformed
        // TODO add your handling code here:
        try {
            for (Patient p : patientList.getPatientList()) {
                // System.out.println("p username is: "+p.person.getUsername()+"\nPatient username is: "+patient.person.getUsername());
                if (p.person.getUsername().equals(patient.person.getUsername())) {
                    p.setDoctorName(comboDoctor.getSelectedItem().toString());
                    p.setHospital(comboHospital.getSelectedItem().toString());
                }
                //  System.out.println("p Doctorname is: "+p.getDoctorName());
                //  System.out.println("p hospital is: "+p.getHospital());

            }
            JOptionPane.showMessageDialog(this, "Patient appointment booked");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please try again");
        }

    }//GEN-LAST:event_btnBookAppointmentActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        PatientOperations patientOp = new PatientOperations(personList, doctorList, patientList, hospitalList, patient, doctor);
        patientOp.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void populateFields() {

        txtName.setText(patient.person.getUsername());
        txtDisease.setText(patient.getDisease());
        System.out.println(patient.person.getUsername());

        Set<String> hospital = new HashSet<>();
        for (Hospital hos : hospitalList.getHospitalList()) {

            hospital.add(hos.getHospitalName());
        }

        DefaultComboBoxModel model1 = (DefaultComboBoxModel) comboHospital.getModel();
        model1.addAll(hospital);

        Set<String> doctor = new HashSet<>();
        for (Doctor doc : doctorList.getDoctorList()) {

            doctor.add(doc.person.getFullName());
        }
        DefaultComboBoxModel model2 = (DefaultComboBoxModel) comboDoctor.getModel();
        model2.addAll(doctor);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBookAppointment;
    private javax.swing.JComboBox<String> comboDoctor;
    private javax.swing.JComboBox<String> comboHospital;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtDisease;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
