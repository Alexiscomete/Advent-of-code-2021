package main.days.day9;

import main.Part;

import java.util.ArrayList;

public class Part1d9 extends Part {
    public Part1d9() {
        final ArrayList<String> arrayList = new ArrayList<>();
        getInput.forEach(arrayList::add);
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
}
