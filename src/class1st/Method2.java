package class1st;

public class Method2 {
    public static void main(String[] args) {
        String user="Sanjay is a professional it worker!";

        Methods m=new Methods();
//        System.out.println(m.print(user));
        String cap=m.toUpperCase(user);
        String sub=m.subString(cap,3,16);
        System.out.println(sub);


    }
}
