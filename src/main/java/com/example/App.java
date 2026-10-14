package com.example;

import java.util.Scanner;

public class App {
    public String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("Reversed String: " + reverseStringStatic(input));
        sc.close();
    }

    public static String reverseStringStatic(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}