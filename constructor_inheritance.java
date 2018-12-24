/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myjava_ex;

/**
 *
 * @author devashish kapadia
 */
public class constructor_inheritance {
    constructor_inheritance(){
        System.out.println("i am in constructor base class");
    }
}
class z extends constructor_inheritance{
    z(){
        System.out.print(" I am derived class");
        
    }
    
}
class Mi{
   public static void main ( String [] args){
    z ob= new z();
}
}