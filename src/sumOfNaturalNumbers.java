import java.util.Scanner;
public class sumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the last number til you want to add");
        int num= sc.nextInt();
        if(num<0)
            System.out.println("Please enter any natural number");
        else {
            for (int i = 1; i <= num; i++) {
                sum = sum + i;
            }
            System.out.println("Sum of natural numbers " + sum);
        }
    }

}
