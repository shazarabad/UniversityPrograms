import java.util.ArrayList;
import java.util.List;


public class Student <NAME , FATHERNAME , NUMBER> {
    private NAME name;
    private FATHERNAME fathername;
    private NUMBER number;

    List<Integer> scores = new ArrayList<>();

    public void setName(NAME name) {
        this.name = name;
    }
    public void setFathername(FATHERNAME fathername) {
        this.fathername = fathername;

    }

    public void setNumber(NUMBER number) {
        this.number = number;

    }

    public void setScores (int score){
        scores.add(score);
    }

    public NAME getName() {
        return name;
    }

    public FATHERNAME getFathername() {
        return fathername;
    }

    public NUMBER getNumber() {
        return number;
    }
    public List getScores(){
        return scores;
    }







}
