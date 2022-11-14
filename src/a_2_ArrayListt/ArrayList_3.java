package a_2_ArrayListt;

import java.util.ArrayList;

public class ArrayList_3 {
    public static void main(String[] args) {

        // get(), indexOf(), LastIndexOf()

        ArrayList <String> names = new ArrayList<>();

        names.add("Ahmet");
        names.add("Mustafa");
        names.add("Talip");
        names.add("Alparslan");
        names.add("Ihsan");
        names.add("Talha");
        names.add("Bilge");
        names.add("Bahar");
        names.add("Hatice");
        names.add("Cigdem");

        System.out.println("names.size() = " + names.size());

//        for (String str :names) {
//            System.out.println("str+\" \" = " + str + " ");    // alttakide aynısı farklı yöntem
//        }


//        for (int i = 0; i < names.size(); i++) {
//            System.out.println("names.get(i) = " + names.get(i));    // // üsttekide aynısı farklı yöntem
//        }

        System.out.println("names.get(0) = " + names.get(0));   // ahmet

        int alparslan = names.indexOf("Alparslan");
        System.out.println("alparslan = " + alparslan);   // alparslan = 3

        names.add("Hasan");
        System.out.println("names = " + names);
        // names = [Ahmet, Mustafa, Talip, Alparslan, Ihsan, Talha, Bilge, Bahar, Hatice, Cigdem, Hasan]

        names.set(3,"Hasan");
        System.out.println("names = " + names);
        // names = [Ahmet, Mustafa, Talip, Hasan, Ihsan, Talha, Bilge, Bahar, Hatice, Cigdem, Hasan]

        System.out.println("names.lastIndexOf(\"Hasan\") = " + names.lastIndexOf("Hasan"));
        // names.lastIndexOf("Hasan") = 10


    }
}
