package swordOffer;
/**
 * ���ǽ�ָoffer�ĵ�8�⣺��ת�������С����
 * ��Ŀ��������һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�����
 * ��ת������һ����������������һ����ת�������ת�������СԪ�ء�������
 * ��{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת�����������СֵΪ 1��
 * 
 * @author Stephen Huge
 *
 */
public class Ex08MinAtRotateArr {
	public static void main(String[] args) {
		Ex08MinAtRotateArr mara = new Ex08MinAtRotateArr();
		int[] arr = {2, 3, 4, 5, 1};
//		int[] arr = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1};
		int sol = mara.MinAtRotateArr(arr);
		System.out.println(sol);
	}
	public int MinAtRotateArr(int[] arr) {
		return  MinAtRotateArr(arr, 0, arr.length - 1);
	}
	private int MinAtRotateArr(int[] arr, int left, int right) {			
		int pivot = (left + right) / 2;
		if(arr[left] == arr[right]) {
			return iterateGet(arr);
		}
		if(left == pivot) {
			return arr[left + 1];
		}
		if(arr[left] < arr[pivot]) {
			left = pivot;
			pivot = (pivot + right) / 2;
		}
		if(arr[left] > arr[pivot]) {
			right = pivot;
			pivot = (pivot - left) / 2;
		}
		return MinAtRotateArr(arr, left, right);
		
	}
	// ������������ͬʱ���޷�ʹ�ö��ַ��жϣ����ñ����ж�
	private int iterateGet(int[] arr) {
		int result = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] < result) {
				result = arr[i];
			}
		}
		return result;
	}
}
