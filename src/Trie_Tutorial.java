import java.util.Arrays;

public class Trie_Tutorial {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        trie.insert("app");
        System.out.println(trie.search("apple"));
        System.out.println(trie.startsWith("apps"));
        System.out.println(trie.startsWith("ap"));
    }
}

class TrieNode{
    TrieNode[] children;
    boolean end;

    public TrieNode(){
        children = new TrieNode[26];
        Arrays.fill(children, null);
        end = false;
    }
}

class Trie{
    TrieNode root;

    public Trie(){
        root = new TrieNode();
    }

    public void insert(String word){
        TrieNode ptr = this.root;
        System.out.println(ptr == null);
        for(int i = 0; i<word.length(); i++){
            char c = word.charAt(i);
            ptr.children[c - 'a'] = ptr.children[c - 'a'] == null ? new TrieNode() : ptr.children[c - 'a'];
            ptr = ptr.children[c-'a'];
        }
        ptr.end = true;
    }

    public boolean search(String word){
        System.out.println("searching for word: " +  word);
        TrieNode ptr = this.root;
        for(int i = 0; i<word.length(); i++){
            char c = word.charAt(i);
            if(ptr.children[c - 'a'] == null){
                System.out.println("found null for: " + c);
                return false;
            }
        }
        return ptr.end;
    }

    public boolean startsWith(String word){
        TrieNode ptr = this.root;
        for(int i = 0; i<word.length(); i++){
            char c = word.charAt(i);
            if(ptr.children[c - 'a'] == null){
                return false;
            }
        }
        return true;
    }
}
