/*
 * 赋值运算
 * =
 * +=， -=， /=, %=, *=
 */
package day02;

public class Operator_2 {
	public static void main(String[] args){
		//=赋值运算，将右面的值，赋给左面的变量
		int i = 3;
		i = i + 3;
		System.out.println(i);
		
		// +=赋值运算 i+=3, i = i+3;
		int j = 5;
		j+=5;	//j = j+5
		System.out.println(j);
		
		byte b = 5;
		b = (byte)(b + 1);
		System.out.println(b);
		
		byte b1 = 1;
		b1+=1;	//(byte)(b1+1)
		System.out.println(b1);
		
	}

}
