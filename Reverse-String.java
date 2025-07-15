class Solution {
    public void reverseString(char[] s) {
        int i=0;
        int j=s.length-1;
        if(s.length==0 || s.length==1){
            return;
        }
        while(i<j){
            if(i!=j || i<j){
                char ch=s[i];
                s[i]=s[j];
                s[j]=ch;
                i++;
                j--;
            }
            
        }
    }
}