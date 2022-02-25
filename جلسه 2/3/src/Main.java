import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Equation1 eq = new Equation1();

        System.out.print("Enter a: ");
        eq.a =input.nextDouble();

        System.out.print("Enter b: ");
        eq.b =input.nextDouble();

        System.out.print("Enter c: ");
        eq.c =input.nextDouble();

        System.out.print("Enter d: ");
        eq.d =input.nextDouble();

        System.out.print("Enter e: ");
        eq.e =input.nextDouble();

        System.out.print("Enter f: ");
        eq.f =input.nextDouble();

        eq.Solve();
    }
}
