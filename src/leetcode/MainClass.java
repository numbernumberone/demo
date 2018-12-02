package leetcode;
/**
 *
 *
 * 很容易想到的解决办法就是把数组排序，相同的元素会前后挨着，正常情况下脚标为0和1的两个元素相同，2和3两个元素相同，直到那个单身的元素出现才会扰乱这个局面，就这样当出现两个元素不相同的时候，前一个元素就是要找的单身元素。
 * 这种解法虽然可以找出单身元素，但是要使用排序，排序的时间复杂度是O(nlogn)，不是线性时间复杂度（O(n)），不符合平台的要求。
 *
 *
 * */
import java.util.Arrays;

public class MainClass{

    public int singleNumber(int[] nums) {

        if (nums.length == 0) {
            return -1;
        }
        if (nums.length == 1) {
            return nums[0];
        }

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i += 2) {
            if (i == nums.length - 1) {
                return nums[i];
            }
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return 0;
    }



    public static void main(String args[]) {
        MainClass a = new MainClass();

        int a1[] = {1,2,3,4,2,3,1};
        //System.out.println();
        a.singleNumber(a1);
        System.out.println(a.singleNumber(a1));

    }
}