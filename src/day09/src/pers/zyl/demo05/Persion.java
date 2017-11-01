package pers.zyl.demo05;

/*
 * 类描述人
 * 	属性：姓名，年龄
 * 	功能:说话
 * 
 * 私有化所有的属性 (成员变量) ,必须写对应的get/set方法
 * 凡是自定义的类,自定义成员变量,应该私有化,提供get/set
 * 
 * this关键字:
 * 	区分成员变量和局部变量同名情况
 * 	方法中,方位成员变量,写this.
 * 	
 */

public class Persion {
	private String name;
	private int age;
	
	//set方法，变量name,age的值
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		//设置age的值的范围
		if(age > 200 || age < 0) {
			this.age = 20;
		}else {
			this.age = age;
		}
	}
	
	//get方法，调用name，age的值
	public String getName() {
		return name;
	}
	
	public int getage() {
		return age;
	}
	
	
	public void speak() {
		System.out.println("name: " + name + ", age:" + age);
	}

}
