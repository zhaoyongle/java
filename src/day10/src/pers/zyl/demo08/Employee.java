package pers.zyl.demo08;
/*
 *  定义员工类
 *    内容,都是所有子类的共性抽取
 *      属性: 姓名,工号
 *      方法: 工作
 */
public abstract class Employee {
	//定义成员变量名
	private String name;
	//定义成员变量id
	private String id;
	
	//定义工作方法
	public abstract void work();
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}

}
