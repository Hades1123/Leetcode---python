class Solution:
    def isPalindrome(self, s: str) -> bool:
        format_str = ''
        for ch in s:
            if ch.isalnum():
                format_str += ch.lower()
        i, j = 0, len(format_str) - 1
        while i < j:
            if format_str[i] != format_str[j]:
                return False
            i += 1
            j -= 1
        
        return True