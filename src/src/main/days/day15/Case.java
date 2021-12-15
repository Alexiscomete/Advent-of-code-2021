package main.days.day15;

import java.util.ArrayList;

public class Case {
    public static final ArrayList<ArrayList<Case>> map = new ArrayList<>();

    private final int num, x, y;
    private boolean canTravel = true;

    public Case(int num, int x, int y) {
        this.num = num;
        this.x = x;
        this.y = y;
    }

    public int startTravel() {
        int min = -1;
        if (canTravelTo(x, y+1)) {
            int trav = map.get(y+1).get(x).travel();
            if (trav != -1 && min < trav) {
                min = trav;
            }
        }
        if (canTravelTo(x+1, y)) {
            int trav = map.get(y).get(x+1).travel();
            if (trav != -1 && min < trav) {
                min = trav;
            }
        }
        return min;
    }

    private int travel() {
        if (y == map.size()-1 && x == map.get(0).size()-1) {
            return num;
        }
        canTravel = false;
        int min = -1;
        if (canTravelTo(x+1, y)) {
            int trav = map.get(y).get(x+1).travel();
            if (trav != -1 && min < trav) {
                min = trav;
            }
        }
        if (canTravelTo(x-1, y)) {
            int trav = map.get(y).get(x-1).travel();
            if (trav != -1 && min < trav) {
                min = trav;
            }
        }
        if (canTravelTo(x, y-1)) {
            int trav = map.get(y-1).get(x).travel();
            if (trav != -1 && min < trav) {
                min = trav;
            }
        }
        if (canTravelTo(x, y+1)) {
            int trav = map.get(y+1).get(x).travel();
            if (trav != -1 && min < trav) {
                min = trav;
            }
        }
        canTravel = true;
        if (min != -1) {
            return min + num;
        }
        return -1;
    }

    public boolean canTravelIn() {
        return canTravel;
    }

    public boolean canTravelTo(int x, int y) {
        if (x < 0 || x > map.get(0).size()-1 || y < 0 || y > map.size()-1) {
            return false;
        }
        return map.get(y).get(x).canTravelIn();
    }
}
