class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            int n = num;
            int digits = 0;
            while (n > 0){
                digits++;
                n /= 10;
            }
            if (digits % 2 == 0){
                count++;
            }
        }
        return count;
        
    }
}