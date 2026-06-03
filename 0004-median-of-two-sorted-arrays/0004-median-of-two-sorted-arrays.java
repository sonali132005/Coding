class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int q = m + n;

        int[] merged = new int[q];

        int i = 0, j = 0, k = 0;

        // Merge the two sorted arrays
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }

        // Copy remaining elements from nums1
        while (i < m) {
            merged[k++] = nums1[i++];
        }

        // Copy remaining elements from nums2
        while (j < n) {
            merged[k++] = nums2[j++];
        }

        // Find median
        if (q % 2 != 0) {
            return merged[q / 2];
        } else {
            return (merged[q / 2 - 1] + merged[q / 2]) / 2.0;
        }
    }
}