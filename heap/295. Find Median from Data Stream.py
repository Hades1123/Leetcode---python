class MedianFinder:

    def __init__(self):
        self.arr = []

    def lower_bound(self, target):
        left, right = 0, len(self.arr) - 1
        while left <= right:
            mid = (left + right) // 2
            if self.arr[mid] < target:
                left = mid + 1
            else:
                right = mid - 1
        return left
    
    def addNum(self, num: int) -> None:
        self.arr.insert(self.lower_bound(num), num)

    def findMedian(self) -> float:
        n = len(self.arr)
        if n % 2 == 0:
            return (self.arr[n // 2] + self.arr[n // 2 - 1]) / 2
        return self.arr[n // 2]

