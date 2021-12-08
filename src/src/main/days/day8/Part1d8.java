package main.days.day8;

import main.Part;

public class Part1d8 extends Part {
    public Part1d8() {
        int[] i = {0};

        getInput.forEach(s -> {
            String[] strings = s.substring(s.indexOf("|") + 1).split(" ");
            for (String digit : strings) {
                if (digit.length() == 3 || digit.length() == 4 || digit.length() == 2 || digit.length() == 7) {
                    i[0]++;
                }
            }
        });

        System.out.println(i[0]);
    }
}
