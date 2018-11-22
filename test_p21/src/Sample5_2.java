public class Sample5_2 
{
	public static void main(String[] args)
	{
		try
		{
			int[]test;
			test = new int [5];
			
			System.out.println("將指定給test[10]");
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("超過陣列範圍了");
		}
		System.out.println("順利地執行完畢了");
	}

}
