package main.days.day17;

import main.Part;

public class Part1d17 extends Part {
    private final int[] pos = {0, 0, 0, 0};

    public Part1d17() {
        getInput.forEach((str) -> {
            str = str.substring(15);
            String[] strings = str.split(", y=");
            String[] x = strings[0].split("..");
            String[] y = strings[0].split("..");
            pos[0] = Integer.parseInt(x[0]);
            pos[1] = Integer.parseInt(x[1]);
            pos[2] = Integer.parseInt(y[0]);
            pos[3] = Integer.parseInt(y[1]);
        });

    }

    public Integer getVelocityX() {
        return 0;
    }

    public Integer getVelocityY() {
        return 0;
    }

    public boolean simulate(int velX, int velY) {
        int x = 0, y = 0;
        while (x < pos[1] && y < pos[3]) {
            x += velX;
            y += velY;
            velY--;
            if (x > 0) {
                velX--;
            } else if (x < 0) {
                velX++;
            }
        }
        return false;
    }
}
