/*
 * �����Ķ���
 */
package day05;

import java.util.Scanner;

public class MethodDemo_01 {
	public static void main(String[] args){
//		printRect();
//		double avg = getAvg(1,2,3);
//		System.out.println(avg);
//		getNumber();
		printRect2(12, 8);
		
		
	}
	/*
            �����޷���ֵ�в������������ӡָ��M�У�ÿ��N��*�ŵľ���
	��ȷ�����������,����̨���ͼ��,û�з���ֵ��
	��������û��δ֪��,ͼ������,������,��δ֪��, ������������int
	 */
	public static void printRect2(int a, int b){
		for(int i = 0; i < a; i++){
			for(int j = 0; j < b; j++){
				System.out.print("x ");
			}
			System.out.println();
		}
		
	}
	
	/*
	   �����з���ֵ�޲��������������¼��õ�һ������
	   ��ȷ��������������������� int
	   ��ȷ��û��δ֪��,û
	*/
	public static int getNumber(){
		Scanner sc = new Scanner(System.in);
		
		return sc.nextInt();
		
	}
	
	/*
	   �����з���ֵ�в���������������������ƽ��ֵ
	   ��ȷ������������������, ����ֵ���� double
	   ��ȷ����δ֪��, ����δ֪������
	*/
	public static double getAvg(double a, double b, double c){
		double avg = (a+b+c)/3;
		
		return avg;
	}
	
	/*
	   �����޷���ֵ�޲������������ӡ3�У�ÿ��3��*�ŵľ���
	   Ϊʲôû�з���ֵ:
	       ��ӡ���� ,���Ч��,����Ҫ���������
		   ��ȷδ֪��: ����Ҫδ֪��
	*/
	public static void printRect(){
		for(int i = 0; i < 3; i++){
			for(int j = 0; j<3; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
