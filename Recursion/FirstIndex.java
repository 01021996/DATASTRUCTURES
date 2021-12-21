import java.util.Scanner;

public class FirstIndex 
{
    public static void main(String[] args) throws Exception {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int [] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=obj.nextInt();
        }
        int x=obj.nextInt();
        int element=firstIndex(arr, 0, x);
        System.out.println(element);
        
    }

    public static int firstIndex(int[] arr, int idx, int x)
    {
        if(idx==arr.length)
        {
            return -1;
        }
        if(arr[idx]==x)
        {
            return idx;
        }
        else{
          return  firstIndex(arr, idx+1, x);
        }
            
    }
}