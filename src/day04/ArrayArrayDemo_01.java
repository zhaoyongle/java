/*
 * int[][] arr = new int[3][]���Ƽ�
 * ��ά�����ж�������һά���飬ÿ��һά���鳤�ȣ���û��ָ��
 * arr[0]
 * arr[1]
 * arr[2]
 * ����Ҫnew
 * 	arr[0] = new int[5]
 * 	arr[1] = new int[4]
 * 
 * ��򵥵Ķ�ά���鶨�巽ʽ
 * 		int[][] arr = {{12,32, 43},{12, 32, 3}{12, 32, 32}}
 */
package day04;
public class ArrayArrayDemo_01 {
	public static void main(String[] args){
		int[][] arr = {{2, 4, 23} , {23, 32, 23} , {23, 32, 23}};
		//���⣺��ӡ23���������е�Ԫ��0
		
		System.out.println(arr[1][0]);
	}

}

