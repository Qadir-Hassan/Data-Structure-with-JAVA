import java.util.Scanner;

public class firstProgram {

    public  static  void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter First Number: ");

        int numOne = userInput.nextInt();

        System.out.print("Enter Second number ");
        int numTwo = userInput.nextInt();

        System.out.println(" The Sum of "+ numOne + " + "+ numTwo + " is "+ (numOne+numTwo));


    }
}
