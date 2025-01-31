class Solution {
    public int[] sortedSquares(int[] nums) {
        int start = 0, end = nums.length - 1;
        int[] res = new int[nums.length];
        int i = end;
        while (start <= end) {
            int ll = nums[start] * nums[start];
            int rr = nums[end] * nums[end];
            if (ll < rr) {
                res[i] = rr;
                end--;
            } else {
                res[i] = ll;
                start++;
            }
            i--;
        }
        return res;
    }
}