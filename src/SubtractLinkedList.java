class ListNode {
	public int val;
	public ListNode next;
	public ListNode head;

	ListNode(int x) {
		val = x;
		next = null;
	}

	ListNode(int x, ListNode nextNode) {
		val = x;
		next = nextNode;
	}

//	public ListNode reverseList(ListNode a) {
//		if (a.next == null || a == null) {
//			head = a;
//			return a;
//		}
//		ListNode remaining = reverseList(a.next);
//		ListNode temp = a.next;
//		temp.next = a;
//		a.next = null;
//		return remaining;
//	}
	
	public  ListNode reverseList(ListNode currentNode)  
	 {  
	// For first node, previousNode will be null  
	ListNode previousNode=null;  
	  ListNode nextNode;  
	  while(currentNode!=null)  
	  {  
	   nextNode=currentNode.next;  
	  // reversing the link  
	   currentNode.next=previousNode;  
	  // moving currentNode and previousNode by 1 node  
	   previousNode=currentNode;  
	   currentNode=nextNode;  
	  }  
	  return previousNode;  
	 }  


	public ListNode subtract(ListNode head){
		
		ListNode slow = head;
		ListNode fast = slow.next;
		
		     
	    while(fast != null && fast.next != null) {
	         
	        slow = slow.next;
	        fast = fast.next.next;
	    }
	     
	    // Reverse the second half and get it's head
	    ListNode head2 = reverseList(slow.next);
	     
	    ListNode curr = head;    // pointer to first half
	    ListNode curr2 = head2; // Pointer to revesed second half list 
	     
	    while(curr2 != null) {
	         
	        curr.val = curr2.val - curr.val;
	        curr = curr.next;
	        curr2 = curr2.next;
	    }
	     
	    reverseList(head2);
	    return head;
	}
}

public class SubtractLinkedList {

}
