//.Create a program that determines if a number is positive, negative,
//        or zero

import java.util.Scanner;

public class PositiveCheck {

    public static void main (String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the number: ");
        double number = userInput.nextDouble();

        if(number==0){
            System.out.println("The enter number "+ number + " is 0");
        }
        else if (number>0) {
            System.out.println("The enter number "+ number + " is Greater than Zero");
        }

        else {
            System.out.println("The enter number "+ number + " is Less than Zero");
        }
    }
}
