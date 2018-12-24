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
public class thrws {
    
    void cal(int a,int b)
            throws Exception
    {
       int c= a/b;
        System.out.println(c);
    }
}
class m
{
    public static void main(String[] args) {
        thrws t=new thrws();
        try
        {
        t.cal(5, 0);
        }catch(Exception v)
        {
            System.out.println("number will not divide by 0");
            v.printStackTrace();
        }
    }
}
