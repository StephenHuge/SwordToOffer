package swordOffer;
/**
 * ������ 24�������������ĺ����������
 * ��Ŀ������һ���������飬�жϸ������ǲ���ĳ�����������ĺ�������Ľ����
 * ���򷵻�true�����򷵻�false��
 * 
 * @author Stephen Huge
 * 
 */
import java.util.Arrays;

public class Ex24JudgeLRD {
	public static void main(String[] args) throws Exception {
//		int[] lrd = {5,7,6,9,11,3,10,8};
		int[] lrd = {8,8,8,8,8,8,8,8,8};
		System.out.println(judgeLRD(lrd));
	}
	public static boolean judgeLRD(int[] lrd) throws Exception {
		if(lrd == null || lrd.length == 0) {	//����Ϊnull���߳���Ϊ0���׳��쳣
			throw new Exception("��������ʧ��");
		}	
		int len = lrd.length;
		if(len == 1) {	// Ĭ�����lrd����Ϊ1������Ϲ��򣬷���true
			return true;
		}
		int root = lrd[len - 1];
		int cut = 0;
		while(lrd[cut] < root && cut < len - 1) {	//�������г���cut�����֣��󲿷�0��cut���Ҳ���cut+1��len-2
			if(lrd[cut] == root) {	//��������ȵ�ֵ
				return false;
			}
			cut++;
		}
		int[] lTree = null;
		int[] rTree = null;
		boolean left = false;	//�������Ƿ���Ϲ���
		boolean right = false;	//�������Ƿ���Ϲ���
		if(cut != 0) {
			lTree = Arrays.copyOfRange(lrd, 0, cut);
			left = judgeLRD(lTree);
		}else{  //������Ϊ�գ�Ĭ�Ϸ���
			left = true;
		}
		if(cut != len -1) {
			rTree = Arrays.copyOfRange(lrd, cut, len - 1);
			for(int i = cut; i < len - 1; i++) {
				if(lrd[i] <= root) {
					return false;
				}
			}
			right = judgeLRD(rTree);
		}else{  //������Ϊ�գ�Ĭ�Ϸ���
			right = true;
		}		
		return left && right;	//�������������Ϲ����򷵻�true�����򷵻�false
	}
}		