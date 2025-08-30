class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        mapS = [0] * 257
        visited = [False] * 257
        for i in range(len(s)):
            if not mapS[ord(s[i])]:
                if visited[ord(t[i])]:
                    return False
                visited[ord(t[i])] = 1
                mapS[ord(s[i])] = t[i]
            else:
                if mapS[ord(s[i])] != t[i]:
                    return False
        return True