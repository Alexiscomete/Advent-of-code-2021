package main.days.day12;

public class EndCave extends Cave {

    public EndCave() {
        super("end");
    }

    @Override
    void findPath(PartD12 partD12) {
        partD12.numberOfPaths++;
    }
}
