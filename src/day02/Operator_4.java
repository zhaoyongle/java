/*
 * �߼��������������Boolean��������֮�����
 * ���Ҳ��Boolean����
 * 
 * & ��һ����FALSE������������FALSE������FALSE����FALSE
 * | ��һ����TRUE������������TRUE������TRUE����TRUE
 * ^ :������ͬΪFALSE����ͬTRUE
 * ��  :ȡ������TRUE = FALSE����FALSE = TRUE
 * && ����·�룬һ����FALSE����һ�߲�����
 * || ����·��һ����TRUE����һ�߲����У�
 */
package day02;

public class Operator_4 {
	public static void main(String[] args)
	{
		System.out.println(false&true);
		System.out.println(true|true);
		System.out.println(false^false);
		System.out.println(true^true);
		
		System.out.println(!true);
		System.out.println("--------------------------");
		int i = 3;
		int j = 4;
		System.out.println(3>4 && ++j>2);
		System.out.println(i);
		System.out.println(j);
		
		System.out.println(3==3 || ++j>2);
		System.out.println(i);
		System.out.println(j);
	}

}
