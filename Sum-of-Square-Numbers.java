import java.util.*;
class Solution {
    public boolean judgeSquareSum(int c) {
        long a=0;
        long b= (long)(Math.sqrt(c));
        while(a<=b){
            long x=(a*a)+(b*b);
            if(x==c){
                return true;
            }
            else if(x<c) {
                a++;
            }
            else b--;
        }
        return false;
    }
}