/*
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
public class testExample {

    int a, b, c;
int k,l;
    testExample() {
         Scanner input = new Scanner(System.in);
        System.out.println(" Please enter the number/Numbers");
        a = input.nextInt();
        b = input.nextInt();
  
    
  }

    void testexam() {

        c = a + b;
        System.out.print(c);

    }

    void example() {
        c = a / b;
        System.out.print(c);
    }

    void texample() {
        c = a * b;
        System.out.print(c);
    }

}

class tmain {

    public static void main(String[] args) {
     testExample t=new testExample();
     Scanner sc=new Scanner(System.in);
    System.out.println("enter your choice");
    int choice=sc.nextInt();
    if(choice==1)
    {
        t.example();
        
    }
    else if(choice==2)
            {
           t.testexam();     
            }
    
    else if (choice==3)
    {
        t.texample();
                
    }
    else
    {
        System.out.println("you entered wrong choice");
    }
    }
}
