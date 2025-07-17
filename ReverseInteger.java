import java.util.Scanner;

public class ReverseInteger {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        int rev =0;
        while(num!=0){
            int digit = num%10;
            num=num/10;
             rev = rev*10+digit;

        }

        System.out.println("Reverse Number : "+rev);
    }
}
