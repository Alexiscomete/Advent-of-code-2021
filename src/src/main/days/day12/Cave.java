package main.days.day12;

import java.util.ArrayList;

public abstract class Cave {
    final String name;
    final ArrayList<String> paths = new ArrayList<>();

    protected Cave(String name) {
        this.name = name;
    }

    public void addPath(String path) {
        paths.add(path);
    }

    abstract void findPath();
}
