public class LongestCommonPrefix {

    // Function to find the longest common prefix
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0]; // Assume the first string is the prefix

        for (int i = 1; i < strs.length; i++) {
            // Reduce prefix until prefix matches the current string
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }

    // Test the function
    public static void main(String[] args) {
        String[] input = {"flower", "flow", "flight"};

        String result = longestCommonPrefix(input);
        System.out.println("Longest Common Prefix: " + result);
    }
}
