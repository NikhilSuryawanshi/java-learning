package Methods;

public class Math {

    public float average(float a,float b)
    {
        float res=(a+b)/2;
        return res;
    }
    public float average(float a,float b,float c)
    {
        float res=(a+b+c)/3;
        return res;
    }
    public boolean isGreater(int a ,int b)
    {
        return a>b? true:false;
    }

    public int floor(float a)
    {
        return (int)a;
    }
    public float ceil(float a)
    {
        return (int)a+1;
    }

}
