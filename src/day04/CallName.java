/*
 * �����������
 * 	1.�洢����
 * 	2.Ԥ�������е�����
 * 	3.�����һ���˵�����
 */
package day04;

import java.util.Random;

public class CallName {
	public static void main(String[] args){
		//��һά����洢�����˵�����String
		String[] names = {"����", "����", "����", "����", "����", "����" };
		//��forѭ�������������˵�����
		for(int i = 0; i < names.length; i++){
			System.out.println(names[i]);
		}
		System.out.println("==================");
		//����һ���������Ϊ����������������
		Random rm = new Random();
		int name = rm.nextInt(names.length);
		System.out.println(names[name]);
	}
}
