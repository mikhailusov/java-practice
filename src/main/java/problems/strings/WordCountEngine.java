package problems.strings;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * from pramp.com
 *
 * Implement a document scanning function wordCountEngine, which receives a string document and returns a list of all
 * unique words in it and their number of occurrences, sorted by the number of occurrences in a descending order. If
 * two or more words have the same count, they should be sorted according to their order in the original sentence.
 * Assume that all letters are in english alphabet. You function should be case-insensitive, so for instance, the words
 * “Perfect” and “perfect” should be considered the same word.
 *
 * The engine should strip out punctuation (even in the middle of a word) and use whitespaces to separate words.
 */
public class WordCountEngine {

    public static String[][] wordCountEngine(String document) {
        String[] words = document.trim().toLowerCase().replaceAll("[^a-z ]", "").split(" ");
        Map<String, Integer> dict = new HashMap<>();

        for (String word: words) {
            if (word.length() < 1) continue;
            if (dict.containsKey(word)) {
                dict.put(word, dict.get(word) + 1);
            } else {
                dict.put(word, 1);
            }
        }

        String[][] result = new String[dict.size()][];

        int i = 0;
        Set<String> set = new HashSet<>();
        for (String word: words) {
            if (word.length() < 1) continue;
            if (!set.contains(word)) {
                result[i++] = new String[]{word, ""+dict.get(word)};
                set.add(word);
            }
        }

        Arrays.sort(result, Comparator.comparing((String[] w) -> w[1]).reversed());

        return result;
    }
}
