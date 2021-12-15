package main.days.day14;

import main.Part;

import java.util.ArrayList;
import java.util.HashMap;

public class Part2d14 extends Part {
    public Part2d14() {
        final ArrayList<Rule> rules = new ArrayList<>();
        final String[] strings = {""};
        final short[] shorts = {0};
        getInput.forEach((str) -> {
            if (shorts[0] == 0) {
                shorts[0]++;
                strings[0] = str;
            } else if (shorts[0] == 1) {
                shorts[0]++;
            } else {
                rules.add(new Rule(str.charAt(0), str.charAt(1), str.charAt(6)));
            }
        });
        for (int i = 0; i < 40; i++) {
            System.out.println(i);
            String lastString = strings[0];
            strings[0] = "";
            for (int j = 0;  j < lastString.length()-1; j++) {
                strings[0] += lastString.charAt(j);
                for (Rule rule : rules) {
                    if (rule.isApply(lastString.charAt(j), lastString.charAt(j+1))) {
                        strings[0] += rule.c();
                        break;
                    }
                }
            }
            strings[0] += lastString.charAt(lastString.length()-1);
        }
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (Character c : strings[0].toCharArray()) {
            if (hashMap.containsKey(c)) {
                hashMap.replace(c, hashMap.get(c) +1);
            } else {
                hashMap.put(c, 1);
            }
        }
        ArrayList<Integer> integers = new ArrayList<>(hashMap.values());
        integers.sort(Integer::compareTo);
        System.out.println(integers.get(integers.size()-1) - integers.get(0));
    }
}
