class Solution {
    public int hammingWeight(int n) {
        int c=0;
        int m=1;
        for(int i=0;i<32;i++){
            if((n&m)!=0){
                c++;
            }
            m<<=1;
        }
        return c;        
    }
}