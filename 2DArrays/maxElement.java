import java.util.Scanner;

public class maxElement 
{
    static Scanner obj=new Scanner(System.in);
    public static void main(String[] args)
     {
        
        int n = obj.nextInt();     
		int [] arr1=new int[n];
		TakeInput(arr1);
		Printarray(arr1);
        maxElement(arr1);
    }

    public static void maxElement(int [] arr) 
	{
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) 
		{
			max=Math.max(max, arr[i]);
		}
		System.out.println(max);
	}

    public static void TakeInput(int [] arr)
	{
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=obj.nextInt();
		}
	}
	
	public static void Printarray(int [] arr)
	{
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i]+" ");
		}
	}
}
