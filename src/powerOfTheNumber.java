import java.util.Scanner;

public class powerOfTheNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of the base number");
        int base= sc.nextInt();
        System.out.println("Enter an exponent");
        int exp= sc.nextInt();
        int expp=exp;
        int res=1;
        while(exp!=0)
        {
            res=res*base;
            --exp;
        }
        System.out.println("The power of "+base+ " to "+expp+" = "+res);
    }
}
