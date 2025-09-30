package Loops;

import java.util.Scanner;

public class f47 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = sc.nextInt();

        int n1 = n;
        int n2 = n;
        int cnt = 0;
        int sum = 0;

       
        while (n > 0) {
            cnt++;
            n = n / 10;
        }

       
        while (n1 > 0) {
            int digit = n1 % 10;
            sum =(int) (sum + Math.pow(digit, cnt));
            n1 = n1 / 10;
        }

        if (sum == n2) {
            System.out.println("This is an Armstrong number.");
        } else {
            System.out.println("This is not an Armstrong number.");
        }

        
    }
}
