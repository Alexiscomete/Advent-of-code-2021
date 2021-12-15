package main.days.day15;

import main.Part;

import java.util.ArrayList;

public class Part1d15 extends Part {
    public Part1d15() {
        int[] x = {0};
        getInput.forEach((str) -> {
            ArrayList<Case> cases = new ArrayList<>();
            for (int i = 0; i < str.length(); i++) {
                cases.add(new Case(str.charAt(i), i, x[0]));
            }
            x[0]++;
            Case.map.add(cases);
        });
        System.out.println(Case.map.get(0).get(0).startTravel());
    }
}
