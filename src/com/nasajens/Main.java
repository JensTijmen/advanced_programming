package com.nasajens;
import java.util.Scanner;

public class Main {

    public static char nextChar (Scanner in) {
        return in.next().charAt(0);
    }

    public static void main(String[] args) {
        System.out.println("Give the first set: ");
        Scanner sc = new Scanner(System.in);
        System.out.println(nextChar(sc));
    }
}
