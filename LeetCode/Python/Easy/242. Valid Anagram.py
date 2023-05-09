"""
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
"""

class Solution(object):
    def isAnagram(self, s, t):
        val = {}
        for x in s:
            if x not in val:
                val[x] = 0
            val[x] += 1

        for x in t:
            if x not in val:
                return False
            else:
                if val[x] == 0:
                    return False
                val[x] -= 1

        if len(s) != len(t):
            return False

        return True
