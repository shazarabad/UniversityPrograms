import java.util.Scanner;


class Calculator {
    int add(int a , int b)
    {
        return a + b;
    }

    int sub(int a , int b)
    {
        return a - b;
    }




    public static void main(String args[])
    {
        divmulti cal = new divmulti();
        Scanner input = new Scanner (System.in);
        int a = input.nextInt();
        int b =input.nextInt();
        System.out.println( cal.add(a, b) );
        System.out.println( cal.sub(a,b) );
        System.out.println( cal.mult(a,b) );
        System.out.println( cal.div(a,b) );
    }
}