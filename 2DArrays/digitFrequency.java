import java.util.Scanner;

public class digitFrequency
{
    public static void main(String[] args)
    {
        System.out.println("enter ");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
    }

    public static int getDigitFrequency(int n, int d)
	{
		int count=0;
		while(n!=0)
		{
			int rem=n%10;
			if(rem==d)
                 count++;
			n=n/10;
		}
        
		return count;
    }
}
