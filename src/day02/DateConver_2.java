/*
 * 数据类型的强制转换
 * 强制：数据类型取值范围大的，转成取值范围小的
 * 
 * 数据类型的强制转换公式
 * 	被转换后的数据类型  变量名 = （被转换后数据类型）要转换的数据
 */
package day02;

public class DateConver_2 {
	public static void main(String[] args)
	{
		//double浮点，转换成整数int
		double d = 3.14;
		
		//被转换后的数据类型 变量名 = （被转换后数据类型）要转换的数据
		int i = (int)d;
		System.out.println(i);
		
		byte b = (byte)210;
		System.out.println(b);
	}

}
