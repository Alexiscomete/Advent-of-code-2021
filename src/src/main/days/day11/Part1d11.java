package main.days.day11;

import main.Part;

import java.util.Arrays;
import java.util.function.Consumer;

public class Part1d11 extends Part {
    int[][] cases = new int[10][10];

    public Part1d11() {
        getInput.forEach(new Consumer<>() {
            int i = 0;

            @Override
            public void accept(String s) {
                for (int j = 0; j < 10; j++) {
                    char c = s.charAt(j);
                    cases[i][j] = Integer.parseInt(String.valueOf(c));
                }
                i++;
            }
        });

        int answer = 0;

        for (int i = 0; i < 100; i++) {

            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    cases[k][j]++;
                }
            }

            while (check()) {
                for (int j = 0; j < 10; j++) {
                    for (int k = 0; k < 10; k++) {
                        if (cases[j][k] > 9) {
                            cases[j][k] = -1;
                            if (j != 0) {
                                if (k != 0 && cases[j-1][k-1] != -1) cases[j-1][k-1]++;
                                if (cases[j-1][k] != -1) cases[j-1][k]++;
                                if (k != 9 && cases[j-1][k+1] != -1) cases[j-1][k+1]++;
                            }
                            if (k != 0 && cases[j][k-1] != -1) cases[j][k-1]++;
                            if (k != 9 && cases[j][k+1] != -1) cases[j][k+1]++;
                            if (j != 9) {
                                if (k != 0 && cases[j+1][k-1] != -1) cases[j+1][k-1]++;
                                if (cases[j+1][k] != -1) cases[j+1][k]++;
                                if (k != 9 && cases[j+1][k+1] != -1) cases[j+1][k+1]++;
                            }
                        }
                    }
                }
            }

            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    if (cases[j][k] == -1) {
                        cases[j][k] = 0;
                        answer++;
                    }
                }
                System.out.println(Arrays.toString(cases[j]));
            }
            System.out.println("-----");
        }

        System.out.println(answer);
    }

    public boolean check() {
        for (int j = 0; j < 10; j++) {
            for (int k = 0; k < 10; k++) {
                if (cases[j][k] > 9) {
                    return true;
                }
            }
        }
        return false;
    }
}
