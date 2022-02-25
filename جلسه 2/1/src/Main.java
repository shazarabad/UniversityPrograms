import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        Square square=new Square();

        System.out.print("Type 1 for Rectangle and 2 for Square : ");
        int shape = input.nextInt();
        if(shape == 1){
            System.out.print("Enter height: ");

            rectangle.height = input.nextDouble();
            System.out.print("Enter widght: ");

            rectangle.widght = input.nextDouble();

            rectangle.Pri();
            rectangle.Area();
        }
        else
            if(shape == 2)
            {
                System.out.print("Enter height: ");

                square.height = input.nextDouble();

                square.Pri();
                square.Area();

            }




    }
}
