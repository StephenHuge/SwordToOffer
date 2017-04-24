package swordOffer;
/**
 *���ǽ�ָoffer�ĵڶ��⣺ʵ�ֵ���ģʽ
 *�̰߳�ȫ�ķ�ʽ��4��
 *1.����ʽ�� 
 *2.˫�ؼ������DLC��+volatile�ؼ��֣� 
 *3.�ӳٳ�ʼ��ռλ��ģʽ��Holder���� 
 *4.ö�١� 
 * @author Stephen Huge
 */

public class Ex02Singleton {
	
	private Ex02Singleton(){}
	
	/*
	 * 1.����ʽ
	 * ��ʵ����һ�����󣬲������̲߳���ȫ������û���ӳټ���
	private static Ex01Singleton singleton = new Ex01Singleton();
	public static Ex01Singleton getInstance(){			
		return singleton;
	}*/
	/*
	 * 2.˫�ؼ������DLC��+volatile�ؼ���
	 * volatile�ؼ��ַ�ָֹ��������֮��˫�ؼ������DLC�����ж����жϣ�����Ч�����̲߳���ȫ
	private static volatile Ex01Singleton singleton;
	public static Ex01Singleton getInstance(){
		if(singleton == null){
			synchronized (Ex01Singleton.class){
				if(singleton == null){
					singleton = new Ex01Singleton();
				}
			}
		}
		return singleton;
	}*/
	/*
	 * 3.�ӳٳ�ʼ��ռλ��ģʽ��Holder���ֳ�Initialization on Demand Holder (IoDH)
	 * �ɾ�̬�ڲ���InstanceHolder����ʵ����singleton���������̲߳���ȫ��Ҳʵ�����ӳټ���
	 private static class InstanceHolder{
		public static Ex01Singleton singleton = new Ex01Singleton();	
	}
	public static Ex01Singleton getInstance(){			
		return InstanceHolder.singleton;
	}*/
	
	/*
	 * 4.ö��
	 * ��ʵ�н��ټ�
	 public enum Singleton{
	  	INSTANCE:
	   	public void whateverMethod(){}
	 }
	 */
	
}
