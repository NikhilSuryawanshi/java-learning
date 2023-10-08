package class1st;

public class InstanceVariable {
    int a;
    public InstanceVariable()
    {
        this.a=10; // instance variable
    }

    public static void main(String[] args) {
        InstanceVariable i=new InstanceVariable();
        System.out.println(i.a);
    }

}
