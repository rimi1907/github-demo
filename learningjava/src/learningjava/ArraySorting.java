package learningjava;


public class ArraySorting {

	public static void main(String[]args)
	{
		int[] Array = new int[] {31,4,41};
		//Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<Array.length;i++)
		{
			int temp= 0;
			for(int j=i+1;j<Array.length;j++)
			{
			
				if (Array[i]<Array[j])
				{
				temp= Array[i];
			Array[i]=Array[j]; 	
			Array[j]=temp;
		}
			}
		
		System.out.println(Array[i]);
}
	}
}