﻿/*
 * 二维数组
 * 	数组中的数组，数组里面存储的还是数组
 * 	
 * 	定义方式和一维数组很相似
 * 	
 * 	int[][] arr = new int[3][4];
 * 	定义一个二维数组
 * 	[3] 表示：二维数组中，有三个一维数组
 * 	[4] 表示：三个一维数组中，每个的长度是4
 */
package day04;

public class ArrayArrayDemo {
	public static void main(String[] args){
		int[][] arr = new int[3][4];
		System.out.println(arr);
		
		System.out.println(arr[1]);
		System.out.println(arr[1][1]);
	}

}
