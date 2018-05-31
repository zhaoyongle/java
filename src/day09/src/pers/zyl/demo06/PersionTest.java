package pers.zyl.demo06;

public class PersionTest {
	public static void main(String[] args) {
		//测试persion类中的比较年龄方法
		//创建出两个persion类对象
		Persion p1 = new Persion();
		Persion p2 = new Persion();
		
		p1.setAge(15);
		p2.setAge(15);
		
		//p1对象调用自己的方法compare传递p2对象
		boolean b1 = p1.compare(p2);
		System.out.println(b1);
	}

}
