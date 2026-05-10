class Solution {

    public void reverse (int start , int end , int[] arr){
        int temp = 0;
        while(start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public int[] rotate(int[] nums, int k) {

        int n = nums.length;
        k = k % n ;
        reverse(0,n-1,nums);
        reverse(0,k-1,nums);
        reverse(k,n-1,nums);
        
        return nums;
    }
}


class RotateArray {
    public static void main(String[] args){

        int arr[] = {1,2,3,4,5,6,7};
        int k = 3;

        Solution s = new Solution();

        int[] solution =  s.rotate(arr, k);

        for(int num : solution){
            System.out.println(num + ",");
        }

    }
}