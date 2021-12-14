package main.days.day14;

public record Rule(char a, char b, char c) {

    public boolean isApply(char a, char b) {
        return this.a == a && this.b == b;
    }
}
