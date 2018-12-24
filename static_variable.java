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
public class static_variable {
    static int a=1;
    int b=1;
static_variable(){
a=a+1;
b=b+1;
    System.out.println(a);  
    System.out.println(b);
}

}
class red{
    public static void main(String[] args){
       static_variable t=new static_variable();
       static_variable th=new static_variable();
        
    }
   

}