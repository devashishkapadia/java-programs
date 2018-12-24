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

interface name {
    abstract void show();
   
}
interface  abc{
    int x=1;
    
}
interface cde extends abc,name {
    
    int y=2;
}
class R implements cde{

    @Override
    public void show() {
        System.out.println(" value" +x);
    }
    
}
class m9{
    public static void main(String []args){
        R oh=new R();
        oh.show();
    }

}