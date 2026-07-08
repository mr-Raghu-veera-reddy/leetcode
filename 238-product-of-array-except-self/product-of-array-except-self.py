class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        length = len(nums)
        
        # We only create ONE array. (This does not count against space complexity)
        answer = [1] * length
        
        # --- STEP 1: The Left Sweep ---
        # Calculate the left products and put them directly into 'answer'
        for i in range(1, length):
            answer[i] = answer[i - 1] * nums[i - 1]
            
        # --- STEP 2: The Right Sweep ---
        # Keep track of the right product using a single variable
        right_running_product = 1
        
        # Loop backwards through the array
        for i in range(length - 1, -1, -1):
            # Multiply whatever is already in answer[i] by the right_running_product
            answer[i] = answer[i] * right_running_product
            
            # Update the right product for the next step backward
            right_running_product = right_running_product * nums[i]
            
        return answer