package class1st;

public class AddressRefrence {

    public static void main(String[] args) {


        String old=new String("Heelo");
        String new1=old;
        old=old.replace("H","h");
        System.out.println(old);
        System.out.println(new1);

        System.out.println(new AddressRefrence());

    }

}
