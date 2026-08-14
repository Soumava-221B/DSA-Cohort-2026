/**
 Do not return anything, modify nums in-place instead.
 */
function nextPermutation(nums: number[]): void {
    const n = nums.length;

    let i = n - 2;
    while (i >= 0 && nums[i] >= nums[i + 1]) {
        i--;
    }

    if (i >= 0) {
        let j = n - 1;
        while (nums[j] <= nums[i]) {
            j--;
        }
        swap(nums, i, j);
    }
    reverse(nums, i + 1, n - 1);
}

function swap(arr: number[], a: number, b: number) {
    const t = arr[a];
    arr[a] = arr[b];
    arr[b] = t;
}

function reverse(arr: number[], left: number, right: number) {
    while (left < right) {
        swap(arr, left, right);
        left++;
        right--;
    }
}