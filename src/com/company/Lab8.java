package com.company;

import java.util.Scanner;

public class Lab8 {
    public static void main(String[] args) {
        int k = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("input string");
        String vav = in.nextLine();
        String[]words = vav.split(" ");
        for(String word:words) {
            k += 1;
        }
        System.out.println("Nuber of spaces - " + (k - 1));
    }
}
