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
public class Staticmethoud {
    static int a=1;
   int b=1;

    public Staticmethoud() {
        a=a+1;
        b=b+1;
    }
   
   static void show(Staticmethoud y)
   {
       System.out.println("value of a ="+a); 
       System.out.println("value of b ="+y.b); 
   }
  /* void dis()
   {
       System.out.println("value of b ="+b); 
   }*/
}
class h
{
    public static void main(String[] args) {
        Staticmethoud st=new Staticmethoud();
        Staticmethoud.show(st);
        //st.dis();
        Staticmethoud sst=new Staticmethoud();
        Staticmethoud.show(sst);
        //sst.dis();
    }
}
