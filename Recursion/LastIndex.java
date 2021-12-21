import java.util.Scanner;

public class LastIndex {
    public static void main(String[] args) throws Exception {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int [] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=obj.nextInt();
        }
        int x=obj.nextInt();
        int ele=lastIndex(arr, arr.length-1, x);
        System.out.println(ele);
    }

    // public static int lastIndex(int[] arr, int idx, int x){
    //     if(idx==0)
    //     {
    //         return -1;
    //     }
    //     if(arr[idx]==x)
    //     {
    //         return idx;
    //     }
    //     return lastIndex(arr, idx-1, x);

    // }
    
        //top down approach
    public static int lastIndex(int[] arr, int idx, int x){
            if(idx==arr.length)
            {
                return -1;
            }
            int li=lastIndex(arr, idx+1, x);
            if(li==-1)
            {
                if(arr[idx]==x)
                {
                    return idx;
                }
                else{
                    return li;
                }

            }
            else{
                //we got the element
                return li;
            }
    }
}
