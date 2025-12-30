public class RemoveElement {

    // Function to remove all instances of val in the array
    public static int removeElement(int[] nums, int val) {
        int newSize = 0;

        // Traverse the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[newSize] = nums[i]; // Keep element
                newSize++;
            }
        }

        return newSize; // New length without val
    }

    // Test the function
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;

        int length = removeElement(nums, val);
        System.out.println("New length: " + length);
    }
}
