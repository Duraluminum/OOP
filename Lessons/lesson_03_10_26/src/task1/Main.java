package task1;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 5, 6, 2, 9, 3};
        BubbleSort.bubble(nums);

        for (int num : nums) {
            System.out.printf("%d ", num);
        }
    }
}
