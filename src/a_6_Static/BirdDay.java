package a_6_Static;

public class BirdDay {

    static int cakeSlice = 28;


    public void takeASlice(){
        cakeSlice--;
    }

    public void takeASlice(int count){
        cakeSlice+=count;
    }






}
class main2 {
    public static void main(String[] args) {



        BirdDay Zafer = new BirdDay();
        BirdDay Enes = new BirdDay();
        BirdDay Ilyas = new BirdDay();
        BirdDay Ridvan = new BirdDay();
        BirdDay Talip = new BirdDay();
        BirdDay Razaman = new BirdDay();
        BirdDay Talha = new BirdDay();

        Zafer.takeASlice();
        Enes.takeASlice();
        Ilyas.takeASlice();
        Ridvan.takeASlice();
        Talip.takeASlice();
        Razaman.takeASlice();
        Talha.takeASlice();
        Zafer.takeASlice(2);
        Ilyas.takeASlice();

        System.out.println(BirdDay.cakeSlice);




    }
}
