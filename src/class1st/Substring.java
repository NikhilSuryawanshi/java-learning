package class1st;

public class Substring {

    public String subString(String str,int start,int end)
    {
        String res="";
        for (int i = start; i <= end ; i++) {
            res+=str.charAt(i);
        }
        return res;
    }



    public static void main(String[] args) {
        Substring s=new Substring();
        String result=s.subString("Nikhilchkhcvhbckc",1,9);
        System.out.println(result);

    }

}
