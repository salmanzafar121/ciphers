public class EncryptUtils {


    public static String[] encryptMany(BaseCipher cipher, String[] messages) { // encrypts an array of messages
        String[] encrypted = new String[messages.length];    // create an array to store the encrypted messages
        for (int i = 0; i < messages.length; i++) {  // for each message in the array
            encrypted[i] = cipher.encrypt(messages[i]); // encrypt the message
        }
        return encrypted;   // return the array of encrypted messages
    }

    public static String[] decryptMany(BaseCipher cipher, String[] messages) {  // decrypts an array of messages
        String[] decrypted = new String[messages.length];   //  create an array to store the decrypted messages
        for (int i = 0; i < messages.length; i++) {  // for each message in the array
            decrypted[i] = cipher.decrypt(messages[i]);  // decrypt the message
        }
        return decrypted; // return the array of decrypted messages
    }


}
