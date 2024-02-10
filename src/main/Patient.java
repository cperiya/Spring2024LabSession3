/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import javax.swing.ImageIcon;

/**
 *
 * @author HP PC
 */
public class Patient {
   String firstName;
   String lastName;
   int age;
   String email;
   String message;
   String gender;
   String photo;
   ImageIcon userPhoto;

    public String getPatientType() {
        return PatientType;
    }

    public void setPatientType(String PatientType) {
        this.PatientType = PatientType;
    }
   String PatientType;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public ImageIcon getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(ImageIcon userPhoto) {
        this.userPhoto = userPhoto;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
   
}
