package swordOffer;
/**������ 20��˳ʱ���ӡ����
 * ��Ŀ������һ�����󣬰��մ���������˳ʱ���˳�����δ�ӡ��ÿһ�����֡�
 * 
 * @author Stephen Huge
 * @date 17/04/22
 */
public class Ex20PrintMatrixClockwisely {

	public static void main(String[] args) {
//		int[][] array = new int[3][0];
//		int[][] array = {{1,2,3,4,5}};
//		int[][] array = {{1},{2},{3},{4},{5}};
//		int[][] array = {{1,2,3},{2,3,4}};		
		int[][] array = {{1,2},{2,3},{3,4},{4,5},{5,6}};		
//		int[][] array = {{1,2,3},{2,3,4},{3,4,5}};
//		int[][] array={{1,2,3,4,5},{5,6,7,8,9},{9,10,11,12,13},{13,14,15,16,17},{17,18,19,20,21},{21,22,23,24,25}};
		Ex20PrintMatrixClockwisely pmcw = new Ex20PrintMatrixClockwisely();
		pmcw.printMatrixClociwisely(array);
	}
	public void printMatrixClociwisely(int[][] a) {
		if(a == null || a.length == 0 || (a.length > 0 && a[0].length == 0)) {
			System.out.println("Length error!");
			return;
		}
		
		int up = 0;
		int down = a.length - 1;//ÿ�е�����
		int left = 0;
		int right = a[0].length - 1;//ÿ�е�����
		
		int rDir = 1;
		int cDir = 1;
		while(true) {
			if(left <= right) {
				if(rDir == 1) {
					printLR(a, left, right, up, down);
					up++;
					rDir = 0;
				}else {
					printRL(a, left, right, up, down);
					down--;
					rDir = 1;
				}	
			}else {
				System.out.println("left > right");
				return;
			}
			if(up <= down) {
				if(cDir == 1) {
					printUD(a, left, right, up, down);
					right--;
					cDir = 0;
				}else {
					printDU(a, left, right, up, down);
					left++;
					cDir = 1;			
				}	
			}else {
				System.out.println("up < down");
				return;
			}	
		}
	}
	private void printLR(int[][] a, int left, int right, int up, int down) {	//�����Ҵ�ӡ
		for(int i = left; i <= right; i++) {
			System.out.print(a[up][i] + " ");
		}
		System.out.print(". ");
	}
	private void printRL(int[][] a, int left, int right, int up, int down) {	//���ҵ����ӡ
		for(int i = right; i >= left; i--) {
			System.out.print(a[down][i] + " ");
		}
		System.out.print(". ");
	}
	private void printUD(int[][] a, int left, int right, int up, int down) {	//���ϵ��´�ӡ
		for(int i = up; i <= down; i++) {
			System.out.print(a[i][right] + " ");
		}
		System.out.print(". ");
	}
	private void printDU(int[][] a, int left, int right, int up, int down) {	//���µ��ϴ�ӡ
		for(int l = down;l >= up; l--) {
		System.out.print(a[l][left] + " ");
	}
		System.out.print(". ");
	}
}
