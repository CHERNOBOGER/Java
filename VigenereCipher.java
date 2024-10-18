public class VigenereCipher {
    public static String encrypt(String text, String key){
        StringBuilder encryptedText = new StringBuilder();
        int i=0;
        char[] keyCharArray = key.toCharArray();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                i %= keyCharArray.length;
                int index = (c - base + keyCharArray[i]) % 26;
                encryptedText.append((char) (base + index));
            } else {
                encryptedText.append(c);
            }
            i+=1;
        }
        return encryptedText.toString();
    }
    public static String decrypt(String text, String key) {
        StringBuilder encryptedText = new StringBuilder();
        int i=0;
        char[] keyCharArray = key.toCharArray();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                i %= keyCharArray.length;
                int index = (c + base - keyCharArray[i]) % 26;
                encryptedText.append((char) (base + index));
            } else {
                encryptedText.append(c);
            }
            i+=1;
        }
        return encryptedText.toString();
    }
    public static void main(String[] args) {
        System.out.println(encrypt("HELLO WORLD", "KEY"));
        System.out.println(decrypt(encrypt("HELLO WORLD", "KEY"),"KEY"));
    }

}