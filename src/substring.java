public class substring {
    public static void main(String[] args) {
        String s = "abobobzdkjbaibobandfkbob";
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == 'b') {
                int start = i;
                int end = i + 3;
                String ss = s.substring(start, end);
                if (ss.equals("bob"))
                    count++;
            }
        }
        System.out.println(count);
    }
}
