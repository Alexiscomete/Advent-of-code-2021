package main.day1;

import main.Part;

import java.util.function.Consumer;

public class Part2 extends Part {
    public Part2() {
        final int[] answer = {0};
        System.out.println("Consumer :");
        getInput.forEach(new Consumer<>() {
            Integer last = null, A = null, B = null, C = null;


            @Override
            public void accept(String s) {
                System.out.println("accept");
                C = B;
                B = A;
                A = Integer.parseInt(s);
                if (B != null && C != null) {
                    int sum = A + B + C;
                    if (last != null && last < sum) {
                        answer[0]++;
                    }
                    last = sum;
                }
            }
        });
        System.out.println(answer[0]);
    }
}
