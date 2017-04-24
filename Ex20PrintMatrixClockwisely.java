package swordOffer;
/**������ 20��˳ʱ���ӡ����
 * ��Ŀ������һ�����󣬰��մ���������˳ʱ���˳�����δ�ӡ��ÿһ�����֡�
 * 
 * @author Stephen Huge
 * @date 17/04/22
 */
public class Ex20PrintMatrixClockwisely {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		int[][] array={{1,2,3,4,5},{5,6,7,8,9},{9,10,11,12,13},{13,14,15,16,17},{17,18,19,20,21},{21,22,23,24,25}};
//		int[][] array = {{1,2,3,4,5}};
		int[][] array = {{1},{2},{3},{4},{5}};
		Ex20PrintMatrixClockwisely pmcw = new Ex20PrintMatrixClockwisely();
		pmcw.printMatrixClockwisely(array);
	}
	public void printMatrixClockwisely(int[][] a) {
		if(a == null) {
			return;
		}
		int up = 0;
		int down = a.length - 1;//ÿ�е�����
		int left = 0;
		int right = a[0].length - 1;//ÿ�е�����

		if(up == down) {//����Ϊ1
			for(int i = 0; i <= right; i++) {
				System.out.print(a[0][i] + " ");
			}
		}else if(left == right) {//����Ϊ1
			for(int i = 0; i <= down; i++) {
				System.out.print(a[i][0] + " ");
			}
		}else{
			while(left < right && up < down) {
				if(left < right) {//��һ��
					for(int i = left; i <= right; i++) {
						System.out.print(a[up][i] + " ");
					}
					up++;
				}
				if(up < down) {//��һ��
					for(int j = up; j <= down; j++) {
						System.out.print(a[j][right] + " ");
					}
					right--;
				}
				if(left < right) {//�ڶ���
					for(int k = right; k >= left; k--) {
						System.out.print(a[down][k] + " ");
					}
					down--;
				}
				if(up < down) {//�ڶ���
					for(int l = down;l >= up; l--) {
						System.out.print(a[l][left] + " ");
					}
					left++;
				}
			}			
		}
	}
}
