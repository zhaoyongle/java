package pers.zyl.demo01;
/*
 * 类的方式，描述现实中的事物
 * 	小汽车 属性和功能
 * 		属性：颜色， 轮胎个数 		变量定义
 * 		方法：成员方法
 * 
 */
public class Car {
	//定义car类型的属性
	
	//定义car类型的颜色
	String color;
	//定义轮胎个数
	int count;
	
	//定义car类型的功能
	public void Run() {
		System.out.println("小汽车在跑，" + color + count);
	}

}
