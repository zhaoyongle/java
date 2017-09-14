/*
 * 循环语句：可以让一部分代码，反复执行
 * 
 * while循环：
 * 	编写格式：
 * 		while(条件){
 * 			循环体
 * }
 * 条件：当条件是true，就执行循环体，执行完循环体后
 * 程序再次执行while中的条件，如果还是true，继续执行循环体
 * 直到条件是false的时候，循环就结束
 */

public class WhileDemo {
	public static void main(String[] args)
	{
		int i = 1;
		while(i<5){
			System.out.println(i);
			i++;
		}
	}

}
