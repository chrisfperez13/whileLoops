import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number greater than one ");
        double n = input.nextDouble();

        double counter = 0;
        double sum = 0;

    while(n > counter ){

        counter++;

        if ( n % counter == 0  ){

            sum += counter;
        }
    }
    System.out.println("The sum of all factors of " + n + " is " + sum);
    }
}

