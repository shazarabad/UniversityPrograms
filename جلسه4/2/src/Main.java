import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.*;
import java.io.*;
import java.util.ArrayList;




public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Person person = new Person();
        Person p2 = null;
        Person p3 =null;
        Person p4 =null;




        System.out.println("Enter Your name:");
        person.setName(input.next());
        System.out.println("Enter Your number:");
        person.setNumber(input.nextInt());
        System.out.println("Enter Your City:");
        person.setCity(input.next());

        try{

            p2=(Person) person.clone();
            p3=(Person) person.clone();
            p4=(Person) person.clone();

        }

        catch (CloneNotSupportedException e){
            System.out.println("Error");
        }


        System.out.println("Here are your clones "+person.getName()+" from "+person.getCity());
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);


    }
}
