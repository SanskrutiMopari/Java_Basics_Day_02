package Assignment_Day_02;

//1. Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5???

public class ForLoop01 {
    public static void main(String[] args) {
        int i, num = 10, sum = 0;
//executes until the condition returns true
        for (i = 1; i <= num; ++i) {
//adding the value of i into sum variable
            sum = sum + i;
        }
//prints the sum
        System.out.println("Sum of First 10 Natural Numbers is = " + sum);
    }
}









