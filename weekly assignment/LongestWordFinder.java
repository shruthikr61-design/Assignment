import java.util.Scanner;
public class LongestWordFinder {
   public static void main(String[] args) {
       // Input sentence from user
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter a sentence:");
       String sentence = scanner.nextLine();
       // Split the sentence into words
       String[] words = sentence.split(" ");
       String longestWord = "";
       // Find the longest word
       for (String word : words) {
           if (word.length() > longestWord.length()) {
               longestWord = word;
           }
       }
       // Output the result
       System.out.println("The longest word is: " + longestWord);
   }
}