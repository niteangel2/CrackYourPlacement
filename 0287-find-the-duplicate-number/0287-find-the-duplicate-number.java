class Solution { //visiting modifying input array
    public int findDuplicate(int[] nums) {
        for(int i : nums) {
            int idx = Math.abs(i);
            if(nums[idx] < 0) return idx;
            nums[idx] = -nums[idx];
        }
        return 0;
    }
}