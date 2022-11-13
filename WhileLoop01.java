package Assignment_Day_02;

//1)Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5???
public class WhileLoop01 {
    public static void main(String[] args) {
        int N=5;
        int i=1;
        int Sum =0;
        while(i<=N)
        {
            Sum = Sum + i;
            i++;
        }
        System.out.print("Sum of NaturalNos : "+Sum);
    }
}



