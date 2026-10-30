public class Program_SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]arr= {12, 45, 7, 89, 34, 89, 56};
		System.out.println("min value:"+Integer.MIN_VALUE);
		
		int largest=Integer.MIN_VALUE;
		int secondlargest=Integer.MIN_VALUE;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]>largest)
			{secondlargest=largest;
			largest=arr[i];
			}
			else if(arr[i]>secondlargest && arr[i]!=largest)
			{
				secondlargest=arr[i];
			}
		}
		System.out.println("Largest:"+largest);
		System.out.println("secondlargest:"+secondlargest);

	}

}
