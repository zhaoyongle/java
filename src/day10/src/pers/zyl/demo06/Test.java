package pers.zyl.demo06;

/*
 * 测试抽象类，
 * 	创建他的子类对象，使用子类对象调用方法
 */

public class Test {
	public static void main(String[] args) {
		JavaEE je = new JavaEE();
		je.work();
		
		Android ad = new Android();
		ad.work();
	}

}
