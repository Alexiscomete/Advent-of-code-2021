package main.days.day8;

import main.Part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Part2d8 extends Part {
    public Part2d8() {
        int[] i = {0};
        final Character[] chars = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};

        getInput.forEach(s -> {
            String[] strings = s.substring(s.indexOf("|") + 1).split(" ");
            List<Character> charactersH0 = new ArrayList<>(), charactersH1 = new ArrayList<>(), charactersH2 = new ArrayList<>(), charactersV0R = new ArrayList<>(), charactersV0L = new ArrayList<>(), charactersV1R = new ArrayList<>(), charactersV1L = new ArrayList<>();
            Collections.addAll(charactersH0, chars);
            Collections.addAll(charactersH1, chars);
            Collections.addAll(charactersH2, chars);
            Collections.addAll(charactersV0L, chars);
            Collections.addAll(charactersV0R, chars);
            Collections.addAll(charactersV1L, chars);
            Collections.addAll(charactersV1R, chars);

            for (String digit : strings) {
                if (digit.length() == 2) {
                    for (Character c : charactersH0) {
                        if (!digit.contains(c)) {

                        }
                    }
                }
            }
        });

        System.out.println(i[0]);
    }
}
