/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author tharik
 */
public class Bird implements Animal {

    @Override
    public void move() {
        System.out.println("Bird is flying");
    }

    @Override
    public void consume() {
        System.out.println("Bird is eating");
    }
    
}
