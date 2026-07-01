import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[m + n];
        int k = 0;

        // Copy first m elements of nums1
        for (int i = 0; i < m; i++) {
            arr[k++] = nums1[i];
        }

        // Copy all elements of nums2
        for (int j = 0; j < n; j++) {
            arr[k++] = nums2[j];
        }

        // Sort the combined array
        Arrays.sort(arr);

        // Copy back into nums1
        for (int i = 0; i < m + n; i++) {
            nums1[i] = arr[i];
        }

        // Optional: Print the merged array for debugging
        System.out.println(Arrays.toString(nums1));
    }
}