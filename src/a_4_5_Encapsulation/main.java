package a_4_5_Encapsulation;

public class main {
    public static void main(String[] args) {

        Dog karabas = new Dog();
      //  System.out.println("karabas.getName() = " + karabas.getName());
       karabas.setName("Karabas");
     //   System.out.println(karabas.getName());

        Dog dog=new Dog("Karabas");

        dog.setBreed("Sivas");

//=================================================

        Circle circle_1 = new Circle(5);
       // System.out.println(circle_1.getRadius());

      //  System.out.println(circle_1.circleAres());

        //==================================================

        KraftBankCustomer enes= new KraftBankCustomer(1245,"enes yilmaz", false);
        System.out.println("enes.getCustomerToken() = " + enes.getCustomerToken());

        enes.setCustomerFullName("1245en13","enes sen");
        System.out.println("enes.getCustomerFullName() = " + enes.getCustomerFullName());


    }
}
