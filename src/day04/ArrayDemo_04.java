/*
 * ��������У������������쳣
 * 	�����������쳣
 * 	��ָ���쳣
 */
package day04;

public class ArrayDemo_04 {
	public static void main(String[] args){
		//����������쳣
//		int[] arr = {3, 4, 1};
		//�����е�����Ԫ�أ�����0�� 1�� 2��
		//System.out.println(arr[3]);// java.lang.ArrayIndexOutOfBoundsException:
		
		//��ָ���쳣
		int[] arr2 = {2, 3, 31};
		System.out.println(arr2[2]);
		arr2 = null; //arr���ٱ���������
		System.out.println(arr2[2]);//java.lang.NullPointerException
	}

}
