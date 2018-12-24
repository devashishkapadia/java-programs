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
public class constructor_overloading {
    int a,b,c;
    constructor_overloading(int k,int l)
    {
   a=k;
   b=l;
     
}
    
    
 void constructor(){
      c=a+b;
      System.out.println(c + "");
    
}  
}
class main8
{
    public static void main (String [] args){
     constructor_overloading a1= new constructor_overloading(10,20);   
      a1.constructor();  
    }
}