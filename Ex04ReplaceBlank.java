package swordOffer;

/**
 * ���ǽ�ָoffer�ĵ����⣺���ַ����еĿո��滻��"%20"
 * 
 * @author Steve Huge
 */
public class Ex04ReplaceBlank {
	public static void main(String args[]){
		String s="We are happy.";
		Ex04ReplaceBlank replace = new Ex04ReplaceBlank();  
		System.out.println(replace.replaceBlank(s));
	}
	/**
	 * �滻�ַ���input�еĿո�Ϊ��%20����
	 * @param input	һ�� �ַ���
	 * @return	�����滻��ɺ�����ַ��������еĿո�����滻Ϊ��%20��
	 */
	public String replaceBlank(String input){
		if(input==null)
		return null;
//		�����ǵ��̱߳�̣�����������������StringBuffer������StringBuilder
//		StringBuffer outputBuffer=new StringBuffer();
		StringBuilder output = new StringBuilder();
		for(int i=0;i<input.length();i++){
			if(input.charAt(i)==' '){
				output.append("%20");
//				output.append("2");
//				output.insert(i, " ");
			}else {
				output.append(String.valueOf(input.charAt(i)));
			}
		}
		return new String(output);
	}
}
