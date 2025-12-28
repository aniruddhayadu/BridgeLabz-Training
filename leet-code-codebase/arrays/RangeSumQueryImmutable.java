public class RangeSumQueryImmutable {

    // Prefix sum array to support sumRange queries in O(1)
    private int[] prefixSum;

    // Constructor to build prefix sums
    public RangeSumQueryImmutable(int[] nums) {
        prefixSum = new int[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }
    }

    // Function to get the sum from left to right inclusive
    public int sumRange(int left, int right) {
        return prefixSum[right + 1] - prefixSum[left];
    }

    // Test the class
    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};

        RangeSumQueryImmutable obj = new RangeSumQueryImmutable(nums);
        System.out.println("sumRange(0, 2): " + obj.sumRange(0, 2)); // 1
        System.out.println("sumRange(2, 5): " + obj.sumRange(2, 5)); // -1
        System.out.println("sumRange(0, 5): " + obj.sumRange(0, 5)); // -3
    }
}
