/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.io.File;
import java.util.Arrays;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

/**
 *
 * @author rh140
 */
public class pass2 {
    
    public String enco(String originalinput){
        
        Encoder encoder = Base64.getUrlEncoder();
        String encodedUrl = encoder.encodeToString(originalinput.getBytes());
        
        return encodedUrl;
    }
    
    public String deco(String encodedUrl){
        
        Decoder decoder = Base64.getUrlDecoder();
        byte[] bytes = decoder.decode(encodedUrl);
        String name = (new String(bytes));
        
        return name;
    }
    
    public void renamed(){
        File f = new File("E:\\5.SECURE FOLDER\\Encrypted");
        f.mkdir();
        File[] files = f.listFiles();
        if(files.length > 0){
            Arrays.asList(files).forEach(x -> {
            
                File old = new File(x.getAbsolutePath());
                String s =  deco(x.getName());
                File nw = new File(x.getParent()+"\\"+ s );
                old.renameTo(nw);
                /*
                System.out.println(deco(x.getName()));
                if(old.renameTo(nw)){
                    System.out.println(x.getAbsolutePath());
                    
                }
                System.out.println(s);
                */
            
            });
        }
    }
    
    public void renamee(){
        File f = new File("E:\\5.SECURE FOLDER\\Encrypted");
        f.mkdir();
        File[] files = f.listFiles();
        if(files.length > 0){
            Arrays.asList(files).forEach(x -> {
            
                File old = new File(x.getAbsolutePath());
                String s =  enco(x.getName());
                File nw = new File(x.getParent()+"\\"+ s );
                old.renameTo(nw);
                /*
                System.out.println(deco(x.getName()));
                if(old.renameTo(nw)){
                    System.out.println(x.getAbsolutePath());
                    
                }
                System.out.println(s);
                */
            
            });
        }
    }
    
    public static void main(String[] cadet){
        
        /*
        Encoder encoder = Base64.getUrlEncoder();
        String originalinput = "https://stackabuse.com/tag/java/";
        String encodedUrl = encoder.encodeToString(originalinput.getBytes());

        System.out.println(encodedUrl);
        
        
        Decoder decoder = Base64.getUrlDecoder();
        byte[] bytes = decoder.decode(encodedUrl);
        System.out.println(new String(bytes));
        */
        
        pass2 p1 = new pass2();
        //p1.renamed();
        p1.renamee();
        /*
        String a = p1.enco("Oracle SQL Tutorial 11 - CREATE TABLE - YouTube - Copy.mkv");
        System.out.println(a);
        
        String b = p1.deco(a);
        System.out.println(b);
        */
        
    }
       
        
    }
    
