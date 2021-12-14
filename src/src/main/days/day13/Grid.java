package main.days.day13;

import java.util.ArrayList;

public class Grid {
    ArrayList<ArrayList<Character>> gridDots = new ArrayList<>();

    public void addDot(int x, int y) {
        checkGrid(x, y);
        gridDots.get(y).set(x, '#');
    }

    private void checkGrid(int x, int y) {
        while (gridDots.size() < y+1) {
            gridDots.add(new ArrayList<>());
        }
        for (ArrayList<Character> characters : gridDots) {
            checkW(x, characters);
        }
    }

    private void checkW(int x, ArrayList<Character> characters) {
        while (characters.size() < x+1) {
            characters.add('.');
        }
    }

    public void fold(boolean axe, int num) {
        if (axe) {
            for (int x = 0; x < num; x++) {
                for (ArrayList<Character> gridDot : gridDots) {
                    char c2 = gridDot.get(2 * num - x);
                    if (c2 == '#') {
                        gridDot.set(x, '#');
                    }
                    gridDot.remove(2 * num - x);
                }
            }
            for (ArrayList<Character> gridDot : gridDots) {
                gridDot.remove(num);
            }
        } else {
            for (int y = 0; y < num; y++) {
                for (int x = 0; x < gridDots.get(y).size(); x++) {
                    char c2 = gridDots.get(gridDots.size()-1).get(x);
                    if (c2 == '#') {
                        gridDots.get(y).set(x, '#');
                    }
                }
                gridDots.remove(gridDots.size()-1);
            }
            if (gridDots.size() > num) {
                gridDots.remove(num);
            }
        }
    }

    public int howMany() {
        int total = 0;
        for (ArrayList<Character> characters : gridDots) {
            for (char c : characters) {
                if (c == '#') {
                    total++;
                }
            }
        }
        return total;
    }
}
