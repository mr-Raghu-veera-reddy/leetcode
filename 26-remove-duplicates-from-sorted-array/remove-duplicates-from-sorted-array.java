class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;             
                nums[i] = nums[j];
            }
        }

        // The number of unique elements is the index + 1
            return i + 1;
    }
}