package swordOffer;

import java.util.Stack;

/**
 * ���ǽ�ָoffer�ĵ�7�⣺
 * ������ջʵ��һ�����У�ʵ�ֶ��˵��������� appendTail ��deleteHead��
 * �ֱ�����ڶ���β��������ڶ���ͷ��ɾ�����Ĺ��ܡ�
 * @author Stephen Huge
 */
public class Ex07StacksToQueue<T> {
	private Stack<T> stack1 = new Stack<T>();
	private Stack<T> stack2 = new Stack<T>();
	
	/**
	 * ������β����µ�Ԫ�أ���ӳɹ�����true�����ʧ�ܷ���false
	 * @return ��ӳɹ�����true�����ʧ�ܷ���false
	 */
	public boolean appendTail(T element) {
		if(!stack1.isEmpty() && !stack2.isEmpty()) {
			return false;			
		}else if(!stack1.isEmpty()) {
			stack1.push(element);
			return true;		
		}else{
			stack2.push(element);
			return true;
		}		
	}
	/**
	 * ��ͷԪ�س��ӣ����ӳɹ��򷵻س��ӵ�Ԫ�أ�����ʧ�����׳��쳣"failed"
	 * @return ���ӳɹ��򷵻س��ӵ�Ԫ��
	 * @throws Exception ����ʧ�����׳��쳣"failed"
	 */
	public T deleteHead() throws Exception{
		if(!stack1.isEmpty() && stack2.isEmpty()) {
			while(!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
			return stack2.pop();
		}else if(!stack2.isEmpty() && stack1.isEmpty()) {
			while(!stack2.isEmpty()) {
				stack1.push(stack2.pop());
			}
			return stack1.pop();
		}
		throw new Exception("failed");		
	}
	
	public static void main(String[] args) throws Exception {
		Ex07StacksToQueue<String> stq = new Ex07StacksToQueue<>();
		stq.appendTail("aaa");
		stq.appendTail("bbb");
		stq.appendTail("ccc");
		stq.deleteHead();
	}
}
