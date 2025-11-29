from typing import List

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        num_dict = {}

        for i in range(len(nums)):
            answer = target - nums[i]

            if answer in num_dict:
                return [num_dict[answer], i]

            num_dict[nums[i]] = i
        return []
