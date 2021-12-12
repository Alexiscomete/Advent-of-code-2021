package main.days.day12;

public class BigCave extends Cave {

    public BigCave(String name) {
        super(name);
    }

    @Override
    void findPath(PartD12 partD12) {
        for (String str : paths) {
            Cave cave = partD12.getCaveByName(str);
            if (cave.canTravelTo()) {
                cave.findPath(partD12);
            }
        }
    }
}
