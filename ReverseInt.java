import java.util.*;
public class ReverseInt {
   public static void main(String[]args)
   {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int a = sc.nextInt();
    // int rev=0;
    // while(a>0)
    // {
    //     // int t = a%10;
    //     // System.out.print(t);
    //     // a=a/10;
    //     rev = rev*10+a%10;
    //     a=a/10;
    
    // }
    StringBuffer sb = new StringBuffer(String.valueOf(a));
    StringBuffer rev = sb.reverse();
    System.out.println("Reversed number is "+rev);
   } 
}
