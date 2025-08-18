class Solution:
    def reverseBits(self, n: int) -> int:
        result = 0
        bit_count = 0
        while n:
            bit_count += 1
            temp = n & 1
            n = n >> 1
            result = result << 1
            result = result | temp
        time_loop = 32 - bit_count
        while time_loop:
            time_loop -= 1
            result = result << 1
            result = result | 1
        return result

class Solution:
    def reverseBits(self, n: int) -> int:
        bin_str = format(n, '032b')
        out = 0
        for i in range(0, 32):
            if bin_str[i] == "1":
                out += 2 ** i
        return out