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
public class thrd extends Thread{
    String name[]={"G","U","R","J","A","N","T"};
    int l=name.length;
    public void run()
    {
        for(int i=0;i<l;i++)
        {
            try
            {
              sleep(500);  
            }catch(Exception e)
            {
                
            }
            
            System.out.print(name[i]);
        }
    }
    
}
class scnd extends Thread
{
  public void run()
    {
        for(int i=0;i<=10;i++)
        {
            try
            {
              //sleep(1000);  
            }catch(Exception e)
            {
                
            }
            
            System.out.println("value of j ="+i);
        }
    }   
}
class trd extends Thread
{
     public void run()
    {
        for(int i=0;i<=10;i++)
        {
            System.out.println("value of k ="+i);
        }
    }
}
class man
{
    public static void main(String[] args) {
        thrd th=new thrd();
        scnd sc=new scnd();
        trd td=new trd();
       td.start();
        sc.start();
         th.start();
        
    }
}