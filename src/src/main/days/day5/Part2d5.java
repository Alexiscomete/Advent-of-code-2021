package main.days.day5;

import main.Part;

import java.util.HashMap;

public class Part2d5 extends Part {

    public Part2d5() {
        final HashMap<Integer, HashMap<Integer, Short>> map = new HashMap<>();
        final int[] num = {0};

        getInput.forEach((str) -> {
            System.out.println(str);
            String[] strings = str.split(" -> ");
            String[] coo1 = strings[0].split(","), coo2 = strings[1].split(",");
            int x1 = Integer.parseInt(coo1[0]), x2 = Integer.parseInt(coo2[0]), y1 = Integer.parseInt(coo1[1]), y2 = Integer.parseInt(coo2[1]);
            if ((x1 == x2) || (y1 == y2)) {
                int xmin, xmax, ymin, ymax;
                if (x1 < x2) {
                    xmin = x1;
                    xmax = x2;
                } else {
                    xmin = x2;
                    xmax = x1;
                }
                if (y1 < y2) {
                    ymin = y1;
                    ymax = y2;
                } else {
                    ymin = y2;
                    ymax = y1;
                }
                for (int i = xmin; i < xmax +1; i++) {
                    HashMap<Integer, Short> tempMap;
                    if (!map.containsKey(i)) {
                        tempMap = new HashMap<>();
                        map.put(i, tempMap);
                    } else {
                        tempMap = map.get(i);
                    }
                    for (int j = ymin; j < ymax + 1; j++) {
                        if (!tempMap.containsKey(j)) {
                            tempMap.put(j, (short) 1);
                        } else if (tempMap.get(j) == 1){
                            System.out.println("+1hv");
                            tempMap.replace(j, (short) (2));
                            num[0]++;
                        }
                    }
                }
            } else {
                int xmin, xmax, ymin, ymax;
                if (x1 < x2) {
                    xmin = x1;
                    xmax = x2;
                } else {
                    xmin = x2;
                    xmax = x1;
                }
                if (y1 < y2) {
                    ymin = y1;
                    ymax = y2;
                } else {
                    ymin = y2;
                    ymax = y1;
                }
                for (int i = xmin, j = ymin; i < xmax +1 && j < ymax +1; i++, j++) {
                    HashMap<Integer, Short> tempMap;
                    if (!map.containsKey(i)) {
                        tempMap = new HashMap<>();
                        map.put(i, tempMap);
                    } else {
                        tempMap = map.get(i);
                    }

                    if (!tempMap.containsKey(j)) {
                        tempMap.put(j, (short) 1);
                    } else if (tempMap.get(j) == 1){
                        System.out.println("+1d");
                        tempMap.replace(j, (short) (2));
                        num[0]++;
                    }
                }
            }
        });

        System.out.println(num[0]);
    }
}
