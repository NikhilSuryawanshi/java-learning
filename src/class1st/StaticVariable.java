package class1st;

public class StaticVariable {
    static int a=20;


    static  {
        a=30;
        System.out.println("Static block");
    }




    public static void main(String[] args) {
        System.out.println(a);
        System.out.println("main block");

    }
}
