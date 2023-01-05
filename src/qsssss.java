import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class qsssss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data = "cat batman latt matter cat matter cat";

        Map<String, Integer> mp = new HashMap<>();
        String[] words = data.split(" ");

        for (String word : words) {
            Integer frequency = mp.get(word);

            if (frequency == null) {
                mp.put(word, 1);
            } else {
                mp.put(word, frequency + 1);
            }

        }

        System.out.println(mp);
        sc.close();
    }
}
