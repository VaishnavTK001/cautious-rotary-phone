import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaSortDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Cherry");
        names.add("Apple");
        names.add("Berry");

        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));

        System.out.println("Sorted list:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
