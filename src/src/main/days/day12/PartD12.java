package main.days.day12;

import main.Part;

import java.util.HashMap;

public class PartD12 extends Part {

    private final HashMap<String, Cave> caves = new HashMap<>();

    public Cave getCaveByName(String name) {
        return caves.get(name);
    }

    protected void addPath(String path) {

    }

    protected void addCave(String cave) {
        if (cave.equals("start")) {
            caves.put("start", new StartCave());
        } else if (cave.equals("end")) {
            caves.put("end", new EndCave());
        } else if (cave.toLowerCase().equals(cave)) {
            caves.put(cave, new SmallCave(cave));
        } else {
            caves.put(cave, new BigCave(cave));
        }
    }

}
