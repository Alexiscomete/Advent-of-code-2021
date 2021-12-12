package main.days.day12;

import main.Part;

import java.util.HashMap;

public class PartD12 extends Part {

    private final HashMap<String, Cave> caves = new HashMap<>();

    public Cave getCaveByName(String name) {
        return caves.get(name);
    }

    protected void addPath(String path) {
        String[] str = path.split("-");
        if (!caves.containsKey(str[0])) {
            addCave(str[0]);
        }
        caves.get(str[0]).addPath(str[1]);
        if (!caves.containsKey(str[1])) {
            addCave(str[1]);
        }
        caves.get(str[1]).addPath(str[0]);
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
