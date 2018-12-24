/*f 3tark du6dy7xfddgbfycydgrfxhthnuntgrthfnkmnyu
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myjava_ex;

import java.util.Scanner;

/**
 *
 * @author devashish kapadia
 */
public class userdefine extends Exception{

    public userdefine() {
        System.out.println("user under age");
    }
    
}
class mm
{
    public static void main(String[] args) {
        int age;
        Scanner s=new Scanner(System.in);
        age=s.nextInt();
        if(age<18)
        {
            try
            {
            throw (new userdefine());
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        }   
    }
}
