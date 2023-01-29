public class WordReplacementCipher extends BaseCipher {
    private String toBeReplaced;  // the word to be replaced
    private String replacedBy;  // the word to replace with

    public WordReplacementCipher(String toReplace, String replacement) {
        super("WordReplacement");
        this.toBeReplaced = toReplace;
        this.replacedBy = replacement;
    }
    // encrypts and returns the encrypted message
    public String encrypt(String message) {
        return message.replace(toBeReplaced, replacedBy);
    }

    // decrypts and returns the decrypted message
    public String decrypt(String message) {
        return message.replace(replacedBy, toBeReplaced);
    }

    // returns a string representation of the cipher
    public String toString() {
        return "WordReplacement(" + toBeReplaced + ", " + replacedBy + ")";
    }

    public boolean equals(Object o) {
        if (o instanceof WordReplacementCipher) {
            WordReplacementCipher other = (WordReplacementCipher) o;
            return toBeReplaced.equals(other.toBeReplaced) && replacedBy.equals(other.replacedBy);
        }
        return false;
    }

}
