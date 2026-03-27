class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        b = s
        max_length = 0
        
        for i in range(len(b)):
            temp = ""
            for j in range(i, len(b)):
                if b[j] not in temp:
                    temp += b[j]
                else:
                    break
            
            max_length = max(max_length, len(temp))
        
        return max_length