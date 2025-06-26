class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int cnt=0,max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                cnt++;
                max=Math.max(max,cnt);
            }
            else
                cnt=0;
        }
        return max;
    }
}