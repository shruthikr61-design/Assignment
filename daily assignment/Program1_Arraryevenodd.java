public class Program1_Arraryevenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {11, 24, 35, 42, 56, 67, 80, 93};
		int evencount=0;
		int oddcount=0;
		for (int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]%2==0)
				evencount++;
			else
				oddcount++;
			
		}

		System.out.println("Even:"+evencount);
		System.out.println("odd:"+oddcount);
	}

}
