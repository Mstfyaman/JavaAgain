package a_10_FinalAndHiding;

public class Parent {

    protected int num;
    int x;


    {
        System.out.println("instance method çalıştı");
    }

    static{
        System.out.println("static bloc çalıştı");
    }

    Parent(){
        System.out.println("constructor çalıştı");
    }



}
