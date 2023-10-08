package Constructor;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Impl {
    public static void main(String[] args) {
//        Student s=new Student(1,"Nikhil","xyz","5436356356");
//
////        s.setId(1);
////        s.setName("Jhon");
////        s.setSurname("Wills");
////        s.setMob("54554645665");
//        Student s1=new Student(2,"Piyush","45436363");
//        Student s2=new Student(3,"Divyani","M","4356346636");
//        System.out.println(s);
//        System.out.println(s1);
//        System.out.println(s2);
        System.out.print("Enter size: ");
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        Student[] arr=new Student[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter id: ");
            int id=scan.nextInt();
            System.out.print("Enter name: ");
            String name =scan.next();
            System.out.print("Enter surname: ");
            String surname=scan.next();
            System.out.print("Enter mob: ");
            String phone=scan.next();
            arr[i]=new Student(id,name,surname,phone);
        }

        for (Student s :arr ) {
            System.out.println(s);
        }






    }
}
