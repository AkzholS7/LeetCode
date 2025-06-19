class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int even = 0;
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            if (nums[i] == 1){
                even++;
                if(even > max){
                    max = even;
                }
            }
            else{
                even = 0;
            }
        }
       return max;
    }
}