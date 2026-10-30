public class Program7_Magicnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int  num=172;
		int sum=0;
		
		for(;num>9;)
		{
			for(;num>0;)
			{
				int lastdigit=num%10;
				sum=sum+lastdigit;
				num=num/10;
			}
			num=sum;
			sum=0;
		}
		System.out.println("Final value of num:"+num);
		if(num==1);
	}

}
