package a_4_5_Encapsulation;

public class Dog {

    private String name;
    private String breed;
    public boolean isBlack;
    private int age;

    public Dog() {
    }


    public Dog (String name){
        this.name = name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public String getBreed(String sivas){
        return this.breed;
    }

    public void setBreed(String breed){
        this.breed=breed;
    }



}
