package pers.zyl.demo04;

/*
 * 描述现实生活中的人或事物
 * 	属性： 姓名 年龄
 *  功能： 说话
 *  
 *  出现安全问题: age问题,可能出现赋值为负数的情况
 *  负数不会导致程序问题,违反生活中的真实情况
 *  
 *  提高安全问题: 让外面的类,不允许直接调用我的成员变量
 *  新的关键字  private 私有   属于成员修饰符,不能修饰局部变量
 *  被private修饰的成员,只能在自己的本类中被使用
 *  
 *  对私有变量,提供公共的访问方式: 方法
 */

public class Persion {
	//人的姓名，成员变量
	String name;
	//人的年龄，成员变量
	private int age;
	
	//定义的age被私有，让外面的类使用
	//定义方法，对age进行赋值，方法的名字必须用set开头
	public void setAge(int a) {
		//对变量参数a进行范围限制
		if(a < 0 || a > 200) {
			//如果年龄大于200或小于0，将年龄改为20
			age = 20;
		}else {
			//如果没有超出范围，则对age赋值
			age = a;
		}
		
	}
	
	//定义方法，对变量age获取值使用，方法开头用get
	public int getAge() {
		return age;
	}
	
	//定义说话的功能，在说话中时要说出自己的姓名和年龄
	public void speack() {
		System.out.println("name: " + name + ", age:" + age);
	}

}
