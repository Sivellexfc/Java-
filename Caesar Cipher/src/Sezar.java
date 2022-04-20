public class Sezar {
    
    private static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static String newAlphabet;
    

    public static String Encrypted(String word , int key) {  
        
        char temp;
        String newWord = "";

        word = word.toUpperCase();

        newAlphabet = alphabet.substring(key,alphabet.length()) + alphabet.substring(0,key);

        for (int i = 0; i < word.length(); i++) {
            temp = word.charAt(i);
            newWord = newWord + newAlphabet.charAt(alphabet.indexOf(temp));
        }

        System.out.println(newAlphabet);
        return newWord;
    }


}
