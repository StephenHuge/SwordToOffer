package swordOffer;


/**
 * ������ 15�������е����� k �����
 * ��Ŀ������һ����������������е����� k ����㡣Ϊ�˷��ϴ�����˵�ϰ�ߣ������
 * 1��ʼ�������������β����ǵ�����һ����㡣����һ���� 6 ������������ͷ���
 * ������ 1,2,3,4�� 5,6������������������ֵΪ 4 �Ľ�㡣
 * 
 * @author Stephen Huge
 *
 */
public class Ex15CountBackwardsInLinkList {

	public static void main(String[] args) {
		Ex15CountBackwardsInLinkList cbwill = new Ex15CountBackwardsInLinkList();		
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(3);
		ListNode d = new ListNode(4);
		a.next = b;
		b.next = c;
		c.next = d;
		ListNode sol = cbwill.countBackwardsInLinkList(a, 2);
		System.out.println(sol.getClass().getSimpleName());
	}
	public ListNode countBackwardsInLinkList(ListNode node, int k) {
		if(node == null || k == 0) {
			return null;
		}
		ListNode temp = null;
		ListNode result = null;
		temp = node;
		for(int i = 0; i < k; i++) {
			if(temp.next != null) {
				temp = temp.next;
			}else{
				return null;
			}
		}
		result = node;
		while(temp.next != null) {
			temp = temp.next;
			result = result.next;
		}
		return result;
	}
	/*
	//��ջ�ռ临�Ӷ�ΪO��n����ʱ�临�Ӷ�ΪO��n����Ч��̫��
	public ListNode countBackwardsInLinkList(ListNode node, int k) {
		if(node == null || k == 0) {
			return null;
		}
		Stack<ListNode> stack = new Stack<ListNode>();
		for(ListNode temp = node;temp.next != null; temp = temp.next) {
			stack.push(temp);
		}
		for(int i = 1; i < k; i++) {
			stack.pop();
		}
		return stack.peek();
	}*/
//	public class ListNode{
//		int data;
//		ListNode next;
//		
//		public ListNode(int data) {
//			this.data = data;
//		}
//	}
}
