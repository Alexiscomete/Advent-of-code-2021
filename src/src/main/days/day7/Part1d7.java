package main.days.day7;

import main.Part;

import java.util.Arrays;

public class Part1d7 extends Part {
    public Part1d7() {
        final int[][] integers = {{}};
        final int[] total = {0};

        getInput.forEach((str) -> {
            String[] strings = str.split(",");
            int[] ints = new int[strings.length];
            for (int i = 0; i < strings.length; i++) {
                int j = Integer.parseInt(strings[i]);
                ints[i] = j;
                total[0] += j;
            }
            integers[0] = ints;
        });

        integers[0] = Arrays.stream(integers[0]).sorted().toArray();
        long coox;
        if (integers[0].length%2==0) {
            coox = integers[0][integers[0].length/2];
        } else {
            coox = (integers[0][(integers[0].length-1)/2] + integers[0][(integers[0].length+1)/2]) / 2;
        }

        long distTotal = 0;

        for (int i : integers[0]) {
            distTotal += Math.abs(i - coox);
        }

        System.out.println(total[0]);
        System.out.println(integers[0].length);
        System.out.println(coox);
        System.out.println(distTotal);

        distTotal = 0;
        for (int i : integers[0]) {
            distTotal += Math.abs(i - coox - 1);
        }
        System.out.println(distTotal);

        distTotal = 0;
        for (int i : integers[0]) {
            distTotal += Math.abs(i - coox - 2);
        }
        System.out.println(distTotal);

        distTotal = 0;
        for (int i : integers[0]) {
            distTotal += Math.abs(i - coox + 3);
        }
        System.out.println(distTotal);

        distTotal = 0;
        for (int i : integers[0]) {
            distTotal += Math.abs(i - coox + 4);
        }
        System.out.println(distTotal);

        distTotal = 0;
        for (int i : integers[0]) {
            distTotal += Math.abs(i - coox + 5);
        }
        System.out.println(distTotal);

        distTotal = 0;
        for (int i : integers[0]) {
            distTotal += Math.abs(i - coox + 6);
        }
        System.out.println(distTotal);

        long lastDist = distTotal +2;
        int i = 40;
        while (lastDist > distTotal) {
            lastDist = distTotal;
            distTotal = 0;
            for (int j : integers[0]) {
                distTotal += Math.abs(j - coox + i);
            }
            System.out.println(distTotal);
            i++;
        }

    }
}
