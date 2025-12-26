public class SearchInsertPosition {

    // Function to find insert position
    public static int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid; // Target found
            } else if (nums[mid] < target) {
                left = mid + 1; // Search right half
            } else {
                right = mid - 1; // Search left half
            }
        }

        // Target not found, left is the insert position
        return left;
    }

    // Test the function
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 2;

        int index = searchInsert(nums, target);
        System.out.println("Insert position: " + index);
    }
}
