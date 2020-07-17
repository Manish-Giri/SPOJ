package net.manishgiri.problems.prime1;

import java.util.Scanner;

// https://www.spoj.com/problems/PRIME1/

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numTest = Integer.parseInt(sc.nextLine());
        String[] nums = new String[numTest];
        for (int i = 0; i < numTest; i++) {
            nums[i] = sc.nextLine();
        }
        sc.close();

        for (int i = 0; i < nums.length; i++) {
            String line = nums[i];
            int start = Integer.parseInt(line.split(" ")[0]);
            int end = Integer.parseInt(line.split(" ")[1]);
            printPrime(start, end);
            System.out.println();
        }

    }


    private static void printPrime(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i == 1) continue;
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
