class Solution(object):
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """
        # Set pointers to the last valid elements and the last empty slot
        p1 = m - 1
        p2 = n - 1
        p = m + n - 1
        
        # Merge backwards, taking the largest element each time
        while p1 >= 0 and p2 >= 0:
            if nums1[p1] > nums2[p2]:
                nums1[p] = nums1[p1]
                p1 -= 1
            else:
                nums1[p] = nums2[p2]
                p2 -= 1
            p -= 1
            
        # If nums2 still has elements left, copy them over.
        # (If nums2 is empty or exhausted, this loop just won't run.
        # If nums1 has elements left, they are already perfectly in place!)
        while p2 >= 0:
            nums1[p] = nums2[p2]
            p2 -= 1
            p -= 1


















            