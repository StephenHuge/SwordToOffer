package swordOffer;

/**
 * ���ǽ�ָoffer�ĵ�5�⣺
 * ����һ�������ͷ��㣬��β��ͷ��������ӡ��ÿ������ֵ��
 * @author Stephen Huge
 */
public class Ex05ReverseLinkList2 {	
	public static void main(String[] args) {
		//�ڲ����ʵ������ʽ
		Ex05ReverseLinkList2.Node a = new Ex05ReverseLinkList2().new Node("aaa");
		Ex05ReverseLinkList2.Node b = new Ex05ReverseLinkList2().new Node("bbb");
		Ex05ReverseLinkList2.Node c = new Ex05ReverseLinkList2().new Node("ccc");
		a.next = b;
		b.next = c;
		c.next = null;
		reverseLinkList2(a);
	}
	public static void reverseLinkList2(Node header) {		
		if(header.next != null) {	//�ݹ����
			reverseLinkList2(header.next);
		}		
		System.out.println(header.data.toString());	
	}
	public class Node{
		Node next;
		Object data;
		Node() {}
		Node(Object data) {
			this.data = data;
		}
	}
}
