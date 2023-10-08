package class1st;

import java.util.Locale;
import java.util.Scanner;

public class Methods
{

    public String print(String a)
    {
        return "Hello Dear, "+a+"\nWelcome to our Application!!";
    }

    public String toUpperCase(String str)
    {
        return str.toUpperCase(Locale.ROOT);
    }
    public String subString(String str,int start,int end)
    {
        return str.substring(start,end);
    }

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.print("Enter user name: ");
        String name=s.next();
        Methods m=new Methods();
        System.out.println(m.print(name));
    }
}
