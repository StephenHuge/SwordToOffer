package swordOffer;
/**
 * ������ 9��쳲���������
 * ��Ŀ��дһ������������ n����쳲��������еĵ� n �
 * 
 * @author Stephen Huge
 *
 */
public class Ex09Fibonacci {
	public static void main(String[] args) {
		//long���ͱ���ռ4���ֽڣ���ȡֵ��Χ-2,147,483,648��2,147,483,647���ڴ�n�����ȡ��46��
		//Ҳ����쳲��������еĵ�46�1,836,311,903������47��Ϊ2,971,215,073������long���ȡֵ
		long a = fibonacci(46);
		System.out.println(a);
	}
	public static long fibonacci(int n) {
		int a = 0;	
		int b = 1;
		int res = 1;
//		if(n == 1) {
//			System.out.print(res + "\t");
//		}
		for(int i = 1; i < n; i++) {
//			if(i == 1) {
//				System.out.print(res + "\t");
//			}
			res = b + a;
			a = b;
			b = res;			
//			System.out.print(res + "\t");
//			if((i + 1) % 10 == 0) {
//				System.out.println();
//			}
		}
		return res;
	}
	//	�ݹ�ʵ�֣�Ч��ʮ�ֵ���
	public static long f(int n) {
		return n > 2 ? f(n - 1) + f(n - 2) : 1;
	}
}
