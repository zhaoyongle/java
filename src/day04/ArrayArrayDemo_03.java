/*
 *  ��ά����ı������
    ��һС�����۶�Ϊ{11, 12}��Ԫ    
    �ڶ�С�����۶�Ϊ{21, 22, 23}��Ԫ
    ����С�����۶�Ϊ{31, 32, 33, 34}��Ԫ��
	ÿ��С�����һ������, ��������洢��һ��������,�γɶ�ά����
	���:
	  ÿ��С�����
	  ����Ԫ�����
 */
package day04;

public class ArrayArrayDemo_03 {
	public static void main(String[] args){
		//����һ����ά���飬�洢��˾���е����۶�
		int[][] arr = { {11, 12} , {21, 22, 23} , {31, 32, 33, 34} };
		//���������������ֱ�洢С�����۶�͹�˾�����ܶ�
		int sum = 0;
		int groupsum = 0;
		//������ά���飬�ڱ������������
		for(int i = 0; i < arr.length ; i++){
			for(int j = 0; j < arr[i].length; j++){
				groupsum = arr[i][j] + groupsum;
//				groupsum += arr[i][j];
			}
			System.out.println(groupsum);
//			sum = sum + groupsum;
			sum +=groupsum;
			groupsum = 0;
		}
		System.out.println("==============");
		System.out.println(sum);
	}

}
