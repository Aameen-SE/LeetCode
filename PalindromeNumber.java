
// Palindrome Number

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check it is palindrome or not : ");
        int num = sc.nextInt();

        int temp = num;
        int reverse =0;

        for(;num!=0;num=num/10){
            int digit = num%10;
            reverse = reverse*10+digit;
        }

        if (reverse==temp)
            System.out.println("Palindrome Number ");
        else
            System.out.println("Not a Palindrome Number");

    }
}
