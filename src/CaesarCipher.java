public class CaesarCipher extends BaseCipher {
    private int rotation;

    public CaesarCipher(int rotation) {
        super("Caesar");
        this.rotation = rotation;
    }

    public boolean isValid(int rotation) {
        return rotation >= 0 && rotation <= 25;
    }

    public String encrypt(String message) {
        StringBuilder encrypted = new StringBuilder();
        for(char c : message.toCharArray()) {
            if (Character.isLowerCase(c)) {
                c = (char) ('a' + (c - 'a' + rotation) % 26);
            }
            else if (Character.isUpperCase(c)) {
                c = (char) ('A' + (c - 'A' + rotation) % 26);
            }
            encrypted.append(c);
        }
        return encrypted.toString();
    }

    public String decrypt(String message) {
        StringBuilder decrypted = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if (Character.isUpperCase(c)) {
                c = (char) ('A' + (c - 'A' - rotation + 26) % 26);
            } else if (Character.isLowerCase(c)) {
                c = (char) ('a' + (c - 'a' - rotation + 26) % 26);
            }
            decrypted.append(c);
        }
        return decrypted.toString();
    }

    public String toString() {
        return "Caesar(" + rotation + ")";
    }

    public boolean equals(Object o) {
        if (o instanceof CaesarCipher) {
            CaesarCipher other = (CaesarCipher) o;
            return rotation == other.rotation;
        }
        return false;
    }



}
