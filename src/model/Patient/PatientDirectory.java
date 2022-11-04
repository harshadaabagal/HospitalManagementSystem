/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Patient;

import java.util.ArrayList;
import model.Doctor.Doctor;
import model.Person.Person;

/**
 *
 * @author Harshada
 */
public class PatientDirectory {

    ArrayList<Patient> patientList;

    public PatientDirectory() {
        this.patientList = new ArrayList<Patient>();
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }

    public Patient addPatientRecord() {
        Patient newPatient = new Patient();
        newPatient.setPerson(new Person());
        patientList.add(newPatient);
        return newPatient;
    }

    public String loginValues(String username, String password) {
        String check = "notfound";
        for (Patient patient : patientList) {
            if (patient.person.getUsername().equals(username) && patient.person.getPassword().equals(password)) {
                check = patient.person.getRole();
            }
        }
        return check;
    }

    public Patient getLoginValues(String username, String password) {
        String check = "notfound";
        for (Patient patient : patientList) {
            if (patient.person.getUsername().equals(username) && patient.person.getPassword().equals(password)) {
                return patient;
            }
        }
        return null;
    }
    
    public PatientDirectory getDoctorsPatient(String doctorname) {
        PatientDirectory pdir = new PatientDirectory();
        ArrayList<Patient> pd = new ArrayList<>();
        System.out.println("Patientlist in doctor patient is:");

        for(Patient p : this.getPatientList()) {
            if(p.getDoctorName() != null)
            {
                if(p.getDoctorName().equals(doctorname))
                {
                    pd.add(p);
                }
            }
        }
        
        pdir.setPatientList(pd);
        
        return pdir;
        
    }

    public Patient FindPatient(String username) {
        for (Patient patient : patientList) {

            if (patient.person.getUsername().equals(username)) {
                System.out.println("This is FindDoc");
                return patient;

            }

        }
        return null;
    }

    public void deletePatient(Patient patient) {
        patientList.remove(patient);
    }

    public void UpdatePatientList(String name, String username, String password, String confirmPassword, String email, Integer age, String gender, long phoneNo, String disease) {
        for (Patient patient : patientList) {
            if (patient.person.getUsername().equals(username)) {

                patient.person.setFullName(name);
                patient.person.setUsername(username);
                patient.person.setPassword(password);
                patient.person.setConfirmPassword(confirmPassword);
                patient.person.setEmail(email);
                patient.person.setAge(age);
                patient.person.setGender(gender);
                patient.person.setPhoneNo(phoneNo);
                patient.setDisease(username);

            }
        }

    }
}
