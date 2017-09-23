/*
 * 数组操作中，常见的两个异常
 * 	数组索引的异常
 * 	空指针异常
 */
package day04;

public class ArrayDemo_04 {
	public static void main(String[] args){
		//数组的索引异常
//		int[] arr = {3, 4, 1};
		//数组中的三个元素，索引0， 1， 2，
		//System.out.println(arr[3]);// java.lang.ArrayIndexOutOfBoundsException:
		
		//空指针异常
		int[] arr2 = {2, 3, 31};
		System.out.println(arr2[2]);
		arr2 = null; //arr不再保存数据了
		System.out.println(arr2[2]);//java.lang.NullPointerException
	}

}
