package swordOffer;

import java.util.Arrays;

/**
 * ���ǽ�ָoffer�ĵ�6�⣺�����������ǰ���������������Ľ�����ؽ����ö�������
 * ����ǰ������������������ж��������ظ������֣����������ǰ���������
 * {1,2,4,7,3,5,6,8}�������������{4,7,2,1,5,3,8,6}���ؽ�����������
 * 
 * @author Stephen Huge
 * 
 */
public class Ex06RebuiltBT {
	public static void main(String[] args) throws Exception {
		int[] dlr = {1,2,4,7,3,5,6,8};	//ǰ��������� 
		int[] ldr = {4,7,2,1,5,3,8,6};	//�����������
		Ex06RebuiltBT rbt= new Ex06RebuiltBT();		
		BinaryNode bt = rbt.RebuiltBT(dlr, ldr);
		System.out.println();
		rbt.getLRD(bt);
	}
	//ͨ��ǰ��������к�������������ؽ�������
	public BinaryNode RebuiltBT(int[] dlr, int[] ldr) throws Exception {
//		if(dlr == null || ldr == null) {	//����Ϊ0�����鲻Ϊ�գ���ô�жϻ���dataΪ0�Ľ�����
		if(dlr.length <= 0 || ldr.length <= 0) {	//���ܲ�����ָ���쳣����Ϊ�������δ��ʵ������
													//��������������޴�֮�ݣ�����Ӧ��ע��
			return null;
		}
		if(dlr.length != ldr.length) {
			throw new Exception("���г��Ȳ����");
		}
		BinaryNode root = new BinaryNode();				
		for(int i = 0; i < dlr.length; i++) {
			if(ldr[i] == dlr[0]) {
				root.data = ldr[i];
				System.out.print(root.data + " ");
				 root.lChild = RebuiltBT(Arrays.copyOfRange(dlr, 1, i + 1), 
						 Arrays.copyOfRange(ldr, 0, i));
				 root.rChild = RebuiltBT(Arrays.copyOfRange(dlr, i + 1, dlr.length), 
						 Arrays.copyOfRange(ldr, i + 1, ldr.length));
			}
		}		
		return root;
	}
	//��ӡ�����������������
	public void getLRD(BinaryNode node) {
		if(node.lChild == null && node.rChild == null) {
			System.out.print(node.data + " ");	//��ӡҶ���
			return;
		}
		if(node.lChild != null) {
			getLRD(node.lChild);
		}
		if(node.rChild != null){
			getLRD(node.rChild);
		}
			System.out.print(node.data + " ");
	}
	
//	public class BinaryNode{
//		BinaryNode lChild;
//		BinaryNode rChild;
//		int data;
//	}
}
	

