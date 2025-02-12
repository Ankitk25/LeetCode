class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> hash=new HashMap<>();
        int max=0;
        int ele=-1;
        for(int i: nums){
            if(i%2==0){
                hash.put(i,hash.getOrDefault(i,0)+1);
            }
        }
        for (int i: hash.keySet()){
            int val=hash.get(i);
            if(val>max || (val==max && i<ele)){
                max=val;
                ele=i;
            }
        }
        return ele;
    }
}