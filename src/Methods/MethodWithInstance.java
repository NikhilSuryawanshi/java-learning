package Methods;

public class MethodWithInstance {
    public void printHello()
    {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        MethodWithInstance m=new MethodWithInstance();
        m.printHello();

    }

}
