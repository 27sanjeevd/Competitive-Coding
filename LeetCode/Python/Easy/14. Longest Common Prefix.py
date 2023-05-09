"""
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".
"""
class Solution(object):
    def longestCommonPrefix(self, strs):
        output = ""
        pos = 0
        min_len = 0
        for x in range(len(strs)):
            if x == 0:
                min_len = len(strs[0])
            else:
                if len(strs[x]) < min_len:
                    min_len = len(strs[x])

        for x in range(min_len):
            val = strs[0][pos]

            for word in strs:
                if word[pos] != val:
                    return output

            output += val
            pos += 1

        return output
