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
public class join_methoud extends Thread {
    public void run(){
    for (int i=0;i<=10;i++){
        
            try{
                sleep(1000);
            }
            catch (Exception r){
                r.printStackTrace();
            }
        
        System.out.println("value of i="+i);
        
    }
    
    
    
}
    
}
class ok extends Thread{
    join_methoud j;
    public ok(join_methoud o){
        j=o;
    
    }
    public void run(){
        for ( int k=0;k<=10;k++){
            if (k==5)
            {
                try
                {
                  j.join();  
                }
            catch ( Exception e){
                
                e.printStackTrace();
            }
                
            }
            System.out.println("value of j="+k);
        }
                
            
        }
            
    
}

class m0{
    public static void main(String[] args) {
        join_methoud y=  new join_methoud();
        ok r=new ok(y);
        y.start();
        r.start();
        
        
    }
}