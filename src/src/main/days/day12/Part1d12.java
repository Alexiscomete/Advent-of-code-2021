package main.days.day12;

public class Part1d12 extends PartD12 {
    public Part1d12() {
        getInput.forEach(this::addPath);
        getCaveByName("start").findPath();
        System.out.println(EndCave.paths);
    }
}
