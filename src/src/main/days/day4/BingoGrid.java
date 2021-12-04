package main.days.day4;

import java.util.function.Consumer;

public record BingoGrid(BingoCase[][] bingoCases) {

    public void setMarkCase(int i, int j, boolean value) {
        bingoCases[i][j].setMarked(value);
    }

    public boolean victory() {

        for (BingoCase[] bingoCase : bingoCases) {
            if (bingoCase[0].isMarked() && bingoCase[1].isMarked() && bingoCase[2].isMarked() && bingoCase[3].isMarked() && bingoCase[4].isMarked()) {
                return true;
            }
        }

        for (int i = 0; i < 5; i++) {
            if (bingoCases[0][i].isMarked() && bingoCases[1][i].isMarked() && bingoCases[2][i].isMarked() && bingoCases[3][i].isMarked() && bingoCases[4][i].isMarked()) {
                return true;
            }
        }

        return false;
    }

    public void mark(int num) {
        for (BingoCase[] bingoCases1 : bingoCases) {
            for (BingoCase bingoCase : bingoCases1) {
                if (bingoCase.getValue() == num) {
                    bingoCase.setMarked(true);
                }
            }
        }
    }

    public void forEach(Consumer<BingoCase> bingoCaseConsumer) {
        for (BingoCase[] bingoCases1 : bingoCases) {
            for (BingoCase bingoCase : bingoCases1) {
                bingoCaseConsumer.accept(bingoCase);
            }
        }
    }

}
