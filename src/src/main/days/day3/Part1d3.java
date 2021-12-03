package main.days.day3;

import main.Part;

import java.util.ArrayList;

public class Part1d3 extends Part {

    public Part1d3() {
        final ArrayList<Integer[]> common = new ArrayList<>();

        getInput.forEach(s -> {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (common.size() == i) {
                    common.add(new Integer[]{0, 0});
                }
                if (c == '0') {
                    common.get(i)[0]++;
                } else {
                    common.get(i)[1]++;
                }
            }
        });

        StringBuilder stringBuilderMin = new StringBuilder(), stringBuilderMax = new StringBuilder();

        for (Integer[] i : common) {
            if (i[0] > i[1]) {
                stringBuilderMax.append(0);
                stringBuilderMin.append(1);
            } else {
                stringBuilderMax.append(1);
                stringBuilderMin.append(0);
            }
        }

        System.out.println(Integer.parseInt(stringBuilderMax.toString(), 2) * Integer.parseInt(stringBuilderMin.toString(), 2));

    }
}
