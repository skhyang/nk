package com.liu.test;

import java.util.ArrayList;

public class TestListNode {
	ArrayList<Integer> newArrayList = new ArrayList<Integer>();

	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

		if (listNode != null) {
			this.printListFromTailToHead(listNode.next);
			newArrayList.add(listNode.val);

		}

		return newArrayList;

	}
}

     class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

