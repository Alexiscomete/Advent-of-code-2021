package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Day :");
        int day = sc.nextInt();
        System.out.println("Part :");
        int part = sc.nextInt();
        switch (day) {
            case 1:
                if (part == 1) {
                    new main.day1.Part1();
                } else {
                    new main.day1.Part2();
                }
                break;
            default:
                System.out.println("invalid");
                break;
        }
    }
}
