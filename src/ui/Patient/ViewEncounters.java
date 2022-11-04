/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui.Patient;

import javax.swing.table.DefaultTableModel;
import model.Doctor.Doctor;
import model.Doctor.DoctorDirectory;
import model.Encounter.Encounter;
import model.Hospital.HospitalDirectory;
import model.Patient.Patient;
import model.Patient.PatientDirectory;
import model.Person.PersonDirectory;

/**
 *
 * @author Harshada
 */
public class ViewEncounters extends javax.swing.JFrame {

    /**
     * Creates new form ViewEncounters
     */
    Patient patient;
    Doctor doctor;
    DoctorDirectory doctorList;
    PatientDirectory patientList;
    PersonDirectory personList;
    HospitalDirectory hospitalList;

    public ViewEncounters(PersonDirectory personList1, DoctorDirectory doctorList1, PatientDirectory patientList1, HospitalDirectory hospitalList1, Patient patient1, Doctor doctor1) {
        initComponents();
        this.personList = personList1;
        this.doctorList = doctorList1;
        this.hospitalList = hospitalList1;
        this.patientList = patientList1;
        this.patient = patient1;
        this.doctor = doctor1;
        populateTable();

    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblEncounter.getModel();
        model.setRowCount(0);

        for(Encounter e : patient.getEncounterHistory()) {

            String pfullname = patient.person.getFullName();
            String dfullname = doctor.person.getFullName();
            Object[] row = new Object[7];

            row[0] = pfullname;
            row[1] = dfullname;
            row[2] = e.getVitalSign().getPulseRate();
            row[3] = e.getVitalSign().getBodyTemp();
            row[4] = e.getVitalSign().getRespRate();
            row[5] = e.getVitalSign().getBloodPressure();
            row[6] = e.getAptTime();
            model.addRow(row);
        }
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
        tblEncounter = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(873, 475));
        setPreferredSize(new java.awt.Dimension(873, 475));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblEncounter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient Name", "Doctor Name", "Pulse Rate", "Temperature", "Respiration Rate", "Blood Pressure", "Appointment Date"
            }
        ));
        jScrollPane1.setViewportView(tblEncounter);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 790, 229));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("View Encounter History");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 212, 40));

        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 88, 31));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        PatientOperations patientOp = new PatientOperations(personList, doctorList, patientList, hospitalList, patient,doctor);
        patientOp.setVisible(true);
        dispose();

    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEncounter;
    // End of variables declaration//GEN-END:variables
}
