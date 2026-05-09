import java.util.*;

class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        
        ArrayList<Integer> result = new ArrayList<>();
        
        int i = 0, j = 0;
        
        while (i < a.length && j < b.length) {
            
            if (a[i] == b[j]) {
                result.add(a[i]);
                i++;
                j++;
            } else if (a[i] < b[j]) {
                result.add(a[i]);
                i++;
            } else {
                result.add(b[j]);
                j++;
            }
        }
        
        while (i < a.length) {
            result.add(a[i]);
            i++;
        }
        
        while (j < b.length) {
            result.add(b[j]);
            j++;
        }
        
        return result;
    }
}