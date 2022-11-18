package a_7_Inheritance;

public class GameActivity {

    private double score;

    public double getScore(){
        return score;
    }

    public void setScore(double score){
        this.score=score;
    }

    public String getRank(){
        String rank;
        if (score>=800){
            rank="veteran";
        }else if (score>500){
            rank="advence";
        } else if (score>=300) {
            rank="undead";
        }else {
            rank="beginner";
        }
        return rank;
    }


}
