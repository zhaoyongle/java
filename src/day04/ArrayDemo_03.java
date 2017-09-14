/*
 * 数组遍历
 * 	将所有的数组元素获取
 * 	依靠索引，规律：从0开始，一直在增长，到达length-1
 * 	for循环实现
 * 	for	知道循环到次数，计数器思想
 * 	while 不确定循环次数
 */
package day04;

public class ArrayDemo_03 {
	public static void main(String[] args){
		int arr[] = {1, 3, 43, 54, 3, 546, 34};
		
		for(int i = 0; i < arr.length-1; i++){
			System.out.println(arr[i]);
		}
	}

}
