import java.util.*;

public class RevRecursion{
    public static void rev(int N)
    {
        if(N<10)
        System.out.println(N);
        else
        {
            System.out.print(N%10);
            rev(N/10);
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int N=sc.nextInt();
        rev(N);
    }
}