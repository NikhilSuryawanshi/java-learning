package class1st;

class Test{
    public  int sum(int a , int b)
    {
        return a+b;
    }

    public String addHello(String txt)
    {
        return "Hello "+txt;
    }

}


public class ReturnStatement {
    public static void main(String[] args) {
        Test t=new Test();
        int result = t.sum(20,30);

        System.out.println(t.addHello("Nikhil"));

    }
}
