class Solution {
    public int longestOnes(int[] nums, int k) {
        int zeroes = 0;
        int l = 0, r = 0, n = nums.length, len = 0;
        int maxLen = 0;
        while(r < n) {
            if(nums[r] == 0) zeroes++;
            while(zeroes > k) {
                if(nums[l] == 0) zeroes--;
                l++;
            }
            len = r - l + 1;
            r++;
            maxLen = Math.max(maxLen, len);
        }
        return maxLen;
    }
}