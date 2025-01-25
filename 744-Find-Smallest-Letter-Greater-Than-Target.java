class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char res= binary(letters,target);
        return res;
    }
    public char binary(char[] arr, char target){
        char ans='$';
        int first=0;
        int last= arr.length-1;
        while(first<=last){
            int mid= first + (last-first)/2;
            if(arr[mid]<=target){
                first=mid+1;
            }
            else{
                last=mid-1;
                ans=arr[mid];
            }
        }
        return (ans == '$')?arr[0]:ans;
    }
}