/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myjava_ex;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author devashish kapadia
 */
public class egofinot {
    public static void main(String[] args) {
        char a[]={'d','o','g','\n','c','a','t','\n','d','o','g','\n','c','a','t','\n'};
        String g="i love java ";
        FileWriter fout;
        try{
            fout=new FileWriter("animal1.txt");
            fout.write(g);
            fout.close();
            
        }catch (Exception f){
           f.printStackTrace();
        }
        FileReader fin;
        int d;
        try{
            fin=new FileReader("animal1.txt");
            while((d=fin.read())!=-1){
               System.out.print((char)d);
        }
            fin.close();
        }
        catch(Exception y){
            y.printStackTrace();
        }
    }
    
}
