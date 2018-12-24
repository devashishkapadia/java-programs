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
public class inheritance
{
     int id =25;
    String Class ="Java";
  
    void show(){
System.out.print("id ="+ id);
}
}
class Salary extends inheritance{
    int salary = 10000;
    void display(){
        System.out.print(id + salary + Class );
    }
            

}
class Main {
    public static void main (String[] args ){
        
     Salary  s = new Salary();
    s.display();
    }
    
    
}




