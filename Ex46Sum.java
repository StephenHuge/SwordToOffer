package swordOffer;

import java.util.Scanner;
/**
 * ������ 46���� 1+2+...+n
 * ��Ŀ���� 1+2+...+n,Ҫ�����ó����� for�� while�� if�� else�� switch�� case
 * �ȹؼ��ּ������ж���䣨 A?B:C����
 * 
 * @author Stephen Huge
 * @date 17/04/22
 */
public class Ex46Sum {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Input n:");
		int n = scan.nextInt();
		Ex46Sum su = new Ex46Sum();
		int sol = su.sum(n);
		System.out.println("Sum from 1 to n is " + sol);	
	}
//	public int sum(int n){
//		if(n <= 0) {
//			return -1;
//		}
//		if(n == 1) {
//			return 1;
//		}
//		if((n & 1) == 0) {//ż��
//			
//		}
//	}
	public int sum(int n) {
		if(n <= 0) {
			return -1;
		}
		try{
			int[] array = new int[n-2];
			return n+sum(n-1);
		}
		catch(Exception e) {
			return 1;

		}
	}
}
