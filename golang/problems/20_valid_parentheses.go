package problems

// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// An input string is valid if:

// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// Every close bracket has a corresponding open bracket of the same type.

// Example 1:
// Input: s = "()"
// Output: true

// Example 2:
// Input: s = "()[]{}"
// Output: true

// Example 3:
// Input: s = "(]"
// Output: false

// Example 4:
// Input: s = "([])"
// Output: true

// Constraints:

// 1 <= s.length <= 104
// s consists of parentheses only '()[]{}'.

func IsValid(s string) bool {
	a := []string{}

	for i := 0; i < len(s); i++ {
		if s[i] == '(' || s[i] == '{' || s[i] == '[' {

			a = append(a, string(s[i]))

		}

		if s[i] == ')' {
			if len(a) == 0 {
				return false
			}
			// if a[len(a)-1] == "{" || a[len(a)-1] == "[" {
			// 	return false
			// }
			if a[len(a)-1] == "(" {
				// return true
				a = a[:len(a)-1]
			} else {
				return false
			}

			// a = a[:len(a)-1]
			// return true
		}

		if s[i] == '}' {
			if len(a) == 0 {
				return false
			}

			// if a[len(a)-1] == "(" || a[len(a)-1] == "{" {
			// 	return false
			// }
			if a[len(a)-1] == "{" {
				a = a[:len(a)-1]
			} else {
				return false
			}

			// a = a[:len(a)-1]
			// return true
		}

		if s[i] == ']' {
			if len(a) == 0 {
				return false
			}
			// if a[len(a)-1] == "{" || a[len(a)-1] == "(" {
			// 	return false
			// }
			if a[len(a)-1] == "[" {
				a = a[:len(a)-1]
			} else {
				return false
			}

			// a = a[:len(a)-1]
			// return true
		}

	}
	if len(a) == 0 {
		return true
	}

	return false
}
