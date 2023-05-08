import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums={2,5,5,11}; 
        int target=10;
        Solution s1=new Solution();
       int []a =s1.twoSum(nums,target);
        System.out.println(Arrays.toString(a));
    }

}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for (int j =i+ 1; j < nums.length ; j++) {
                if(target==nums[i]+nums[j]){
                    return new int[]{i, j};

                }
            }

        }
        return null;
    }
}
