class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;

        if (k == 0) {  
            return; 
        }

        int[] rotatedNums = new int[n];

        for (int i = 0; i < n; i++) {
            rotatedNums[(i + k) % n] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = rotatedNums[i];
        }
    }
}