package main;

import java.util.Scanner;
import main.days.day1.*;
import main.days.day2.*;
import main.days.day3.Part1d3;
import main.days.day3.Part2d3;

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
                    new Part1d1();
                } else {
                    new Part2d1();
                }
                break;
            case 2:
                if (part == 1) {
                    new Part1d2();
                } else {
                    new Part2d2();
                }
                break;
            case 3:
                if (part == 1) {
                    new Part1d3();
                } else {
                    new Part2d3();
                }
                break;
            default:
                System.out.println("invalid");
                break;
        }
    }
}
