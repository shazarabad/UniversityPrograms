import java.util.Scanner;
import java.util.*;


public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        Information info = new Information();

        System.out.println("Enter your name: ");
        info.setName(input.next());

        System.out.println("Enter your Family: ");
        info.setFamily(input.next());

        System.out.println("Enter your Age: ");
        info.setAge(input.next());

        System.out.println("Enter your Pass: ");
        info.setPass(input.next());

        System.out.println("Enter your Username: ");
        info.setUsername(input.next());

        System.out.println("Enter your Job: ");
        info.setJob(input.next());

        for(;;) {
            int s;
            System.out.println("Enter (1.show / 2.end)");
            s = input.nextInt();
            s= Integer.valueOf(s);
            if (s==1) {
                System.out.println("These are private informations");

                System.out.println(info.getName());
                System.out.println(info.getFamily());
                System.out.println(info.getAge());
                System.out.println(info.getPass());
                System.out.println(info.getUsername());
                System.out.println(info.getJob());
                break;
            } else if (s==2) {
                System.out.println("The End , bye");
                break;
            } else {
                System.out.println("Enter 1 or 2");
                continue;
            }
        }





    }
}
