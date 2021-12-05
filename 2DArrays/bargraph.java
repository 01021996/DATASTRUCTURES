import java.util.Scanner;

public class bargraph 
{
    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);
		int [] arr1= {3,1,0,7,5};
		bar(arr1);
    }

    public static void bar(int[] arr)
	{
		int height=maxElement(arr);
		for (int h=height; h>=1; h--) 
		{
			for (int j = 0; j < arr.length; j++) 
			{
				if(arr[j]>=h)
				{
					System.out.print("*\t");
				}
				else
					System.out.print("\t");
			}
			System.out.println();
		}
		
	}
	
	public static int maxElement(int [] arr) 
	{
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) 
		{
			max=Math.max(max, arr[i]);
		}
		
		return max;
	}
}
