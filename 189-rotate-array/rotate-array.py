class Solution(object):
    def rotate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        length=len(nums)

        if length == 0:
            return
        

        k=k%length 

        # # If k is 0, the array doesn't need to change at all!
        # if k != 0:
        #     nums[:] = nums[-k:] + nums[:-k]

        self.reverse(nums,0,length-1)

        self.reverse(nums,0,k-1)

        self.reverse(nums,k,length-1)

    def reverse(self,nums,start,end):
        while start<end:
            nums[start],nums[end]=nums[end],nums[start]
            start+=1
            end-=1
