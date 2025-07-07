class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder arr= new StringBuilder();
        Arrays.sort(strs);
        char[] a= strs[0].toCharArray();
        char[] b= strs[strs.length-1].toCharArray();

        for(int i=0;i<a.length;i++){
            if (a[i]!=b[i]){
                break;
            }
            arr.append(a[i]);
        }
        // if(arr==null){
        //     return "";
        // }
        return arr.toString();
    }
}