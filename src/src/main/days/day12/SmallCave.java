package main.days.day12;

public class SmallCave extends Cave {

    private boolean canTravel = true;

    public SmallCave(String name) {
        super(name);
    }

    @Override
    void findPath(PartD12 partD12) {
        canTravel = false;
        for (String str : paths) {
            Cave cave = partD12.getCaveByName(str);
            if (cave.canTravelTo()) {
                cave.findPath(partD12);
            }
        }
        canTravel = true;
    }

    @Override
    public boolean canTravelTo() {
        return canTravel;
    }
}
