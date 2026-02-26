int countOdd(List<Integer> nums) {
    // base case
    if (nums.isEmpty()) {
        return 0;
    }

    if (nums.get(0) % 2 != 0) {
        return 1 + countOdd(nums.subList(1, nums.size()));
    } else {
        return countOdd(nums.subList(1, nums.size()));
    }
}