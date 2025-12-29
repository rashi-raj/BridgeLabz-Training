// https://leetcode.com/problems/majority-element/
// Problem - 169

class MajorityElement {
    public int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count=1;
        for(int i=1; i<nums.length; i++){
            if(count==0){
                candidate = nums[i];
                count++;
            }else{
                if(candidate==nums[i]){
                    count++;
                }else{
                    count--;
                }
            }
        }
        int count1=0;
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i]==candidate){
                count++;
                if(count>nums.length/2){
                    return candidate;
                }
            }
        }
        return -1;
    }
}