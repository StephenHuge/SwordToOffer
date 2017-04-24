package swordOffer;
/**
 * ������ 11����ֵ�������η���Ŀ��ʵ�ֺ��� doublePower(double base�� int exponent)��
 * �� base �� exponent�η�������ʹ�ÿ⺯����ͬʱ����Ҫ���Ǵ������⡣
 *  
 * @author Stephen Huge
 *
 */
public class Ex11DoublePower {
	public static void main(String[] args) throws Exception {
		Ex11DoublePower dp = new Ex11DoublePower();
		System.out.println(dp.doublePower(2.3,	-1));
	}
	public double doublePower(double base, int exponent) throws Exception{
		if(base == 0.0 && exponent <= 0) {
			throw new Exception("0�ķ���������û������");
		}
		return getPower(base, exponent);
	}
	
	private double getPower(double base, int exponent) {
		if(base == 0.0) {	//����Ϊ0
			return 0.0;
		}
		if(exponent == 1) {	//ָ��Ϊ1
			return base;
		}
		if(exponent < 0) {	//ָ��Ϊ��
			return 1 / power(base, -exponent);
		}
		return power(base, exponent);
	}
	
	private double power(double base, int exponent) {
		for(int i = 1; i < exponent; i++) {
			base *= base;
		}
		return base;
	}
}
