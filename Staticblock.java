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
public class Staticblock {
    static{
        System.out.println("i am in static");
    }
    Staticblock(){
        System.out.println("I am in constructor");
    
}
}
class th{
    public static void main (String[] args){
    Staticblock r=new Staticblock();
    Staticblock e=new Staticblock();

}}