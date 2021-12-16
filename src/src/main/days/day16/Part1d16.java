package main.days.day16;

import main.Part;

import java.util.Arrays;
import java.util.List;

public class Part1d16 extends Part {

    public Part1d16() {

        final List<String> bin = Arrays.asList("0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111");
        final List<Character> hexa = Arrays.asList('0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F');

        getInput.forEach((str) -> {
            StringBuilder binVal = new StringBuilder();
            for (char c : str.toCharArray()) {
                binVal.append(bin.get(hexa.indexOf(c)));
            }

        });
    }
}
