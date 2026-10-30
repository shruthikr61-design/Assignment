public class Program_MoveallZeroEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={0, 5, 0, 3, 8, 0, 2, 9};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if (arr[i]==0)
				{
					if(arr[j]!=0)
					{
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
						break;
					}
					else
						j++;
				}
				
			}
		}
				for(int i=0;i<arr.length;i++)
					System.out.print(arr[i]+" ");
			

	}
	}


		
		
		
		
