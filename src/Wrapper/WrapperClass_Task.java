package Wrapper;

public class WrapperClass_Task {
    public static void main(String[] args) {

        String str = "'+^j435*/(a+^5&/v)=?672a";

        String empty ="";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i)))
                empty+=str.charAt(i);

        }
        System.out.println("empty = " + empty);

    }



}
