package main.days.day4;

public class BingoCase {

    private int value;
    private boolean isMarked;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isMarked() {
        return isMarked;
    }

    public void setMarked(boolean marked) {
        isMarked = marked;
    }

    public BingoCase(int value) {
        this.value = value;
        this.isMarked = false;
    }
}
