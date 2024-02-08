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

        //ask users if they want to add or subtract
        System.out.println("Please enter 'a' if you would like to add the two numbers or 's' if you would like to subtract them: ");
        char operation = scanner.next().charAt(0);

        int sum = -1;
        
        if(operation == 'a'){
        //Add numbers together and print result
        sum = numOne + numTwo;
        System.out.print(sum);
        }else if(operation == 's'){
            //subtract numbers and print result
        sum = numOne - numTwo;
        System.out.print(sum);
        }else{
            System.out.println("invalid option");
            return;
        }
    }
}