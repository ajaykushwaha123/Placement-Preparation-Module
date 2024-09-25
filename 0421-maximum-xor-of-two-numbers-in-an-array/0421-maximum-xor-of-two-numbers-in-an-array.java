class Solution {
    static class TrieNode {
        TrieNode[] children = new TrieNode[2]; 
    }

    public int findMaximumXOR(int[] nums) {
        TrieNode root = new TrieNode(); 
        int maxResult = 0;

        for (int num : nums) {
            insert(root, num);
        }

        for (int num : nums) {
            maxResult = Math.max(maxResult, query(root, num));
        }

        return maxResult;
    }

    private void insert(TrieNode root, int num) {
        TrieNode node = root;
        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1;
            if (node.children[bit] == null) {
                node.children[bit] = new TrieNode();
            }
            node = node.children[bit];
        }
    }

    private int query(TrieNode root, int num) {
        TrieNode node = root;
        int maxXor = 0;
        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1;
            int oppositeBit = 1 - bit;
            if (node.children[oppositeBit] != null) {
                maxXor = (maxXor << 1) | 1;
                node = node.children[oppositeBit];
            } else {
                maxXor = (maxXor << 1);
                node = node.children[bit];
            }
        }
        return maxXor;
    }
}