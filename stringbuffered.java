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
public class stringbuffered {
    public static void main(String[]args){
       StringBuffer str =new StringBuffer(" Object language ");
        System.out.println("orignal string :" +str);
        System.out.println(" length of string: " +str.length());
        for(int i=0;i<str.length();i++){
           // int p=i;
            System.out.println("  Charater at position " +i+ " is " +str.charAt(i));
            
        }
    str.setCharAt(1, 'z');
        System.out.println("changed value "+str);
       String aString=new String(str.toString());
       int pos =aString.indexOf("language");
       str.insert(pos,"Oriented");
        System.out.println(" modified string " +str);
        str.setCharAt(6, '-');
        System.out.println(" String now: " +str);
        str.append(" improves security. ");
        System.out.println(" Append string: " +str);
        
       
        
    }
    
}
