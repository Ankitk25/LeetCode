class Solution {
    public int maxArea(int[] height) {
        int f=0;
        int last=height.length-1;
        int res=0;
        while(f<last){
            if(height[f]<=height[last]){
                res=Math.max(res,height[f]*(last-f));
                f++;
            }
            else{
                res=Math.max(res,height[last]*(last-f));
                last--;
            }
        }
        return res;
    }
}