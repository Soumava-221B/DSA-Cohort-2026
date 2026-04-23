function findMaxConsecutiveOnes(nums: number[]): number {
    let current_count = 0;
    let max_count = 0
    
    for (let i = 0; i < nums.length; i++) {
        if (nums[i] === 1) {
            current_count++;
            max_count = Math.max(current_count, max_count)
        } else {
            current_count = 0;
        }
    }
    return max_count;
};