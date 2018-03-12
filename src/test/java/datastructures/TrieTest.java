package datastructures;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TrieTest {

    @Test
    public void addWordsAndGetCount() {
        Trie trie = new Trie();
        assertEquals(0, trie.getCount("mic"));
        assertFalse(trie.hasWord("mic"));
        trie.addWord("mic");
        assertTrue(trie.hasWord("mic"));
        assertFalse(trie.hasWord("micro"));
        assertEquals(1, trie.getCount("mic"));
        assertEquals(1, trie.getCount("mi"));
        assertEquals(1, trie.getCount("m"));
        assertEquals(0, trie.getCount("mick"));
        trie.addWord("micro");
        assertTrue(trie.hasWord("micro"));
        assertTrue(trie.hasWord("mic"));
        assertFalse(trie.hasWord("micr"));
        assertEquals(2, trie.getCount("mic"));
        assertEquals(1, trie.getCount("micr"));
        trie.addWord("microscope");
        trie.addWord("micky");
        assertEquals(4, trie.getCount("mic"));
    }
}