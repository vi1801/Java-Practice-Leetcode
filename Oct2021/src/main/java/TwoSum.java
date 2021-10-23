public class TwoSum {
    public static void main(String[] args) {
        int nums[] = {2,7,11,15};
        int target = 9;
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == target - nums[i]) {
                        System.out.println(i);
                        System.out.println(j);
                }
            }
        }
    }
}
