public class Program2_duplicatearr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,10,20,40,10,40,60,60,50,80,80};
		int duplicate[]=new int[arr.length];
		int index=0;
		int check=0;
		for(int i=0;i<arr.length-1;i++)
		{
			for (int j=i+1;j<arr.length;j++)
			{
				if(arr[j]==arr[i])
				{
					for(int k=0;k<duplicate.length;k++)
					{
						if(duplicate[k]==arr[i])
						{
							check=1;
							break;
						}
					}
					if(check==0)
					{
						duplicate[index]=arr[i];
						
						index++;;
						
					}
					check=0;
				}
			}
		}
		System.out.print("Even:");
		for(int i=0;i<duplicate.length;i++)
		{
			if(duplicate[i]!=0)
				System.out.print(duplicate[i]+" ");
		}
		
		

	}

}
