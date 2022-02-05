package com.krishna;

public class SearchinString {
    public static void main(String[] args) {
        String krishna = "krishnajhapate";
        char target = 'k';
        System.out.println(search(krishna, target));
        System.out.println(search1(krishna, target));

    }

    static boolean search(String str, char ser) {
        if (str.length() == 0) {
            return false;
        }
        for (char i : str.toCharArray()) {
            if (i == ser) {
                return true;
            }
        }
        return false;
    }

    static boolean search1(String str, char ser) {
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ser) {
                return true;
            }
        }
        return false;
    }
}
