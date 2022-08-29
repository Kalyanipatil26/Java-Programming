class series
{
	
	int i,x,y;
	void display()
	{
		for(i=2;i<=8;i++)
		{
			x=i*i*i;
			y=i*i;
			System.out.println(x-y);
		}
	}
}
	class demo
	{
		public static void main(String[]args)
		{
			series s = new series();
			s.display();
		}
	}


	