import java.util.Scanner;


public class SimpleCal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a,b,x;
        System.out.print("Enter Number 1:");
        a= input.nextInt();
        System.out.print("\n");

        System.out.print("Enter Number 2:");
        b= input.nextInt();
        System.out.print("\n");

        System.out.println("1) +");
        System.out.println("2) -");
        System.out.println("3) x");
        System.out.println("4) /");
        System.out.print("Enter Number Of Function:");
        x = input.nextInt();
        int y;
        switch(x){
            case 1:
                y=a+b;
                System.out.print("a+b=");
                System.out.print(y);
                break;
            case 2:

                if(a>b){
                    y=a-b;
                    System.out.print("a-b=");
                    System.out.print(y);
                }
                else
                    if(b>a) {
                        y = b - a;
                        System.out.print("a-b=");
                        System.out.print(y);
                    }
                else{
                        y=a-b;
                        System.out.print("a-b=");
                        System.out.print(y);
                    }

                break;
            case 3:
                y=a*b;
                System.out.print("axb=");
                System.out.print(y);
                break;
            case 4:
                y=a/b;
                System.out.print("a/b=");
                System.out.print(y);
                break;

        }





    }
}
