package algorithms;

import static org.junit.Assert.*;

import java.util.Set;

import org.junit.Test;

public class TrieTest {
    @Test
    public void test() {
        Trie<Integer> trie = new Trie<>();
        trie.put("abc", 1);
        trie.put("abdfg", 4);
        trie.put("abde", 3);
        trie.put("abd", 2);
        
        assertEquals(4, trie.getSize());
        assertEquals(new Integer(1), trie.get("abc"));
        assertEquals(new Integer(2), trie.get("abd"));
        assertEquals(new Integer(3), trie.get("abde"));
        assertEquals(new Integer(4), trie.get("abdfg"));
        assertNull(trie.get("abf"));
        assertNull(trie.get("abdf"));
        assertNull(trie.get("xyz"));
        
        Set<String> keys = trie.keys("abc");
        assertEquals(1, keys.size());
        assertTrue(keys.contains("abc"));
        
        keys = trie.keys("ab");
        assertEquals(4, keys.size());
        assertTrue(keys.contains("abc"));
        assertTrue(keys.contains("abdfg"));
        assertTrue(keys.contains("abde"));
        assertTrue(keys.contains("abd"));
        
        keys = trie.keys("abd");
        assertEquals(3, keys.size());
        assertTrue(keys.contains("abdfg"));
        assertTrue(keys.contains("abde"));
        assertTrue(keys.contains("abd"));
        
        keys = trie.keys("abdfgh");
        assertTrue(keys.isEmpty());
        
        keys = trie.keys("abdx");
        assertTrue(keys.isEmpty());
        
        keys = trie.keys("xyz");
        assertTrue(keys.isEmpty());
    }
}
