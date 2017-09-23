/*
 * int[][] arr = new int[3][]不推荐
 * 二维数组中定义三个一维数组，每个一维数组长度，都没有指定
 * arr[0]
 * arr[1]
 * arr[2]
 * 必须要new
 * 	arr[0] = new int[5]
 * 	arr[1] = new int[4]
 * 
 * 最简单的二维数组定义方式
 * 		int[][] arr = {{12,32, 43},{12, 32, 3}{12, 32, 32}}
 */
package day04;
public class ArrayArrayDemo_01 {
	public static void main(String[] args){
		int[][] arr = {{2, 4, 23} , {23, 32, 23} , {23, 32, 23}};
		//问题：打印23，是数组中的元素0
		
		System.out.println(arr[1][0]);
	}

}

