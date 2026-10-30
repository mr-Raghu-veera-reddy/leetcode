class Solution {

    static int lowerbound(int[]nums, int target){
        int low=0,high=nums.length-1,startindex=-1;
        while(low<=high){
           int  mid=low+(high-low)/2;
           if(nums[mid]==target){
                startindex=mid;
                high=mid-1;
           }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return startindex;

    }
    static int  upperbound(int[]nums,int target){
        int low=0,high=nums.length-1,endindex=-1;
        while(low<=high){
           int  mid=low+(high-low)/2;
           if(nums[mid]==target){
                endindex=mid;
                low=mid+1;
           }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return endindex;

    }
    public int[] searchRange(int[] nums, int target) {
        
        if(nums.length==0){
            return new int []{-1,-1}; 
        }
        int startindex=lowerbound(nums,target);
      

        int endindex=upperbound(nums,target);
        
        
        return new int[] {startindex,endindex};
        
    }
}