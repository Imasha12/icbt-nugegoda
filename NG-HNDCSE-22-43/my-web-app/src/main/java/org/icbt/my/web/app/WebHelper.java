/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.icbt.my.web.app;

/**
 *
 * @author tharik
 */
public class WebHelper {
    
    
    public static Student[] getStudents() {
        Student[] students  = new Student[3];
        
        students[0] = new Student("ST001", "John", "123V");
        students[1] = new Student("ST002", "George", "124V");
        students[2] = new Student("ST003", "James", "1235");
        
        return students;   
    }
    
    public static String getGreeting() {
        String name = "George";
        String greeting = "Hello";
        return greeting + " " + name;
    }
    
}
