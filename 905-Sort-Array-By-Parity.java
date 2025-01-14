class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] arr= new int[nums.length];
        int i=0;
        int f=0;
        int last=nums.length-1;
        while(i < nums.length){
            if(nums[i]%2==0){
                arr[f]=nums[i];
                f++;
            }
            else{
                arr[last]=nums[i];
                last--;
            }
            i++;
        }
        return arr;
    }
}