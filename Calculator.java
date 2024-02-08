import java.util.*;
public class Calculator {

    public static void main(String[] args) {
        //create new scanner to get user input
        Scanner scanner = new Scanner(System.in);

        //ask user to enter the numbers
        System.out.println("Please enter the first number: ");
        int numOne = scanner.nextInt();

        System.out.println("Please enter the second number: ");
        int numTwo = scanner.nextInt();

        //Add numbers together and print result
        int sum = numOne + numTwo;
        System.out.print(sum);
    }
}