import java.util.Scanner;

public class RemoveElement {
    public int removeElement( int val) {
        int i = 0;
        Double[] nums = new Double[4];
        Scanner scan = new Scanner(System.in);
        //for (i = 0; i < 4; i++) {
              //Double[] nums = new Double[4];
        System.out.println(scan.nextDouble());
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        RemoveElement re = new RemoveElement();
        re.removeElement(2);
    }
}
