public class Person <NAME , NUMBER , CITY> implements Cloneable {
    private NAME name;
    private NUMBER number ;
    private    CITY city ;

    public void setName(NAME name) {
        this.name = name;
    }
    public void setNumber(NUMBER number){
        this.number=number;
    }
    public void setCity(CITY city){
        this.city=city;
    }


    public NAME getName(){
        return this.name;
    }
    public NUMBER getNumber(){
        return this.number;
    }
    public CITY getCity(){
        return this.city;
    }

@Override
    protected Object clone() throws CloneNotSupportedException{
        return  super.clone();
}


}
