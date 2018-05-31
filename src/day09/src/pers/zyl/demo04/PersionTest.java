package pers.zyl.demo04;
/*
 * 定义好的类的方法进行调用
 * 创建对象，对象调用属性和方法
 */

public class PersionTest {
	public static void main(String[] args) {
		//创建persion类对象 new
		Persion p = new Persion();
		//对成员变量赋值
//		p.setAge(-200);
		p.setAge(50);
		p.name = "张三";
		p.speack();
		
		//输出成员变量age的值必须用get方法
		System.out.println(p.getAge());
		
	}

}
