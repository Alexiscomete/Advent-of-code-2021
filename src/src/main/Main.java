package main;

import java.util.Scanner;
import main.days.day1.*;
import main.days.day10.Part1d10;
import main.days.day10.Part2d10;
import main.days.day11.Part1d11;
import main.days.day11.Part2d11;
import main.days.day12.Part1d12;
import main.days.day12.Part2d12;
import main.days.day13.Part1d13;
import main.days.day13.Part2d13;
import main.days.day14.Part1d14;
import main.days.day14.Part2d14;
import main.days.day15.Part1d15;
import main.days.day15.Part2d15;
import main.days.day2.*;
import main.days.day3.Part1d3;
import main.days.day3.Part2d3;
import main.days.day4.Part1d4;
import main.days.day4.Part2d4;
import main.days.day5.Part1d5;
import main.days.day5.Part2d5;
import main.days.day6.Part1d6;
import main.days.day6.Part2d6;
import main.days.day7.Part1d7;
import main.days.day7.Part2d7;
import main.days.day8.Part1d8;
import main.days.day8.Part2d8;
import main.days.day9.Part1d9;
import main.days.day9.Part2d9;

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
            case 4:
                if (part == 1) {
                    new Part1d4();
                } else {
                    new Part2d4();
                }
                break;
            case 5:
                if (part == 1) {
                    new Part1d5();
                } else {
                    new Part2d5();
                }
                break;
            case 6:
                if (part == 1) {
                    new Part1d6();
                } else {
                    new Part2d6();
                }
                break;
            case 7:
                if (part == 1) {
                    new Part1d7();
                } else {
                    new Part2d7();
                }
                break;
            case 8:
                if (part == 1) {
                    new Part1d8();
                } else {
                    new Part2d8();
                }
                break;
            case 9:
                if (part == 1) {
                    new Part1d9();
                } else {
                    new Part2d9();
                }
                break;
            case 10:
                if (part == 1) {
                    new Part1d10();
                } else {
                    new Part2d10();
                }
                break;
            case 11:
                if (part == 1) {
                    new Part1d11();
                } else {
                    new Part2d11();
                }
                break;
            case 12:
                if (part == 1) {
                    new Part1d12();
                } else {
                    new Part2d12();
                }
                break;
            case 13:
                if (part == 1) {
                    new Part1d13();
                } else {
                    new Part2d13();
                }
                break;
            case 14:
                if (part == 1) {
                    new Part1d14();
                } else {
                    new Part2d14();
                }
                break;
            case 15:
                if (part == 1) {
                    new Part1d15();
                } else {
                    new Part2d15();
                }
                break;
            default:
                System.out.println("invalid");
                break;
        }
    }
}
