package ArrayListt;

import java.util.ArrayList;

public class ArrayList_2 {
    public static void main(String[] args) {

        // remove

    ArrayList <Integer> nums = new ArrayList<>();
    nums.add(10);  nums.add(100);  nums.add(101);  nums.add(190); nums.add(5);  nums.add(55);

        System.out.println("nums = " + nums);   // nums = [10, 100, 101, 190, 5, 55]
        nums.remove(1); //  nums = [10, 100, 101, 190, 5, 55]   100 1. indexte olduğundan attı

        nums.remove(1); // nums = [10, 100, 101, 190, 5, 55]    101 1 di. onuda attı

        nums.add(60);
        nums.add(200);
        System.out.println("nums = " + nums);  // nums = [10, 190, 5, 55, 60, 200]   sona ekleme yapar
        System.out.println("nums.size() = " + nums.size());  // nums.size() = 6


        int num = 5;
        Integer NUM =5;
      //  nums.remove(num);
        System.out.println("nums = " + nums);  //  nums = [10, 190, 5, 55, 60]  200 ü attı. yani 5. indexi
        nums.remove(NUM);
        System.out.println("nums = " + nums);  // nums = [10, 190, 5, 55, 60, 200]  // burda 5. attı. sayı aldı direkt


//        while (nums.size()>1){     // burda 1. index ten başlayım gerisini komple attık
//            nums.remove(1);
//        }
//        System.out.println("nums = " + nums);


    }
}
