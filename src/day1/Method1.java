package day1;
import math.Sum;
public class Method1 {

    public void print(String txt)
    {
        System.out.println(txt);
    }


    public static void main(String[] args) {
        Sum s=new Sum();
        System.out.println(s.sum(5,6,4));

        Method1 m=new Method1();
        m.print("My name is nikhil");
    }


}
