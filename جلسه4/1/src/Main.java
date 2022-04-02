import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StudentInfo info = new StudentInfo();

        System.out.println("Enter your student code:");
        info.setCode(input.nextInt());
        System.out.println("Enter your score:");
        info.setScore(input.nextInt());
        System.out.println("Enter your name:");
        info.setName(input.next());
       System.out.println("Here is your information:");
        info.show();




    }
}
