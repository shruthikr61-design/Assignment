public class Program_calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=5;
		int choice=3;
		do
		{
			switch(choice)
			{
			case 1: System.out.println("Addition->"+(a+b));break;
			case 2: System.out.println("Sub->"+(a-b));break;
			case 3: System.out.println("Mul->"+(a*b));break;
			case 4: System.out.println("Div->"+(a/b));break;
			case 5: System.out.println("Successfully exited");break;
			}
			choice++;
			
		}while(choice<=5);

	}

}
