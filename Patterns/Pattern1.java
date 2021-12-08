import java.util.Scanner;

public class Pattern1
 {
public static void main(String[] args)
 {
    // *
    // **
    // ***
    // ****
    // *****
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter size");
    int n=obj.nextInt();
    for(int i=0;i<=n;i++)
    {
        for(int j=0;j<=n;j++)
        {
            if(j<=i)
            System.out.print("*");
            else
            System.out.print(" ");
        }
        System.out.println();
    }  
}    
}
