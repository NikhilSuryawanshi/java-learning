package math;

import java.util.Scanner;

public class Charcount {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        String str=s.next();
        int uppercase=0;
        int lowercase=0;
        int numbers=0;
        int specialchar=0;

        for (int i = 0; i <str.length();i++) {
            int tmp=(int)str.charAt(i);
            if (47<tmp && tmp<58)
            {
                numbers++;
            }
            else if (65<=tmp && tmp<=90)
            {
                uppercase++;
            }else if (97<=tmp && tmp<=122)
            {
                lowercase++;
            }
            else
            {
                specialchar++;
            }
        }
        System.out.println("Upper case : "+uppercase);
        System.out.println("lowercase : "+lowercase);
        System.out.println("number : "+numbers);
        System.out.println("special char: "+specialchar);

    }
}
// special char 33 - 47    58 - 64
// numbers 48  - 57
// A-Z     65-90
//a-z      97 - 122
