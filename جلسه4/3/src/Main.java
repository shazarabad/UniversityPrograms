import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student student = new Student();
        System.out.println("Enter Your Name: ");
        student.setName(input.next());
        System.out.println("Enter Your Father's name : ");
        student.setFathername(input.next());
        System.out.println("Enter Your Number: ");
        student.setNumber(input.nextInt());

        for (int i=1 ; i<=5;i++){

            System.out.println("Enter Score"+i);
            student.setScores(input.nextInt());

        }

        System.out.println("Hi "+student.getName()+ " son of "+student.getFathername() + " ("+student.getNumber()+") . Here are your scores:");
        System.out.println(student.getScores());




    }
}
