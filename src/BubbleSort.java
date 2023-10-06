public class BubbleSort {
    public static void bubble_sort (int[] nums){
        System.out.print("Original Array: [" + nums[0] + ", ");
        for(int i = 1; i < nums.length - 1; i++){
            System.out.print(nums[i] + ", ");
        }
        System.out.println(nums[nums.length-1] + "]");

        for(int i = 0; i < nums.length - 1; i++){
            for(int j = 0; j < nums.length - i - 1; j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        System.out.print("Sorted Array: [" + nums[0] + ", ");
        for(int i = 1; i < nums.length - 1; i++){
            System.out.print(nums[i] + ", ");
        }
        System.out.println(nums[nums.length-1] + "]");
    }
    public static void main(String[] args) {
        int[] nums = {8, -5, 3, 2, 1, 0, 45};
        bubble_sort(nums);
    }
}
