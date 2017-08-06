/*
 * if语句
 * 	编码格式
 * 	
 * 	if(条件){
 * 		if语句的执行体
 * }
 * 条件：结果必须是布尔类型
 * 执行体：当if中的条件为true，执行大括号中的执行体
 * 		if条件是false时，什么也不做
 */

public class IfDemo {
	public static void main(String[] args){
		int i = 5;
		if(i == 5){
			System.out.println("if中的条件为true");
			i++;
		}
		System.out.println(i);
	}

}
