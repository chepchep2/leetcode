# 1_two_sum_test.py
import unittest
import importlib
import sys
import os

# 정확한 모듈 경로 설정
current_dir = os.path.dirname(os.path.abspath(__file__))
parent_dir = os.path.dirname(current_dir)
sys.path.insert(0, parent_dir)

# 동적으로 모듈 import (파일명이 숫자로 시작하는 문제 해결)
problems_module = importlib.import_module('problems.1_two_sum')
Solution = problems_module.Solution

class TestTwoSum(unittest.TestCase):
    def test_case1(self):
        solution_instance = Solution()  # 클래스의 인스턴스 생성
        nums = [2, 7, 11, 15]
        target = 9
        result = solution_instance.twoSum(nums, target)
        self.assertEqual(sorted(result), sorted([0, 1]))

    def test_case2(self):
        solution_instance = Solution()
        nums = [3, 2, 4]
        target = 6
        result = solution_instance.twoSum(nums, target)
        self.assertEqual(sorted(result), sorted([1, 2]))

    def test_case3(self):
        solution_instance = Solution()
        nums = [3, 3]
        target = 6
        result = solution_instance.twoSum(nums, target)
        self.assertEqual(sorted(result), sorted([0, 1]))

if __name__ == '__main__':
    unittest.main()
