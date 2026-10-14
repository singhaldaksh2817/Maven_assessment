
package com.example;
public class App {

    public String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        App app = new App();

        String input = "Hello World";
        String result = app.reverseString(input);

        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + result);
    }
}
