/*
 * ��ά����ı���
 * 	��ά�����У��洢4��һά���飬ÿ��һά����ĳ��Ȳ�ͬ
 * 
 * 	������forѭ����������ά����
 * 		���������У�for����һά����
 */
package day04;

public class ArrayArrayDemo_02 {
	public static void main(String[] args){
		int[][] arr = {{12,3, 4,}, {12, 32, 43,43}, {1,32}};
		
		//��ѭ����������ά����
		for(int i = 0; i<arr.length; i++){
			//��ѭ��������ÿ��ά���� arr[0] arr[1] arr[2]
			for(int j = 0; j<arr[i].length; j++){
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

}
