package day1;

import java.util.Arrays;
import java.util.Scanner;

public class Day1 {
   public static void main(String[] args) {

      Scanner sc=new Scanner(System.in);
      int size=sc.nextInt();

      int[] arr=new int[size];
      for (int i = 0; i < size ; i++) {
         arr[i]=sc.nextInt();
      }

      for (int i = 0; i < size; i++) {
         System.out.println(arr[i]);
      }


   }



}
