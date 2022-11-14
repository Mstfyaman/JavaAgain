package a_2_ArrayListt;

import java.util.ArrayList;

public class ArrayList_ {
    public static void main(String[] args) {

// size(), add(), set(), isEmpty()

    ArrayList<String> names = new ArrayList();
    names.add("Ahmet");
    names.add("Mehmet");
    names.add("Ayşe");
    names.add("Zehra");
        System.out.println("names.size() = " + names.size());
        System.out.println("names.toString() = " + names.toString());  // bu ve alttaki aynı şey.
        System.out.println("names = " + names);

        names.set(2,"Fatma");  // 2. indexe fatmayı atadık ve eski 2. indexsi sildik.
        System.out.println("names = " + names);

        names.add(2,"Ayse"); // burda yeni ekleme yaptık. arrayın boyutu uzadı.

        System.out.println("names.size() = " + names.size());

        System.out.println("names.isEmpty() = " + names.isEmpty());   // boşmu  dedik
        names.clear();  // boşalttık
        System.out.println("names.isEmpty() = " + names.isEmpty()); // boş dedi.


    }
}
