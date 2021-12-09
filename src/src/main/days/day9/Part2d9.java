package main.days.day9;

import main.Part;

import java.util.ArrayList;

public class Part2d9 extends Part {
    private ArrayList<ArrayList<Boolean>> arr = new ArrayList<>();
    private ArrayList<String> arrayList = new ArrayList<>();

    public Part2d9() {
        getInput.forEach((str) -> {
            arrayList.add(str);
            ArrayList<Boolean> temp = new ArrayList<>();
            for (int i = 0;  i < str.length(); i++) {
                temp.add(true);
            }
            arr.add(temp);
        });
        ArrayList<Integer> basinSizes = new ArrayList<>();
        for (int x = 0; x < arrayList.size(); x++) {
            String line = arrayList.get(x);
            for (int y = 0; y < line.length(); y++) {
                if (arr.get(x).get(y)) {
                    basinSizes.add(calcBasin(x, y));
                }
            }
        }
        basinSizes.sort(Integer::compareTo);
        System.out.println(basinSizes.get(basinSizes.size()-1) * basinSizes.get(basinSizes.size()-2) * basinSizes.get(basinSizes.size()-3));
    }

    public int calcBasin(int x, int y) {
        arr.get(x).set(y, false);
        if (arrayList.get(x).charAt(y) == '9') {
            return 0;
        }
        int sum = 1;
        if (y != 0 && arr.get(x).get(y-1)) {
            sum+=calcBasin(x, y-1);
        }
        if (x != 0 && arr.get(x-1).get(y)) {
            sum+=calcBasin(x-1, y);
        }
        if (y != arrayList.get(x).length()-1 && arr.get(x).get(y+1)) {
            sum+=calcBasin(x, y+1);
        }
        if (x != arrayList.size()-1 && arr.get(x+1).get(y)) {
            sum+=calcBasin(x+1, y);
        }
        return sum;
    }
}
