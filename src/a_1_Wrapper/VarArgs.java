package a_1_Wrapper;

public class VarArgs {
    public static void main(String[] args) {

    sum(5,10);
    sum(5,10,15);
    sum(5,10,15,20,25,30);
    sum(5,10,15,25,30,105,120);


    }

    public static void sum(int a, int b){
        System.out.println("a+b = "+ a + b);

    }
    public static void sum(int a,int b, int c){
        System.out.println("a+b+c = " + a + b + c);
    }

    public static void sum( int... sayılar){   // VarArgs oldu--  variable arguments
        int sum = 0;
        for (int i: sayılar){
            sum+=i;
        }
        System.out.println("sum = " + sum);
    }



}
