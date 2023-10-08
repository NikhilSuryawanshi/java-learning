package Methods;

import Methods.com.nik.Test;

public class ReturnExp {
    public static void main(String[] args) {
        Math m=new Math();
        float res=m.average(1,2,3);
        System.out.println( res);
        System.out.println(m.isGreater(8,7));
        System.out.println(m.floor(3.7f));
        System.out.println(m.ceil(3.3f));
        Test t=new Test();
        t.printHello();




    }


}
