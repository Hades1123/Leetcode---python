from collections import deque

class RecentCounter: 

    def __init__(self):
        self.dq = deque([])  
        self.result = 0      

    def ping(self, t: int) -> int:
        self.dq.append(t)
        while len(self.dq) != 0 and not (t - 3000 <= self.dq[0] <= t):
            self.dq.popleft()
        return len(self.dq)


# Your RecentCounter object will be instantiated and called as such:
# obj = RecentCounter()
# param_1 = obj.ping(t)