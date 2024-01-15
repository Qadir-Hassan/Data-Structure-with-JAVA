import java.util.Scanner;

public class LeapYear {

    public static void checkLeapYear(int year) {
          // f                   F
        if((year % 4== 0) && ((year % 100 != 0) || (year % 400 == 0))){
            System.out.println("YES, " + year + " is a leap Year.");
        }
        else {
            System.out.println("NO, " + year + " is  NOT a leap Year.");
        }
    }

    public static void main(String[] args) {
        Scanner  userInput = new Scanner(System.in);
        System.out.print("Enter a Year: ");
        int inputYear = userInput.nextInt();

        checkLeapYear(inputYear);
    }
}
