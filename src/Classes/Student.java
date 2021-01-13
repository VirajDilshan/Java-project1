/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Administrator
 */
public class Student {
    String studentName;
    String studentID;
    String dob;
    String address;
    String doa;
    String faculty;
    String contactNumber;
    String email;

    

    
    public Student(String studentName, String studentID, String dob, String address, String doa, String faculty, String contactNumber, String email) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.dob = dob;
        this.address = address;
        this.doa = doa;
        this.faculty = faculty;
        this.contactNumber = contactNumber;
        this.email = email;
    }

    
    public Student(){

    
    }
    
    
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDoa() {
        return doa;
    }

    public void setDoa(String doa) {
        this.doa = doa;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
