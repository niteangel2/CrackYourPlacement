class Solution1 { // better solution O(2n)
    public void sortColors(int[] nums) {
        int count=0;
        int count1=0;
        int count2=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
                count++;
            else if(nums[i]==1)
                count1++;
            else
                count2++;
        }
        int k=0;
        for(int i=0;i<count;i++)
        nums[k++]=0;
        for(int i=0;i<count1;i++)
        nums[k++]=1;
        for(int i=0;i<count2;i++)
        nums[k++]=2;
    }
}

class Solution { // optimal solution dutch national flag algo
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length-1;
        while(mid <= high) {
            if(nums[mid] == 0) {
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                mid++;
                low++;
            }
            else if(nums[mid] == 1) { //already sorted in hypothetical array
                mid++;
            }
            else {//shrinking array
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }

        }
    }
}