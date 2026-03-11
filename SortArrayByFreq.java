class Solution {
    public int[] frequencySort(int[] nums) {
        int n = nums.length;
        int[] freq = new int[201];
        for(int i = 0; i < n; i++){
            freq[nums[i] + 100]++;
        }
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                int f1 = freq[nums[i] + 100];
                int f2 = freq[nums[j] + 100];
                if(f1 > f2 || (f1 == f2 && nums[i] < nums[j])){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }
}
