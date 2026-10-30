public class Program_separatepostiveandneg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,-8,0,1,2,-1,-2,0};
		int sorted=0;
		while((sorted!=arr.length-1))
		{
		
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>0  && sorted==i)
			{
			}
			else if(!(arr[i]>0))
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if((arr[j]>0))
					{
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
						sorted=i;
						break;
						
					}
				}
			}
			else if((arr[i]<0)&& sorted==i)
			{
			}
			else if(arr[i]==0)
			{
			
					for(int j=i;j<=arr.length;j++)
					{
						if((arr[j]<0))
						{
							int temp=arr[i];
							arr[i]=arr[j];
							arr[j]=temp;
							sorted=i;
							break;
					}
					}
			}
			sorted=i;
		}
		}
		for(int i=0;i<=arr.length-1;i++)
		System.out.print(arr[i]+" " );
		
	}

}
