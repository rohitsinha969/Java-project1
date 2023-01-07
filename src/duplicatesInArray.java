import java.util.*;

public class duplicatesInArray {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 4, 2, 1, 8, 9, 0 };

        ArrayList<Integer> ans = new ArrayList<Integer>();

        Arrays.sort(arr);
        int i = 0;
        int j = 1;
        int eV = -1;

        while (j < arr.length) {
            if (arr[i] == arr[j]) {
                ans.add(i);
            }
        }
        if (ans.isEmpty()) {
            ans.add(eV);
        }
        System.out.println(arr);
    }
}
