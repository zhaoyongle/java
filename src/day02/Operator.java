/*
 * ���������
 * + �ӷ�������
 * -����
 * *�˷�
 * /����
 * %ȡģ
 * ++����1
 * --�Լ�1
 */
package day02;

public class Operator {
	public static void main(String[] args){
		//+�������ã���һ���ַ���������������������
		//+�����ַ�����������ӷ��š�5+5=55��
		//+�κ�����ֻҪ���ַ���+�����е����ݱ�����ַ���
		System.out.println("5+5="+5+5);
		
		//��������
		int i = 100;
		int j = 9;
		System.out.println(i/j);
		
		//ȡģ���㣬�������������ȡ��������
		int k = 6;
		int m = 4;
		System.out.println(k%m);
		
		//�������㣬�������������ȡ��������
		int a = 3;
		int b = 4;
		
		a++;	//�����Լ�����1
		
		++b;
		System.out.println(b);
	}

}
