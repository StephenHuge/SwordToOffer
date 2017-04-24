package swordOffer;
/**
 * ������ 12����ӡ 1 ������ n λ����Ŀ���������� n����˳���ӡ���� 1 ��
 * ���� nλ����������������3�����ӡ�� 1�� 2�� 3 һֱ�� 999.
 * 
 * @author Stephen Huge
 * 
 */

public class Ex12PrintNDigits {
	public static void main(String[] args) throws Exception {
		Ex12PrintNDigits pnd = new Ex12PrintNDigits();
		pnd.printNDigits(8);
	}
	public void printNDigits(int n) throws Exception{
		if(n < 0 || n > 8) {	//int�͵������ֵ��2147483647����9λ�����ܳ��������������n������ȡ��8
			throw new Exception("n��ֵ���Ϸ�");
		}
		int num = 1;
		int count = 0;	
		while(count < n) {
			num *= 10;
			count++;
		}
		for(int i = 1; i < num; i++) {
			System.out.print(i + "\t");
			if(i % 10 == 0) {	//	ÿ10��������
				System.out.println();
			}
		}
	}
}
