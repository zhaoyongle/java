/*
 * 随机点名器：
 * 	1.存储姓名
 * 	2.预览出所有的名字
 * 	3.随机出一个人的名字
 */
package day04;

import java.util.Random;

public class CallName {
	public static void main(String[] args){
		//用一维数组存储所有人的名字String
		String[] names = {"张三", "李四", "王五", "赵六", "刘七", "胡八" };
		//用for循环遍历出所有人的名字
		for(int i = 0; i < names.length; i++){
			System.out.println(names[i]);
		}
		System.out.println("==================");
		//创建一个随机数作为索引，索引出人名
		Random rm = new Random();
		int name = rm.nextInt(names.length);
		System.out.println(names[name]);
	}
}
