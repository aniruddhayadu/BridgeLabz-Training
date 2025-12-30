public class MedianOfTwoSortedArrays {

    // Function to find the median of two sorted arrays
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalLength = nums1.length + nums2.length;

        // If total length is odd, median is the middle element
        if (totalLength % 2 == 1) {
            return findKth(nums1, 0, nums2, 0, totalLength / 2 + 1);
        }
        // If total length is even, median is the average of two middle elements
        else {
            double left = findKth(nums1, 0, nums2, 0, totalLength / 2);
            double right = findKth(nums1, 0, nums2, 0, totalLength / 2 + 1);
            return (left + right) / 2.0;
        }
    }

    // Helper function to find the k-th smallest element
    private static int findKth(int[] nums1, int start1, int[] nums2, int start2, int k) {
        if (start1 >= nums1.length) {
            return nums2[start2 + k - 1];
        }
        if (start2 >= nums2.length) {
            return nums1[start1 + k - 1];
        }
        if (k == 1) {
            return Math.min(nums1[start1], nums2[start2]);
        }

        int mid1 = start1 + k / 2 - 1;
        int mid2 = start2 + k / 2 - 1;

        int val1 = (mid1 < nums1.length) ? nums1[mid1] : Integer.MAX_VALUE;
        int val2 = (mid2 < nums2.length) ? nums2[mid2] : Integer.MAX_VALUE;

        if (val1 < val2) {
            return findKth(nums1, mid1 + 1, nums2, start2, k - k / 2);
        } else {
            return findKth(nums1, start1, nums2, mid2 + 1, k - k / 2);
        }
    }

    // Test the function
    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        double median = findMedianSortedArrays(nums1, nums2);
        System.out.println("Median: " + median);
    }
}
