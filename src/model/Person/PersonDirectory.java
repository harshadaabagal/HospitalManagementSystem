/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Person;

import java.util.ArrayList;

/**
 *
 * @author Harshada
 */
public class PersonDirectory {

    ArrayList<Person> personList;

    public PersonDirectory() {
        this.personList = new ArrayList<>();
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }

    public Person addPersonRecord() {

        Person newPerson = new Person();
        personList.add(newPerson);
        return newPerson;
    }

    public String loginValues(String username, String password) {
        String check = "notfound";
        for (Person person : personList) {
            if (person.getUsername().equals(username) && person.getPassword().equals(password)) {
                check = person.getRole();
            }
        }
        return check;
    }
   
    public void UpdateList(String fullname , String username , String password, String confirmPassword, String role , long phoneNo, String gender, String email,Integer age)
    {
         for (Person person : personList) {
         if (person.getFullName().equals(fullname))
         {    
             
             person.setUsername(username);
             person.setPassword(password);
             person.setConfirmPassword(confirmPassword);
             person.setRole(role);
             person.setGender(gender);
             person.setEmail(email);
             person.setAge(age);
             person.setPhoneNo(phoneNo);
             
         }
         }
    }
    public void deletePerson(Person person) {
        personList.remove(person);

    }
//    public String usernameAlreadyExists(String username)
//    {
//        String msg = null;
//        for (Person person : personList)
//        {
//              if (person.getUsername().equals(username))
//              {
//                  msg = "Username Already Exists";
//              }
//        }
//        return msg;
//    }

}
