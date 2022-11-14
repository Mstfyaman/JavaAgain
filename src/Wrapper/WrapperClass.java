package Wrapper;

public class WrapperClass {
    public static void main(String[] args) {

        Byte B = new Byte((byte)127);
        Byte B2 = new Byte("127");

        Integer I = new Integer(10000);
        Integer I2 = new Integer("10000");

    // Autoboxing  and unboxing

        int i = 10;
        Integer x= i;  // autoboxing



        // Unboxing

        Integer i1 = 20;
        int a = i1;  // unboxing
        System.out.println("i1 = " + i1);


    }
}
