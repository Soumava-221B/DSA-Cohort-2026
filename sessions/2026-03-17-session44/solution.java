class Solution {
    public String mergeCharacters(String s, int k) {
        StringBuilder sb = new StringBuilder(s);

        while (true) {
            boolean merged = false;

            // try all pairs
            for (int i = 0; i < sb.length(); i++) {
                for (int j = i + 1; j < sb.length(); j++) {

                    // check condition
                    if (sb.charAt(i) == sb.charAt(j) && (j - i) <= k) {
                        sb.deleteCharAt(j); // remove right character
                        merged = true;
                        break; // restart from beginning
                    }
                }
                if (merged) break;
            }

            // if no merge happened → stop
            if (!merged) break;
        }

        return sb.toString();
    }
}