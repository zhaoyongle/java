package pers.zyl.demo01;

public class Test {
	public static void main(String[] args) {
		Develop d = new Develop();
		d.name = "张三";
		d.work();
		d.print();
		
		WeiHu w = new WeiHu();
		w.name = "李四";
		w.work();
		w.print();
		
		
		Employee e = new Employee();
		System.out.println(e.name);
		
	}

}
