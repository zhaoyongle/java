/*
 * 数据类型的转换
 * 自动：去值范围小的类型，自动转成取值范围发的类型
 * 一个类型，博哦了安不参与类型转换
 */
package day02;

public class DateConver {
	public static void main(String[] args){
		//定义double类型的变量
		double d = 1000;	//出现类型自动转换，int转换成double
		System.out.println(d);
		
		int i = 100;
		double d2 = i;	//出现类型自动转换，int转换成double
		System.out.println(d2);
		
		byte b = 10;
		int j = b;	//类型自动转换，byte转换成int
		System.out.println(j);
	}

}
