package datastructures;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class HashTableTest {

    @Test
    public void putAndContainsKey() {
        HashTable<String, Integer> hashTable = new HashTable<>();
        assertFalse(hashTable.containsKey("One"));
        assertFalse(hashTable.containsKey(""));
        assertFalse(hashTable.containsKey(null));
        hashTable.put("One", 1);
        assertTrue(hashTable.containsKey("One"));
        assertFalse(hashTable.containsKey("Two"));
        hashTable.put("Two", 2);
        assertTrue(hashTable.containsKey("Two"));
        assertFalse(hashTable.containsKey("Three"));
        hashTable.put("Three", 3);
        assertTrue(hashTable.containsKey("Three"));
        assertFalse(hashTable.containsKey("Four"));
        assertFalse(hashTable.containsKey(""));
        assertFalse(hashTable.containsKey(null));
        hashTable.put("One", 1);
    }

    @Test
    public void get() {
        HashTable<String, Integer> hashTable = new HashTable<>();
        hashTable.put("One", 1);
        hashTable.put("Two", 2);
        hashTable.put("Three", 3);
        assertEquals(java.util.Optional.of(1), java.util.Optional.ofNullable(hashTable.get("One")));
        assertEquals(java.util.Optional.of(2), java.util.Optional.ofNullable(hashTable.get("Two")));
        assertEquals(java.util.Optional.of(3), java.util.Optional.ofNullable(hashTable.get("Three")));
        hashTable.put("Two", 22);
        assertEquals(java.util.Optional.of(22), java.util.Optional.ofNullable(hashTable.get("Two")));
    }

    @Test
    public void removeAndSize() {
        HashTable<String, Integer> hashTable = new HashTable<>();
        hashTable.remove(null);
        hashTable.remove("");
        hashTable.remove("a");
        hashTable.remove("abc");
        assertEquals(0, hashTable.getSize());
        hashTable.put("One", 1);
        assertEquals(1, hashTable.getSize());
        hashTable.put("Two", 1);
        assertEquals(2, hashTable.getSize());
        hashTable.put("Three", 3);
        assertTrue(hashTable.containsKey("One"));
        assertTrue(hashTable.containsKey("Two"));
        assertTrue(hashTable.containsKey("Three"));
        assertEquals(3, hashTable.getSize());
        hashTable.remove("Two");
        assertFalse(hashTable.containsKey("Two"));
        assertTrue(hashTable.containsKey("One"));
        assertTrue(hashTable.containsKey("Three"));
        hashTable.remove("a");
        hashTable.remove(null);
        hashTable.remove("Two");
        assertFalse(hashTable.containsKey("Two"));
        assertTrue(hashTable.containsKey("One"));
        assertTrue(hashTable.containsKey("Three"));
        assertEquals(2, hashTable.getSize());
        hashTable.remove("One");
        hashTable.remove("Two");
        hashTable.remove(null);
        assertTrue(hashTable.containsKey("Three"));
        assertEquals(1, hashTable.getSize());
    }

    @Test
    public void isEmpty() {
        HashTable<String, Integer> hashTable = new HashTable<>();
        assertTrue(hashTable.isEmpty());
        hashTable.put("One", 1);
        assertFalse(hashTable.isEmpty());
        hashTable.put("Two", 2);
        assertFalse(hashTable.isEmpty());
        hashTable.remove("One");
        assertFalse(hashTable.isEmpty());
        hashTable.remove("Two");
        assertTrue(hashTable.isEmpty());
    }

    @Test
    public void clear() {
        HashTable<String, Integer> hashTable = new HashTable<>();
        hashTable.clear();
        assertTrue(hashTable.isEmpty());
        hashTable.put("One", 1);
        assertFalse(hashTable.isEmpty());
        hashTable.clear();
        assertTrue(hashTable.isEmpty());
        assertEquals(0, hashTable.getSize());
    }
}