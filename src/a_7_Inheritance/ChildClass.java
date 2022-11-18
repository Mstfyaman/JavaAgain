package a_7_Inheritance;

public class ChildClass extends  ParentClass{

    public void print_message_C(){

        System.out.println(" world");
        print_message_P();  // parent classın metodunu direk kullanır.
    }


}
