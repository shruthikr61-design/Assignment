public class Assignment_ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=12345;
		int Reversenum=0;
		
		for (; num != 0; num = num / 10) {
            int digit = num % 10;
            Reversenum = Reversenum * 10 + digit;
        }

        System.out.println("Reversed number: " + Reversenum);


	}

}