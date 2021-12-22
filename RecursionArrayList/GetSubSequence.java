    import java.util.ArrayList;
    import java.util.Scanner;

    public class GetSubSequence
    {
        public static void main(String[] args) throws Exception
        {
            Scanner obj=new Scanner(System.in);
            String s=obj.next();
            ArrayList<String> ans=gss(s);
            System.out.println(ans);
        }

        public static ArrayList<String> gss(String str)
        {
            if(str.length()==0)
            {
                ArrayList<String> base=new ArrayList<>();
                base.add("");
                return base;
            }

            char c=str.charAt(0);   //first character
            String ros=str.substring(1);   //remaining character

            ArrayList<String> recAns=gss(ros);
            ArrayList<String> myAns= new ArrayList<>();

            //without adding the variable
            for (String ele : recAns) {
                myAns.add(ele);
            }

                //with adding the variable
            for (String ele : recAns) {
                myAns.add(c+ele);
            }
            return myAns;
        }
    }
