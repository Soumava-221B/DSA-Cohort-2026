class Solution {
    public ArrayList<Integer> intersection(int arr1[], int arr2[]) {
        ArrayList<Integer> result = new ArrayList<>();
        
        int i = 0, j = 0;
        int n = arr1.length;
        int m = arr2.length;

        while (i < n && j < m) {
            
            // If elements are equal
            if (arr1[i] == arr2[j]) {
                
                // Avoid duplicates
                if (result.isEmpty() || result.get(result.size() - 1) != arr1[i]) {
                    result.add(arr1[i]);
                }
                
                i++;
                j++;
            }
            
            // Move pointer of smaller element
            else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }

        return result;
    }
}