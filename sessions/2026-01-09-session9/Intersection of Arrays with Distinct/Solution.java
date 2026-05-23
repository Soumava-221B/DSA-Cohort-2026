import java.util.HashSet;

class Solution {
    public static int intersectSize(int a[], int b[]) {
        HashSet<Integer> set = new HashSet<>();
        
        for (int num : a) {
            set.add(num);
        }
        
        int count1 = 0;
        
        for (int num : b) {
            if (set.contains(num)) {
                count1++;
            }
        }
        
        return count1;
    }
}