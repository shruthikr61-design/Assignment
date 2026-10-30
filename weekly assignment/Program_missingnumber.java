public class Program_missingnumber {
	
		   public static void main(String[] args) {
		       int[] arr = {1, 2, 3, 5, 6};
		       int n = arr.length + 1; // Total numbers including the missing one
		       int totalSum = n * (n + 1) / 2; // Sum of first n natural numbers
		       int arraySum = 0;
		       for (int num : arr) {
		           arraySum += num;
		       }
		       int missingNumber = totalSum - arraySum;
		       System.out.println("Missing Number is: " + missingNumber);
		   }
		}
