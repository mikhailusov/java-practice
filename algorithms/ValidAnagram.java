/**
 * from leetcode.com
 *
 * Valid Anagram
 *
 * Given two strings s and t, write a function to determine if t is an anagram of s.
 *
 * For example,
 * s = "anagram", t = "nagaram", return true.
 * s = "rat", t = "car", return false.
 *
 * You may assume the string contains only lowercase alphabets.
 */

public class ValidAnagram {

    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        if (s1.length() == 0) return true;

        int[] map = new int[26];

       for (int i = 0; i < s1.length(); i++) {
           map[s1.charAt(i) - 'a']++;
           map[s2.charAt(i) - 'a']--;
       }

       for (int i = 0; i < map.length; i++) {
           if (map[i] != 0)
               return false;
       }

        return true;
    }
}
