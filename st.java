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
public class st {
    public static void main(String[] args) {
        String s="HELLO DEV ";
        String s2="in java";
        String ss=s.toLowerCase();
        String sk=s.toUpperCase();
        String cn=s.replace("HELLO","hi");
        String tr=s.trim();
        char ch=s.charAt(6);
        int l=s.length();
        System.out.println(ss);
        System.out.println(sk);
        System.out.println(cn);
        System.out.println(tr);
        System.out.println(l);
        System.out.println(ch);
        System.out.println(s.concat(s2));

    }
}
