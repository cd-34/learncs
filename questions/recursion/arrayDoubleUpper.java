int[] arrayDoubleUpper(int[] nums, int index) {
    if (index < 0 || index >= nums.length) {
        return nums;
    }

    int[] result = arrayDoubleUpper(nums, index + 1);
    result[index] = nums[index] * 2;
    return result;
}

int[] arrayDoubleUpper(int[] nums) {
    return arrayDoubleUpper(nums, 0);
}
