package pers.zyl.demo07;

/*
 * 学生类
 * 属性： 姓名，年龄
 * 
 */

public class Student {
	private int age;
	private String name;
	
	//set方法
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//get方法
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}

}
