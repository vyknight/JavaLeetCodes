def targetIndices(self, nums: List[int], target: int) -> List[int]:
        indices = []
        sortedNums = sorted(nums)
        for i in range(0, len(sortedNums)):
            if(sortedNums[i] == target):
                indices.append(i)
            if(sortedNums[i] > target):
                break
        return indices