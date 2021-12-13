package main;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.function.Consumer;

public class GetInput {
    private final ArrayList<String> strings = new ArrayList<>();

    public GetInput() {
        System.out.println("Your input :");
        Scanner sc = new Scanner(System.in);
        String answer = "";
        while (!Objects.equals(answer, "stop")) {
            answer = sc.nextLine();
            if (!Objects.equals(answer, "stop")) {
                strings.add(answer);
            }
        }
        System.out.println("Stop input");
    }

    public void forEach(Consumer<String> stringConsumer) {
        strings.forEach(stringConsumer);
    }

    public ArrayList<String> getStrings() {
        ArrayList<String> answer = new ArrayList<>();
        forEach(answer::add);
        return answer;
    }
}
