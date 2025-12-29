// https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/
// Problem - 2535

class DifferenceSum {
    public int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;
        for(int i=0 ; i<nums.length ; i++){
            elementSum += nums[i];
        }
        for(int i=0 ; i<nums.length ; i++){
            int temp = nums[i];
            while(temp>0){
                int rem = temp % 10;
                digitSum += rem;
                temp/=10;
            }
        }
        return Math.abs(elementSum-digitSum);
    }
}