package main.days.day6;

import main.Part;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Part1d6 extends Part {

    public Part1d6() {
        getInput.forEach((new Consumer<>() {
            boolean aBoolean = true;
            final ArrayList<Fish> fishArray = new ArrayList<>();

            @Override
            public void accept(String s) {
                if (aBoolean) {
                    aBoolean = false;
                    String[] list = s.split(",");
                    for (String str : list) {
                        fishArray.add(new Fish(Integer.parseInt(str), 7));
                    }
                } else {
                    int max = Integer.parseInt(s);
                    for (int i = 0; i < max; i++) {
                        ArrayList<Fish> newFish = new ArrayList<>();
                        for (Fish fish : fishArray) {
                            fish.setDays(fish.getDays()-1);
                            if (fish.getDays() == 0) {
                                fish.setDays(fish.getMaxDay());
                                newFish.add(new Fish(fish.getMaxDay() +2, fish.getMaxDay() +2));
                            }
                        }
                        fishArray.addAll(newFish);
                    }
                    System.out.println(fishArray.size());
                }
            }
        }));
    }
}
