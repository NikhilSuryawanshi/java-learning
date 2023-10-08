package math;

import java.util.Scanner;

public class Sum {

    public static int sum(int a,int b)
    {
        return a+b;
    }
    public static int sum(int a,int b,int c)
    {
        return a+b+c;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number");
        int firstno=sc.nextInt();

        System.out.print("Enter Second number");
        int secondno=sc.nextInt();

        int result=sum(firstno,secondno);
        System.out.println(result);


    }
}
