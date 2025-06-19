class Solution {
    public void duplicateZeros(int[] arr) {
        int posdup = 0;
        int n = arr.length - 1;
        for(int i = 0; i <= n - posdup; i++){
            if(arr[i] == 0){
                if(i == n - posdup){
                    arr[n] = 0;
                    n--;
                    break;
                }
                posdup++;
            }
        }
        
        for (int j = n - posdup; j >=0; j--){
            if(arr[j] == 0){
                arr[j+posdup] = 0;
                posdup--;
                arr[j+posdup] = 0;
                
            }
            else{
                arr[j+posdup] = arr[j];
            }
        }
       
        
    }
}