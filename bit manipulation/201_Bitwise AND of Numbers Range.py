class Solution:
    def rangeBitwiseAnd(self, left: int, right: int) -> int:
        count  = 0
        num = 0
        temp = right
        while temp:
            num += 1
            if ~ ((left & 1) ^ (right & 1)):
                count += 1
            else:
                count += 1
                num += count
                temp = temp >> count
                count = 0
            right = right >> count
            left = left >> count

        if count:
            right = right >> count
        while num:
            temp = temp << 1
            num -= 1
        return temp
            