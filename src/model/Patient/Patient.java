/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Patient;

import java.awt.List;
import java.util.ArrayList;
import model.Encounter.Encounter;
import model.Person.Person;

/**
 *
 * @author Harshada
 */
public class Patient {
    private String disease;
   
    public Person person;
   
    private String DoctorName;
    private String hospital;
    private ArrayList<Encounter> encounterHistory;
    public Patient() {
        
        this.encounterHistory = new ArrayList<>();
        this.person = new Person();
    }
    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getDoctorName() {
        return DoctorName;
    }

    public void setDoctorName(String DoctorName) {
        this.DoctorName = DoctorName;
    }
    public ArrayList<Encounter> getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(ArrayList<Encounter> encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }



    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
     @Override
    public String toString(){
      return person.getFullName();
    }
    

   
}
