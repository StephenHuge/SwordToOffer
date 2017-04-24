package swordOffer;
/**
 * ��ָoffer��10��
 * ��Ŀ����ʵ��һ������������һ��������������������Ʊ�ʾ�� 1 �ĸ���������
 * �� 9 ��ʾ�ɶ������� 1001���� 2 λ�� 1������������ 9��������� 2.
 * 
 * @author Stephen Huge
 *
 */
public class Ex10NumOf1InBinary {
	public static void main(String[] args) {
		Ex10NumOf1InBinary nob = new Ex10NumOf1InBinary();
		int ans = nob.numOf1InBinary(2147483647);
		System.out.println(ans);
	}
	public int numOf1InBinary(long num) {
		if(num < 0 || num > Long.MAX_VALUE) {
			return -1;
		}
		int count = 0;
		if(num % 2 == 0) {
			count++;
		}
		while(num >= 1) {
			if(num % 2 != 0) {
				count++;
			}
			num /= 2;
		}
		return count;
	}
}
