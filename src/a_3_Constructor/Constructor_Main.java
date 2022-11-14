package a_3_Constructor;

public class Constructor_Main {
    public static void main(String[] args) {

//    Flower flower = new Flower();
//        System.out.println("flower.renk = " + flower.renk);  // flower.renk = null    atama yapmadık
//
//        flower.renk="kirmizi";  // atamayı yaptık
//        System.out.println("flower.renk = " + flower.renk);   // flower.renk = kirmizi
//
//        flower.renk="sari";
//        System.out.println("flower.renk = " + flower.renk);   // flower.renk = sari
//
//
//       Flower flower1 = new Flower("sarı", 23, true);


       Okul gazi = new Okul();
       Okul kanuni = new Okul("pembe", 400,50);
       Okul keskin = new Okul("beyaz", 600, 200);

        System.out.println(keskin.kapasite);
        System.out.println(kanuni.kapasite);



    }
}
