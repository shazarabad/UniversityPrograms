public class Library {
    String person;
    String book;
    int floor;

    public void Borrow(){
        System.out.println(person + " Borrow " + book + " Book From Floor"+floor);
    }

    public void Giveback(){
        System.out.println(person + " Giveback " + book +" Book ");
    }

    public void Join(){
        System.out.println(person + " Join Our Library");
    }

}
