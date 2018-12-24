/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myjava_ex;

import java.io.FileOutputStream;

/**
 *
 * @author devashish kapadia
 */
public class finput {
    public static void main(String[] args) {
        byte b[]={'D','E','L','H','I','\n','C','H','A','N','D','I','G','A','R','H','\n'};
        FileOutputStream fout;
        try
        {
          fout=new FileOutputStream("dev.txt");
          fout.write(b);
        //  fout.close();
          fout.flush();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    
}

