/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Doctor;

import java.util.ArrayList;
import model.Patient.Patient;
import model.Person.Person;

/**
 *
 * @author Harshada
 */
public class DoctorDirectory {

    ArrayList<Doctor> doctorList;

    public DoctorDirectory() {
        this.doctorList = new ArrayList<>();
    }

    public ArrayList<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(ArrayList<Doctor> doctorList) {
        this.doctorList = doctorList;
    }

    public Doctor addDoctorRecord() {
        Doctor newDoctor = new Doctor();
        newDoctor.setPerson(new Person());
        doctorList.add(newDoctor);
        return newDoctor;
    }
      public void deleteDoctor(Doctor doctor) {
        doctorList.remove(doctor);

    }
       public String loginValues(String username, String password) {
        String check = "notfound";
        for (Doctor doctor : doctorList) {
            if (doctor.person.getUsername().equals(username) && doctor.person.getPassword().equals(password)) {
                check = doctor.person.getRole();
            }
        }
        return check;
       }
       
       
           public Doctor getLoginValues(String username, String password) {
        String check = "notfound";
        for (Doctor doctor : doctorList) {
            if (doctor.person.getUsername().equals(username) && doctor.person.getPassword().equals(password)) {
                return doctor;
            }
        }
        return null;
    }
           public void UpdateList(String name , String username , String password, String confirmPassword, String email , Integer age ,String gender, long phoneNo, String speciality, String hospital)
    {
         for (Doctor doctor : doctorList) {
         if (doctor.person.getUsername().equals(username))
         {    
             
             doctor.person.setFullName(name);
             doctor.person.setUsername(username);
             doctor.person.setPassword(password);
             doctor.person.setConfirmPassword(confirmPassword);
             doctor.person.setEmail(email);
             doctor.person.setAge(age);
             doctor.person.setGender(gender);
             doctor.person.setPhoneNo(phoneNo);
             doctor.setSpeciality(speciality);
             doctor.setHospital(hospital);
    
             
         }
         }
    }
}
