package main.days.day12;

public class StartCave extends Cave {

    public StartCave() {
        super("start");
    }

    @Override
    void findPath(PartD12 partD12) {
        for (String str : paths) {
            partD12.getCaveByName(str).findPath(partD12);
        }
    }

    @Override
    public boolean canTravelTo() {
        return false;
    }
}
