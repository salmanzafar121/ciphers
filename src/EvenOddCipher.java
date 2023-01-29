public class EvenOddCipher extends BaseCipher {

    public EvenOddCipher() {
        super("EvenOdd");
    }
    public String encrypt(String message) {
        String even = "";
        String odd = "";
        int index = 0;
        for (char c : message.toCharArray()) {
            if (index % 2 == 0) {
                even += c;
            } else {
                odd += c;
            }
            index++;
        }
        return even + odd;
    }

    public String decrypt(String message) {
        String even = "";
        String odd = "";
        for (int i = 0; i < message.length(); i++) {
            if (i < Math.ceil(message.length() / 2.0)) {
                even += message.charAt(i);
            } else {
                odd += message.charAt(i);
            }
        }
        String decrypted = "";
        for (int i = 0; i < message.length(); i++) {
            if (i % 2 == 0) {
                decrypted += even.charAt(i / 2);
            } else {
                decrypted += odd.charAt(i / 2);
            }
        }
        return decrypted;
    }

    public String toString() {
        return "EvenOddCipher";
    }

    public boolean equals(Object o) {
        return o instanceof EvenOddCipher;
    }
}
