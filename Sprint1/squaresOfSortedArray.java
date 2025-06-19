class Solution {
    public int[] sortedSquares(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int n = nums.length - 1;
        int[] temp = nums.clone();
        for(int i = 0; i < nums.length; i++){
            if(Math.abs(temp[start]) <  Math.abs(temp[end])){
                nums[n] = temp[end] * temp[end];
                end--;
                
            }
               else{
                   nums[n] = temp[start] * temp[start];
                   start++;
                   
               }
            n--;
        }
               return nums; 
    }
}