package problems.strings;

import java.util.ArrayList;
import java.util.List;

/**
 * from leetcode.com
 *
 * Given a digit string, return all possible letter combinations that the number could represent.
 * A mapping of digit to letters (just like on the telephone buttons) is given below.
 */
public class PhoneNumberLetters {

    private static final String[] dict = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static List<String> letterCombinations(String digits) {
        if (digits.length() < 1) return new ArrayList<>();
        int index = Character.getNumericValue(digits.charAt(0));
        return combs(dict[index], digits.substring(1));
    }

    private static List<String> combs(String firstPart, String digits) {
        List<String> list = new ArrayList<>();

        for (char ch: firstPart.toCharArray()) {
            StringBuffer sb = new StringBuffer();
            sb.append(ch);
            if (digits.length() > 0) {
                int index = Character.getNumericValue(digits.charAt(0));
                for (String comb: combs(dict[index], digits.substring(1))) {
                    list.add(sb.toString() + comb);
                }
            } else {
                list.add(sb.toString());
            }
        }
        return list;
    }
}