package DataStructures;

public class LLutil {

	/**
	 * Check whether a list contains cycle or not
	 * @param list input Linked List
	 * @return true if yes, false if not.
	 */
	public static boolean isCycle(VLinkedList list){
		
		LNode slow = list.head;
		LNode fast = list.head;
		
		while(slow!=null && fast !=null && fast.next!=null){
			
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow==fast)
				return true;
				
		}
		
		return false;
		
	}
	
	public static VLinkedList merge(VLinkedList list1,VLinkedList list2){
		
		VLinkedList newList = new VLinkedList();
		
		int list1_len = list1.size();
		int list2_len = list2.size();
		
	//	System.out.println("LEN1 : "+list1_len+"\n LEN2 :"+list2_len);
		int i=0,j=0;
			
		while(i<list1_len && j<list2_len){
			
			if(list1.get(i) <= list2.get(j)){
				newList.add(list1.get(i++));
			}else{
				newList.add(list2.get(j++));
			}
						
		}
	
		while(i<list1_len){
			newList.add(list1.get(i++));
		}
		
		while(j<list2_len){
			newList.add(list2.get(j++));
		}
		
		return newList;
	}

	public static boolean isPalindrome(VLinkedList list){
		
			
		
		
		
		return false;
	}
	
	
}
