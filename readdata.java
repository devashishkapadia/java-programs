/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myjava_ex;

import java.io.FileInputStream;

/**
 *
 * @author devashish kapadia
 */
public class readdata {
     public static void main(String[] args) {
      //  byte b[]={'D','E','L','H','I','\n','C','H','A','N','D','I','G','A','R','H',};
        FileInputStream fin;
        int c;
        try
        {
          fin=new FileInputStream("C:\\Users\\devashish kapadia\\Desktop\\password for worpress admin.txt");
          while((c=fin.read())!=-1)
          {
               System.out.print((char)c);
        
          }
           fin.close();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
}
