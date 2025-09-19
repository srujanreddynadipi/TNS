package com.srujanreddy.assignment;
import java.util.Scanner;
import com.srujanreddy.assignment.Prime1To100;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        Prime1To100 prime = new Prime1To100();

        if (prime.isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }

}
