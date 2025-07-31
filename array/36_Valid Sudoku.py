from typing import List


class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        for i in range(0 , 9):
            dict = {}
            for j in range(0, 9):
                if board[i][j] == '.':
                    continue
                if not dict.get(board[i][j]):
                    dict[board[i][j]] = 1
                else:
                    return False
        for col in range(0, 9):
            dict = {}
            for row in range(0, 9):
                if board[row][col] == '.':
                    continue
                if not dict.get(board[row][col]):
                    dict[board[row][col]] = 1
                else:
                    return False
        
        for i in range(0, 3):
            for j in range(0, 3):
                dict = {}
                for m in range(0, 3):
                    for n in range(0, 3):
                        if board[3 * i + m][3 * j + n] == '.':
                            continue
                        if not dict.get(board[3 * i  + m][3 * j + n]):
                            dict[board[3*i + m][3 * j + n]] = 1
                        else:
                            return False
        return True