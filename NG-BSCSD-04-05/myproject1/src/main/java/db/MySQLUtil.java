/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

/**
 *
 * @author Buddhi
 */
public class MySQLUtil implements DBUtil {

    @Override
    public void addStudent() {
        System.out.println("Adding a student to MySQL Database");
    }

    @Override
    public void getStudent() {
        System.out.println("Finding a student from MySQL Database");
    }

    @Override
    public void updateStudent() {
        System.out.println("Update a student in MySQL Database");
    }

    @Override
    public void deleteStudent() {
        System.out.println("Deleting a student from MySQL Database");
    }
    
}
