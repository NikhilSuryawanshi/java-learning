package math;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Power {


    int power(int num,int power)
    {
        int result=1;
        for (int i = 0; i < power; i++) {
            result*=num;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
//        System.out.print("Enter the Name: ");
//        String name=sc.next();
//        System.out.print("Enter the DOB: ");
//        String dob=sc.next();
//        String finalName="";
//        for (int i = 0; i < 4; i++) {
//            if(i==0)
//            {
//                finalName+=name.charAt(i);
//                finalName=finalName.toUpperCase(Locale.ROOT);
//            }else {
//                finalName+=name.charAt(i);
//            }
//        }
//        String finalyear=dob.split("/")[2];
//
//
//        System.out.println("Password:" + finalName+finalyear);

//
//        System.out.print("Enter the size of array: ");
//        int size=sc.nextInt();
//        int []arr=new int[size];
//        for (int i = 0; i < size; i++) {
//            System.out.print("Enter the value of index "+i+": ");
//            arr[i]= sc.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));








    }

}

