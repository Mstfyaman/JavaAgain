package a_1_Wrapper;

public class WrapperClassTask_2 {
    public static void main(String[] args) {

        String str = " #${657367M//&%/&/e'&/&%/r%^/&%/&%h/%&//%&/a7&%/%9^^+%^+b&%^//)&/=/a '^+2&j'^+'^+'^'a+%/%&(&/)&v'+'^+'^+'a^&/%+/%&(/%& i+'^+'^+'^+n234+'^+'^+'^+s'^+'" +
                "^+'a$£#$£#n½$$½{$½{$l£#$£#$£#a½#$££#$£#r'^+'^+'4232i%+654&%+&+%";

        String empty = "";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i)) || str.charAt(i)==' '){
                empty+=str.charAt(i);
            }
        }
        System.out.println("empty = " + empty);

    }
}
