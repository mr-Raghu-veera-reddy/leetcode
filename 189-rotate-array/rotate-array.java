class Solution {
    static void reversearr(int[] nums,int start, int last){
        while(start<last){
            int temp;
            temp=nums[start];
            nums[start]=nums[last];
            nums[last]=temp;
            start++;
            last--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        reversearr(nums,0,n-1);
        reversearr(nums,0,k-1);
        reversearr(nums,k,n-1);
        // int [] temp = new int[nums.length];
        // for(int i=0;i<nums.length;i++){
        //     temp[(i+k)%nums.length]=nums[i];
        // }
        // for(int i=0;i<temp.length;i++){
        //     nums[i]=temp[i];
        // }
        // System.out.println(Arrays.toString(temp));
        
    }
}