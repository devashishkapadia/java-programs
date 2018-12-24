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
public class Addition_method {
   static int a,b,c;
    static void add(int z,int l){
        a=z;
        b=l;
        c=a+b;
      System.out.print(c);
      
    }
    public static void main(String[] args){
        Addition_method m =new Addition_method();
        add(10,5);
    }
}