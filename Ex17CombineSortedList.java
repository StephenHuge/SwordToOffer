package swordOffer;
/**
 * ������ 17���ϲ��������������
 * ��Ŀ������������������������ϲ�����������ʹ�������еĽ����Ȼ�ǰ�
 * �յ�������ġ�
 * 
 * @author Stephen Huge
 *
 */
public class Ex17CombineSortedList {
	public static void main(String[] args) {
		Ex17CombineSortedList csl = new Ex17CombineSortedList();		
		ListNode a = new ListNode(1, 
				new ListNode(3, 
						new ListNode(5, 
								new ListNode(7))));
		ListNode b = new ListNode(2, 
				new ListNode(4, 
						new ListNode(6, 
								new ListNode(8))));
		ListNode c = csl.combineSortedList(a, b);
		csl.print(c);
	}
	private void print(ListNode c) {
		if(c == null) {
			return;
		}
		while(c != null) {
			System.out.println(c.data);
			c = c.next;
		}
		
	}
/*	//�ݹ�
	public ListNode combineSortedList(ListNode first, ListNode second) {
		
		if(first == null && second ==null) {return null;}
		if(first == null) {return second;}
		if(second == null) {return first;}
		
		ListNode combined = null;
		if(first.data >= second.data) {
			combined = second;
			combined.next = combineSortedList(first, second.next);
		}else{
			combined = first;
			combined.next = combineSortedList(second, first.next);
		}
		return combined;
	}*/
	//�ǵݹ�
	public ListNode combineSortedList(ListNode first, ListNode second) {
		
		if(first == null && second == null) {  return null;  }
		if(first == null) {	 return second;  }
		if(second== null) {	 return first;  }
		
		ListNode combined = null;	//�������
		ListNode current = null;
		ListNode fNext = null;
		ListNode sNext = null;
		
		while(first != null && second != null) {
			if(first.data <= second.data) {
				fNext = first.next;
				first.next = null;
				if(current == null) {
					combined = first;
					current = combined;
				}else{
					current.next = first;
					current = current.next;
				}
				first = fNext;
			}else{
				sNext = second.next;
				second.next = null;
				if(current == null) {
					combined = second;
					current = combined;
				}else{
					current.next = second;
					current = current.next;
				}
				second = sNext;
			}
		}
		if(first == null && second != null) {
			current.next = second;
//			current = current.next;
		}else{
			current.next = first;
//			current = current.next;
		}
		return combined;
	}
	
	public static class ListNode{
		int data;
		ListNode next;
		public ListNode() {}
		public ListNode(int data) {
			this.data = data;
		}
		public ListNode(int data, ListNode next) {
			this.data = data;
			this.next = next;
		}
	}
}
