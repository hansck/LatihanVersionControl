/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import Controller.Constants;
import Model.*;
/**
 *
 * @author User
 */
public class StandardView implements Constants{
    public StandardView(){
        Dog dog = new Dog("a",5,DOG_FOOD,ALIVE);
        Cat cat = new Cat("b",3,CAT_FOOD,ALIVE);
        Horse horse = new Horse("c",3,HORSE_FOOD,DEAD);
        Duck duck = new Duck("d",2,DUCK_FOOD,ALIVE);
        
        System.out.println("suck it");
        System.out.println("ender");
        
        dog.gender = "helicopter";
        cat.gender = "tank";
        
        System.out.println(dog.gender);
    }
}
