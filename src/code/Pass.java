/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

/**
 *
 * @author ASUS
 */
public class Pass {
    
    public static String setPass(String pass){
        String s = "";
        for(int i=0;i<pass.length();i++){
            long a = pass.charAt(i);
            s = s + pass.charAt(i) + pass.charAt(pass.length()-i-1) + (a+100);
        }
        return s;
    }
    
    public static String getPass(String pass){
        char[] c = new char[pass.length()];
        String s = "";
        for(int i=0;i<pass.length();i=i+5){
            s = s + pass.charAt(i);
        }
        return s;
    }
    
    public static void main(String[] rifat){
        Pass p1 = new Pass();
        System.out.println(p1.setPass("11111111"));
        System.out.println(p1.getPass(p1.setPass("11111111")));
    }
}
