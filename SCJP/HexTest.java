class HexTest 
{
	public static void main (String [] args)
	{
		int x = 0X0001;
		int y = 0x7fffffff;
		int z = 0xDeadCafe;
		System.out.println("x = " + x + " y = " + y + " z = " + z);
		sum();
		sum(1,2);
	}
	public static void sum(int a, int b)
	{
		System.out.println("Two Value");
	}
	public static int sum()
	{
		System.out.println("No value");
		return 0;
	}
}