import java.util.Scanner;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Library library = new Library();
        int what ;

        System.out.println("Enter person name : ");
        library.person = input.nextLine();

        System.out.println("What to do? (1.borrow,2.giveback,3.join) ");
        what=input.nextInt();

        if (what == 1){
            System.out.println("Enter book name : ");

            library.book=input.next();
            System.out.println("Enter floor  : ");

            library.floor=input.nextInt();
            library.Borrow();

        }
        else
            if (what == 2) {
                System.out.println("Enter book name : ");

                library.book = input.next();
                System.out.println("Enter floor  : ");

                library.floor = input.nextInt();
                library.Giveback();
            }
        else{
            library.Join();
            }

    }
}
