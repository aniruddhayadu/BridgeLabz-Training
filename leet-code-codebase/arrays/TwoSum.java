import java.util.HashMap;

public class TwoSum {

    // Function to find indices of the two numbers such that they add up to target
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Traverse the array
        for (int i = 0; i < nums.length; i++) {
            int remaining = target - nums[i];

            // Check if the remaining value exists in the map
            if (map.containsKey(remaining)) {
                return new int[] { map.get(remaining), i };
            }

            // Store the current number with its index
            map.put(nums[i], i);
        }

        // This line will never be reached as per problem constraints
        return new int[] {};
    }

    // Test the function
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
