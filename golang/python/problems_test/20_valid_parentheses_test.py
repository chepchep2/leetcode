import unittest
import sys
import os

# 시스템 경로 설정
current_dir = os.path.dirname(os.path.abspath(__file__))
parent_dir = os.path.dirname(current_dir)
sys.path.insert(0, parent_dir)

# problems 디렉토리에서 Solution 클래스 import
import importlib
solution_module = importlib.import_module('problems.20_valid_parentheses')
Solution = solution_module.Solution

class TestValidParentheses(unittest.TestCase):
    def test_case1(self):
        """should return true when s is '()' """
        solution = Solution()
        s = "()"
        result = solution.isValid(s)
        self.assertTrue(result)

    def test_case2(self):
        """should return true when s is '()[]{}' """
        solution = Solution()
        s = "()[]{}"
        result = solution.isValid(s)
        self.assertTrue(result)

    def test_case3(self):
        """should return false when s is '(]' """
        solution = Solution()
        s = "(]"
        result = solution.isValid(s)
        self.assertFalse(result)

    def test_case4(self):
        """should return false when s is '([)]' """
        solution = Solution()
        s = "([)]"
        result = solution.isValid(s)
        self.assertFalse(result)

    def test_case5(self):
        """should return true when s is '{[]}' """
        solution = Solution()
        s = "{[]}"
        result = solution.isValid(s)
        self.assertTrue(result)

    def test_case6(self):
        """should return false when s is '[' """
        solution = Solution()
        s = "["
        result = solution.isValid(s)
        self.assertFalse(result)

    def test_case7(self):
        """should return false when s is ']' """
        solution = Solution()
        s = "]"
        result = solution.isValid(s)
        self.assertFalse(result)

if __name__ == '__main__':
    unittest.main()
