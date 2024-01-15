import java.util.Scanner;

public class PalindromeString {

    public static void checkPalindrome(String word) {
       String reverseString = "";
       for(int i = word.length()-1; i>=0 ; i--){
           reverseString += word.charAt(i);

       }

       if(reverseString.equals(word)){
           System.out.println("The word " +word + " is a Palindrome");
       }
       else {
           System.out.println("The word " + word + " is  NOT a Palindrome");
       }

    }

    // Main Method
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String word = userInput.nextLine();
        checkPalindrome(word);
    }
}