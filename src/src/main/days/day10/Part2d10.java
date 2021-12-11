package main.days.day10;

import main.Part;

import java.util.ArrayList;

public class Part2d10 extends Part {
    StringBuilder str = new StringBuilder();

    public Part2d10() {
        ArrayList<Long> integers = new ArrayList<>();
        getInput.forEach(s -> {
            str = new StringBuilder();
            if (!errorDetect(s) && str.length() > 0) {
                long score = 0;
                for (int i = str.length()-1; i >= 0; i--) {
                    char c = str.charAt(i);
                    score *= 5;
                    switch (c) {
                        case '(' -> score += 1;
                        case '{' -> score += 3;
                        case '[' -> score += 2;
                        case '<' -> score += 4;
                    }
                }
                integers.add(score);
            }
        });
        integers.sort(Long::compareTo);
        System.out.println(integers);
        System.out.println(integers.get((int) (integers.size()/2+0.5)));
    }

    public boolean errorDetect(String s) {
        for (char character : s.toCharArray()) {
            if (character == '{' || character == '[' || character == '(' || character == '<') {
                str.append(character);
            } else {
                switch (character) {
                    case '}':
                        if (str.charAt(str.length() - 1) == '{') {
                            str.deleteCharAt(str.length() - 1);
                        } else {
                            return true;
                        }
                        break;
                    case ']':
                        if (str.charAt(str.length() - 1) == '[') {
                            str.deleteCharAt(str.length() - 1);
                        } else {
                            return true;
                        }
                        break;
                    case ')':
                        if (str.charAt(str.length() - 1) == '(') {
                            str.deleteCharAt(str.length() - 1);
                        } else {
                            return true;
                        }
                        break;
                    case '>':
                        if (str.charAt(str.length() - 1) == '<') {
                            str.deleteCharAt(str.length() - 1);
                        } else {
                            return true;
                        }
                        break;
                }
            }
        }
        return false;
    }
}
