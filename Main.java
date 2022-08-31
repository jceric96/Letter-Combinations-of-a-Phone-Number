import java.util.*;

public class Main {

    private static final String[] KEYS = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    static List<String> letterCombinations(String digits) {
        List<String> results = new LinkedList<String>();
        combination("", digits, 0, results);
        return results;
    }

    private static void combination(String prefix, String digits, int index, List<String> results) {
        if (index >= digits.length()) {
            results.add(prefix);
            return;
        }
        String letters = KEYS[(digits.charAt(index) - '0')];
        for (int i = 0; i < letters.length(); i++) {
            combination(prefix + letters.charAt(i), digits, index + 1, results);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> res;

        String _digits;
        try {
            _digits = in.nextLine();
        } catch (Exception e) {
            _digits = null;
        }

        res = letterCombinations(_digits);
        Collections.sort(res);
        for (int res_i = 0; res_i < res.size(); res_i++) {
            System.out.println(res.get(res_i));
        }
        in.close();
    }
}