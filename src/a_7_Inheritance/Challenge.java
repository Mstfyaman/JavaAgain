package a_7_Inheritance;

public class Challenge extends GameActivity {

    private int shootOption;
    private int pointOfShoot;
    private int shootSucces;

    public Challenge(int shootOption, int shootSucces) {
        int point;
        this.shootOption = shootOption;
        this.shootSucces = shootSucces;

        pointOfShoot=1000/shootOption;
        point=pointOfShoot*shootSucces;

        setScore(point);

    }
}
