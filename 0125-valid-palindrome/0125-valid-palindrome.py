class Solution:
    def isPalindrome(self, s: str) -> bool:
        cleaned=""
        for ch in s:
            if ch.isalnum():
                cleaned+=ch.lower()
        if cleaned == cleaned[::-1]:
            return True
        else:
            return False