package problems.strings;

/**
 * from leetcode.com
 *
 * Given two strings s and t, write a function to determine if t is an anagram of s.
 * For example,
 * s = "anagram", t = "nagaram", return true.
 * s = "rat", t = "car", return false.
 *
 * You may assume the string contains only lowercase alphabets.
 */
public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        if (s.length() == 0 && t.length() == 0) return true;

        int[] map = new int[26];

        for (int i = 0; i < s.length(); i++) {
            map[s.charAt(i) - 'a']++;
            map[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < map.length; i++) {
            if (map[i] != 0)
                return false;
        }

        return true;
    }
}
