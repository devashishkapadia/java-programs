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
abstract class abstractmethoud {
    abstract void area();
        
    }
    
class A extends abstractmethoud{
int l=20;
int b=40;
    void area(){
    int area=l*b;
        System.out.println(" area is "+area);
}    
    
}
class B extends abstractmethoud{
    void area(){
        int r =30;
        double pie=3.14;
      double  area= 2*pie*r;
      System.out.println(" area is "+area);
    }
}

class m8{
    public static void main(String[] args){
        abstractmethoud j;
  A ob= new A();  
  j=ob;
  B h =new B();
  j.area();
  h.area();
    }
}