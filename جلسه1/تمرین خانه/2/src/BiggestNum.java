import java.util.Arrays;
import java.util.Scanner;

public class BiggestNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n =input.nextInt();
        int numbers [] = new int[n];

        for(int i=0;i<n;i++) {
            numbers[i] = input.nextInt();
        }

        Arrays.sort(numbers);
        System.out.print("Biggest number is ");
        System.out.print(numbers[n-1]);

    }
}
