import java.util.Scanner;
public class FindNumberInArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n,x,h=0;
        boolean found = false;
        System.out.print("How Many Numbers Do You Want To Enter? ");
        n=input.nextInt();
        int numbers [] = new int[n];

        for(int i=0;i<n;i++){
            int j = i+1;
            System.out.print("Please Enter Number"+ j +": ");
            numbers[i]=input.nextInt();
            System.out.println(" ");

        }
        System.out.print("Find : ");
        x= input.nextInt();


        for(int i=0;i<n;i++){
            if(x==numbers[i])
            {
                found =true;
                break ;
            }
            else
            {

                found = false;

            }
        }

        for(int i=0;i<n;i++){

            if(x==numbers[i])
                h++ ;

        }
        if(found == true)
        {
            System.out.print(x+" Found "+ h + " Times");
        }
        else{
            System.out.print("No Matches");
        }

    }

}
