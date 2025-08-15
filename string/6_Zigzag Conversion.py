class Solution:
    def convert(self, s: str, numRows: int) -> str:
        result = ""
        size = numRows * 2 - 2
        if numRows == 1:
            return s
        for i in range(0, numRows):
            if i == 0:
                index = i
                while index * size < len(s):
                    result += s[index * size]
                    index += 1
                    if size == 0:
                        break
            elif i == numRows - 1:
                lastIndex = i 
                while lastIndex < len(s):
                    result += s[lastIndex]
                    lastIndex += size
            else:
                index = i 
                count = 1
                while index < len(s):
                    result += s[index]
                    if size * count - (index % size) < len(s):
                        result += s[size * count - (index % size)]
                    index += size
                    count += 1

        return result
