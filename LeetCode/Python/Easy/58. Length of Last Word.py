"""
Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal 
substring
 consisting of non-space characters only.
"""
class Solution(object):
    def lengthOfLastWord(self, s):
        val = s.split(" ")
        for x in range(len(val)):
            if len(val[len(val) - x - 1]) != 0:
                return len(val[len(val) - x - 1])
        return 0
