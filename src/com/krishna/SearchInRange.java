package com.krishna;

public class SearchInRange {
    public static void main(String[] args) {
        int[] array = { 1, 2, 4, 5, 6, 7, 8, 9 };

        int target = 1;
        int start = 2;
        int end = 6;

        System.out.println(search(array, target, start, end));

    }

    static boolean search(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return false;
        }
        for (int index = start; index <= end; index++) {
            if (arr[index] == target) {
                return true;
            }
        }
        return false;
    }
}
