package main.days.day12;

public class SmallCave extends Cave {

    public SmallCave(String name) {
        super(name);
    }

    @Override
    void findPath() {

    }

    @Override
    public boolean canTravelTo() {
        return false;
    }
}
