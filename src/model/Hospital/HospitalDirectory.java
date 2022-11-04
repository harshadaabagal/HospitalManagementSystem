/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Hospital;

import java.util.ArrayList;
import model.Doctor.Doctor;
import model.Patient.Patient;
import model.Person.City;
import model.Person.Community;
import model.Person.House;

/**
 *
 * @author Harshada
 */
public class HospitalDirectory {
     ArrayList<Hospital> hospitalList;

    public ArrayList<Hospital> getHospitalList() {
        return hospitalList;
    }
     public HospitalDirectory() {
        this.hospitalList = new ArrayList<>();
    }

    public void setHospitalList(ArrayList<Hospital> hospitalList) {
        this.hospitalList = hospitalList;
    }
    public Hospital addHospitalRecord() {
        Hospital newHospital = new Hospital();
        newHospital.setCommunity(new Community());
        newHospital.setCity(new City());
        newHospital.setHouse(new House());
        hospitalList.add(newHospital);
        return newHospital;
    }
     public void deleteHospital(Hospital hospital) {
        hospitalList.remove(hospital);

    }
     public void UpdateHospitalCommunity(String name,Long phoneNo, String address, String city, String country , String state ,String community)
        {
         for (Hospital hospital : hospitalList) {
         if (hospital.getHospitalName().equals(name))
         {    
             
             hospital.setHospitalName(name);
             hospital.setPhoneNo(phoneNo);
             hospital.house.setAddressLine1(address);
             hospital.city.setCityName(city);
             hospital.house.setCountry(country);
             hospital.house.setState(state);
             hospital.community.setCommunity(community); 
         }
         }
        }

       public void UpdateHospital(String name,Long phoneNo, String address, String city, String country , String state)
        {
         for (Hospital hospital : hospitalList) {
         if (hospital.getHospitalName().equals(name))
         {    
             
             hospital.setHospitalName(name);
             hospital.setPhoneNo(phoneNo);
             hospital.house.setAddressLine1(address);
             hospital.city.setCityName(city);
             hospital.house.setCountry(country);
             hospital.house.setState(state);
              
         }
         }
        }
         
}
