package swordOffer;

import sortalgorthims.Tool;

/**
 * ���ǽ�ָoffer�ĵ�3�⣺
 * һ����ά���飬ÿһ�д����ҵ�����ÿһ�д��ϵ��µ�������
 * ��һ����ά�����һ���������ж��������Ƿ���������
 * @author Stephen Huge
 */

public class Ex03SearchMatrix {
	public static void main(String[] args){
		int[][] a = Tool.getRandomMatrix2(2, 2);
		for(int i=0; i<a.length; i++)
			Tool.print(a[i]);
		boolean b = searchMatrix(a, 4);
		Tool.print(b+"");
	}

	/**
	 * ��{@code int}�Ͷ�ά����Ѱ��{@code int}�ͱ���s�Ƿ���ڣ����ڷ���{@code true}�����򷵻�{@code false}��
	 * @param a {@code int}�Ͷ�ά����
	 * @param s ҪѰ�ҵ�{@code int}�ͱ���
	 * @return �������a�д���s���򷵻�{@code true}�����򷵻�{@code false}
	 */
	public static boolean searchMatrix(int[][] a, int s){
		if (a==null)	return false;
		int col = a[0].length-1;		//����
		int row = 0;					//����
		while(col>=0 && row<a.length){
			if (a[row][col]==s)	return true;
			if (a[row][col]>s)		
				col--;
			else
				row++;		
		}
		return false;	
	}
}		
		/*	//����ķ���
		if (a==null)	return false;	
		
		int col = a.length-1;		//����
		int row = a[0].length-1;	//����
		if (a[col][row]<s)	return false;
		while(true){
			while(col > row){			//����������������������			
				col /= 2;
				if (a[col][row]==s)	return true;
				if (a[col][row] > s)	break;
				else{
					col += col/2;
					if(a[col][0]>s)	break;
					if (a[col][row]==s)	return true;
					break;
				}
				
			}
			while(col < row ){			//����С����������������			
				row /= 2;
				if (a[col][row]==s)	return true;
				if (a[col][row]>s)	break;
				else{
					row += row/2;
					if(a[0][row]>s)	break;
					if (a[col][row]==s)	return true;
					break;
				}
			}
		}
*/	

