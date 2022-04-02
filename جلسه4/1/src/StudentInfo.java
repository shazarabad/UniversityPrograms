import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentInfo {
    private int code,score;
    private String name;

    HashMap<String , String > info = new HashMap<String, String>();

    public void setCode (int code1){
        this.code=code1;

        info.put("code ", String.valueOf(code));
    }
    public void setScore (int score1){
        this.score=score1;
        info.put("Score ", String.valueOf(score));

    }
    public void setName (String name1){
        this.name=name1;
        info.put("Name: ", name);

    }

    public int getCode (){
        return code;
    }
    public int getScore (){
        return score;
    }
    public String getName (){
        return name;
    }

    public void show(){
        System.out.println(info);
    }



}
