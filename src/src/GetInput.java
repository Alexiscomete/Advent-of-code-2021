import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;

public class GetInput {
    ArrayList<String> strings = new ArrayList<>();

    public GetInput() {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            strings.add(sc.nextLine());
        }
    }

    public void forEach(Consumer<String> stringConsumer) {
        strings.forEach(stringConsumer);
    }
}
