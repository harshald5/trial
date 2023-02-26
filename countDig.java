import java.util.*;

public class countDig {
    
        public static void main(String args[])
        {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter a digit");
            int N=sc.nextInt();
            int temp = N;
            int count = 0;
            while(N!=0)
            {
                N=N/10;
                ++count;
            }
            System.out.println("Number of digits in "+temp+" are "+count);
        }
}
