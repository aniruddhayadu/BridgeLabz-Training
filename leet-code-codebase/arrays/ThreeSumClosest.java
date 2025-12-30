import java.util.Arrays;

public class ThreeSumClosest {

    // Function to find the sum of three integers closest to target
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums); // Sort the array
        int closestSum = nums[0] + nums[1] + nums[2]; // Initialize closest sum

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];

                // Update closestSum if current is closer to target
                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currentSum;
                }

                if (currentSum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return closestSum;
    }

    // Test the function
    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;

        int result = threeSumClosest(nums, target);
        System.out.println("Closest sum: " + result);
    }
}
