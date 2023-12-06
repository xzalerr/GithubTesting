package org.example;

public class Main {
    public static void add(int a, int b) {
        System.out.println(a + b);
    }
    public static void substract(int a, int b) {
        System.out.println(a - b);
    }
    public static void multiply(int a, int b) {
        System.out.println(a*b);
    }
    public static void divide(int a, int b) {
        System.out.println(a/b);
    }
    public static void test(String x) {
        System.out.println("hello " + x + "!");
    }
    //now should be pushing from main account
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int a = 5;
        int b = 10;
        add(a, b);
        substract(a, b);
        throw new RuntimeException();
    }
}