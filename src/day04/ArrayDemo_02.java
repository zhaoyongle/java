/*
 * ������������巽ʽ
 * 	��������[] ������ = new ��������[]{Ԫ��1��Ԫ��2��Ԫ��3}��
 * 	ע�����new����������У�������д�κ����ݣ�д�˾ͱ���ʧ��
 * 
 * ��������[] ������ = {Ԫ��1��Ԫ��2��Ԫ��3};
 */
package day04;

public class ArrayDemo_02 {
	public static void main(String[] args){
		//���������ͬʱ����Ԫ�ؽ��и�ֵ
		int[] arr = new int[]{1, 2, 3, 5};
		System.out.println(arr.length);
		System.out.println(arr[3]);
		
		System.out.println("=============");
		//�������飬ֱ�ӽ��д����Ÿ�ֵ
		int[] arr2 = {23, 45,3, 1, 45};
		System.out.println(arr2.length);
		System.out.println(arr2[1]);
	}

}
