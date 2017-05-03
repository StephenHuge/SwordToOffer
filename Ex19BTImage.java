package swordOffer;
/**
 * ���ǽ�ָoffer�ĵ�19�⣺�������ľ���
 * ��Ŀ�������һ������������һ�����������ú���������ľ���
 * 
 * @author Stephen Huge
 *
 */
public class Ex19BTImage {
	public static void main(String[] args) throws Exception {	
		int[] dlr = {1,2,4,7,3,5,6,8};	//ǰ��������� 
		int[] ldr = {4,7,2,1,5,3,8,6};	//�����������
		Ex06RebuiltBT rbt= new Ex06RebuiltBT();		
		BinaryNode bt = rbt.RebuiltBT(dlr, ldr);
		System.out.println();
		Ex19BTImage bti = new Ex19BTImage();
		BinaryNode bt2 = bti.BTImage(bt);
		Ex23PrintBTByRow.printBTByRow(bt2);
		
	}
	public BinaryNode BTImage(BinaryNode node) {
		if(node == null) {
			return null;
		}
		if(node.lChild == null && node.rChild == null) {
			return node;
		}
		//���������ӽ��
		BinaryNode temp = node.lChild;
		node.lChild = node.rChild;
		node.rChild = temp;
		//�������µݹ飬��þ��������
		BTImage(node.lChild);
		BTImage(node.rChild);
		return node;
	}
}
