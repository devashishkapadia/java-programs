/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myjava_ex;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author devashish kapadia
 */
public class wordcounting {
   /* public static void main(String[] args) {
        HashMap h=new HashMap();                        
FileInputStream fin;
        try {
            fin = new FileInputStream("P:\\Smo main file_2.txt");
            BufferedReader br=new BufferedReader(new InputStreamReader(fin));
        

String n;
while((n=br.readLine())!=null)
{
    if(h.containsKey(n))
    {
    int i=(Integer)h.get(n);
    h.put(n,(i+1));
    }
    else
    h.put(n, 1);
}
        
    }
        catch (Exception ex) {
           ex.printStackTrace();
        }
    
}*/
    public static void main(String[] args) {
Scanner input=new Scanner(System.in);
            String path = "C:\\Users\\devashish kapadia\\Downloads\\";
            String fileName = "sm.txt";
            System.out.println("please enter the wornd you wanna count");
            String testWord = input.nextLine();
           //CHANGE THIS IF YOU WANT
            int tLen = testWord.length();
            int wordCntr = 0;
            String file = path + fileName;
            boolean check;
int j=0;
            try{
                FileInputStream fstream = new FileInputStream(file);
                BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
                String strLine;        
                //Read File Line By Line
                while((strLine = br.readLine()) != null){                
                    //check to see whether testWord occurs at least once in the line of text
                    check = strLine.toLowerCase().contains(testWord.toLowerCase());
                    if(check){  
                         j=strLine.length();
                        //get the line, and parse its words into a String array
                        String[] lineWords = strLine.split("\\s+");                    
                        for(String w : lineWords){
                            //first see if the word is as least as long as the testWord
                            if(w.length() >= tLen){
                                /*
                                1) grab the specific word, minus whitespace
                                2) check to see whether the first part of it having same length
                                    as testWord is equivalent to testWord, ignoring case
                                */
                                String word = w.substring(0,tLen).trim();                                                        
                                if(word.equalsIgnoreCase(testWord)){                                
                                    wordCntr++;
                                }                            
                            }
                        }                    
                    }   
                }            
                System.out.println("total is: " + wordCntr);
                     System.out.println("total is: " + j);
            //Close the input stream
            br.close();
            } catch(Exception e){
                e.printStackTrace();
            }
        }
}
