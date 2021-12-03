package main.days.day3;

import main.Part;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Part2d3 extends Part {


    public Part2d3() {
        ArrayList<String> min = getInput.getStrings();
        ArrayList<String> max = getInput.getStrings();

        int itMax = 0;
        while(max.size() > 1) {
            boolean com = common(itMax, max);
            int finalItMax = itMax;
            max.removeIf(str -> (str.charAt(finalItMax) == '1') != com);
            itMax++;
        }
        int itMin = 0;
        while(min.size() > 1) {
            boolean com = common(itMin, min);
            int finalItMin = itMin;
            min.removeIf(str -> (str.charAt(finalItMin) == '1') == com);
            itMin++;
        }

        System.out.println(min.get(0) + max.get(0));
        System.out.println(Integer.parseInt(min.get(0), 2) * Integer.parseInt(max.get(0), 2));

    }

    public boolean common(int i, ArrayList<String> str) {
        final Integer[] common = {0, 0};
        str.forEach(s -> {
            char c = s.charAt(i);
            if (c == '0') {
                common[0]++;
            } else {
                common[1]++;
            }
        });
        return common[1] >= common[0];
    }
}
