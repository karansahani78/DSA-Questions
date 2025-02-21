import java.util.Arrays;

public class Arr {
    public static void main(String[] args) {
        int [] nums = {1,2,3};
        System.out.println(Arrays.toString(Sum(nums)));
    }
    public static int []Sum(int []nums){
        int [] arr = new int[nums.length*2];
        for(int i=0; i<nums.length; i++){
            arr[i] = nums[i];
        }
        for(int i=0; i<nums.length; i++){
            arr[nums.length+i] = nums[i];
        }
        return arr;
    }
}