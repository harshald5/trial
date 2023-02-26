import java.util.*;
public class Palindrome {
    public static void main(String args[])
    {
        int N;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        N= sc.nextInt();
        int rev=0;
        int temp=N;
        while(N>0)
        {
            rev = rev*10+N%10;
            N=N/10;
        }
        System.out.println(rev);
        if(temp==rev)
        {
        System.out.println("It is palindrome");
        }
        else{
        System.out.println("It is not palindrome");
        }
    }
}
