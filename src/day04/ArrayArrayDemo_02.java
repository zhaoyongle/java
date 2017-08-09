/*
 * 二维数组的遍历
 * 	二维数组中，存储4个一维数组，每个一维数组的长度不同
 * 
 * 	遍历：for循环，遍历二维数组
 * 		遍历过程中，for遍历一维数组
 */
package day04;

public class ArrayArrayDemo_02 {
	public static void main(String[] args){
		int[][] arr = {{12,3, 4,}, {12, 32, 43,43}, {1,32}};
		
		//外循环，遍历二维数组
		for(int i = 0; i<arr.length; i++){
			//内循环，遍历每个维数组 arr[0] arr[1] arr[2]
			for(int j = 0; j<arr[i].length; j++){
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

}
