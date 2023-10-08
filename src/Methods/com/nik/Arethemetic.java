package Methods.com.nik;

import java.util.Scanner;

public class Arethemetic {

    public int solveEq(String eq)
    {
        int ans=0;
        int tmp=0;
        for (int i = 0; i < eq.length(); i++) {
            char ch=eq.charAt(i);
            if (ch=='+'||ch=='-'||ch=='*'||ch=='/')
            {
                switch (ch)
                {
                    case '+':
                    {
                        ans+=tmp;
                        break;
                    }
                    case '-':
                    {
                        ans-=tmp;
                        break;
                    }
                    case '*':
                    {
                        ans*=tmp;
                        break;
                    }
                    case '/':
                    {
                        ans/=tmp;
                        break;
                    }
                }

                tmp=0;
            }
            else
            {
                tmp=tmp*10+Integer.parseInt(""+ch);
            }
        }

        return ans;
    }




    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String eq="21+3+5-4*2";
        Arethemetic ar=new Arethemetic();
        System.out.println(ar.solveEq(eq));
    }

}
