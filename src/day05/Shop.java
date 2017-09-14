/*
 * 实现商品的库存管理
     功能:
	    1. 展示用户选择功能清单
		2. 根据选择的功能编号,进行不同的操作
		   A. 展示所有库存
		   B. 修改库存数量
		   
	  分析:
	    1. 展示用户清单:
		   输出语句, 用户输入, 选择功能序号
		2. 根据选择,调用不同的方法
		    switch语句
			  case 1 2 3
		
		   A  展示库存
		     将存储商品的数组,遍历
		   B  修改库存
		        
			  修改所有的库存数量
 */
package day05;

import java.util.Scanner;

public class Shop {
	public static void main(String[] args){
		//使用数组，保存商品信息
		//品名，尺寸，价格，库存数，定义4个数组
		String[] brand = {"MacBookAir","ThinkpadT450"};
		double[] size = {13.3,15.6};
		double[] price = {9998.97,6789.56};
		int[] count = {0,0};
//		System.out.println("");
		
		//接收键盘输入
		
		
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
			System.out.println("系统退出！");
			return ;
			default:
				System.out.println("没有这个选项！");
				break;
			
		}
		}
	}
	
	/*
	 * 遍历所有库存数，用到for循环，无返回值
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
	 * 实现用户的选择功能，不需要返回值
	 * 接收用户键盘输入返回int
	 * 参数没有
	 */
	
	public static int chooseFunction(){
		System.out.println("-------------库存管理------------");
		System.out.println("1.查看库存清单");
		System.out.println("2.修改商品库存数量");
		System.out.println("3.退出");
		System.out.println("请输入要执行的操作序号：");
		//接收用户键盘输入
		Scanner sc = new Scanner(System.in);
		int chooserNumber = sc.nextInt();
		
		return chooserNumber;
	}
	
	/*
	 * 修改商品库存数
	 * 用到遍历，遍历一个，修改一个
	 * 用到for无返回值
	 * 用到两个数组
	 * 输入公司的商品总价值，定义一个变量输出
	 */
	
	public static void update(String[] brand, int[] count, double[] price){
		int countSum = 0;
		int Money = 0;
		for(int a = 0; a < brand.length ; a++){
			System.out.println("请输入"+brand[a]+"的库存数");
			Scanner sc = new Scanner(System.in);
			count[a] = sc.nextInt();
			countSum += count[a];
			Money += count[a]*price[a];
		}
		System.out.println("所有商品价格为 "+Money);
		System.out.println("所有库存数为 "+ countSum);
		
	}
	

}
