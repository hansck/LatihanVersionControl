/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author User
 */
public abstract class Animal {
    public static String gender;
    
    public String name;
    public int age;
    public String food;
    public int alive;
    
    boolean isAlive(int status){
        if(status == 1){
            return true;
        }else{
            return false;
        }
    }
}
