package pers.zyl.demo04;

/*
 * 测试手机类
 * 	创建手机对象，调用方法
 */

public class Test {
	public static void main(String[] args) {
		Phone p = new Phone();
		p.showNum();
		p.call();
		p.sendMessage();
		
		AndroidPhone ap = new AndroidPhone();
		ap.showNum();
	}

}
