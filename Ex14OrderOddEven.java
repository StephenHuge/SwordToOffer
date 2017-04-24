package swordOffer;

import sortalgorthims.Tool;

/**
 * ������ 14����������˳��ʹ����λ��ż��ǰ��
 * ��Ŀ������һ���������飬ʵ��һ�������������ú������������ֵ�˳��ʹ��
 * ��������λ�������ǰ�벿�֣����е�����λ������ĺ�벿�֡�
 * 
 * @author Stephen Huge
 *
 */
public class Ex14OrderOddEven {
	public static void main(String[] args) {
		Ex14OrderOddEven ooe = new Ex14OrderOddEven();
		int[] arr = {11,25,32,1,3,4,37,12,33,13,32,10,38,58,7,4,63,33,6,43,4,21,14,24,62,4,42,1};
		int[] b = ooe.orderOddEven(arr);
		Tool.printL(b);
	}
	public int[] orderOddEven(int[] arr) {
		if(arr == null || arr.length == 0) {
			return null;
		}
		int left = 0;
		int right = arr.length - 1;
		while(left < right) {
			while(left < right && !isEven(arr[left])) {	//����ż��ͣ��
				left++;
			}
			while(left < right && isEven(arr[right])) {	//��������ͣ��
				right--;
			}
			if(left < right) {
				swap(arr, left, right);
			}
		}
		return arr;
	}

	private void swap(int[] arr, int left, int right) {
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;		
	}

	private boolean isEven(int i) {
		return i % 2 == 0;		
	}
}
