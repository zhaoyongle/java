/*
 * 方法的定义
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
            定义无返回值有参数方法，如打印指定M行，每行N个*号的矩形
	明确方法计算后结果,控制台输出图形,没有返回值的
	方法中有没有未知数,图形行数,和列数,是未知的, 数据类型整数int
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
	   定义有返回值无参数方法，如键盘录入得到一个整数
	   明确方法计算后结果的数据类型 int
	   明确有没有未知数,没
	*/
	public static int getNumber(){
		Scanner sc = new Scanner(System.in);
		
		return sc.nextInt();
		
	}
	
	/*
	   定义有返回值有参数方法，如求三个数的平均值
	   明确方法计算后的数据类型, 返回值类型 double
	   明确方法未知数, 三个未知的整数
	*/
	public static double getAvg(double a, double b, double c){
		double avg = (a+b+c)/3;
		
		return avg;
	}
	
	/*
	   定义无返回值无参数方法，如打印3行，每行3个*号的矩形
	   为什么没有返回值:
	       打印矩形 ,输出效果,不需要将结果返回
		   明确未知数: 不需要未知数
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
