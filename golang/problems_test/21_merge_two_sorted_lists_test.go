package problems_test

import (
	"leetcode/problems"

	. "github.com/onsi/ginkgo/v2"
	. "github.com/onsi/gomega"
)

var _ = Describe("Problem21", func() {
	It("should merge two sorted lists [1,2,4] and [1,3,4] to [1,1,2,3,4,4]", func() {
		// Create first list: 1->2->4
		list1 := &problems.ListNode{Val: 1}
		list1.Next = &problems.ListNode{Val: 2}
		list1.Next.Next = &problems.ListNode{Val: 4}

		// Create second list: 1->3->4
		list2 := &problems.ListNode{Val: 1}
		list2.Next = &problems.ListNode{Val: 3}
		list2.Next.Next = &problems.ListNode{Val: 4}

		result := problems.MergeTwoLists(list1, list2)

		// Check values manually
		Expect(result.Val).To(Equal(1))
		Expect(result.Next.Val).To(Equal(1))
		Expect(result.Next.Next.Val).To(Equal(2))
		Expect(result.Next.Next.Next.Val).To(Equal(3))
		Expect(result.Next.Next.Next.Next.Val).To(Equal(4))
		Expect(result.Next.Next.Next.Next.Next.Val).To(Equal(4))
		Expect(result.Next.Next.Next.Next.Next.Next).To(BeNil())
	})

	It("should return nil when both lists are empty", func() {
		var list1 *problems.ListNode = nil
		var list2 *problems.ListNode = nil

		result := problems.MergeTwoLists(list1, list2)

		Expect(result).To(BeNil())
	})

	It("should return [0] when list1 is empty and list2 is [0]", func() {
		var list1 *problems.ListNode = nil
		list2 := &problems.ListNode{Val: 0}

		result := problems.MergeTwoLists(list1, list2)

		Expect(result.Val).To(Equal(0))
		Expect(result.Next).To(BeNil())
	})
})
