/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Hospital;

import model.Person.City;
import model.Person.Community;
import model.Person.House;

/**
 *
 * @author Harshada
 */
public class Hospital {
    
    private String hospitalName;
    private long PhoneNo;
    public House house;
    public Community community;
    public City city;

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }
   
  
    

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
    
    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public long getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(long PhoneNo) {
        this.PhoneNo = PhoneNo;
    }

  
      @Override
    public String toString(){
      return getHospitalName();
    }
}
