"""
Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.

After doing so, return the array.
"""

class Solution(object):
    def replaceElements(self, arr):
        val = 0
        for x in range(len(arr)):
            pos = len(arr) - x - 1
            if pos == len(arr) - 1:
                val = arr[pos]
                arr[pos] = -1
            else:
                temp = arr[pos]
                arr[pos] = val
                if temp > val:
                    val = temp

        return arr
        
