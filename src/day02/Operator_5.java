/*
 * 三元运算符
 * 公式：
 * 	布尔表达式 ？ 结果1结果2；
 * 布尔表达式的结果是TRUE，三元运算符的结果就是，结果1；
 * 布尔表达式的结果是FALSE，三元运算符的结果就是，结果2
 */
package day02;

public class Operator_5 {
	public static void main(String[] args){
		System.out.println(3>5?99:88);
		
		String s = 0==1?"哈哈":"呵呵";
		System.out.println(s);
		
		int a = 5;
		int b = 3;
		int c = 1;
		int n2 = (a>b && b>c) ? (c++) : (++c);
		System.out.println(c);
		System.out.println(n2);
	}

}
