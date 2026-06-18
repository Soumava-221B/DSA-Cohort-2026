class Solution {
    public int longestSubstring(String s, int k) {
        return helperRecursive(s, k);
    }

    private int helperRecursive(String s, int k) {
        if (s.length() < k) {
            return 0;
        }

        int[] freq = new int[26];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (freq[ch - 'a'] < k) {
                int left = helperRecursive(s.substring(0, i), k);
                int right = helperRecursive(s.substring(i + 1), k);

                return Math.max(left, right);
            }
        }

        return s.length();
    }
}


// k=3
// a=3 
// b=2

// k=2
// a=2
// b=3
//     1 2 3 4 5 6 
// s=" a b a b b c" 
