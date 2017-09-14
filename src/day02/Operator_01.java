/*
 * ++写在变量前面，和卸载变量后面，区别
 * a = 1
 * a++
 * ++a
 * 符号写在前面，还是后面，在变量自己独立计算是，没有区别，
 * 但是变量，要是参与了其他运算，就有区别了
 * 
 */
package day02;

public class Operator_01 {
	public static void main(String[] args){
		int i = 5;
		int j = i++;
		System.out.println(i);	//6
		System.out.println(j);	//5
		
		int m = 5;
		int n = ++m;
		System.out.println(m);
		System.out.println(n);
	}

}
