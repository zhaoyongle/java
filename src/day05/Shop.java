/*
 * ʵ����Ʒ�Ŀ�����
     ����:
	    1. չʾ�û�ѡ�����嵥
		2. ����ѡ��Ĺ��ܱ��,���в�ͬ�Ĳ���
		   A. չʾ���п��
		   B. �޸Ŀ������
		   
	  ����:
	    1. չʾ�û��嵥:
		   ������, �û�����, ѡ�������
		2. ����ѡ��,���ò�ͬ�ķ���
		    switch���
			  case 1 2 3
		
		   A  չʾ���
		     ���洢��Ʒ������,����
		   B  �޸Ŀ��
		        
			  �޸����еĿ������
 */
package day05;

import java.util.Scanner;

public class Shop {
	public static void main(String[] args){
		//ʹ�����飬������Ʒ��Ϣ
		//Ʒ�����ߴ磬�۸񣬿����������4������
		String[] brand = {"MacBookAir","ThinkpadT450"};
		double[] size = {13.3,15.6};
		double[] price = {9998.97,6789.56};
		int[] count = {0,0};
//		System.out.println("");
		
		//���ռ�������
		
		
		while(true){
		int index = chooseFunction();
		switch(index){
		case 1:
			printStore(brand, size,  price, count);
			break;
		case 2:
			update(brand, count, price);
			break;
		case 3:
			System.out.println("ϵͳ�˳���");
			return ;
			default:
				System.out.println("û�����ѡ�");
				break;
			
		}
		}
	}
	
	/*
	 * �������п�������õ�forѭ�����޷���ֵ
	 */
	public static void printStore(String[] brand, double[] size, double[] price, int[] count){
		for(int a = 0; a < size.length; a++){
			System.out.print(brand[a]+" ");
			System.out.print(size[a]+" ");
			System.out.print(price[a]+" ");
			System.out.print(count[a]);
			System.out.println();
		}

	}
	
	/*
	 * ʵ���û���ѡ���ܣ�����Ҫ����ֵ
	 * �����û��������뷵��int
	 * ����û��
	 */
	
	public static int chooseFunction(){
		System.out.println("-------------������------------");
		System.out.println("1.�鿴����嵥");
		System.out.println("2.�޸���Ʒ�������");
		System.out.println("3.�˳�");
		System.out.println("������Ҫִ�еĲ�����ţ�");
		//�����û���������
		Scanner sc = new Scanner(System.in);
		int chooserNumber = sc.nextInt();
		
		return chooserNumber;
	}
	
	/*
	 * �޸���Ʒ�����
	 * �õ�����������һ�����޸�һ��
	 * �õ�for�޷���ֵ
	 * �õ���������
	 * ���빫˾����Ʒ�ܼ�ֵ������һ���������
	 */
	
	public static void update(String[] brand, int[] count, double[] price){
		int countSum = 0;
		int Money = 0;
		for(int a = 0; a < brand.length ; a++){
			System.out.println("������"+brand[a]+"�Ŀ����");
			Scanner sc = new Scanner(System.in);
			count[a] = sc.nextInt();
			countSum += count[a];
			Money += count[a]*price[a];
		}
		System.out.println("������Ʒ�۸�Ϊ "+Money);
		System.out.println("���п����Ϊ "+ countSum);
		
	}
	

}
