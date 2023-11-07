import java.util.*;
class Two_sum {
    public static void main(String[] args) {
        Two_sum solution = new Two_sum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = solution.twoSum(nums, target);

        if (result.length == 2) {
            System.out.println("["+result[0]+","+result[1]+"]");
        } else {
            System.out.println("No solution found.");
        }
    }
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            numMap.put(nums[i], i);
        }
        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement) && numMap.get(complement) != i) {
                return new int[]{i, numMap.get(complement)};
            }
        }

        return new int[]{};
    }
}