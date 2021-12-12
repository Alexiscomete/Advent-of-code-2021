package main.days.day12;

public class StartCave extends Cave {

    public StartCave() {
        super("start");
    }

    @Override
    void findPath() {

    }

    @Override
    public boolean canTravelTo() {
        return false;
    }
}
