package main.days.day2;

import main.Part;

public class Part2d2 extends Part {
    public Part2d2() {
        final int[] coos = {0, 0, 0};

        getInput.forEach(s -> {
            String[] str = s.split(" ");
            int move = Integer.parseInt(str[1]);
            switch (str[0]) {
                case "forward" -> {
                    coos[0] += move;
                    coos[1] += coos[2] * move;
                }
                case "down" -> coos[2] += move;
                case "up" -> coos[2] -= move;
            }
        });

        System.out.println(coos[0]*coos[1]);
    }
}
