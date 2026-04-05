import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }
        int longest = 0;
        for (int num : set) {
            // start only if it's the beginning of a sequence
            if (!set.contains(num - 1)) {
                int current = num;
                int count = 1;

                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        int[] arr = {100, 4, 200, 1, 3, 2};
        System.out.println(obj.longestConsecutive(arr)); // Output: 4
    }
}
