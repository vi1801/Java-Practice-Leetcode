import java.util.Scanner;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums){
        if(nums.length == 0)
            return 0;
        int i = 0;
        for(int j = 1; j< nums.length; j++)
        {
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        RemoveDuplicates rd = new RemoveDuplicates();
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[4];
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println("Please enter number");
            numbers[i] = input.nextInt();
        }
        System.out.println(rd.removeDuplicates(numbers));
    }
}
