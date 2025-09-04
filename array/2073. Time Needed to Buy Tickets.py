from typing import List


class Solution:
	def timeRequiredToBuy(self, tickets: List[int], k: int) -> int:
		result = 0
		for i in range(0, len(tickets)):
			if i <= k:
				result += min(tickets[k], tickets[i])
			else:
				result += min(tickets[k] - 1, tickets[i])
		return result