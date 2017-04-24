package swordOffer;

/**
 * ������ 13���� O�� 1��ʱ��ɾ��������
 * ��Ŀ���������������ͷָ���һ�����ָ�룬����һ�������� O(1)ʱ��ɾ���ý�㡣
 * 
 * @author Stephen Huge
 *
 */
public class Ex13DelNodeInO_1 {
	public static void main(String[] args) throws Exception {
		ListNode d = new ListNode(4);
		ListNode c = new ListNode(3, d);
		ListNode b = new ListNode(2, c);
		ListNode a = new ListNode(1, b);
		ListNode head = a;
		Ex13DelNodeInO_1 dnio = new Ex13DelNodeInO_1();
		int data = dnio.delNodeInO_1(head, d);
		System.out.println(data);
	}
	public int delNodeInO_1(ListNode head, ListNode delNode) throws Exception {
		if(head == null || delNode == null) {
			throw new Exception("��������ɾ��ʧ��");
		}
		if(delNode == head) {	//ɾ��ͷָ��
			head = delNode.next;
			int hTemp = delNode.data;
			delNode = null;
			return hTemp;
		}
		if(delNode.next == null) {	//ɾ��βָ��
			int tTemp = delNode.data;
			delNode = null;
			return tTemp;
		}
		int mTemp = delNode.data;  
		delNode.data = delNode.next.data;
		delNode.next = delNode.next.next;		
		return mTemp;
	}
//	public class ListNode {
//		public int data;
//		public ListNode next;
//		
//		public ListNode() {		
//		}
//		public ListNode(int data) {
//			this.data = data;
//		}
//		public ListNode(int data, ListNode next) {
//			this.data = data;
//			this.next = next;
//		}		
//	}
}
