class Solution:
    def containsDuplicate(self,nums):
        red =list(set(nums))
        if len(nums)>len(red):
            return True
        else:
            return False