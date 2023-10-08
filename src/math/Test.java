package math;

import error.NegativeNumberNotSupportedException;
import java.util.Scanner;

public class Test {

    Scanner s=new Scanner(System.in);

    int getPositiveNumber() throws NegativeNumberNotSupportedException {
        System.out.print("Enter the number: ");
        int num=s.nextInt();
        if (num<0)
        {
            throw new NegativeNumberNotSupportedException("Negative number not supported");
        }
        return num;
    }

    public static void main(String[] args)  {
        Test tst=new Test();
        try {
            int a =tst.getPositiveNumber();
            System.out.println("Number is :" +a);
        }
        catch (NegativeNumberNotSupportedException e)
        {
            System.out.println("Dont Enter negative number \nError: "+e);
        }

    }


}
