package ArrayListt;

import java.util.ArrayList;

public class ArrayList_5 {
    public static void main(String[] args) {

        // copy, contains(), containsAll()

        ArrayList <String> weekDays = new ArrayList<>();
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("ThursDay");
        weekDays.add("Friday");

        ArrayList <String> allDays = new ArrayList<>(weekDays);
        System.out.println("allDays.get(0) = " + allDays.get(0));  // allDays.get(0) = Monday   copy yaptık.
        allDays.add("Saturday");
        allDays.add("Sunday");

        System.out.println("allDays = " + allDays);


        System.out.println("allDays.contains(\"Tuesday\") = " + allDays.contains("Tuesday"));
        // allDays.contains("Tuesday") = true

        System.out.println("allDays.indexOf(\"Tuesday\") = " + allDays.indexOf("Tuesday"));
        System.out.println("allDays.get(1)==\"Tuesday\" = " + allDays.get(1) == "Tuesday");


        System.out.println("allDays.containsAll(weekDays) = " + allDays.containsAll(weekDays));
        //  allDays.containsAll(weekDays) = true


    }
}
