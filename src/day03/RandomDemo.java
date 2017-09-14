/*
 * java中已有的引用类型，Random类，作用产生随机数
 * 步骤：
 * 	1、导入包，Random类，也在java.util文件中
 * 	2、公式：创建出Random类型的变量
 * 	3、变量.调用Random类中的功能，产生随机数
 * 
 * 	Random类，提供功能， 名字 nextint() 产生随机数
 * 	出现随机数的氛围，在nextInt(写一个整数)
 * 	随机数范围在 0--指定的整数之间的随机数
 * 
 * 产生浮点的随机数：功能名字 nextDouble() 随机数的氛围 0.0--1.0
 */

import java.util.Random;

public class RandomDemo {
	public static void main(String[] args){
		Random ran = new Random();
		
		int i = ran.nextInt(4);
		System.out.println(i);
		
		double d = ran.nextDouble();
		System.out.println(d);
	}

}
