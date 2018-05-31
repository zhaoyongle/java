package pers.zyl.demo03;
/*
 * 方法的参数类型是，基本数据类型，引用数据类型
 */
public class TestPersion {
	public static void main(String[] args) {
		int a = 1;
		function(a);
		System.out.println(a);
		
		Persion p = new Persion();
		p.name = "张三";
		System.out.println(p.name);
		
		function(p);
		System.out.println(p.name);
	}
	
	/*
	 * 定义方法，参数类型书引用数据类型
	 * 参数是persion类型
	 * p接受的是一个内存的地址
	 * main中的变量p
	 * function中的变量是p，保存地址是一样的
	 */
	public static void function(Persion p) {
		p.name = "李四";
	}
	
	/*
	 * 定义方法，参数类型是基本数据类型
	 */
	public static void function(int a) {
		a +=5;
	}

}
