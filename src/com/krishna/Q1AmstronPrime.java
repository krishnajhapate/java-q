package com.krishna;

import java.util.Scanner;

public class Q1AmstronPrime {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // int n = in.nextInt();
        // boolean res = isPrime(n);
        // System.out.println(res);
        for (int i = 100; i < 1000; i++) {
            if (isAmstrong(i)) {
                System.out.println(i);
            }
        }
        // boolean res = isAmstrong(n);
        // System.out.println(res);
    }

    static boolean isAmstrong(int n) {
        int a = n;
        int sum = 0;
        while (a > 0) {
            int rem = a % 10;
            sum = sum + rem * rem * rem;
            a = a / 10;
        }
        return sum == n;
    }

    static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        int c = 2;
        while (c * c < n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > n;
    }
}
