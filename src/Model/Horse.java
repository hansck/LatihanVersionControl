/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.Interface;

/**
 *
 * @author User
 */
public class Horse extends Animal implements Interface{
    
    public Horse(String name,int age,String food,int life){
        this.name = name;
        this.age = age;
        this.food = food;
        alive = life;
    }
    
    @Override
    public void printSound(){
        System.out.println("Eeee!");
    }
    
    @Override
    public String printData() {
        String s = "name: " + this.name + "\nage: " + this.age + "\nfood: " + this.food + "\nstatus: " + this.alive + "\n";
        return s;
    }
}
