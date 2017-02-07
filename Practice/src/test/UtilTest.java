package test;

import DataStructures.LLutil;
import DataStructures.VLinkedList;

public class UtilTest {
	
	public static LLutil util = new LLutil();

	public static void main(String[] args){
		
		mergeDemo();
	}
	
	
	public static void mergeDemo(){
		VLinkedList list1 = new VLinkedList();
		VLinkedList list2 = new VLinkedList();
		VLinkedList newList =null;
		
//		list1.head = new LNode(1);
//		list1.head.next = new LNode(2);
//		list1.head.next.next = new LNode(3);
//		list1.head.next.next.next = new LNode(4);
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.printList();
		//list.head.next.next.next.next = list.head.next;
			
		list2.add(5);
		list2.add(6);
		list2.add(7);
		list2.add(8);
		list2.add(9);
		
		list2.printList();
		
		newList = util.merge(list1, list2);
		
		newList.printList();
//		/System.out.println();
	}
	
}
