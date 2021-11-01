import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> nums = new LinkedList<Integer>();
        nums.add(1);
        nums.add(3);
        nums.add(4);
        nums.add(2);
        nums.addFirst(0);
        System.out.println(nums);
    }
}
