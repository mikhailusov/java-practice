package datastructures;

import java.util.HashSet;
import java.util.Set;

public class HashTable<K, V> {

    private Set<Element<K, V>>[] buckets;
    private int size;

    HashTable() {
        buckets = new Set[10];
        clear();
    }

    public V get(K key) {
        if (key == null) {
            return null;
        }
        Set<Element<K, V>> set = getBucket(key);
        if (set.isEmpty()) {
            return null;
        }

        for (Element<K, V> element: set) {
            if (element.key.equals(key)) {
                return element.value;
            }
        }
        return null;
    }

    public void put(K key, V value) {
        Element<K, V> element = new Element(key, value);
        getBucket(key).add(element);
        size++;
    }

    public void remove(K key) {
        if (key == null) {
            return;
        }
        Set<Element<K, V>> set = getBucket(key);
        if (set.isEmpty()) {
            return;
        }

        for (Element<K, V> element: set) {
            if (key.equals(element.key)) {
                set.remove(element);
                size--;
                return;
            }
        }
    }

    public int getSize() {
        return size;
    }

    public boolean containsKey(K key) {
        return get(key) != null;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        for (int i = 0; i < 10; i++) {
            buckets[i] = new HashSet<>();
        }
        size = 0;
    }

    private int getBucketIndex(K key) {
        return key.hashCode() % 10;
    }

    private Set<Element<K, V>> getBucket(K key) {
        return buckets[getBucketIndex(key)];
    }

    private class Element<K, V> {
        private K key;
        private V value;
        private Element(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
