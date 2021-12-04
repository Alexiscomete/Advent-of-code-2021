package main.days.day4;

import main.Part;

import java.util.ArrayList;

public class Part1d4 extends Part {

    final ArrayList<BingoGrid> bingoGrids = new ArrayList<>();
    final ArrayList<Integer> integers = new ArrayList<>();
    BingoGrid vic = null;

    public Part1d4() {
        final int[] i = {-1};
        final GridBuilder gridBuilder = new GridBuilder();

        getInput.forEach((line) -> {
            if (i[0] == -1) {
                String[] strings = line.split(",");
                for (String s : strings) {
                    integers.add(Integer.parseInt(s));
                }
            } else if (i[0] > 0){
                String[] strings = line.split(" ");
                gridBuilder.setLine(i[0]-1, Integer.parseInt(strings[0]), Integer.parseInt(strings[1]), Integer.parseInt(strings[2]), Integer.parseInt(strings[3]), Integer.parseInt(strings[4]));
                if (i[0] == 5) {
                    i[0] = -1;
                    bingoGrids.add(gridBuilder.generate());
                }
            }
            i[0]++;
        });

        int it = -1;
        do {
            it++;
            for (BingoGrid bingoGrid : bingoGrids) {
                bingoGrid.mark(integers.get(it));
            }
        } while (!align());

        i[0] = 0;

        vic.forEach((c) -> {
            if (!c.isMarked()) {
                i[0] += c.getValue();
            }
        });

        System.out.println(i[0] * integers.get(it));

    }

    public boolean align() {
        for (BingoGrid bingoGrid : bingoGrids) {
            if (bingoGrid.victory()) {
                vic = bingoGrid;
                return true;
            }
        }
        return false;
    }
}
