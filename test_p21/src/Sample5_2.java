public class Sample5_2 
{
	public static void main(String[] args)
	{
		try
		{
			int[]test;
			test = new int [5];
			
			System.out.println("�N���w��test[10]");
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("�W�L�}�C�d��F");
		}
		System.out.println("���Q�a���槹���F");
	}

}
