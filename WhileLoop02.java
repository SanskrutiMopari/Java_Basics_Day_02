package Assignment_Day_02;

//2)Write a Program to reverse the integer number eg. Input n=231 reverse is 132???

public class WhileLoop02 {
    public static void main(String[] args) {

        int num = 123, reversed = 0;

        System.out.println("Original Number: " + num);

        // run loop until num becomes 0
        while (num != 0) {

            // get last digit from num
            int digit = num % 10;
            reversed = reversed * 10 + digit;

            // remove the last digit from num
            num /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
    }
}

