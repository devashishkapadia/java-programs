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
public class sorting_method {
    public static void main (String[] args){
        int a[]={67,78,97,34,22};
        int temp=a.length;
        for (int i=0;i<a.length;i++){
              System.out.print(a[i] + " " );
        }

    System.out.println();

        
          for (int i=0;i<a.length;i++){    
              for (int j=i+1;j<a.length;j++){
               
             if ( a[i]>a[j]){
                 temp= a[i];
                 a[i]=a[j];
                 a[j]=temp;
              
             }
             
         }
            
                          
                 }
           System.out.print(" the assending order ");
          for (int i=0;i<a.length;i++){
             
              System.out.print(a[i] + " " );
        }

    System.out.println();
    
    int sum=0;
    for (int i=0;i<a.length;i++){
    
        
        sum=sum+a[i];
        
       
    }
     System.out.print(" sum "+ sum + " " );
    
     for (int i=0;i<a.length;i++){
         if (a[i]>temp)
             temp=a[i];
       
     }
      
               
    System.out.println("Largest Number is : " + temp);
    
 }
}
    
    


    

    

