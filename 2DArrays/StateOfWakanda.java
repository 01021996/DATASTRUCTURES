import java.util.Scanner;

public class StateOfWakanda 
{
    public static void main(String[] args)
     {
        Scanner obj=new Scanner(System.in);
		System.out.println("enter");
		int n=obj.nextInt();
		int m=obj.nextInt();
		int arr[][]=new int[n][m];
		for (int i = 0; i<n; i++) 
		{
			for (int j = 0; j <m; j++) 
			{
				arr[i][j]=obj.nextInt();
			}	
		}

		for (int j = 0; j <m; j++)
		{
			if(j%2==0)
			{
				for (int i = 0; i < n; i++)
				{
					System.out.println(arr[i][j]);
				}

			}
			else
			{
				for (int i = n-1; i >=0; i--)
				{
					System.out.println(arr[i][j]);
				}
				
			}
		}

    }
}
