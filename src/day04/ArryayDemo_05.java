/*
 * ���������е����ֵ
 * ����{3�� 1�� 4�� 6}���Ƚ�
 */
package day04;

public class ArryayDemo_05 {
	public static void main(String[] args){
		//�������飬int����
		int[] arr = {3, 1, 4, 8};
		//�����������¼0�����ϵ�Ԫ��
		int max = arr[0];
		
		//�������飬��ȡ���е�Ԫ�أ��ñ���max�Ƚ�
		for(int i = 1; i < arr.length; i++){
			//����max���������е�ÿ��Ԫ�ؽ��бȽ�
			//���max��С���������е�һ��Ԫ��
			if(max < arr[i]){
				//�ϴ������Ԫ�ظ�ֵ��max
				max = arr[i];
			}
		}
		//������ɣ�����max�����������ֵ
		System.out.println(max);
	}

}
