package class1st;

public class DatatypeRangeFind {
    public static void main(String[] args) {
        byte b =0;
        byte max;
        byte min;
        while (true)
        {
            max=b;
            b=(byte) (b+1);
            if (b<0)
            {
                break;
            }
        }
        System.out.println("Max range is : "+max);
        b=0;
        while (true)
        {
            min=b;
            b=(byte) (b-1);
            if (b>0)
            {
                break;
            }
        }
        System.out.println("Min range is : "+min);
    }
}
