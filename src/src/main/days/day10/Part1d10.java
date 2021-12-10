package main.days.day10;

import main.Part;

public class Part1d10 extends Part {

    StringBuilder str = new StringBuilder();

    public Part1d10() {
        int[] errors = {0};
        getInput.forEach(s -> {
            str = new StringBuilder();
            errors[0] += errorDetect(s);
        });

        System.out.println(errors[0]);
    }

    public int errorDetect(String s) {
        for (char character : s.toCharArray()) {
            if (character == '{' || character == '[' || character == '(' || character == '<') {
                str.append(character);
            } else {
                switch (character){
                    case '}':
                        if (str.charAt(str.length()-1) == '{') {
                            str.deleteCharAt(str.length()-1);
                        } else {
                            return 1197;
                        }
                        break;
                    case ']':
                        if (str.charAt(str.length()-1) == '[') {
                            str.deleteCharAt(str.length()-1);
                        } else {
                             return 57;
                        }
                        break;
                    case ')':
                        if (str.charAt(str.length()-1) == '(') {
                            str.deleteCharAt(str.length()-1);
                        } else {
                            return 3;
                        }
                        break;
                    case '>':
                        if (str.charAt(str.length()-1) == '<') {
                            str.deleteCharAt(str.length()-1);
                        } else {
                            return 25137;
                        }
                        break;
                }
            }
        }
        return 0;
    }
}
