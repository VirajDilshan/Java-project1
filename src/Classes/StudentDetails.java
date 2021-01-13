/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class StudentDetails {
    
    private static final String FILEPATH = "D:\\Projects\\JavaProject-1\\src\\Classes\\studentData.txt";
    
    FileWriter fw = null;
    BufferedWriter bw = null;
    
    public boolean addStudentToTextFile(Student student) {
        
        try {
            PrintWriter out = null;
            
            String studentData = student.getStudentName() +","+ student.getStudentID() +","+ student.getDob()+","+ student.getAddress() +","+ student.getDoa() +","+ student.getFaculty() +","+ student.getContactNumber() +","+ student.getEmail();
            
            out = new PrintWriter(new BufferedWriter(new FileWriter(FILEPATH,true)));
            out.println(studentData);
            
            out.close();
            JOptionPane.showMessageDialog(null, "Details are added");
            
        } catch (IOException ex) {
            Logger.getLogger(StudentDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return true;
    }
    
    
    public Student findStudentFromTextFile(String studentId) throws IOException{
        
        Student student = null;
        
        try {
           
            FileInputStream fileInputStream = new FileInputStream(FILEPATH);
            
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            
            String readLine;
            
            while ((readLine = bufferedReader.readLine()) != null) {
                String[] detailsStudent = readLine.split(",");
                
                if (studentId.equals(detailsStudent[1]) ) {
                    student = new Student();
                    
                    student.setStudentID(detailsStudent[1]);
                    student.setStudentName(detailsStudent[0]);
                    student.setDob(detailsStudent[2]);
                    student.setAddress(detailsStudent[3]);
                    student.setDoa(detailsStudent[4]);
                    student.setFaculty(detailsStudent[5]);
                    student.setContactNumber(detailsStudent[6]);
                    student.setEmail(detailsStudent[7]);
                    
                }
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StudentDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
        return student;
    }
    
}
