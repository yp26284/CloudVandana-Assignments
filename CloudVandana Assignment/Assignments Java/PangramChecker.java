/*Check if the input is pangram or not. (A pangram is a sentence that contains all the
alphabets from A to Z)*/



import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence to check if it's a pangram:");
        
        // Read user input
        String sentence = scanner.nextLine();
        
        if (isPangram(sentence)) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is not a pangram.");
        }
        
        scanner.close();
    }

    public static boolean isPangram(String sentence) {
        sentence = sentence.toLowerCase();
        boolean[] letters = new boolean[26];

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if ('a' <= c && c <= 'z') {
                letters[c - 'a'] = true;
            }
        }

        for (boolean letter : letters) {
            if (!letter) {
                return false;
            }
        }

        return true;
    }
}