public class SuperCipher extends BaseCipher {

    private BaseCipher[] cipherArray;
    public SuperCipher(BaseCipher[] cipherArray) {
        super("SuperCipher");
        this.cipherArray = cipherArray;
    }

    public boolean isValid(){
        for (BaseCipher cipher : cipherArray) {
            if (!cipher.isValid()) {
                return false;
            }
        }
        return true;
    }

    // encrypts the message by encrypting it with each cipher in the array
    // and then returning the final encrypted result
    public String encrypt(String message) {
        String encrypted = message;
        for (BaseCipher cipher : cipherArray) { // for each cipher in the array
            encrypted = cipher.encrypt(encrypted); //encrypt the message
        }
        return encrypted;
    }

    // Decrypts the message by decrypting it with each cipher in the array
    // and then returning the final decrypted result
    public String decrypt(String message) {
        String decrypted = message;
        for (BaseCipher cipher : cipherArray) { // for each cipher in the array
            decrypted = cipher.decrypt(decrypted); // decrypt the message
        }
        return decrypted;
    }

    // returns a string representation of the cipher
    public String toString() {
        String result = "SuperCipher(";
        for (int i = 0; i < cipherArray.length; i++) {
            result += cipherArray[i].toString();
            if (i < cipherArray.length - 1) {
                result += " | ";
            }
        }
        result += ")";

        return result;
    }

    // returns true if the other object is a SuperCipher with the same attributes
    public boolean equals(Object other) {
        if (other instanceof SuperCipher) {
            SuperCipher otherSuperCipher = (SuperCipher) other;
            // check if the two arrays are the same length
            if (cipherArray.length != otherSuperCipher.cipherArray.length) {
                return false;
            }
            // check if each cipher in the array is equal to the other
            for (int i = 0; i < cipherArray.length; i++) {
                if (!cipherArray[i].equals(otherSuperCipher.cipherArray[i])) {
                    return false;
                }
            }
            return true;
        }
        else {
            return false;
        }
    }

}
