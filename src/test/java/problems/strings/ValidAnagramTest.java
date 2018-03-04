package problems.strings;

import org.junit.Test;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class ValidAnagramTest {

    @Test
    public void isAnagram() {
        assertTrue(ValidAnagram.isAnagram("anagram", "raganam"));
        assertTrue(ValidAnagram.isAnagram("cat", "tac"));
        assertTrue(ValidAnagram.isAnagram("ab", "ba"));
        assertTrue(ValidAnagram.isAnagram("a", "a"));
        assertTrue(ValidAnagram.isAnagram("", ""));
        assertFalse(ValidAnagram.isAnagram("cat", "rat"));
        assertFalse(ValidAnagram.isAnagram("a", "ab"));
        assertFalse(ValidAnagram.isAnagram("aba", "bab"));
        assertFalse(ValidAnagram.isAnagram("ssc", "ssf"));
        assertFalse(ValidAnagram.isAnagram("a", ""));
        assertFalse(ValidAnagram.isAnagram("", "b"));
    }
}