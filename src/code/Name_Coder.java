/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.io.File;
import java.util.Arrays;

/**
 *
 * @author rh140
 */
public class Name_Coder {
    
    public String enco(String name2){
        //System.out.println(name);
        
        String[] srname = name2.split("[.]");
        String name = srname[0];
        
        char ch[] = new char[name.length()];
        char chx[] = new char[name.length()];
        int chn[] = new int[name.length()];
        String codename = "";
        
        for(int i=0;i<name.length();i++){
            chx[i] = name.charAt(i);
            ch[i] = Character.toLowerCase(chx[i]);
        }
        
        for(int i=0;i<name.length();i++){
            
            if(ch[i] == ('a')){
                chn[i] = 10;
            }
            
            else if(ch[i] == ('b')){
                chn[i] = 11;
            }
            
            else if(ch[i] == ('c')){
                chn[i] = 12;
            }
            
            else if(ch[i] == ('d')){
                chn[i] = 13;
            }
            
            else if(ch[i] == ('e')){
                chn[i] = 14;
            }
            
            else if(ch[i] == ('f')){
                chn[i] = 15;
            }
            
            else if(ch[i] == ('g')){
                chn[i] = 16;
            }
            
            else if(ch[i] == ('h')){
                chn[i] = 17;
            }
            
            else if(ch[i] == ('i')){
                chn[i] = 18;
            }
            
            else if(ch[i] == ('j')){
                chn[i] = 19;
            }
            
            else if(ch[i] == ('k')){
                chn[i] = 20;
            }
            
            else if(ch[i] == ('l')){
                chn[i] = 21;
            }
            
            else if(ch[i] == ('m')){
                chn[i] = 22;
            }
            
            else if(ch[i] == ('n')){
                chn[i] = 23;
            }
            
            else if(ch[i] == ('o')){
                chn[i] = 24;
            }
            
            else if(ch[i] == ('p')){
                chn[i] = 25;
            }
            
            else if(ch[i] == ('q')){
                chn[i] = 26;
            }
            
            else if(ch[i] == ('r')){
                chn[i] = 27;
            }
            
            else if(ch[i] == ('s')){
                chn[i] = 28;
            }
            
            else if(ch[i] == ('t')){
                chn[i] = 29;
            }
            
            else if(ch[i] == ('u')){
                chn[i] = 30;
            }
            
            else if(ch[i] == ('v')){
                chn[i] = 31;
            }
            
            else if(ch[i] == ('w')){
                chn[i] = 32;
            }
            
            else if(ch[i] == ('x')){
                chn[i] = 33;
            }
            
            else if(ch[i] == ('y')){
                chn[i] = 34;
            }
            
            else if(ch[i] == ('z')){
                chn[i] = 35;
            }
            
            else if(ch[i] == ('0')){
                chn[i] = 36;
            }
            
            else if(ch[i] == ('1')){
                chn[i] = 37;
            }
            
            else if(ch[i] == ('2')){
                chn[i] = 38;
            }
            
            else if(ch[i] == ('3')){
                chn[i] = 39;
            }
            
            else if(ch[i] == ('4')){
                chn[i] = 40;
            }
            
            else if(ch[i] == ('5')){
                chn[i] = 41;
            }
            
            else if(ch[i] == ('6')){
                chn[i] = 42;
            }
            
            else if(ch[i] == ('7')){
                chn[i] = 43;
            }
            
            else if(ch[i] == ('8')){
                chn[i] = 44;
            }
            
            else if(ch[i] == ('9')){
                chn[i] = 45;
            }
            
            else if(ch[i] == (' ')){
                chn[i] = 46;
            }
  
        }
        
        for(int c : chn){
            //System.out.print(c);
            codename = codename + c;
        }
        
        
        codename = codename + "." + srname[1];
        return codename;
    }
    
    public String deco(String name2){
        
        String[] srname = name2.split("[.]");
        String name = srname[0];
        
        String namey[] = new String[name.length()/2];
        char namex[] = new char[name.length()/2];
        String namef = "";
        
        for(int i=0;i<=(name.length())-2;i=i+2){
            namey[i/2] = Character.toString(name.charAt(i)) + Character.toString(name.charAt(i+1));
            
            //System.out.println(namey[i]);
        }
        
        for(int i=0;i<namey.length;i++){
            //System.out.print(namey[i]);
            
            if(namey[i].equals("10")){
                namex[i] = 'a';
            }
            
            else if(namey[i].equals("11")){
                namex[i] = 'b';
            }
            
            else if(namey[i].equals("12")){
                namex[i] = 'c';
            }
            
            else if(namey[i].equals("13")){
                namex[i] = 'd';
            }
            
            else if(namey[i].equals("14")){
                namex[i] = 'e';
            }
            
            else if(namey[i].equals("15")){
                namex[i] = 'f';
            }
            
            else if(namey[i].equals("16")){
                namex[i] = 'g';
            }
            
            else if(namey[i].equals("17")){
                namex[i] = 'h';
            }
            
            else if(namey[i].equals("18")){
                namex[i] = 'i';
            }
            
            else if(namey[i].equals("19")){
                namex[i] = 'j';
            }
            
            else if(namey[i].equals("20")){
                namex[i] = 'k';
            }
            
            else if(namey[i].equals("21")){
                namex[i] = 'l';
            }
            
            else if(namey[i].equals("22")){
                namex[i] = 'm';
            }
            
            else if(namey[i].equals("23")){
                namex[i] = 'n';
            }
            
            else if(namey[i].equals("24")){
                namex[i] = 'o';
            }
            
            else if(namey[i].equals("25")){
                namex[i] = 'p';
            }
            
            else if(namey[i].equals("26")){
                namex[i] = 'q';
            }
            
            else if(namey[i].equals("27")){
                namex[i] = 'r';
            }
            
            else if(namey[i].equals("28")){
                namex[i] = 's';
            }
            
            else if(namey[i].equals("29")){
                namex[i] = 't';
            }
            
            else if(namey[i].equals("30")){
                namex[i] = 'u';
            }
            
            else if(namey[i].equals("31")){
                namex[i] = 'v';
            }
            
            else if(namey[i].equals("32")){
                namex[i] = 'w';
            }
            
            else if(namey[i].equals("33")){
                namex[i] = 'x';
            }
            
            else if(namey[i].equals("34")){
                namex[i] = 'y';
            }
            
            else if(namey[i].equals("35")){
                namex[i] = 'z';
            }
            
            else if(namey[i].equals("36")){
                namex[i] = '0';
            }
            
            else if(namey[i].equals("37")){
                namex[i] = '1';
            }
            
            else if(namey[i].equals("38")){
                namex[i] = '2';
            }
            
            else if(namey[i].equals("39")){
                namex[i] = '3';
            }
            
            else if(namey[i].equals("40")){
                namex[i] = '4';
            }
            
            else if(namey[i].equals("41")){
                namex[i] = '5';
            }
            
            else if(namey[i].equals("42")){
                namex[i] = '6';
            }
            
            else if(namey[i].equals("43")){
                namex[i] = '7';
            }
            
            else if(namey[i].equals("44")){
                namex[i] = '8';
            }
            
            else if(namey[i].equals("45")){
                namex[i] = '9';
            }
            
            else if(namey[i].equals("46")){
                namex[i] = ' ';
            }
            
            
        }
   
        for(char c : namex){
            namef = namef + c;
        }
        
        namef = namef+"."+srname[1];
        return namef;
    }
    
    private String splt(String name){
        
        String[] srname = name.split("[.]");
        return srname[0];
    }
    
        public void rename(){
        File f = new File("E:\\5.SECURE FOLDER\\Encrypted");
        f.mkdir();
        File[] files = f.listFiles();
        if(files.length > 0){
            Arrays.asList(files).forEach(x -> {
            
                File old = new File(x.getAbsolutePath());
                String s =  deco(x.getName());
                File nw = new File(x.getParent()+"\\"+ s );
                System.out.println(deco(x.getName()));
                /*if(old.renameTo(nw)){
                    System.out.println(x.getAbsolutePath());
                    
                }*/
                System.out.println(x.getName());
            
            });
        }
    }
    
    
    public static void main(String[] cadet){
        
        Name_Coder r1 = new Name_Coder();
        //String c = r1.enco("cadetRifat09 183754.txt");
        //System.out.println("\n\n"+c);
        r1.rename();
        //System.out.println(r1.deco("3210191017462930224617244615302121463118131424462824231646046171029144628292427344639462824231628460463510271414234620171023046201027102346281823161746162724311427460462902814271814284604634243029301114.txt"));
    }
    
}
