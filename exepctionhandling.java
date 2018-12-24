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
public class exepctionhandling {
    
   public static void main (String [] args){
       try{
           int a=Integer.parseInt(args[0]);
       int b=0;
       double c=a/b;
        System.out.println(c+ "result");
       }
       catch(ArithmeticException e) {
           System.out.println("err.");
           
       }
       catch(NumberFormatException f)
       {
           System.out.println("myjava_ex.exepctionhandling.main()");
       }
       catch(ArrayIndexOutOfBoundsException j)
       {
           System.out.println("problem in array");
           System.out.println(j);
       }
       finally
       {
       System.out.println(" i am out of try and cath methout");         
       
       }
       
   }
    
    
}
