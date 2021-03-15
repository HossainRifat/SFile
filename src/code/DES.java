
package code;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;



public class DES {
    
    public static void encryptDecrypt(String key, int cipherMode, File in, File out)
    throws InvalidKeyException, NoSuchAlgorithmException, InvalidKeySpecException,
            NoSuchPaddingException, IOException
    {
        FileInputStream fis = new FileInputStream(in);
        FileOutputStream fos = new FileOutputStream(out);
        
        DESKeySpec desKeySpec = new DESKeySpec(key.getBytes());
        
        SecretKeyFactory skf = SecretKeyFactory.getInstance("DES");
        SecretKey secretKey = skf.generateSecret(desKeySpec);
        
        Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
        
        if(cipherMode == Cipher.ENCRYPT_MODE){
            cipher.init(Cipher.ENCRYPT_MODE, secretKey, SecureRandom.getInstance("SHA1PRNG"));
            CipherInputStream cis = new CipherInputStream(fis, cipher);
            Write(cis, fos);
        }
        else if(cipherMode == Cipher.DECRYPT_MODE){
        cipher.init(Cipher.DECRYPT_MODE, secretKey, SecureRandom.getInstance("SHA1PRNG"));
        CipherOutputStream cos = new CipherOutputStream(fos, cipher);
        Write(fis, cos);
    }
    }
    
    public static void Write(InputStream in, OutputStream out) throws IOException{
        byte[] buffer = new byte[64];
        int numOfBytesRead;
        while((numOfBytesRead = in.read(buffer)) != -1){
            out.write(buffer, 0, numOfBytesRead);
        }
        out.close();
        in.close();
    }
    
    
    
    public static void main(String[] ags){
      /*  File plaintext = new File("E:\\USER\\Desktop\\plain\\m.mkv");
        File encrypted = new File("E:\\USER\\Desktop\\encrypted.cadet");
        File dectrypted = new File("E:\\USER\\Desktop\\decrypted");
        
        try{
            encryptDecrypt("cadetrifat", Cipher.ENCRYPT_MODE, plaintext, encrypted);
            //encryptDecrypt("cadetrifat", Cipher.DECRYPT_MODE, encrypted, dectrypted);
           
        }
        catch(InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException
                | NoSuchPaddingException | IOException e){
            
            e.printStackTrace();
        }*/
       System.out.println("ok");
    }
    
}

