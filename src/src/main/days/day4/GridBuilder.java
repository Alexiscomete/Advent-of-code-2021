package main.days.day4;

public class GridBuilder {
    BingoCase[][] bingoCases;

    public GridBuilder() {
        reset();
    }

    private void reset() {
        bingoCases = new BingoCase[5][5];
    }

    public void setLine(int line, int value0, int value1, int value2, int value3, int value4) {
        bingoCases[line] = new BingoCase[]{new BingoCase(value0), new BingoCase(value1), new BingoCase(value2), new BingoCase(value3), new BingoCase(value4)};
    }

    public BingoGrid generate() {
        BingoGrid bingoGrid = new BingoGrid(bingoCases);
        reset();
        return bingoGrid;
    }
}
