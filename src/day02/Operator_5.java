/*
 * ��Ԫ�����
 * ��ʽ��
 * 	�������ʽ �� ���1���2��
 * �������ʽ�Ľ����TRUE����Ԫ������Ľ�����ǣ����1��
 * �������ʽ�Ľ����FALSE����Ԫ������Ľ�����ǣ����2
 */
package day02;

public class Operator_5 {
	public static void main(String[] args){
		System.out.println(3>5?99:88);
		
		String s = 0==1?"����":"�Ǻ�";
		System.out.println(s);
		
		int a = 5;
		int b = 3;
		int c = 1;
		int n2 = (a>b && b>c) ? (c++) : (++c);
		System.out.println(c);
		System.out.println(n2);
	}

}
