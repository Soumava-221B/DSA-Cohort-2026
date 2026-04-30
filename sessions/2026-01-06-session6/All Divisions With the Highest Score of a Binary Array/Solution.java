class Solution {
    public List<Integer> maxScoreIndices(int[] nums) {
        List<Integer> result = new ArrayList<>();

        int n = nums.length;

        int rightOnes = 0;
        for (int num : nums) {
            if (num == 1) rightOnes++;
        }

        int leftZeros = 0;
        int maxScore = -1;

        for (int i = 0; i <= n; i++) {

            int score = leftZeros + rightOnes;

            if (score > maxScore) {
                maxScore = score;
                result = new ArrayList<>();
                result.add(i);
            } else if (score == maxScore) {
                result.add(i);
            }

            if (i < n) {
                if (nums[i] == 0) {
                    leftZeros++;
                } else {
                    rightOnes--;
                }
            }
        }

        return result;
    }
}