class Solution {
    public boolean validMountainArray(int[] arr) {
        int len = arr.length;
        if(len < 3){
            return false;
            
        }
        int i = 0;
      
        for(; i + 1 < len && arr[i] < arr[i+1]; i++);
        if(i == 0 || i == len - 1){
            return false;
        }
        
        for(; i + 1 < len && arr[i] > arr[i + 1]; i++);
        return i == len - 1;
    }
}