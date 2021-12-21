import java.util.Scanner;

public class MaxOfArray 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int [] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=obj.nextInt();
        }
        int max=maxOfArray(arr, 0);
        System.out.println(max);
    }

    public static int maxOfArray(int[] arr, int idx)
    {
        if(idx==arr.length-1)
        {
            return arr[idx];
        }
        int recAns=maxOfArray(arr, idx+1);
        int me=arr[idx];
        if(me>recAns)
            return me;
        else
            return recAns;    
        
    }
}
