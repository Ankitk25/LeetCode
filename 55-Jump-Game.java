class Solution {
    public boolean canJump(int[] nums) {
        int max=nums[0];
        if(nums[0]==0 && nums.length==1){
            return true;
        }
        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
            if(max==0 && i!=nums.length-1){
                return false;
            }
            max--;
        }
        return true;
    }
}