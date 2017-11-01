package pers.zyl.demo08;
/*
 *  测试员工案例
 *    创建最下面的子类的对象
 */

public class Test {
	public static void main(String[] args) {
		JavaEE ee = new JavaEE();
		NetWork nt = new NetWork();
		
		ee.setName("张三");
		ee.setId("研发部");
		
		nt.setName("李四");
		nt.setId("运维部");
		
		ee.work();
		nt.work();
		
		
	}

}
