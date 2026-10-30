public class Program_EvenOddNumber {
		    public static void main(String[] args) {
		        int limit = 20;
		       

		        // Print even numbers
		        System.out.print("Even numbers: ");
		        for (int i = 1; i <= limit; i++) {
		            if (i % 2 == 0) {
		                System.out.print(i + " ");
		            }
		        }
		        System.out.println();

		        // Print odd numbers
		        System.out.print("Odd numbers: ");
		        for (int i = 1; i <= limit; i++) {
		            if (i % 2 != 0) {
		                System.out.print(i + " ");
		            }
		        }
		        System.out.println();
		    }
		


	}


