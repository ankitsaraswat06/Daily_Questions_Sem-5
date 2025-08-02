# Last updated: 02/08/2025, 18:58:34
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        triangle = [[1]]
        for _ in range(1, numRows):
            temp = [0] + triangle[-1] + [0]
            temp_row = []
            for j in range(len(temp) - 1):
                temp_row.append(temp[j] + temp[j + 1])
            
            triangle.append(temp_row)

        return triangle


    

        