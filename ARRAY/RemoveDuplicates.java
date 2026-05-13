class Solution {
    public int removeDuplicates(int[] nums) {
         if (nums.length <= 2) {
            return nums.length;
        }

        int count = 1;
        int point = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count <= 2) {
                nums[point] = nums[i];
                point++;
            }
        }

        return point;
    }
}


class RemoveDuplicates {
    public static void main( String[] args){

        int[] nums = {0,0,2,4,5,5,5,5,6,7,8,8,9,9};

        Solution s = new Solution();

        int res = s.removeDuplicates(nums);

        System.out.println("Result = "+res);
        System.out.println("\n");
        for(int i = 0 ; i < res ; i++){
            System.out.println(nums[i]);
        }
    }
}