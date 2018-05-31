package pers.zyl.demo01;
/*
 * 1、测试自定义car的类
 * 2、创建出car类型变量
 * 3、变量，调用属性 ---成员变量（car属性）
 * 4、变量.调用方法
 */
public class TestCar {
	public static void main(String[] args) {
		//创建car类的变量，创建出car类的对象，小汽车真的有了
		Car cc = new Car();
		
		//调用car类的颜色属性
		cc.color = "yello";
		//调用car类的轮胎个数属性
		cc.count = 5;
		
		//调用car方法
		cc.Run();
	}

}
