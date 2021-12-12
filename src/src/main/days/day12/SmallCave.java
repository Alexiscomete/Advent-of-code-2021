package main.days.day12;

public class SmallCave extends Cave {

    private boolean canTravel = true;
    private static boolean twice = true;
    private boolean twiceInstance = false;

    public SmallCave(String name) {
        super(name);
    }

    @Override
    void findPath(PartD12 partD12) {
        if (!twiceInstance) canTravel = false;
        for (String str : paths) {
            Cave cave = partD12.getCaveByName(str);
            if (cave.canTravelTo()) {
                cave.findPath(partD12);
            }
        }
        if (twiceInstance) {
            twiceInstance = false;
            twice = true;
        } else {
            canTravel = true;
        }
    }

    @Override
    public boolean canTravelTo() {
        if (canTravel) {
            return true;
        } else {
            if (twice) {
                twice = false;
                twiceInstance = true;
                return true;
            } else {
                return false;
            }
        }
    }
}
