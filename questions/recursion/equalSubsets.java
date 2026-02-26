private boolean equalSubsets(int[] nums, int start, int total1, int total2) {
    if (start >= nums.length) {
        return total1 == total2;
    }

    // if either leads to a solution, resolves as true
    // need to look into this more and see how it resolves every possible combination
    // wouldn't this be very time inefficient for a long array?
    return equalSubsets(nums, start + 1, total1 + nums[start], total2) 
        || equalSubsets(nums, start + 1, total1, total2 + nums[start]);
}

boolean equalSubsets(int[] nums, int total) {
    return equalSubsets(nums, 0, 0, 0);
}