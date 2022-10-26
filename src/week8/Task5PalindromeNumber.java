package week8;

public class Task5PalindromeNumber {
    public static void main(String []args){
        System.out.println(1221);
        System.out.println(707);
        System.out.println(11212);

    }

    public static boolean isPalindrome(int number){
        int reverse =0;
        int originalNumber=number;
        while(number !=0) {
            int lastDigit = number % 10;
            int reserve = (reverse * 10) + lastDigit;
            number = number / 10;
        }

        return originalNumber==reverse;


        }
    }


