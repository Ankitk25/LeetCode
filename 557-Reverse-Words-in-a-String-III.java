class Solution {
    public String reverseWords(String s) {
        char[] arr=s.toCharArray();
        int n=arr.length;
        int start=0;
        for(int i=0;i<=n;i++){
            if(i==n || arr[i]==' '){
                rev(arr,start,i-1);
                start=i+1;
            }
        }
        return new String(arr);
    }
    public static void rev(char arr[], int start, int i){
        while(start<i){
            char temp = arr[start];
            arr[start]=arr[i];
            arr[i]=temp;
            start++;
            i--;
        }
    }
}