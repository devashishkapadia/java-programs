/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myjava_ex;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.SequenceInputStream;

/**
 *
 * @author devashish kapadia
 */
public class buffered {
    public static void main(String[] args) {
        try{
            FileInputStream file1=null;
            FileInputStream File2=null;
            SequenceInputStream File3=null;
            file1= new FileInputStream("Dev.txt");
            File2=new FileInputStream("animal.txt");
            File3=new SequenceInputStream(file1,File2);
            BufferedInputStream inBuffer=new 
                BufferedInputStream(File3);
            BufferedOutputStream outBuffer=new
                BufferedOutputStream(System.out);
            int R;
            while((R=inBuffer.read())!=-1){
                outBuffer.write((char)R);
                
            }
            inBuffer.close();
            outBuffer.close();
            file1.close();
            File2.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
}
