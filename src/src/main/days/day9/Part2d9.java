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
        int sum = 0;
        for (int x = 0; x < arrayList.size(); x++) {
            String line = arrayList.get(x);
            for (int y = 0; y < line.length(); y++) {
                char caseChar = line.charAt(y);
                if ((y == 0 || line.charAt(y-1) > caseChar) && (x == 0 || arrayList.get(x-1).charAt(y) > caseChar) && (y == line.length()-1 || line.charAt(y+1) > caseChar) && (x == arrayList.size()-1 || arrayList.get(x+1).charAt(y) > caseChar)) {
                    sum+=Integer.parseInt(String.valueOf(caseChar))+1;
                }
            }
        }
        System.out.println(sum);
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
