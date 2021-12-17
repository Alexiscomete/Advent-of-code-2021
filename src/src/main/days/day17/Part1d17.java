package main.days.day17;

import main.Part;

public class Part1d17 extends Part {
    private final int[] pos = {0, 0, 0, 0};

    public Part1d17() {
        getInput.forEach((str) -> {
            str = str.replace('.', ';');
            str = str.substring(15);
            String[] strings = str.split(", y=");
            String[] x = strings[0].split(";;");
            String[] y = strings[0].split(";;");
            pos[0] = Integer.parseInt(x[0]);
            pos[1] = Integer.parseInt(x[1]);
            pos[2] = Integer.parseInt(y[0]);
            pos[3] = Integer.parseInt(y[1]);
        });
        System.out.println(getMaxY(getVelocityY(getVelocityX())));
    }

    public Integer getMaxY(int velY) {
        int y = 0;
        while (velY > 0) {
            y += velY;
            velY--;
        }
        return y;
    }

    public Integer getVelocityX() {
        return (int) (((Math.sqrt(8.0 * pos[0] + 1.0) - 1.0) + 1) / 2);
    }

    public Integer getVelocityY(int velX) {
        int velY = 0;
        boolean rep = true, dir = simulate(velX, velY);
        while (rep) {
            boolean sim = simulate(velX, velY);
            if (dir) {
                if (sim) {
                    velY++;
                } else {
                    rep = false;
                    velY--;
                }
            } else {
                if (sim) {
                    rep = false;
                } else {
                    velY--;
                }
            }
        }
        return velY;
    }

    public boolean simulate(int velX, int velY) {
        int x = 0, y = 0;
        while (x <= pos[1] && y <= pos[3]) {
            x += velX;
            y += velY;
            if (x >= pos[0] && y >= pos[2]) {
                return true;
            }
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
