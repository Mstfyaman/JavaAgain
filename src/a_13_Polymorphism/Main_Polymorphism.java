package a_13_Polymorphism;

import a_12_Interface.A;

public class Main_Polymorphism {
    public static void main(String[] args) {

//        Dog karabas=new Dog();
//
//        Animal akbas= new Dog();
//
//        karabas.voice();
//        akbas.voice();
//       akbas.sleep();


   //==========================

//SporCar kirmiziMelek=new SporCar();
//kirmiziMelek.start();
//kirmiziMelek.speed();
//kirmiziMelek.stop();
//
//Car beyazMelek=new SporCar();
//beyazMelek.start();
//
//IVehicle sariMelek=new SporCar();
//sariMelek.stop();
//sariMelek.tekerSayisi();
//
//        System.out.println(sariMelek.getClass());


    //========================================

        Kus limon=new Kanarya();
        Kus mavis = new Muhabbet();


    Animal animal_1 = new Dog();
    Dog dog2= (Dog) animal_1;
    // bir üst sınıfı casting yapabilmek için öncelikle üst sınıfın alt sınıfla
   // tanımlanması gerekir ( önce 40. satır, sonra csating için 41. satır )









    }
}
