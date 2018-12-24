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
public class a {
     a(int k)
    {
        System.out.println("i am in base constructor");
    }
     void show()
     {
       
         System.out.println("myjava_ex.a.show()");
     }
}
class b extends a{
    b(int l, int h)
    {
        super(l);
        System.out.println("i am in derived constructor");
    }
    void show()
    {
        super.show();
        System.out.println("base cklass");
    }
    
}
class mn
{
    public static void main(String[] args) {
        b ob=new b(23,67);
        ob.show();
    }
}