public class Information <NAME , FAMILY , AGE , PASS, USERNAME , JOB>{

    private NAME name;
    private  FAMILY family;
    private  AGE age;
    private  PASS pass;
    private  USERNAME username;
    private  JOB job;


    public void setName(NAME name) {
        this.name = name;
    }

    public void setFamily(FAMILY family) {
        this.family = family;
    }

    public void setAge(AGE age) {
        this.age = age;
    }

    public void setPass(PASS pass) {
        this.pass = pass;
    }

    public void setUsername(USERNAME username) {
        this.username = username;
    }

    public void setJob(JOB job) {
        this.job = job;
    }

    public NAME getName() {
        return name;
    }

    public FAMILY getFamily() {
        return family;
    }

    public AGE getAge() {
        return age;
    }

    public PASS getPass() {
        return pass;
    }

    public USERNAME getUsername() {
        return username;
    }

    public JOB getJob() {
        return job;
    }
}
