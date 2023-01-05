import java.util.*;

public class pascalsTriangle {
    public static List<List<Integer>> helper(int rows) {
        List<List<Integer>> result = new ArrayList<>();

        // base case
        if (rows == 0)
            return result;

        result.add(new ArrayList<>());
        result.get(0).add(1);
        for (int i = 1; i < rows; i++) {
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            for (int j = 1; j < i; j++) {
                curr.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
            }
            curr.add(1);
            result.add(curr);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(helper(8));
    }
}
