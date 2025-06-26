class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int arr[]=new int [nums1.length];
        int temp=-1;
        boolean flag=true;
        for(int i=0;i<nums1.length;i++){
            temp=-1;
            flag=true;
            for(int j=0;j<nums2.length;j++){
               if(nums1[i]==nums2[j])
                    flag=false;
                if(nums1[i]<nums2[j]&&!flag){
                    temp = nums2[j];
                    break;
                } 
            }
            arr[i]=temp;
        }
        return arr;
    }
}