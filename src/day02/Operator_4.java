/*
 * 逻辑运算符，对两个Boolean类型数据之间计算
 * 结果也是Boolean类型
 * 
 * & ：一边是FALSE，运算结果就是FALSE，见了FALSE就是FALSE
 * | ：一边是TRUE，运算结果就是TRUE，见了TRUE就是TRUE
 * ^ :两边相同为FALSE，不同TRUE
 * ：  :取反，！TRUE = FALSE，！FALSE = TRUE
 * && ：短路与，一边是FALSE，另一边不运行
 * || ：短路或，一边是TRUE，另一边不运行，
 */
package day02;

public class Operator_4 {
	public static void main(String[] args)
	{
		System.out.println(false&true);
		System.out.println(true|true);
		System.out.println(false^false);
		System.out.println(true^true);
		
		System.out.println(!true);
		System.out.println("--------------------------");
		int i = 3;
		int j = 4;
		System.out.println(3>4 && ++j>2);
		System.out.println(i);
		System.out.println(j);
		
		System.out.println(3==3 || ++j>2);
		System.out.println(i);
		System.out.println(j);
	}

}
