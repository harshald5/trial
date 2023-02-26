public import java.util.*;
class swap2{
    public static void main(String[] args)
    {
        int x,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
         x = sc.nextInt();
         System.out.println("Enter Second number");
         y = sc.nextInt();
         x = x + y;
         y = x - y;
         x = x - y;
         System.out.println("After swapping:"
                            + " x = " + x + ", y = " + y);
        //  int c = a;
        //  a=b;
        //  b=c;
        // if(a<b)
        // {
        //     b=b-a;
        //     a=b+a;
        //     System.out.println("Numbers after swapping are "+a+" & "+b);
        // }
        // else
        // {
        //     a=a-b;
        //     b=a+b;
        //     System.out.println("Numbers after swapping are "+a+" & "+b);
        // }
        

    }
} 
