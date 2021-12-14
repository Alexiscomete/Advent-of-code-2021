package main.days.day13;

import main.Part;

public class Part1d13 extends Part {
    public Part1d13() {
        final Grid grid = new Grid();
        final boolean[] booleans = {true, true};
        getInput.forEach((str) -> {
            if (booleans[0]) {
                if (str.equals("")) {
                    booleans[0] = false;
                } else {
                    String[] strings = str.split(",");
                    grid.addDot(Integer.parseInt(strings[0]), Integer.parseInt(strings[1]));
                }
            } else if (booleans[1]) {
                booleans[1] = false;
                grid.fold(str.charAt(11) == 'x', Integer.parseInt(str.substring(13)));
            }
        });
        System.out.println(grid.howMany());
    }
}
