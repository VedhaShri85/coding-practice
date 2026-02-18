class Solution {
    public void sort012(int[] arr) {
        int c0 = 0, c1 = 0, c2 = 0;
        for (int num : arr) {
            if (num == 0) c0++;
            else if (num == 1) c1++;
            else c2++;
        }

        int i = 0;
        while (c0-- > 0) arr[i++] = 0;
        while (c1-- > 0) arr[i++] = 1;
        while (c2-- > 0) arr[i++] = 2;
    }
}
