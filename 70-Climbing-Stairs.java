class Solution {
    public int climbStairs(int n) {
        int[] arr=new int[n];
        arr[0]=1;
        if(arr.length==1){
            return 1;
        }
        arr[1]=2;

        if(arr.length==2){
            return 2;
        }
        for(int i=2;i<n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[arr.length-1];
    }
}