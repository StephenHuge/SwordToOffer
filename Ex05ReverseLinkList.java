package swordOffer;

import linearlist.LinkList;
import stack.*;
/**
 * ���ǽ�ָoffer�ĵ�5�⣺
 * ����һ�������ͷ��㣬��β��ͷ��������ӡ��ÿ������ֵ��
 * @author Stephen Huge
 */
public class Ex05ReverseLinkList {
	public static void main(String[] args) {
		LinkList<String> list = new LinkList<String>("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");
		System.out.println(list.toString());
		LinkStack<String> reverse = reverseLinkList(list);		
		System.out.println(reverse.toString());		
	}
	/**
	 * һ������ջ��ת����ķ�����
	 * @param list Ҫ��ת������
	 * @return ��ת֮��õ�����ջ
	 */
	public static LinkStack<String> reverseLinkList(LinkList<String> list) {
		if(list.isEmpty()) {
			return null;
		}else{
			LinkStack<String> temp = new LinkStack<String>();
			String next;
			for(int i = 0; i < list.length(); i++) {
				next = list.get(i); 
				if(next != null) {
					temp.push(next);
				}
			}
			return temp;
		}					
	}
}
