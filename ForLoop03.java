package Assignment_Day_02;

//3. Write a Program to find Palindrome Number???

public class ForLoop03 {
    public static void main(String[] args) {

        int lastDigit, sum = 0, a;
        int inputNumber = 121; //It is the number  to be checked for palindrome

        a = inputNumber;

        // Code to reverse a number
        for (; a != 0; a /= 10) {
            System.out.println("Input Number " + a);
            lastDigit = a % 10; //getting remainder
            System.out.println("Last Digit " + lastDigit);
            System.out.println("Digit " + lastDigit + " was added to sum " + (sum * 10));
            sum = (sum * 10) + lastDigit;
            a = a / 10;

        }

        // if given number equal to sum than number is palindrome otherwise not palindrome
        if (sum == inputNumber)
            System.out.println("Number is palindrome ");
        else
            System.out.println("Number is not palindrome");

    }
}
