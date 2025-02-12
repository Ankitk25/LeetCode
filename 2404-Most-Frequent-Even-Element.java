class Solution {
    public int mostFrequentEven(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        boolean flag=true;
        int[] arr=new int[max+1];
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                arr[nums[i]]+=1;
                flag=false;
            }
        }
        if(flag) return -1;
        int max2=-1;
        int j=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max2){
                max2=arr[i];
                j=i;
            }
        }
        if(max2==0) return 0;
        return j;
    }
}