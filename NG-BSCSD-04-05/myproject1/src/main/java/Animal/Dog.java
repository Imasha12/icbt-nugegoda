/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animal;

/**
 *
 * @author Buddhi
 */
public class Dog implements Animal {
    


    @Override
    public void consume() {
        System.out.println("Dog is moving");
    }

    @Override
    public void move() {
        System.out.println("Dog is eating");
    }
    
    
}
