import java.util.Scanner;
public class FibonaciiSeries {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n1=0,n2=1,n3;
        System.out.println("Enter any number till you want to print fibonacii series");
        int num=sc.nextInt();
        System.out.println(n1);
        System.out.println(n2);
        for(int i=1;i<num;i++)
        {
            n3=n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
        }

    }
}
