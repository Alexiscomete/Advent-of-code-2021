package main.days.day6;

public class Fish {
    private int days;
    private final int maxDay;

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getMaxDay() {
        return maxDay;
    }

    public Fish(int days, int maxDay) {
        this.days = days;
        this.maxDay = maxDay;
    }

    @Override
    public String toString() {
        return "F{" +days + '}';
    }
}
