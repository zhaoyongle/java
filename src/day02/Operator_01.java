/*
 * ++д�ڱ���ǰ�棬��ж�ر������棬����
 * a = 1
 * a++
 * ++a
 * ����д��ǰ�棬���Ǻ��棬�ڱ����Լ����������ǣ�û������
 * ���Ǳ�����Ҫ�ǲ������������㣬����������
 * 
 */
package day02;

public class Operator_01 {
	public static void main(String[] args){
		int i = 5;
		int j = i++;
		System.out.println(i);	//6
		System.out.println(j);	//5
		
		int m = 5;
		int n = ++m;
		System.out.println(m);
		System.out.println(n);
	}

}
