import java.util.Scanner;

public class RemoveElement {
    public int removeElement(int val) {
        int i;
        //int[] nums = new int[4];
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter values: ");
        for (i = 0; i < 4; i++) {
            int[] nums = new int[0];
            System.out.println(scan.nextInt());
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] != val) {
                    nums[i] = nums[j];
                    i++;
                }
            }
        }
        return i;
    }
    public static void main (String[]args){
        RemoveElement re = new RemoveElement();
        re.removeElement(2);
    }
}
