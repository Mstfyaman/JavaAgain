package a_3_Constructor;

public class Flower {

    public  String renk ;
    public  int boy;
    public boolean diken;


    public void setRenk(String renk1){
        renk=renk1;
    }


    public Flower() {
    }

    public Flower(String renk) {
        this.renk = renk;
    }

    public Flower(String renk, int boy) {
        this.renk = renk;
        this.boy = boy;
    }

    public Flower(String renk, int boy, boolean diken) {
        this.renk = renk;
        this.boy = boy;
        this.diken = diken;
    }
}
