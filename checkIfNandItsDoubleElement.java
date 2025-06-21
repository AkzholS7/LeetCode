class Solution {
    public boolean checkIfExist(int[] arr) {
        int countZero = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                countZero++;
                if(countZero == 2){
                    return true;
                    
                }
                continue;
            }
            for(int j = 0; j < arr.length; j++){
                if(arr[j] * 2 == arr[i] && j != i){
                    return true;
                }
            }
        }
        return false;
    }
}