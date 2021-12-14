package main.days.day13;

import main.Part;

import java.util.ArrayList;

public class Part2d13 extends Part {
    public Part2d13() {
        final Grid grid = new Grid();
        final boolean[] booleans = {true};
        getInput.forEach((str) -> {
            if (booleans[0]) {
                if (str.equals("")) {
                    booleans[0] = false;
                } else {
                    String[] strings = str.split(",");
                    grid.addDot(Integer.parseInt(strings[0]), Integer.parseInt(strings[1]));
                }
            } else {
                grid.fold(str.charAt(11) == 'x', Integer.parseInt(str.substring(13)));
            }
            if (grid.gridDots.size() < 50) {
                for (ArrayList<Character> arrayList : grid.gridDots) {
                    for (Character c : arrayList) {
                        System.out.print(c);
                    }
                    System.out.println();
                }
            }
            System.out.println("--------------");
        });
        for (ArrayList<Character> arrayList : grid.gridDots) {
            for (Character c : arrayList) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
