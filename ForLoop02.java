package Assignment_Day_02;

//2. Write a Program to reverse the integer number eg. Input n=231 reverse is 132???

public class ForLoop02 {
    public static void main(String[] args) {
        int number = 231, reverse = 0;
        //we have not mentioned the initialization part of the for loop
        for (; number != 0; number = number / 10) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
        }
        System.out.println("The reverse of the given number is: " + reverse);
    }
}
