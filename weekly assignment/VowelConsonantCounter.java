import java.util.Scanner;
	public class VowelConsonantCounter {
	   public static void main(String[] args) {
	       Scanner scanner = new Scanner(System.in);
	       // Input String
	       System.out.print("Enter a string: ");
	       String input = scanner.nextLine().toLowerCase();
	       int vowels = 0, consonants = 0;
	       // Iterate through each character
	       for (int i = 0; i < input.length(); i++) {
	           char c = input.charAt(i);
	           // Check if character is a vowel
	           if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
	               vowels++;
	           }
	           // Check if character is a consonant
	           else if (c >= 'a' && c <= 'z') {
	               consonants++;
	           }
	       }
	       // Output results
	       System.out.println("Vowels: " + vowels);
	       System.out.println("Consonants: " + consonants);
	   }
	}


