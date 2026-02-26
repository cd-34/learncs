boolean subsetTotal(int[] nums, int total, int start) {
    if (total == 0) {
        return true;
    }
    if (start >= nums.length) {
        return false;
    }
    // we're subtracting because we're trying to get total down to 0
    // once again using or || to try every combination of using the number at the specified array vs not using it
    // need to see more in depth how this works
    return subsetTotal(nums, total - nums[start], start + 1) 
        || subsetTotal(nums, total, start + 1);
}

boolean subsetTotal(int[] nbums, int total) {
    return subsetTotal(nums, total, 0);
}