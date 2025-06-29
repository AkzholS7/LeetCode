class Solution {
    public int heightChecker(int[] heights) {
        int[] sorted = new int[heights.length];
        for(int i = 0; i < heights.length ; i++){
            sorted[i] = heights[i];
        }
        
        for(int i = 0; i < sorted.length -1; i++){
            for(int j = 0; j < sorted.length - i - 1; j++){
                if(sorted[j] > sorted[j+1]){
                    int temp = sorted[j];
                    sorted[j]= sorted[j + 1];
                    sorted[j+1] = temp;
                }
            }
        }
        int count = 0;
        for(int i = 0; i < heights.length; i++){
            if(heights[i] != sorted[i]){
                count++;
            }
        }
        return  count;
        
    }
}