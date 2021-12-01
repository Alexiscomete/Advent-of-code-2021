package main.day1;

import main.Part;

import java.util.function.Consumer;

public class Part1 extends Part {
    public Part1() {
        final int[] answer = {0};
        System.out.println("Consumer :");
        getInput.forEach(new Consumer<>() {
            Integer last = null;

            @Override
            public void accept(String s) {
                System.out.println("accept");
                int integer = Integer.parseInt(s);
                if (last != null && last < integer) {
                    answer[0]++;
                }
                last = integer;
            }
        });
        System.out.println(answer[0]);
    }
}
