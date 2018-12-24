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
public class Myjava_ex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
int l=10,b=30;
        rectangleArea(l, b);
        System.out.println(rectangleArea(8, 5));
        
    }
 public static int rectangleArea(int somelength ,int somewidth){
     int k=somelength * somewidth;
return k;
} 



public static int rectangleperimeter(int somelength, int somewidth){
    return 2* (somelength + somewidth);
}
 

    
    
}
