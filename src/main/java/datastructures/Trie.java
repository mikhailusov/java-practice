package datastructures;

import java.util.HashMap;
import java.util.Map;

public class Trie {

    TrieNode head = new TrieNode('*', false);

    public void addWord(String word) {
        TrieNode curr = head;

        for (char ch: word.toCharArray()) {
            if (curr.children.containsKey(ch)) {
                curr = curr.children.get(ch);
            } else {
                curr.addChild(new TrieNode(ch, false));
                curr = curr.children.get(ch);
            }
            curr.size++;
        }
        curr.isCompleted = true;
    }

    public int getCount(String prefix) {
        TrieNode curr = head;

        for (char ch: prefix.toCharArray()) {
            if (curr.children.containsKey(ch)) {
                curr = curr.children.get(ch);
            } else {
                return 0;
            }
        }
        return curr.getSize();
    }

    public boolean hasWord(String word) {
        TrieNode curr = head;

        for (char ch: word.toCharArray()) {
            if (curr.children.containsKey(ch)) {
                curr = curr.children.get(ch);
            } else {
                return false;
            }
        }
        return curr.isCompleted();
    }

    private class TrieNode {
        private Character value;
        private Map<Character, TrieNode>  children = new HashMap<>();
        private boolean isCompleted;
        private int size;

        public TrieNode(Character value, boolean isCompleted) {
            this.value = value;
            this.isCompleted = isCompleted;
        }

        public void addChild(TrieNode trieNode) {
            if (!children.containsKey(trieNode.getValue())) {
                children.put(trieNode.getValue(), trieNode);
            }
        }

        public Character getValue() {
            return value;
        }

        public int getSize() {
            return size;
        }

        public boolean isCompleted() {
            return isCompleted;
        }
    }
}
