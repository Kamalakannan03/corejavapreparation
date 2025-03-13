package Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class One {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        list.parallelStream().forEach(list::remove); // Throws ConcurrentModificationException

    }
}
