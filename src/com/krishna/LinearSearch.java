package com.krishna;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 24234, 3, 5, 5, 3, 23, 42, 23, 432, 52, -24, 23 };
        int target = 2;
        // int res = linearSearch(nums, target);
        // int res = linearSearch2(nums, target);
        boolean res = linearSearch3(nums, target);
        System.out.println(res);
    }

    // linear search for array
    static int linearSearch(int[] arr, int ser) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ser) {
                return i;
            }
        }
        return -1;
    }

    // search the target and return the element
    static int linearSearch2(int[] arr, int ser) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ser) {
                return ser;
            }
        }
        return Integer.MAX_VALUE;
    }

    // search the element and return false or true
    static boolean linearSearch3(int[] arr, int ser) {
        if (arr.length == 0) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ser) {
                return true;
            }
        }
        return false;
    }
}
