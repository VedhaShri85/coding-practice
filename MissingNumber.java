class Solution {
    public int missingNumber(int[] arr) {
        int n=arr.length;
        int res=0;
        for(int i=0;i<=n;i++){
            res=res^i;
        }
        for(int i=0;i<n;i++){
            res=res^arr[i];
        }
        return res;
    }
}
